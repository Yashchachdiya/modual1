CREATE TABLE Department (
    Deptno INT PRIMARY KEY,
    dname VARCHAR(20),
    loc VARCHAR(20)
);

INSERT INTO Department (Deptno, dname, loc) VALUES
(10, 'ACCOUNTING', 'NEW YORK'),
(20, 'RESEARCH', 'DALLAS'),
(30, 'SALES', 'CHICAGO'),
(40, 'OPERATIONS', 'BOSTON');

CREATE TABLE Student (
    Rno INT(2) PRIMARY KEY DEFAULT 0,
    Sname VARCHAR(14) NULL,
    City VARCHAR(20) NULL,
    State VARCHAR(20) NULL
);


CREATE TABLE Emp (
    Empno INT PRIMARY KEY,
    ename VARCHAR(20),
    job VARCHAR(20),
    mgr INT,
    hiredate DATE,
    sal DECIMAL(7, 2),
    comm DECIMAL(7, 2),
    deptno INT,
    FOREIGN KEY (deptno) REFERENCES Department(Deptno)
);
INSERT INTO Emp (Empno, ename, job, mgr, hiredate, sal, comm, deptno) VALUES
(7369, 'SMITH', 'CLERK', 7902, '1980-12-17', 800.00, NULL, 20),
(7499, 'ALLEN', 'SALESMAN', 7698, '1981-02-20', 1600.00, 300.00, 30),
(7521, 'WARD', 'SALESMAN', 7698, '1981-02-22', 1250.00, 500.00, 30),
(7566, 'JONES', 'MANAGER', 7839, '1981-04-02', 2975.00, NULL, 20),
(7654, 'MARTIN', 'SALESMAN', 7698, '1981-09-28', 1250.00, 1400.00, 30),
(7698, 'BLAKE', 'MANAGER', 7839, '1981-05-01', 2850.00, NULL, 30),
(7782, 'CLARK', 'MANAGER', 7839, '1981-06-09', 2450.00, NULL, 10),
(7788, 'SCOTT', 'ANALYST', 7566, '1987-06-11', 3000.00, NULL, 20),
(7839, 'KING', 'PRESIDENT', NULL, '1981-11-17', 5000.00, NULL, 10),
(7844, 'TURNER', 'SALESMAN', 7698, '1981-08-09', 1500.00, 0.00, 30),
(7876, 'ADAMS', 'CLERK', 7788, '1987-07-13', 1100.00, NULL, 20),
(7900, 'JAMES', 'CLERK', 7698, '1981-03-12', 950.00, NULL, 30),
(7902, 'FORD', 'ANALYST', 7566, '1981-03-12', 3000.00, NULL, 20),
(7934, 'MILLER', 'CLERK', 7782, '1982-01-23', 1300.00, NULL, 10);

--1. SELECT UNIQUE job FROM EMP table. 

SELECT DISTINCT job
FROM Emp;

--2. LIST the details of the emps IN ASC ORDER of the Dptnos AND DESC of Jobs? 

SELECT *
FROM Emp
ORDER BY deptno ASC, job DESC;

--3. Display ALL the UNIQUE job groups IN the descending ORDER? 

SELECT DISTINCT job
FROM Emp
ORDER BY job DESC;

--4. LIST the emps who joined BEFORE 1981. 

SELECT *
FROM Emp
WHERE hiredate < '1981-01-01';

--5. LIST the Empno, Ename, Sal, Daily sal of ALL emps IN the ASC ORDER of Annsal. 

SELECT Empno, Ename, Sal, (Sal / 30) AS Daily_Sal
FROM emp
ORDER BY (Sal * 12) ASC;

--6. LIST the Empno, Ename, Sal, EXP of ALL emps working FOR Mgr 7369. 

SELECT Empno, Ename, Sal, (SYSDATE - Hiredate)/365 AS EXP
FROM emp
WHERE Mgr = 7369;

--7. Display ALL the details of the emps who’s Comm. IS more THAN their Sal? 

SELECT * 
FROM emp
WHERE Comm > Sal;

--8. LIST the emps who are either ‘CLERK’ OR ‘ANALYST’ IN the DESC order.

SELECT * 
FROM emp
WHERE job IN ('CLERK', 'ANALYST')
ORDER BY job DESC;

--9. LIST the emps Who Annual sal ranging FROM 22000 AND 45000. 

SELECT * 
FROM emp
WHERE (Sal * 12) BETWEEN 22000 AND 45000;

--10.List the Enames those are STARTING WITH ‘S’ AND WITH five characters. 

SELECT Ename
FROM emp
WHERE Ename LIKE 'S____';

--11.List the emps whose Empno NOT STARTING WITH digit78.

SELECT * 
FROM emp
WHERE Empno NOT LIKE '78%';

--12. LIST ALL the Clerks of Deptno 20. 

SELECT * 
FROM emp
WHERE job = 'CLERK' AND deptno = 20;

--13. LIST the Emps who are senior TO their own MGRS.

SELECT e.Empno, e.Ename, e.Hiredate AS Emp_Hiredate, m.Empno AS Mgr_Empno, m.Ename AS Mgr_Ename, m.Hiredate AS Mgr_Hiredate
FROM emp e
JOIN emp m ON e.Mgr = m.Empno
WHERE e.Hiredate < m.Hiredate;

--14. LIST the Emps of Deptno 20 who’s Jobs are same AS Deptno10. 

SELECT e.Empno, e.Ename, e.Job, e.Deptno
FROM emp e
WHERE e.Deptno = 20
AND e.Job IN (SELECT Job FROM emp WHERE Deptno = 10);

--15. LIST the Emps who’s Sal IS same AS FORD OR SMITH IN DESC ORDER of Sal. 

SELECT Empno, Ename, Sal
FROM emp
WHERE Sal IN (SELECT Sal FROM emp WHERE Ename IN ('FORD', 'SMITH'))
ORDER BY Sal DESC;

--16.List the emps whose jobs same AS SMITH OR ALLEN. 

SELECT Empno, Ename, Job
FROM emp
WHERE Job IN (SELECT Job FROM emp WHERE Ename IN ('SMITH', 'ALLEN'));

--17.Any jobs of deptno 10 those that are NOT FOUND IN deptno 20.

SELECT Job
FROM emp
WHERE Deptno = 10
AND Job NOT IN (SELECT Job FROM emp WHERE Deptno = 20);

--18.Find the highest sal of EMP table. 

SELECT MAX(Sal) AS Highest_Salary
FROM emp;

--19.Find details of highest paid employee

SELECT * 
FROM emp
WHERE Sal = (SELECT MAX(Sal) FROM emp);

--20.Find the total sal given TO the MGR. 

SELECT SUM(Sal) AS Total_Salary_MGR
FROM emp
WHERE Empno IN (SELECT DISTINCT Mgr FROM emp WHERE Mgr IS NOT NULL);

--21. LIST the emps whose NAMES CONTAINS ‘A’. 

SELECT Empno, Ename
FROM emp
WHERE Ename LIKE '%A%';


--22. Find ALL the emps who earn the minimum Salary FOR EACH job wise IN ascending 
order. 

SELECT Empno, Ename, Job, Sal
FROM emp e
WHERE Sal = (
    SELECT MIN(Sal)
    FROM emp
    WHERE Job = e.Job
)
ORDER BY Job ASC;

--23. LIST the emps whose sal greater THAN Blake’s sal. 

SELECT Empno, Ename, Sal
FROM emp
WHERE Sal > (SELECT Sal FROM emp WHERE Ename = 'BLAKE');

--24. CREATE VIEW v1 TO SELECT ename, job, dname, loc whose deptno are same. 

CREATE VIEW v1 AS
SELECT e.Ename, e.Job, d.Dname, d.Loc
FROM emp e
JOIN dept d ON e.Deptno = d.Deptno;



--25.Create a PROCEDURE WITH dno AS input parameter TO FETCH ename AND dname. 

CREATE OR REPLACE PROCEDURE fetch_emp_dept_info (dno IN NUMBER) 
IS
BEGIN
    SELECT e.Ename, d.Dname
    FROM emp e
    JOIN dept d ON e.Deptno = d.Deptno
    WHERE e.Deptno = dno;
END fetch_emp_dept_info;
EXEC fetch_emp_dept_info(10);

--26.Add COLUMN Pin WITH BIGINT DATA TYPE IN TABLE student. 

ALTER TABLE student
ADD Pin BIGINT;

--27. MODIFY the student TABLE TO CHANGE the sname LENGTH FROM 14 TO 40. CREATE TRIGGER 
TO INSERT DATA IN emp_log TABLE whenever ANY UPDATE of sal IN EMP table. You can 
SET ACTION AS ‘New Salary’.

ALTER TABLE student
MODIFY sname VARCHAR2(40);

CREATE OR REPLACE TRIGGER salary_update_trigger
AFTER UPDATE OF sal ON emp
FOR EACH ROW
BEGIN
    INSERT INTO emp_log (empno, ename, old_sal, new_sal, action_date, ACTION)
    VALUES (:OLD.empno, :OLD.ename, :OLD.sal, :NEW.sal, SYSDATE, 'New Salary');
END;



















