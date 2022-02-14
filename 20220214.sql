-- 1. 2021년 가입자 중 가입일이 제일 빠르 사람의 가입일자 구하기
SELECT min(reg_date) FROM userTbl WHERE reg_date >= '2021-01-01';
-- 2. 1의 쿼리문을 조건으로 해서 가입일이 제일 빠른 사람의 키 구하기
SELECT height FROM userTbl WHERE reg_date =
	(SELECT min(reg_date) FROM userTbl WHERE reg_date >= '2021-01-01');
-- 3. 2에서 구한 키를 조건으로 해서 최종적인 명단 만들기
SELECT * FROM userTbl WHERE height >
	(SELECT height FROM userTbl WHERE reg_date =
	(SELECT min(reg_date) FROM userTbl WHERE reg_date >= '2021-01-01'));
    
-- 유저를 다섯명 더 추가해보겠습니다.
INSERT INTO userTbl VALUES ('ZAZ', '김기자', 1993, '서울', '01012345678', 178, '2021-01-02');
INSERT INTO userTbl VALUES ('CGJ', '채기자', 1973, '서울', '01012345642', 181, '2021-02-05');
INSERT INTO userTbl VALUES ('EGZ', '이기자', 1986, '서울', '01012345654', 155, '2021-06-22');
INSERT INTO userTbl VALUES ('PGZ', '박기자', 2000, '광주', '01012323643', 145, '2021-01-12');
INSERT INTO userTbl VALUES ('JPR', '스프링', 2001, '경기', '01012353678', 160, '2021-04-22');
INSERT INTO userTbl VALUES ('YSO', '야스오', 2002, '서울', '01012365678', 168, '2021-01-12');

SELECT * FROM usertbl;

-- ANY, ALL, SOME 구문은 서브쿼리와 조합해서 사용합니다.
-- 지역이 서울인 사람보다 키가 작은 사람을 찾는 쿼리문
-- 1. 서울사람의 키 전체 리스트 가져오기
SELECT height FROM usertbl WHERE addr = '서울';

-- 위 구문을 서브쿼리로 해서 서울사람보다 키가 작은 사람을 찾을 경우 에러가 납니다.
-- 현재 데이터셋은 169, 171, 186, 3개인데 어늘 데이터를 기반으로
-- height을 잡아줄지 모호하기 때문에 에러가 납니다.
SELECT * FROM usertbl WHERE height <
	(SELECT height FROM usertbl WHERE addr = '서울');
    
-- ANY 구문을 사용하면, 169, 171, 186 모든 데이터에 대해 OR 로 처리가됩니다.
-- 개별값 모두에 대한 OR처리가 붙고 그래서 아래와 같이
-- (height < 169) OR (height < 171) OR(height < 186)
-- 3개 조건이 OR로 연결됩니다.
-- ANY는 OR로 연결된다는 특성상 범위가 가장 넓은 조건 하나로 통일됩니다.
-- ANY와 SOME은 사실상 차이가 없는 구문이다.
-- ANY가 들어갈 자리에 SOME을 대시 넣어도 똑같이 작동한다
SELECT * FROM usertbl WHERE height < ANY
	(SELECT height FROM usertbl WHERE addr = '서울');
    
SELECT * FROM usertbl WHERE height < SOME
	(SELECT height FROM usertbl WHERE addr = '서울');
    
-- ALL 구문을 사용하면 169, 171, 186 모든 데이터가 AND로 처리됩니다.
-- 개별값 모두에 대해 AND 처리가 붙고 그래서 아래와 같이
-- (height < 169) AND (height < 171) AND (height < 186)
-- 쿼리문을 작성해서 AND구문을 이용해 (직접 ALL키워드를 기입해서 작성해주세요) 조회해보세요.
SELECT height FROM usertbl WHERE height < ALL
	(SELECT height FROM usertbl WHERE addr = '서울');
    
-- 정렬기준은 ASC(오름차순), DESC(내림차순)이 있으며
-- 입력이 따로 없는 경우는 기본은 ASC로 잡습니다.
-- 가입한 날짜순(reg_date 순으로 오름차순)으로 조회해보겠습니다.

SELECT * FROM usertbl ORDER BY reg_date ASC;

-- 키 큰 순, 내림차순으로 조회하는 구문을 작성해보세요.
SELECT * FROM usertbl ORDER BY height DESC;

-- 정렬시 동점인 부분을 처리하기 위해 ORDER BY 절을 두 개 이상 동시에 나열할 수도 있습니다.
-- 아래 코드는 키로 오름차순을 하되, 동적이면 생년 내림차순으로 처리합니다.
SELECT * FROM usertbl ORDER BY height ASC, user_year DESC;

-- 만약에 문자를 내림차/오름차 순으로 나열한다면, 아스키코드 순으로 ORDER BY 정렬이 들어갑니다.
-- user_name 으로 ORDER BY를 걸어보세요
SELECT * FROM usertbl ORDER BY user_name ASC;

-- 지역을 가나다라 역순으로 나열해주는데, 만약 지역이 같다면 이름 오름차순으로 정렬해주세요.
SELECT * FROM usertbl ORDER BY addr DESC, user_name ASC;

-- DISTINCT는 결과물로 나온 컬럼의 중복값을 다 제거하고
-- 고유값(각 값 1개씩만 남긴 결과값)을 남겨줍니다.
-- 아래 코드는 지역종류 7개(데이터 개수는 11개)를 파악하기 어렵습니다.
SELECT addr FROM usertbl;

-- 중복값을 하나로 집계하기 위해 출력컬럼 앞에 DISTINCT를 붙입니다.
SELECT DISTINCT addr FROM usertbl;

-- employees 스키마 지정을 키워드로 해 주세요.
use employees;

-- 출력요소의 개수를 제한할 때 는 limit 구문을 사용합니다.
-- 데잍처가 300000개에 가깝다 보니 모든 데이터를 보여주지 않고 1000개만 보여줍니다.
SELECT * FROM employees;

-- 테이블명 뒤에 limit 숫자; 가 오는 경우는 적은 숫자 개수만큼만
-- 결과창에 보여줍니다.
-- 숫자는 하나만 적으면 자동으로 0번자료부터 n개를 보여준다.
-- 10개 출력해보세요.
SELECT * FROM employees limit 10;

-- limit는 ORDER BY와 결합해 쓸 수 있습니다.
SELECT * FROM employees ORDER BY hire_date DESC limit 10;

-- 서브쿼리를 써야 하는 문제. 첫 10개를 입사일자 순으로 내림차순 처리해보세요.
SELECT * FROM employees ORDER BY hire_date limit 10;
--  <- 이 자료를 입사일자 순으로 나열하면 됩니다.
-- FROM절 다음에 서브쿼리를 써주세요.
SELECT * FROM employees WHERE emp_no = 10002;
SELECT * FROM employees limit 10;
SELECT * FROM employees WHERE emp_no <= 10010 ORDER BY hire_date DESC;

-- 일정 데이터셋을 먼저 얻어놓고, 얻어놓은 데이터셋을 내부적으로 정렬시킬때도 서브쿼리를 씁니다.
SELECT * FROM (SELECT * FROM employees limit 10) e ORDER BY hire_date DESC;

-- 만약 limit 숫자1, 숫자2; 와 같이 숫자 2개를 넣는 경우는
-- 숫자 1번부터 숫자 2에 기입한 갯수만큼 보여준다.
SELECT * FROM employees limit 5, 10;

-- employees에 대해서 20번부터 30개를 출력해보세요.
SELECT * FROM employees limit 20,30;

-- GROUP BY는 같은 데이터를 하나의 그룹으로 묶어줍니다.
-- 조건절은 WHERE이 아닌 HAVING 절로 처리하게 됩니다.
-- ict_practice2를 잡아주세요.
use ict_ppractice2;

-- 하기 데이터에서 각 인물별로 구매한 개수 총합을 구해보겠습니다.
SELECT user_id, amount FROM buytbl ORDER BY user_id;

-- SELECT 컬럼명, 집계함수(컬럼명2)... FROM 테이블 GROUP BY 묶어서 집계할 컬럼명;
SELECT user_id, sum(amount) FROM buytbl GROUP BY user_id;

-- 각 유저별 총 구매액을 구해주세요.
-- 총 구매액은 가격*개수의 결과를 다 던한 것입니다.
-- 가격은 price컬럼에, 개수는 amount컬럼에 있습니다.
-- 집계함수 sum의 소괄호 사이에 +, * 등의 연산을 할 수 있습니다.
-- SELECT user_id, sum(amount) * sum(price) FROM buytbl GROUP BY user_id; 
SELECT user_id, sum(price * amount) as '총 구매액' FROM buyTbl GROUP BY user_id;
SELECT * FROM buytbl;

-- 각 유저별 구매 물품의 평균가를 구해보세요(총액 아님). 평균은 avg()로 처리합니다.
-- avg()로 처리한 평균가 컬럼의 명칭은 "평균구매금액"으로 변경해보세요.
SELECT user_id, avg(price) as '평균 구매금액' FROM buyTbl GROUP BY user_id;

-- 자주쓰는 집계함수 정리(통계적 결과를 얻기 위해 사용)
-- AVG() 평균
-- MIN() 최소값
-- MAX() 최대값
-- COUNT() 결과 row의 개수
-- COUNT(DISTINCT) 종류 개수
-- STDEV() 표준편차
-- VAR_SAMP() 분산

-- userTbl에서 키가 제일 큰 회원의 이름과 키를 표시해주세요.
-- 서브쿼리로 height절을 처리해야 합니다.
SELECT user_name, MAX(height) FROM usertbl WHERE height; 
-- SELECT * FROM (SELECT * FROM employees limit 10) e ORDER BY hire_date DESC;
-- SELECT * FROM
-- 	(SELECT * FROM usertbl) e MAX(height);
SELECT user_name, height FROM usertbl WHERE height =
	(SELECT MAX(height) FROM usertbl);
    
-- usertbl에서 키가 가장 작은 회원의 키와 이름을 표시해주세요.
SELECT user_name, height FROM usertbl WHERE height =
	(SELECT min(height) FROM usertbl);
-- usertbl 테이블의 가입자 전체의 평균 키를 구해주세요.
SELECT avg(height) as '평균 키' FROM usertbl;


-- 기존 쿼리문에서의 조건절은 WHERE절을 이용해서 처리했었습니다.
-- 하지만 GROUP BY 를 통해 집계하는 경우, WHERE절을 받을 수가 없습니다.
-- 대신 조건절을 HAVING으로 대체해 사용합니다.
-- WHERE과 사용법은 완전히 동일합니다.
-- 우선 사용자별 총 금액을(buytbl)다시 구해보겠습니다.
-- sum(price*amount)를 활용해서 작성해주세요.

SELECT user_id, sum(price * amount) b
 FROM buytbl
 GROUP BY user_id
 HAVING b > 25000;


-- 구매액이 250000을 넘는 사람만 남겨보겠습니다.
-- WHERE처럼 사용하시되 HAVING이라고 적어서 조건식을 붙여보세요.
-- 집계함수를 사용한 컬럼은 명칭이 없으므로 별명을 붙여서 조건식을 써야합니다.
-- select user_id, sum(price * amount) b from buytbl group by user_id;
SELECT user_id, sum(price * amount) b
 FROM buytbl
 GROUP BY user_id
 HAVING b > 25000;
