SELECT * FROM DBA_USERS; --���� �����ͺ��̽��� ��ϵ� �������� ��ȸ�ϴ� ��ɾ�
--�⺻���� ��ɾ� �����Ϸ��� ��ɾ�(������) �ۼ� ���ο� Ŀ���� �ΰ� CTRL+ENTER
--����ŬDB�� �⺻������ ��ɾ 1���� �����Ѵ�. 
SELECT*FROM TAB; --���� ������ ��ϵ� ���̺��� ��ȸ

--������ �̿��� �������� ����Ŭ�� �̿��ڿ��� DB������ �����ϱ� ���� ���� ������ ���̺� -> DATA DICTIONARY
--����Ŭ�� �⺻������ DB������ ������ �ڵ����� �ο���
--SYSTEM : �Ϲݰ����� ���� -> DB�� ���� �� ������ ������ ����. ����ڰ��� ��� �� ���Ѻο� ����
--SYS : ���۰����� ���� -> DB ���� �� ���� ����, ����ڰ��� ��� �� ���Ѻο��� ����
--SYS AS SYSDBA : ���۰����� �������� ����

--�⺻������ DB�� �̿��ϴ� ����ڰ����� ����ϰ� �̿��غ���.
--����� ������ SYSTEM/SYS AS SYSDBA ������ ����Ѵ�.
--DB�� �̿��Ϸ��� �ݵ�� ������ �־���Ѵ�.
--CREATE USER ������ IDENTIFIED BY ��й�ȣ -> �������� ������. ����� ��ҹ��� ������.
CREATE USER KH IDENTIFIED BY KH;
SELECT * FROM DBA_USERS;
--GRANT ����||�� TO ������;  -> ���� �ο��ϱ�
--CONNECT[ROLE] : ������ DB�� ������ �� �ִ� ���� �ο�
GRANT CONNECT TO KH; -- ������ �� �ִ� ���� �ο�

--������ KH�������� ��ȸ�غ���
--�����͸� Ȯ��Ȱ ���� Ȯ��
SELECT * FROM TAB;
CREATE TABLE TEST1(
    NAME VARCHAR2(20)
); 

-- DROP TABLE TEST1 : 'TEST1' ���̺� ����

--���̺��� �����Ϸ��� ������ �� �ִ� ������ �־����.
--RESOURCE (ROLE)�� �ο� : ���̺��� �����ϰ� �̿��� �� �ִ� ������ �ִ� ROLE;
GRANT RESOURCE TO KH;

CREATE USER TEST IDENTIFIED BY TEST;
GRANT CONNECT, RESOURCE TO TEST;
CREATE TABLE TEST2(
    NAME VARCHAR2(20)
);

--DATA DICTIONARY
SELECT * FROM DICT; --������, ����� ������ �̿��Ѵ�.
SELECT *
FROM EMPLOYEE; -- SELECT * FROM ���̺�� -> ���̺��� ��� ������ ��ȸ
DESC EMPLOYEE; -- Ư�� ���̺� � �÷��� �ִ��� ��ȸ
SELECT * FROM DEPARTMENT;

--�⺻ SELECT�� Ȱ��
--SELECT �÷���, �÷��� ....... �߰����� 
--FROM ���̺�

SELECT EMP_ID, EMP_NAME, EMP_NO
FROM EMPLOYEE;

----------------------- 2021-02-26
 
 --RESULT SET���� ROW ���͸� ���������� WHERE
SELECT *
FROM EMPLOYEE
WHERE SALARY<=3500000;

--DB���� ��κ� SELECT �� �ȿ��� �̷������ -> �Լ�����, ������� ��
--�÷����� ���� ������ ������� ����.
SELECT 10+20
FROM DUAL; --ORACLE�� �����ϴ� �׽�Ʈ�� ���̺�

SELECT SALARY, BONUS, SALARY+SALARY*BONUS
FROM EMPLOYEE;

--EMPLOYEE ���̺��� �� ����� ���� ��ȸ
--�÷��� AS �������÷��� (AS �����ϰ� �������ΰ���) "�������÷���" -> ""�ȿ� ������ ������⳪ Ư����ȣ ��� ����
SELECT EMP_NAME �����, SALARY*12 ����, (SALARY+SALARY*BONUS)*12 AS ���������Կ���
FROM EMPLOYEE;
--���� �÷����� �߰��� �ȴ�
SELECT EMP_NAME, '��', 100
FROM EMPLOYEE;

SELECT DISTINCT DEPT_CODE --�÷� �ߺ����� �����ϰ� ���
FROM EMPLOYEE;

SELECT DISTINCT DEPT_CODE, JOB_CODE -- ���� �÷��� ������ �ش� �÷��鳢�� ROW���� ��ġ�� �Ÿ� ����
FROM EMPLOYEE;

SELECT EMP_NAME||'��', SALARY||'��' --�÷��� ����
FROM EMPLOYEE;

--EMPLOYEE ���̺��� ����� �������� ��ü �÷� ��ȸ
SELECT *
FROM EMPLOYEE
WHERE EMP_NAME='������';
--�ڵ尡 D5�� ��� ��ȸ
SELECT*
FROM EMPLOYEE
WHERE DEPT_CODE='D5';
--�޿��� 2�鸸�� �̻��� ��� ��ȸ
SELECT *
FROM EMPLOYEE
WHERE SALARY>2000000;

--�ڵ尡 D5 Ȥ�� D6�� ����� �����,�޿�,�ڵ� ��ȸ
SELECT EMP_NAME, SALARY, DEPT_CODE
FROM EMPLOYEE
WHERE DEPT_CODE='D5' OR DEPT_CODE='D6';

--�μ��ڵ尡 D5�� �ƴ� ����� ��ȸ
SELECT *
FROM EMPLOYEE
WHERE NOT DEPT_CODE='D5';

--EMPLOYEE ���̺��� �޿� 300~500���� ����� �̸�, �޿�, �μ��ڵ� ��ȸ
SELECT EMP_NAME, SALARY, DEPT_CODE
FROM EMPLOYEE
WHERE SALARY>3000000 AND SALARY<5000000;
--WHERE �÷� BETWEEN �� AND �� ���
SELECT EMP_NAME, DEPT_CODE, SALARY
FROM EMPLOYEE
WHERE SALARY BETWEEN 3000000 AND 5000000;

DESC EMPLOYEE; --���̺� � �÷��� �ִ��� ��ȸ
--������� 00/01/01 ������ �Ի��� ����� �̸�, �μ�, ����� ��ȸ
SELECT EMP_NAME, DEPT_CODE, HIRE_DATE
FROM EMPLOYEE
WHERE HIRE_DATE<'00/01/01';

--������� 09/01/01~00/01/01 ���̿� �Ի��� ����� �̸�, �μ�, ����� ��ȸ
SELECT EMP_NAME, DEPT_CODE, HIRE_DATE
FROM EMPLOYEE
WHERE HIRE_DATE BETWEEN '90/01/01' AND '00/01/01';


--LIKE : Ư�� ������ ���ڰ� ��ȸ
-- ���ϵ�ī�带 ����ؼ� ��ȸ %, _
-- % : 0�� �̻��� ������ ���� ǥ��
-- _ : 1���� ������ ���� ǥ��

-- 1) ���ڸ��� ze�� ���� : ze% (�տ��� ze�� �����ϴ°� ������ �����Ͷ�)
-- 2) ���ڸ��� com���� ���� : %com (com���� �����°� ������ �����Ͷ�)
-- 3) �����߿� a�� n�� ���� : %a%n% (��� ��ġ�� �ִ����� ������ �����߿� a �� n�� �����ϴ°� ������ �����Ͷ�)

--���� ���� ���� ����� �̸�, �ڵ�, �޿� ��ȸ
SELECT EMP_NAME, DEPT_CODE, SALARY
FROM EMPLOYEE
WHERE EMP_NAME LIKE '��_%';

--�̸��� �� �� ���Ե� ��� ��ȸ
SELECT EMP_NAME, DEPT_CODE, SALARY
FROM EMPLOYEE
WHERE EMP_NAME LIKE '%��%';

--Ư����ȣ�� �������� ������ ESCAPE ���
SELECT*
FROM EMPLOYEE
WHERE EMAIL LIKE '___A_%' ESCAPE 'A';

--�� ���� �ƴ� ��� ��ȸ
SELECT *
FROM EMPLOYEE
WHERE NOT EMP_NAME LIKE '��%';

--NULL �� ����ó���� �ȵȴ�. 
--IS NULL : NULL ���� �� ã��

--���ʽ� ���޴� ��� ��ȸ......
SELECT *
FROM EMPLOYEE
WHERE BONUS IS NULL;

--�μ� �������� ��ȸ
SELECT *
FROM EMPLOYEE
WHERE DEPT_CODE IS NULL;

--IN/ NOT IN : ���Եƴ��� �ȵƴ���
SELECT *
FROM EMPLOYEE
WHERE (JOB_CODE='J7' OR JOB_CODE='J2') AND SALARY>2000000;

------------------ 2021-03-02

--ORDER BY : ������ ���� ����
-- ASC : ��������, DESC : ��������
--ORDER BY ������ �׻� �� �������� �ۼ�
SELECT *
FROM EMPLOYEE
-- ORDER BY SALARY DESC; --��������
ORDER BY DEPT_CODE DESC NULLS LAST; -- NULLS LAST, NULLS FIRST �߰� ����
-- ORDER BY 3 DESC -- 3��° COLUMN ����, ��Ī�� ��밡��

--LENGTH(���ڿ�||�÷���) : ���ڿ� ���� ��ȯ
SELECT LENGTH(EMAIL)
FROM EMPLOYEE;
-- EMAIL ���̰� 16�̻��� ����� ��ü �÷� ��ȸ
SELECT *
FROM EMPLOYEE
WHERE LENGTH(EMAIL)>=16;
-- LENGTHB(���ڿ�||�÷���) : ���ڿ� BYTE ũ��

-- INSTR(��� ���ڿ�||�÷�, ã�� ����[, ������ġ, Ƚ��]) : ������ ��ġ���� ������ Ƚ����°�� ��Ÿ�� ���ڿ� �ε��� ��ȯ
SELECT INSTR('KH����������KH', 'KH',1,1) FROM DUAL; -- 1, �ѹ� ã���� �� // ������ġ�� ������ �ڿ��� ���� ã�´ٴ� ��
--EMAIL���� @��ġ, �ι�° . �� ��ġ ã��
SELECT INSTR(EMAIL,'@'), INSTR(EMAIL,'.',1,2)
FROM EMPLOYEE;

-- LPAD(��) / RPAD(����) : Ư�� ������ ������ ����� �� ������ ��ü���ڷ� ä��.
--LPAD(����ڿ�, ��������[,��ü����])
SELECT '�ȳ�', LPAD('�ȳ�', 10) FROM DUAL; -- ��ü���� ���������� ����� ��ü

-- LTRIM/RTRIM(�����||�÷�[,����) : �����̳� Ư�� ��ȣ ���� // TRIM �� ���� ����
SELECT LTRIM('              ����ȣ')
FROM DUAL;

-- SUBSTR('���ڿ�', �����ε���[,����]) : ������ ��ġ�� ������ ���ڿ��� �߶󳻴� ���
SELECT SUBSTR('HELLO FUNCTION', 6)
FROM DUAL;
-- �̸����� ���� ���
SELECT SUBSTR(EMP_NAME,1,1)
FROM EMPLOYEE;

--LOWER/UPPER/INICAP : �ҹ��ڷ�,�빮�ڷ�, ���� ������ �빮�ڷ� ���

--REPLACE(����÷�, ��� ���ڿ�[, ��ü���ڿ�])
SELECT REPLACE(EMAIL, '@', '!!!!!!')
FROM EMPLOYEE;
--REVERSE : ���ڿ� �Ųٷ�
SELECT REVERSE('MUYAHO~ HE IS GOING CRAZY')
FROM DUAL; --YZARC GNIOG SI EH ~OHAYUM

--TRANSLATE(����ڿ�,ġȯ���,ġȯ���ڿ�)
SELECT TRANSLATE('��~��~ȣ~','����ȣ','�ų���')
FROM DUAL;

SELECT * FROM EMPLOYEE;
--EMPLOEE���̺��� �����ȣ, �����, �ֹι�ȣ, ������ȸ
-- �ֹι�ȣ�� ������� ������ �������� * �� ǥ��
SELECT EMP_ID, EMP_NAME, SUBSTR(EMP_NO, 1, 7)||'*******'
FROM EMPLOYEE;

--MOD(A, B) // A��B�� ������ ��ȯ
SELECT MOD(10,3) FROM DUAL; -- 1

--ROUND(�Ǽ�, �Ҽ��� �ڸ� ��) : �Ǽ��� �Ҽ��� �ڸ������� ����� �� �ڴ� �ݿø� // ���� ����
SELECT ROUND(1.12345, 2)
FROM DUAL; -- 1.12

--FLOOR : �Ҽ��� ����
SELECT FLOOR(1.2345) FROM DUAL; -- �Ҽ����ڸ� ����

--TRUC : ���� ��ġ �� �Ҽ��� �ڸ� ����
SELECT TRUNC(1.234, 2) FROM DUAL;

-- SYSDATE : ���糯¥ ��ȯ
SELECT SYSDATE FROM DUAL; -- +, - �� �Ϸ���ϰ��� ����

--ADD_MONTHS : ������ ����
SELECT ADD_MONTHS(HIRE_DATE, 3) -- 3���� ����
FROM EMPLOYEE;

--MONTHS_BETWEEN : �� ��¥�� ���� �� ���� ��ȯ
--EMPLOYEE ���̺��� ����� �ٹ��������� ���Ͻÿ�
SELECT EMP_NAME, DEPT_CODE, SALARY, FLOOR(MONTHS_BETWEEN(SYSDATE, HIRE_DATE)) AS �ٹ�������
FROM EMPLOYEE;

-- NEXT_DAY : ���� ������ ���� ����� ��¥ ��ȯ
-- LAST_DAY : �� ���� ������ �� ���
-- EXTRACT : ����Ͻú��� �� ���� ���������� ��ȯ
SELECT EXTRACT(YEAR FROM SYSDATE)
FROM DUAL;
-- �ú���  
SELECT EXTRACT(HOUR FROM CAST(SYSDATE AS TIMESTAMP)) FROM DUAL;
-- �����, �Ի糯(����) ���
SELECT EMP_NAME, TO_CHAR(HIRE_DATE, 'YYYY/MM/DD (DY)')
FROM EMPLOYEE;

SELECT SYSDATE+540, 
FROM DUAL;
