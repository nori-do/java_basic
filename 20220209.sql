-- 1. 데이터베이스 생성 명령
-- DB 생성시 한글을 쓸 수 있도록 -> defauly character set utf8;
create database ict_ppractice2 default character set utf8;

/* 우측 하단의 schemas 클릭 후, 새로고침 한 다음 ict_practice2 우클릭
-> set as default schema를 클릭하세요. 이러면 현재 명령을 받을 DB로 선택됩니다. */

-- default schema 지정은 명령어로도 할 수 있습니다.
-- use 스키마명; 을 사용하면 좌측 schemas에서 우클릭 후 default 스키마 지정한 효과를
-- 낼 수도 있습니다.
use sys;
use ict_practice2;

-- 테이블 생성 명령
-- primary key - 컬럼의 주요 키를 뜻하면, 중복 데이터를 방지합니다.
-- 테이블 내의 하나의 컬럼은 반드시 primary key 속성을 가져야 표준을 따르는 것입니다.
-- not null - 데이터에 null 값이 들어오는 것을 방지합니다.

-- 테이블은 클래스와 구조가 비슷합니다. 클래스 내부의 멤버 변수를 지정하듯이
-- 테이블 내부 요소를 지정할 수 있습니다.
-- varchar는 잡자의 String과 호환됩니다.
CREATE TABLE users(
	id varchar(20) primary key,
    pw varchar(20) not null,
    user_name varchar(30) not null,
    email varchar(80)
    );
    
    /* 데이터 적재하기
    INSERT INTO 테이블명 (컬럼1, 컬럼2...) VALUE(S)(컬럼1값, 컬럼2값...);
    만약 모든 컬럼을 대상으로 지정시 컬럼은 생략하고 VALUE(S) 이후 값만 지정할 수 있다.
    INSERT INTO 테이블명 VALUE(S) (컬럼1값, 컬럼2값, ...); */
    INSERT INTO users (id, pw, user_name, email) value
	('abc1234', 'asdf', '김자바', 'asdf@asdf.com');
    insert into users values ('cba4321', 'fdsa', '바자김', 'fdsa@fdsa.com');
    
    SELECT * FROM users; 
    
    -- 여러분이 계정 3개를 더 넣어주시되, 1개 계정은 이메일 없이 넣어주세요.
    -- 이메일 없이 넣는 경우는 id, pw, user_name에만 값을 넣겠다고 선언해야합니다.
    insert into users values ('qwe1234', 'qwer', '자바김', 'qwer@qwer.com');
	insert into users values ('qwe4321', 'qwe12', '바김', 'qr@qwer.com');
    insert into users values ('qwer1324', 'wqer', 'qwerqwe', null);
    -- 이메일 생략을 할 때는 테이블 명 뒤에 email을 뺀 나머지만 기입해서 넣거나
    -- 혹은 전체 컬럼에 값을 넣어주되 email 자리에 null을 넣어줍니다.
    -- INSERT INTO users VALUES(id, pw, user_name)VALUES('sddds','sddssd','sdsdds')
    
    /*데이터 조회하기
    SELECT 컬럼1, 컬럼2... FROM 테이블명;
    을 적으면 테이블에 적재된 데이터 조회 가능
    SELECT * FROM 테이블명; 으로 조회시 해당 테이블 전체 컬럼 조회가능 */
    -- *대신 컬럼명 기입으로 USERS 테이블의 전체 자료를 조회해보세요.
    select id, pw, user_name, email from users;
    -- select * from users;