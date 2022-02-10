-- 조회구문에 조건을 걸기 위해서 WHERE이라는 구문을 사용합니다.
-- SELECT 조회컬럼 FROM 테이블명 WHERE 컬럼명 = '조건에 맞는 값';
-- 이름은 김자바인 사람만 출력하기
SELECT * FROM users WHERE user_name='김자바';
-- 여러분들의 기준으로 필터링을 해보세요.
-- 아이디 기준으로 찾아보세요.
 SELECT * FROM users WHERE id = 'qwe4321';
 
 -- 조건 여러개를 걸 경우 AND, OR키워드를 쓰시면 됩니다.
 -- OR은 한쪽만 만족하면 가능
 SELECT * FROM users WHERE id = 'qwe4321' OR user_name = '김자바';
 -- AND는 두가지 다 만족해야하는 것
 SELECT * FROM users WHERE user_name = '바김' AND id = 'qwe4321';
 
 
 -- 데이터 수정하기
 -- UPDATE 데이블명 SET 컬럼명1 = '값1', 컬럼명2='값2'...;
 -- 주의하실점은 WHERE을 걸지 않으면 해당 컬럼의 모든 값이 일괄적으로 바뀝니다.
 -- user 테이블의 pw를 전부 'pppp'로 바꾸기
 -- UPDATE users SET pw = 'pppp';
 SET SQL_SAFE_UPDATES=0; -- 0이면 안전모드 비활성화, 1이면 다시 활성화
 
 -- WHERE구문을 이용해 pw컬럼에 있는 5개의 값을 전부 다르게 바꿔주세요.
 -- 문법 : update [테이블] set [수정할 컬럼 및 데이터] where [조건] 


 UPDATE users set pw = 'rrrr' where id = 'abc1234';
 update users set pw = 'aaaa' where id = 'cba4321';
 updATE users set pw = 'bbbb' where id = 'qwe4321';
 updATE users set pw = 'cccc' where id = 'qwer1324';
 updATE users set pw = 'dddd' where id = 'zxcv123';
-- 마지막 하나는 이름과 비밀번호를 함께 바꿔주세요 
 update users set id = 'adad', pw = 'dada' where id='abc1234' and pw = 'rrrr';
 update users set id = 'asas', pw = 'sasa' where id='cba4321' and pw = 'aaaa';
 -- update users set pw ='', user_name = '' where id = '';
 
 -- 데이터 삭제
 -- delete from 테이블명;을 할 경우 테이블 전체 데이터가 싹 날아갑니다.
 -- delete 구문도 역시 일반적으로 where과 조합해서 사용합니다.
 -- 제일 위쪽에 있는 회원정보를 삭제해보겠습니다.
 delete from users where id = 'adad';
 SELECT * FROM users;
 
 
  -- 도서관 테이블 구성하기
  create table library(
	book_name varchar(30) primary key, -- 이름
	book_price int(7) not null,	-- 가격
	book_pub varchar(20) not null, -- 출판사
	book_writer varchar(10) not null, -- 저자
	book_page int(5) not null -- 페이지수
  );
 
 -- insert into 구문을 이용해 책을 6을 넣어보겠습니다.
insert into library values ('불편한 편의점', 12600, '나무옆의자', '김호연', 268);
insert into library values('달러구트 꿈 백화점', 21600, '팩토리나인', ' 이미예', 552);
insert into library values('돈의 심리학', 17800, '인플루엔셜', '모건 하우절', 396);
insert into library values('미드나잇 라이브러리', 14200, '인플루엔셜', '매트 헤이그', 408);
insert into library values('그 해 우리는', 16650, '김영사', '이나은', 556);
insert into library values('부자 아빠 가난한 아빠', 14200, '민음인', '로버트 기요사키', 448); 
	
  -- 테이블을 일괄적으로 날려버리는 명령어
  drop table library;
    
 SELECT * FROM library; 
 
 -- employees를 사용 스키마로 지정해주세요.(명령어로)
 use employees;
 
 -- employees 내부의 emplyoyees 테이블을 조회해주세요.
 -- SQL 구문 명령구문은 무조건 대문자, 테이블명이나 호칭 등은
 -- 소문자로 작성하는 것이 관례입니다.
 -- 무조건 지키지 않아도 실행은 가능하지만 가독성 측면을 위해 고수하는 경우가 많습니다.
 
 SELECT * from employees;
 
 -- 스키마명.테이블명으로 조회할 때는 use중이지 않은 스키마의 테이블도 조회할 수 있습니다.
 -- ict_practice2의 library를 조회해보세요.
 
 SELECT * FROM ict_ppractice2.library;
 
 -- 컴럼을 전체가 아닌 임의로 가져올때는 컬럼명을 ,로 구분합니다.
 -- 이 경우 모든 컬럼이 아닌 일부 컬럼만 조회할 수도 있으며
 -- 심지어 한 개의 컬럼만 조회하는 등 개수조절도 가능합니다.
 SELECT gender, first_name, last_name FROM employees;
 
-- CMD환경에서는 좌측 스키마처럼 스키마 목록을 보여주는 창이 없으므로
-- 아래 명령어를 이용해 SCHEMA 목록을 확인할 수 있습니다.
SHOW databases;
-- CMD환경 로그인 명령어 -> mysql -u 계정명 -p

-- 현재 DB정보를 조회하기 위해서는 
SHOW TABLE STATUS;

-- 특정 테이블의 컬럼 정보를 보고 싶다면 아래 명령어를 씁니다.
-- DESCRIBE 테이블명; 혹은 DESC 테이블명;
DESCRIBE employees;
DESC employees;

-- ict_ppractice2를 디폴트 스키마로 잡아주세요.
use ict_ppractice2;

-- 테이블을 생성합니다.
-- 테이블 생성시 적힌 제약조건과 컬럼명을 이용해 만들어주세요.

/*테이블명 : userTbl

user_id 컬럼 - String 8글자, PRIMARY KEY
user_name 컬럼 - String 10글자, not null
user_year 컬럼 - int 4자리, not null
addr 컬럼 - String 4글자, not null
phone_number-String 11글자
height - int 3자리
reg_date - DATE(라고만 적어주세요)
book_name varchar(30) primary key, -- 이름
	book_price int(7) not null,	-- 가격
	book_pub varchar(20) not null, -- 출판사
	book_writer varchar(10) not null, -- 저자
	book_page int(5) not null -- 페이지수
*/

CREATE TABLE userTbl(
	user_id VARCHAR(8) PRIMARY KEY,
    user_name VARCHAR(10) NOT NULL,
    user_year INT(4) NOT NULL,
    addr VARCHAR(4) NOT NULL,
    phone_number VARCHAR(11) NOT NULL,
    height INT(3),
    reg_date DATE
    );




