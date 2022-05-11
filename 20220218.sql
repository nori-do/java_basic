/* MySQL에서도 프로그래밍이 가능하고
변수나 함수 등을 지정할 수 있다.
물론 Java, Python,CPP 등의 프로그래밍과는 달리
제한되는 점이 많지만, 이를 활용하는 경우가 빈번하기 때문에
먼저 변수 지정 및 출력부터 진행하게된다.*/

-- <MySQL에서 변수 사용하기>
-- MySQL에서 변수를 지정할 때는 SET @변수명 = 값; 의 문법을 쓴다.
SET @myVar1 = 5;
SET @myVar2 = 3;
SET @myVar3 = 4.25;
SET @myVar4 = '가수의 이름 =>';

-- 변수에 저장된 값을 출력할 때는 SELECT @변수명;을 사용합니다.
-- @myVar1을 출력해보세요.
SELECT @myVar1;

-- 만약 계산식 등이 있다면 SELECT 구문 실행 이전에
-- 계산을 모두 마치고 그 결과를 화면에 보여줍니다.
-- @myVar2와 @myVar3을 더한 결과값을 출력해보세요
SELECT @myVar2 + @myVar3;

-- SELECT 구문에서 콤마(,)를 이용해 일반 테이블 데이터와
-- 출력데이터를 함께 나열하는 것도 가능하다.
SELECT @myVar4,user_name
	from userTbl;
    
-- 일반 구문에서 LIMIT에는 변수를 입력해서 쓸 수 없습니다.
SELECT * FROM usertbl limit 3;

-- select * from usertbl limt @myVar2;(불가능)

-- PREPARE 구문
-- PREPARE 구문은 가변적으로 들어갈 문장요소 자리를
-- ?로 구멍을 뚫어놓고, 그 자리를 채우는 방식으로 만듭니다.
-- 사용법은
-- PREPARE 구문 이름
-- 		FROM '실제 쿼리문';
-- 방식으로 선언해두고
-- 호출은 EXECUTE 구문이름 USING 전달변수;
-- 로 호출합니다.

-- myVar5에 변수 3을 저장해보세요
SET @myVar5 = 3;

PREPARE myQuery
	FROM 'SELECT user_name, height FROM userTbl limit ?';
    
-- myQuery 구문 실행해보기
-- 저장된 구문의 ? 위치에 들어갈 값을 전달하기 위해 USING 전달값을 씁니다.
EXECUTE myQuery USING @myVar5;

-- <MySQL의 데이터형식과 형 변환>
-- 데이터 변환시는 CAST(), CONVERT() 등의 함수를 이용해서
-- 처리하면 됩니다. 두 함수의 차이점은 없습니다.
-- 문법
-- CAST(실행문 as 바꿀자료형);
-- CONVERT(실행문, 바꿀자료형);
SELECT avg(amount) FROM buytbl; -- 실수(double)로 나오는 평균 구매수

SELECT CAST(avg(amount) AS SIGNED INTEGER) as '평균구매수' FROM buytbl;
-- 평균구매갯수를 signal integer(정수)로 변경
SELECT CAST(avg(amount) AS SIGNED integer) AS '평균구매수' FROM buytbl;
-- CONVERT를 써서 바꾸는 구문을 여러분들이 직접 작성해주세요
SELECT CONVERT(avg(amount), SIGNED INTEGER) as '평균구매수' FROM buytbl;

-- CAST를 사용하면 날짜 양식도 통일할 수 있습니다.
SELECT CAST('2022$02$18' as DATE);
SELECT CAST('2022/02/18' as DATE);
SELECT CAST('2022%02%18' as DATE);
SELECT CAST('2022@02@18' as DATE);
SELECT CAST('2022.02.18' as DATE);

-- Oracle SQL에서는 sysdate 명령어로 현재 시간을 확인할 수 있는데
-- MySQL에서는 now()를 사용해 현재 시간을 확인할 수 있습니다.
SELECT now();

-- <임시적 형 변환(자동 형 변환)>
SELECT '100' + 200; -- 문자와 숫자간 연산 => MySQL에서는 숫자로 바뀜
-- 여러분들이 그러면 숫자로 이루어진 문자 + 숫자로 이루어진 문자를 해보세요.
SELECT '100' + '200'; -- 문자 + 문자도 숫자로 이루어진 문자끼리만 결과도 숫자로 나옴.
-- 숫자로 변환이 안 되는 문자 + 정수 => 정수끼리만 연산
SELECT '가나다' + 100;

-- 만약 자바처럼 연산 결과가 문자로 바뀌게 나오고 싶다면
-- CONCAT(자료1, 자료2);를 활용합니다.
-- '100', '200'을 100200으로 출력되게 SELECT구문을 적어보세요
SELECT concat('100', '200');
-- 100300
SELECT CONCAT('100', '300');

-- 문자는 첫 머리에 숫자가 포함된 경우 : 첫 글자를 숫자로 변환
-- 문자만 있는 경우 : 0으로 변환
-- 논리 자료형이 없어서 0 을 false로, 1을 true로 간주함
SELECT 3 > '2Mega';
SELECT 1 > 'AMEGA';

-- <MySQL 내장함수>
-- CONCAT, CAST, CONVERT 등과 같이
-- 내부에 이미 선언되어있어서 바로 호출해서 쓸 수 있는
-- 함수들을 보겠습니다.

-- IF(수식, 참일 때 리턴, 거짓일 때 리턴)
-- 삼항연산자와 비슷하게 판단합니다.
SELECT IF(300 > 200, '참입니다.', '거짓입니다.');

-- IFNULL(수식1, 수식2)
-- 수식1이 NULL이 아니면 수식1이 반환, 수식 1이 NULL이면 수식2로 반환됩니다.
SELECT IFNULL(NULL, '널입니다'), IFNULL(100, '널입니다');

-- NULLIF(수식1, 수식2)
-- 수식1과 수식2가 같으면 NULL, 다르면 수식1 반환
SELECT NULLIF(100, 100), NULLIF(200,100);

-- CASE~WHEN~ELSE~END
-- SWITCH~CASE문과 비슷하게
-- 들어온 자료와 일치하는 구간이 있으면 출력
-- 없을때는 ELSE쪽 자료를 출력
-- 단, SQL은 자바와 달리{}로 코드 시작 끝나는 범워(블럭)을 표현하지 않기 때문에
-- 구문이 끝나는 시점에 END라는 키워드를 따로 써줘야한다.
SELECT
	CASE 10
    WHEN 1 THEN '일'
    WHEN 5 THEN '오'
    WHEN 10 THEN '십'
    ELSE '모름'
    END as '결과';
    
    SELECT
	CASE 10
    WHEN 1 THEN '일'
    WHEN 5 THEN '오'
    WHEN 10 THEN '십'
    ELSE '모름'
    END; -- 이런 식으로 나오기 때문에 as '결과'를 붙여줘야 원하는 값을 얻을 수 있다.
    
    -- <문자열 함수>
    -- 문자열을 조작하는데 쓰고 활용도가 높은 편입니다.
    -- ASCII(문자), CHAR(숫자)를 넣으면
    -- 문자는 숫자로, 숫자는 문자로 바뀝니다.
    -- CHAR()는 workbench상에 버그가 있어서 모든 문자가 BLOB로 표현되기 때문에
    -- 실제로 정상적인 결과를 조회하고 싶다면 BLOB -> 우클릭 ->Open value in viewer -> text탭을 선택하면 됩니다.
SELECT ASCII('B');
-- 소문자 b를 숫자를 입력해 CHAR에 넣어서 출력해주세요.
-- 소문자 b에 해당하는 숫자를 구글링으로 직접 찾아보세요.
SELECT CHAR('98');    

-- 문자열의 길이를 그때그때 확인하기 위해서는
-- CHAR_LENGTH(문자열)을 사용합니다.
-- 이 때 결과로 나오는 숫자는 문자열의 길이입니다.
SELECT CHAR_LENGTH('가나다라마바사');
-- 여러분들이 30글자 이상 되는 임의의 문자열을 넣어 길이를 구해보세요.
SELECT CHAR_LENGTH('안녕하세요 저는 박기도라고 합니다. 잘부탁드립니다. 가나다라마바사아자차카타파하');

-- CONCAT(문자열1, 문자열2, 문자열3...);
SELECT CONCAT('가', '다', '마', '사');

-- CONCAT_WS(구분자, 문자열1, 문자열2...);
-- 문자열과 문자열 사이에 구분자를 넣어서 붙여줍니다.
SELECT CONCAT_WS('---', '1', '3', '4', '5', '10', '22');

-- FORMAT(숫자, 소수점자리)
-- 1234.588475906205를 3자리로 끊어서 출력해주세요.
SELECT FORMAT(1234.588475906205, 3);

-- BIN(숫자), HEX(숫자), OCT(숫자)
-- 2진수		16진수		8진수
-- 정수로 10진수 숫자를 바꿔서 표현해줍니다.
SELECT BIN(31), HEX(31), OCT(31);

-- INSERT(기준문자열, 위치, 길이, 삽입할 문자열);
-- 기준 문자열의 위치~길이 사이를 지워주고, 그 사이에 삽일할 문자열을 새로 넣어준다.
SELECT INSERT('abcdefghi', 3, 4, '@@@@');

-- LEFT(문자열, 길이), RIGHT(문자열, 길이)
-- 해당 문자열의 왼쪽, 오른쪽에서 문자열 길이만큼 남깁니다.
SELECT LEFT('abcdefghi', 3), RIGHT('abcdefghi', 4);

-- UCASE(영문자열), LCASE(영문자열)
-- 소문자를 대문자로(UPPERCASE)
-- 대문자를 소문자로(LOWERCASE)
-- abcdEFGH에 대해서 다 대문자/ 다 소문자로 바꿔주세요
SELECT UCASE('abcdEFGH');
SELECT LCASE('abcdEFGH');
-- 한줄로도 처리 가능
SELECT UCASE('abcdEFGH'), LCASE('abcdEFGH'); 

-- UPPER(문자열), LOWER(문자열)로 쓸 수도 있습니다. 기능은 동일합니다.
SELECT UPPER('abcdEFGH'), LOWER('abcdEFGH');

-- LPAD(문자열, 길이, 채울 문자열), RPAD(문자열, 길이, 채울 문자열)
-- 문자열을 길이만큼 늘려놓고, 빈 칸에 채울 문자열을 채워줍니다.
SELECT LPAD('이것이', 5, '#');
-- 저것이---'라고 출력되도록 RPAD를 써보세요
SELECT RPAD('저것이', 6, '-');

-- LTRIM(문자열), RTRIM(문자열)
-- 문자열의 왼쪽/오른쪽 부분의 공백을 모두 없애줍니다.
-- 단, 가운데 부분의 공백은 사라지지 않습니다.
SELECT LTRIM('                    이것이'), RTRIM('저것이                      ');
SELECT '              이것이', '저것이                    ';

-- TRIM(문자열), TRIM(방향, '자를문자' FROM '대상문자')
-- TRIM은 기본적으로는 LTRIM + RTRIM 형식으로 양쪽의 모든 공백을 다 삭제해줍니다.
-- 공백이 아닌 특정 문자를 삭제하도록 구문을 지정할 수도 있습니다.
SELECT TRIM('             무야호          ');

-- 방향은 BOTH(양쪽 다), LEADING(왼쪽), TRAILING(오른쪽)
-- 중 하나를 고르면 됩니다.
-- ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㄹㅇㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ 에서 ㅋ을 오른쪽만 삭제해서 출력
SELECT TRIM(TRAILING 'ㅋ' FROM 'ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㄹㅇㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ');

-- REPEAT(문자열, 횟수)
-- 문자열을 횟수만큼 반복합니다.
SELECT REPEAT('ㅋ', 100);

-- REPLACE(문자열, 찾을 문자열, 바꿀 문자열)
-- 문자열에서 찾을 문자열을 찾아 바꿀문자열로 교체합니다.
-- 'JAVA로 작성되었습니다. JAVA' 문자열을 JAVA 부분을 MySQL로 바꿔주세요.
SELECT REPLACE('JAVA로 작성되었습니다. JAVA', 'JAVA', 'MySQL');

-- REVERSE(문자열)
-- 문자열은 인덱스 역순으로 재배치해줍니다.
SELECT REVERSE('MySQL');

-- SPACE(길이)
-- 길이만큼 공백을 채워줍니다.
SELECT CONCAT('이것이', SPACE(50), '저것이');

-- SUBTRING(문자열, 시작위치, 길이)
-- SUBTRING(문자열 FROM 시작위치 FOR 길이)
-- 시작위치부터 길이만큼의 문자를 반환합니다.
-- 길이를 생략하고 파라미터를 2개만 주면
-- 시작지점부터 끝까지 모든 문자를 반환합니다.
SELECT SUBSTRING('자바스프링마이에스큐엘', 6, 4);
SELECT SUBSTRING('자바스프링마이에스큐엘' FROM 6);


-- <SQL 프로그래밍과 프로시지>
-- SQL에서도 변수선언이 되는 것을 봤었지만
-- 심지어 프로그래밍을 진행할 수도 있다.
-- 문법)
-- DELIMITER $$ -- 시작지점
-- CREATE PROCEDURE 선언할 프로시저 이름()
-- BEGIN -- 실제 실행코드는 BEGIN 아래에 작성한다.
-- 		실행코드...
-- END $$
-- DELIMITER;

-- 위의 문법으로 선언해둔 프로시저는
-- CALL 프로시저명();로 호출 가능합니다.

-- IF ~ ELSE문을 프로시저로 작성
DELIMITER $$
CREATE PROCEDURE ifproc()
BEGIN
	DECLARE var1 INT; -- 변수 선언
    SET var1 = 2000; -- 선언한 변수에 값 저장
    IF var1 = 100 THEN
		SELECT '100이 맞습니다.';
	ELSE
		SELECT '100이 아닙니다.';
	END IF; -- IF문 종료지점
END $$
DELIMITER ;
CALL ifproc();

-- 프로시저 내용을 바꾸고 싶으면 프로시저를 먼저 삭제해준 다음
-- 구문을 고치고 다시 선언해줘야 합니다.
-- DROP PROCEDURE 프로시저명;(프로시저명 우측()는 뺍니다)
DROP PROCEDURE ifproc;


-- 테이블 userTbl을 조회하는 프로시저를 만들어보겠습니다.
-- 프로시저명은 getUser()입니다.
-- 실행하면 SELECT * FROM userTbl;을 호출해줍니다.
-- 쿼리문은 BEGIN과 END 사이에 작성해주세요
DELIMITER $$
CREATE PROCEDURE getUser()
	BEGIN # 프로시저 내에서 주석을 달때에는 # 뒤에 글씨를 씁니다.
		SELECT * FROM userTbl;
	END $$
DELIMITER ;
call getUser;

-- 프로시저를 활용해 employees 테이블의 10001번 직원의
-- 입사일이 5년이 넘었는지 여부를 체크해보겠습니다.
-- hire_date 컬럼의 DATE 자료를 이용해 판단합니다.
use employees;
DELIMITER $$
CREATE PROCEDURE checkFiveYear()
	BEGIN
		DECLARE hireDATE DATE; # 입사일을 얻어오기 위해 DATE 자료형 변수 선언
        DECLARE todayDATE DATE; # 오늘 날짜 얻어오기
        DECLARE days INT; # 오늘 날짜 - 입사일 해서 경과일수 얻어오기
       
        SELECT hire_data INTO hireDATE
			FROM employees WHERE emp_no = 10001;
			
        # 10001번 직원의 HIRE_DATE를 조회하는 쿼리문을 먼저 작성해보세요
        # INTO 키워드를 씁니다.
        
        SET todayDATE = CURRENT_DATE(); #오늘 날짜를 구하는 기능
		SET days = DATEDIFF(todayDATE, hireDATE); # todayDATE = hireDATE를 수행
        
        #경과일수가 5년을 넘었는지 체크
		IF(days / 365) >= 5 THEN # 입사경과일을 365로 나눈 값이 5보다 크면 5년 이상
			SELECT CONCAT('입사한지', days, '일이 경과했습니다.');
            # 아닌 경우는 '5년미만이고 days 일째 근무중'이라고 나오게 한 다음 구문을 종료시켜주세요.
		ELSE
			SELECT CONCAT('5년미만이고', days, '일째 근무 중.');
		END IF;
	END $$
DELIMITER ;
use employees;
CALL checkFiveYear();
drop procedure checkFiveYear;

DELIMITER $$
CREATE PROCEDURE checkFiveYear2(emp_number INTEGER)
 # 매번 프로시저를 만들지 않아도 되게 매개변수를 선언하겠습니다. emp_no 자리에 숫자를 넣어야만 실행
	BEGIN
		DECLARE hireDATE DATE; 
        DECLARE todayDATE DATE;
        DECLARE days INT; 
        SELECT hire_data INTO hireDATE
        FROM employees WHERE emp_no = emp_number;

        SET todayDATE = CURRENT_DATE(); 
		SET days = DATEDIFF(todayDATE, hireDATE); 
        
		IF(days / 365) >= 5 THEN
			SELECT CONCAT('입사한지', days, '일이 경과했습니다');
		ELSE
			SELECT CONCAT('5년미만이고', days, '일째 근무 중');
		END IF;
	END $$
DELIMITER ;
call checkFiveYear(12);

/* 이게 뭔 개 소리야.... */