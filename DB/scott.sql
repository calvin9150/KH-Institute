CREATE USER scott IDENTIFIED BY tiger;
--GRANT 권한||롤 TO 계정명;  -> 특정 권한 부여하기
--CONNECT[ROLE] : 계정이 DB에 접속할 수 있는 권한 부여
GRANT CONNECT TO scott; -- 접속할 수 있는 권한 부여
GRANT RESOURCE TO scott;

select * from emp;