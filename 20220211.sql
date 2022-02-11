-- AUTO_ INCREMENT(자동증가)
-- INT(정수) 자료형이 붙은 컬럼에만 붙일 수 있고, 이게 붙은 컬럼은 자동으로 1씩 증가하는 숫자를 배정받습니다.
-- 시작은 1입니다.
-- INSERT INTO 구문이 실행될 때마다 해당 컬럼에 들어갈 숫자를 자동으로 배정해줍니다.
-- 한 번 사용된 숫자는 다시 사용되지 않습니다.

-- FOREIGN KEY(외래 키)
-- 쇼핑몰의 구매자는 반드시 회원이어야 됩니다.
-- 특정 테이블에 존재하는 값만 해당 컬럼에 들여올 수 있도록 거는 제약조건
-- FOREIGN KEY를 거는 컬럼의 자료형과 크기는 참조하는 쪽과 원본 모두 같아야 합니다.
-- 참조컬럼에 있는 값만(userTbl의 user_id에 존재하는 값만) buyTbl의 user_id에 올 수 있습니다.

/* 테이블 buyTbl을 생성해주세요.
order_number 정수(자리수X) ATIO_INCREMENT PRIMARY KEY,
user_id 문자열(8) null 허용x,
prod_name 문자열(6) null 허용 x,
group_name 문자열(4),
price 정수(7) null 허용 x,
amount 정수(3) null 허용 x,
FOREIGN KRY(user_id) REFERENCES userTbl(user_id)
);
*/
CREATE TABLE buyTbl (
order_number INT AUTO_INCREMENT PRIMARY KEY,
user_id VARCHAR(8) NOT NULL,
prod_name VARCHAR(6) NOT NULL,
group_name VARCHAR(4),
price INT(7) NOT NULL,
amount INT(3) NOT NULL,
FOREIGN KEY(user_id) REFERENCES userTbl(user_id)
);
INSERT INTO userTbl VALUES('CJH', '채종훈', 2000, '경기', '0111111', 175, '2020-12-5');
INSERT INTO userTbl VALUES('ASD', '박기도', 1993, '충남', '0333111', 165, '2022-8-5');
INSERT INTO userTbl VALUES('DSA', '김자바', 1989, '서울', '1232111', 185, '2021-3-5');

-- 가입한 회원이 물건을 산 이력이 남도록 하겠습니다.
INSERT INTO buyTbl VALUES(null, 'CJH', '기계식키보드', '주변기기', 200000, 1);
-- order_number 컬럼은 값을 안 주면 (null을 주면) AUTO_INCTEMENT에 의해 자동으로 
-- 1씩 증가된 숫자를 배정받습니다.
INSERT INTO buyTbl VALUES(null, 'CJH', '듀얼모니터', '전자기기', 20000, 1);

-- userTbl의 user_id에 없는 회원 아이디를 INSERT INTO로 넣어주세요.
INSERT INTO buyTbl VALUES(null, 'QWE', '듀얼모니터', '전자기기', 20000, 1);

-- userTbl의 user_id에 없는 회원 아이디를 INSERT INTO로 넣어보세요
-- 회원 3명에 대한 구매이력을 1개씩 추가로 남겨주시고 저한테 쿼리문을 보내주세요.
INSERT INTO buyTbl VALUES(null, 'ASD', '헬스 스트랩', '운동기구', 11300, 1);
INSERT INTO buyTbl VALUES(null, 'DSA', '모니터', '전자기기', 300000, 1);
INSERT INTO buyTbl VALUES(null, 'CJH', '침대', '생활용품', 500000, 1);

-- 유저를 두 명 더 추가해주세요.
-- 정보는 전부 여러분들이 알아서 넣어주시되, 키는 한 명은 160대로 해주시면 됩니다.
INSERT INTO userTbl VALUES('CXZ', '김바자', 1998, '서울', '3432611', 160, '2021-6-5');
INSERT INTO userTbl VALUES('QAZ', '황비룡', 1979, '베이징', '1232111', 168, '2020-7-5');

-- 새로 추가한 2명의 구매내역을 추가해주세요
-- 2명의 구매내역 3개를 추가해주세요( 1명 1개, 1명 2개)
INSERT INTO buyTbl VALUES(null, 'CXZ', '데스크탑', '전자기기', 2000000,1);
INSERT INTO buyTbl VALUES(null, 'QAZ', '운동화', '패션의류', 120000 ,1);
INSERT INTO buyTbl VALUES(null, 'QAZ', '티셔츠', '패션의류', 75000, 1);


-- 여태까지의 SELECT 구분은 조건 없이 모든 데이터를 다 조회했습니다.
-- 극단적인 경우 employees 테이블의 모든 row를 다 조회하는(cmd환경) ruddn
-- 조회시간이 말도 안되게 오래 잡히는 경우가 발생합니다.
-- 따라서 조건에 맞도록 필터링 하기 위해 WHERE 구문을 사용합니다
-- SELECT 컬럼명 1. 컬럼명1..FORM 테이블 

SELECT * FROM employees.employees;

select * from userTbl where user_name = '박기도';

-- 서울에 사는 사람만 조회해보세요.
select * from userTbl where addr = '서울';

-- 관계연산자를 이용해서 대소비교를 하거나
-- AND, OR을 이용해 조건 여러개를 연결할 수 있습니다.
-- 키 180 이상인 사람을 조회해주세요.

-- select * from uesrTbl where height >=180;  
select * from userTbl where height >= 180;

-- AND 를 이용해서 91~99년생까지만 조회하는 구문을 만들어주세요.
SELECT * FROM userTbl WHERE user_year > 1990 AND user_year <= 1999;
-- birth_year >= 1991 and 1999 >= birth_year;

-- BETWEEN ~ AND 구문을 이용하면 birth_year를 한 번만 적고도
-- 해당 범위의 죄회가 가능하다.
-- 적은 두 개의 숫자는 포함한다.
select * from userTbl where user_year between 1991 and 1999;

-- 위와 같이 숫자는 연속된 범위를 갖기 때문에 범위연산자로 처리가 가능하지만
-- addr같은 자료는 서울이 더 크다던가 영국이 더 작다던가 하는 연산적 처리가 불가능하다.
-- 먼저 지역이 서울이거나 화성인 사람의 정보를 where절로 조회해주세요.
select * from userTbl where addr = '서울' or addr = '경기';

-- int 키워드를 사용하면 컬럼명 in (데이터 1, 2, 3, 4...);
-- 특정 컬럼에 괄호에 담긴 데이터가 포함되는 경우를 전부 출력합니다.
-- 경기, 화성, 영국에 있는 사람들만 in 키워드로 조회해주세요.
select * from userTbl where addr in ('경기', '서울', '베이징');

-- like 연산자는 일종의 표현 양식을 만들어줍니다.
-- like 연산자를 이용하면 %라고 불리는 와일드 카드나 혹은 _라고 불리는
-- 와일드 카드 분자를 이용해 매칭되는 문자나 문자열을 찾습니다.

-- 채씨를 찾는 케스이(%는 몇 글자가 오더라도 상관없음)
-- 아래 구문은 채로 시작하는 모든 요소를 다 가져옵니다. '박'도 포함
select * from userTbl where user_name like '박%';

-- 휴대폰 번호가 01로 시작하는 모든 사람을 찾는 쿼리문을 작성해주세요.
select * from userTbl where phone_number like '01%';

-- 두 글자인 경우만 찾는 케이스(_는 하나에 한 글자임)
select * from userTbl where user_name like '__';

-- user_id가 3글자이면서 H로 끝나는 사람만 조회하는 커리문을 날려주세요.
select * from userTbl where user_id like '__H';

-- 서브쿼리(하위쿼리)란 1차적 결과를 얻어놓고,
-- 거기서 다시 조회구문을 중첩해서 날리는 것을 의미합니다.
-- 채종훈보다 키가 큰 사람을 조회하는 예시를 보겠습니다.


-- 원시적인 방법
-- 1. 채종훈의 키를 where절을 이용해서 확인한다.
-- select id, pw, user_name, email from users;
-- select userTbl where height;
-- select user_name, height from userTbl where user_name = '채종훈';
select height from userTbl where user_name = '채종훈';

-- 2. 확인한 채종훈의 키를 쿼리문에 넣는다.
-- 175보다 큰 사람의 이름과 키만 조회해보겠습니다.
select user_name, height from userTbl where height > 175;
select * from userTbl;

-- 서브쿼리 활용 방법
-- 서브쿼리는 from 절 다음에 ()를 이용해서
-- select구문을 한 번 더 활용합니다.
select user_name, height from userTbl where height >
	(select height from userTbl where user_name = '채종훈');
    
-- 서브쿼리를 이용해 '김바자'보다 먼저 태어난 사람들만 골라보세요.
-- 생년월일(날짜나 연도)도 대소비교가 가능합니다. 큰 쪽이 더 최근, 작은쪽이 더 이전

select user_year, user_name from userTbl where user_year <
	(select user_year from userTbl where user_name = '김바자');
    
    
-- 최대값은 내장함수 max()로 구합니다.
-- 현재 userTbl 테이블에서 가장 나이가 적은 사람의 생년 조회
select max(user_year) from userTbl;
select user_year from userTbl;


UPDATE userTbl set user_id = 'ASDM' where user_id = 'ASDM';
UPDATE userTbl set user_name = '채종훈' where user_id = 'CJHM';
UPDATE userTbl set user_name = '김바자' where user_id = 'CXZM';
UPDATE userTbl set user_name = '김자바' where user_id = 'DSAM';


-- user_id에 M이 포함된 사람들 중 키가 제일 작은 사람보다
-- 키가 더 큰 사람을 구하시오(min을 활용하세요)
-- select height, user_name from userTbl where height >
	-- (select min(height) from userTbl where user_id like '%C%');
    select * from userTble where height >
    (select min(height) from userTbl where user_id like '%C%');
   --  select min(height), user_name from userTbl where user_id like '%A%';

-- 2021년 가입자 중 가입일이 제일 빠른 사람보다 키가 큰 사람을 조회해주세요.
-- 날짜도 부등호로 조회 가능합니다(작다 : 이전날짜, 크다 : 이후날짜)
 
 select * from userTble where reg_date >= min('%2021%');

(select reg_date, user_name from userTbl where reg_date >= 2021);
(select mix(height) from userTbl where height);

-- 1. 2021년 가입자 중 가입일이 제일 빠르 사람의 가입일자 구하기
-- 2. 1의 쿼리문을 조건으로 해서 가입일이 제일 빠른 사람의 키 구하기
-- 3. 2에서 구한 키를 조건으로 해서 최종적인 명단 만들기
select * from userTble where height <
(select mix(hight) from userTbl where height ) <
(select min(reg_date) from userTbl where reg_date > 2021); 


select * from userTbl;