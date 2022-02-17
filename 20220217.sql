-- [조인(JOIN)]
-- 테이블 2개를 합쳐주는 기능
-- 연관된 데이터를 여러 테이블에 나눠담았을때
-- 그것을 다시 재조립해줍니다.
-- 조인 문법
-- SELECT 테이블1.컬럼1, 테이블1.컬럼2, 테이블2.컬럼1, 테이블2.컬럼2...
-- 	 	FROM 테이블1 조인구문 테이블2
-- 		ON 테이블1.공통커럼 = 테이블2. 공통 컬럼;
use ict_ppractice2;
-- userTbl과 buyTbl을 조회해보겠습니다
-- cmd에서도 조회해서 캡쳐해서 보내주세요
select*
from buytbl;

-- 조인구문으로 테이블 2개를 합치기
select * from buytbl inner join usertbl
on buytbl.user_id = usertbl.user_id;

-- 지금 현재 구매자 정보를 조회하려고 하는데 필요한 정보는,
-- buytbl의 구매 물품정보 전체에, 구매자 정보는 택배를 받기 위해서
-- 이름, 주소, 핸드폰 번호만 있으면 되는 상황입니다.
-- 조인 구문을 활용해 필요한 컬럼만 출력되게 수정해주세요.
SELECT user_name, addr, phone_number
FROM userTbl
INNER JOIN buyTbl
ON userTbl.user_id = buyTbl.user_id;

SELECT buyTbl.order_number, buyTbl.user_id, buyTbl.prod_name, buyTbl.group_name,
		buyTbl.price, buyTbl.amount, userTbl.user_name, userTbl.addr, userTbl.phone_number
FROM buyTbl
INNER JOIN userTbl
ON buyTbl.user_id = userTbl.user_id;

-- 위의 경우처럼 특정 테이블의 전체 데이터를 출력하는 경우는
-- 테이블명.*로 대체할 수 있습니다.
SELECT buytbl.*,
	userTbl.user_name, userTbl.addr, userTbl.phone_number
    FROM buytbl
    INNER JOIN userTbl
    ON buytbl.user_id = userTbl.user_id;
    
-- FROM구문에서 테이블명만 적는게 아니라, 테이블명 별명 형식으로 적는 경우는
-- 테이블명을 풀로 적지 않고 별명으로 대체해서 호출할 수 있다.
-- buyTbl은 b라는 별명을 붙이고 userTbl에는 u라는 병명을 붙이는 구문을 
-- 아래와 같이 작성하고, 아래에 제시된 구문은 수정해서
-- buyTbl의 구매 물품정보 전체에, 구매자 정보는 이름과, 주소, 휴대폰 번호만
-- 조회되도록 만들어주세요( 단, buyTbl.*과 같은 생략구문은 쓰지 마세요.)
SELECT b.order_number, b.user_id, b.prod_name, b.group_name, b.price,
		u.user_name, u.addr, u.phone_number
	FROM buyTbl b
    INNER JOIN userTbl u
    ON b.user_id = u.user_id;

-- WHERE절 역시 JOIN문 뒤에 붙여서 쓸 수 있고, 필터링을 담당합니다.
-- 위의 구문에 구매물품 가격이 50000원 이상인 것만 남도록 처리해주세요.
SELECT b.order_number, b.user_id, b.prod_name, b.group_name, b.price,
		u.user_name, u.addr, u.phone_number
	FROM buyTbl b
    INNER JOIN userTbl u
    ON b.user_id = u.user_id
	WHERE b.price > 50000;


-- 위쪽 JOIN구문을 활용하시되, 가격이 200000 이하인 품목만 남겨주시고
-- 그 남은 자료들을 가격순으로 내림차순 출력해주세요.
SELECT b.order_number, b.user_id, b.prod_name, b.group_name, b.price,
		u.user_name, u.addr, u.phone_number
	FROM buyTbl b
    INNER JOIN userTbl u
    ON b.user_id = u.user_id
	WHERE b.price <= 200000
	ORDER BY b.price DESC;

-- LEFR JOIN, RIGHT JOIN은 '공통데이터가 아닌 데이터'도 방향에 따라
-- 출력이 되기 때문에 공통데이터(INNER)가 아닌 데이터(OUTER)까지
-- 출력된다는 점을 이용해 OUTER JOIN이라고 부릅니다.
-- LEFT OUTER JOIN은 JOIN시 왼쪽 테이블의 자료는 모두 출력하고
-- 오른쪽 테이블 데이터는 왼쪽 기준 컬럼과 일치할때만 출력합니다.
-- 반대로 RIGHT OUTER JOIN은 JOIN구문의 오른쪽 테이블의 자료는 전부 출력하고
-- 왼쪽 테이블 데이터는 오른쪽 테이블의 기준컬럼과 일치할 때만 출력한다.

SELECT*
FROM userTbl;
-- 가입회원 11명
select*
from buytbl;
-- 구매이력이 있는 회원 5명

-- LEFT JOIN키워드를 쓰시되, userTbl을 왼쪽에, buyTbl을 오른쪽에 두고 작성
-- 테이블 갈럼은 전체 출력으로 합니다.
SELECT*
FROM userTbl u
LEFT JOIN buyTbl b
ON u.user_id = b.user_id;

-- RIGHT JOIN키워드로도 똑같이 조인 시도를 한 번 해보세요.
SELECT *
FROM userTbl u
RIGHT JOIN buyTbl b
ON b.user_id = u.user_id;

-- 이해를 돕기 위한 추가 테이블 추가
CREATE
TABLE student(-- 학교
	user_name VARCHAR(3) PRIMARY KEY,
    user_addr CHAR(2) NOT NULL
    );
CREATE
TABLE membership( -- 회원 멤버쉽
user_name VARCHAR(3) PRIMARY KEY,
user_point INT NOT NULL
);

INSERT INTO student VALUES('강건미', '서울');
INSERT INTO student VALUES('노영웅', '수원');
INSERT INTO student VALUES('이상웅', '인천');
SELECT*FROM student

INSERT INTO membership VALUES('노영웅', 37000);
INSERT INTO membership VALUES('김철수', 2800);
INSERT INTO membership VALUES('강건미', 15000);
SELECT * FROM membership;
-- user_name을 공통 컬럼으로 해서 INNER JOIN을 수행해보세요.
-- 출력컬럼은 전부 다 입니다.
SELECT*
FROM student s
INNER JOIN membership m
ON s.user_name = m.user_name;

-- user_name을 공통 컬럼으로 해서 LEFT JOIN을 수행해보겠습니다.
SELECT *
FROM student s
LEFT JOIN membership m
ON s.user_name = m.user_name;

SELECT *
FROM student s
RIGHT JOIN membership m
ON m.user_name = s.user_name;

-- MySQL에서는 FULL OUTER JOIN(양쪽의 모든 데이터를 살림)이 안된다.
-- LEFT JOIN구문과 RIGHT JOIN구문 사이에 UNION을 집어넣어 구현합니다.
-- 2줄의 쿼리문 사이에 UNION 키워드를 배치해 하나로 연결해 실행하면 됩니다.
SELECT *
FROM student s
LEFT JOIN membership m
ON s.user_name = m.user_name
UNION
SELECT *
FROM student s
RIGHT JOIN membership m
ON m.user_name = s.user_name;