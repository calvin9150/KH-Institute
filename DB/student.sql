CREATE TABLE MEMBER(
MEMBER_ID VARCHAR2(15) PRIMARY KEY,
MEMBER_PWD VARCHAR2(15) NOT NULL,
MEMBER_NAME VARCHAR(20) NOT NULL,
GENDER CHAR(1) CONSTRAINT CK_CKECK CHECK(GENDER IN ('M','F')),
AGE NUMBER NOT NULL,
EMAIL VARCHAR2(30),
PHONE CHAR(11),
ADDRESS VARCHAR2(500),
HOBBY VARCHAR2(50),
ENROLL_DATE DATE
);
SELECT * FROM MEMBER;
-- 테이블 컬럼에 COMMENTS 설정하기
-- COMMENT ON COLUMN 테이블.컬럼명 IS 코멘트내용
COMMENT ON COLUMN MEMBER.MEMBER_ID IS '회원아이디';
COMMENT ON COLUMN MEMBER.MEMBER_PWD IS '회원비번';

COMMENT ON COLUMN MEMBER.ENROLL_DATE IS '가입날짜';

INSERT  INTO MEMBER (MEMBER_ID, MEMBER_PWD, MEMBER_NAME, GENDER, AGE, EMAIL, PHONE, ADDRESS, HOBBY, ENROLL_DATE) VALUES ('admin','admin', '관리자', 'M', '30', 'admin@iei.or.kr', '01012345678', '서울시 강남구 역삼동 테헤란로 7', 
'기타,독서,운동', '16/03/15');

INSERT INTO MEMBER VALUES ('user11', 'pass11', '홍길동', 'M', '23', 'hong@kh.org', '01017778888', '경기도 수원시 팔달구 팔달동 77', '운동,등산,기타','17/09/21');
INSERT INTO MEMBER VALUES 
('user22', 'pass22', '신사임당', 'F', '48', 'shin50@kh.org', '01050005555', '강원도 강릉시 오죽헌 5', '독서,그림,요리','17/05/05');
INSERT INTO MEMBER VALUES 
('user77', 'pass77', '이순신', 'M', '50', 'dltnstls@naver.com', '01021226374', '경기도시흥시', '음악','17/12/08');
INSERT INTO MEMBER VALUES 
('lsj', 'lsj', '이선주', 'F', '24', 'dltjswn@naver.com', '01021226377', '경기도 안산시', '운동,음악,댄스','17/08/25');
INSERT INTO MEMBER VALUES 
('seonn', 'seonn', '김공부', 'F', '28', 'study11@naver.com', '01021226312', '경기도 성남시', '공부,책읽기','17/11/08');

ALTER USER TEST IDENTIFIED BY TEST;

--위에서 이용한 쿼리문은 오라클이 이용자에게 DB정보를 제공하기 위해 만든 가상의 테이블 -> DATA DICTIONARY
--오라클은 기본적으로 DB관리자 계정을 자동으로 부여함
--SYSTEM : 일반관리자 계정 -> DB를 생성 및 삭제할 관리는 없다. 사용자계정 등록 및 권한부여 역할
--SYS : 수퍼관리자 계정 -> DB 생성 및 삭제 가능, 사용자계정 등록 및 권한부여도 가능
--SYS AS SYSDBA : 수퍼관리자 계정으로 접속

--기본적으로 DB를 이용하는 사용자계정을 등록하고 이용해보기.
--사용자 계정은 SYSTEM/SYS AS SYSDBA 계정이 등록한다.
--DB를 이용하려면 반드시 계정이 있어야한다.
--CREATE USER 계정명 IDENTIFIED BY 비밀번호 -> 계정생성 쿼리문. 비번만 대소문자 구분함.
CREATE USER KH IDENTIFIED BY KH;
CREATE USER SAMPLE IDENTIFIED BY USER;
SELECT * FROM DBA_USERS;
--GRANT 권한||롤 TO 계정명;  -> 특정 권한 부여하기
--CONNECT[ROLE] : 계정이 DB에 접속할 수 있는 권한 부여
GRANT CONNECT TO KH; -- 접속할 수 있는 권한 부여

--접속한 KH계정으로 조회해보기
--데이터를 확보활 공간 확보
SELECT * FROM TAB;
CREATE TABLE TEST1(
    NAME VARCHAR2(20)
); 

-- DROP TABLE TEST1 : 'TEST1' 테이블 삭제

--테이블을 생성하려면 생성할 수 있는 권한이 있어야함.
--RESOURCE (ROLE)를 부여 : 테이블을 생성하고 이용할 수 있는 권한이 있는 ROLE;
GRANT RESOURCE TO KH;

SELECT * FROM MEMBER;

