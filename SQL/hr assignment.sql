use hr
select *from hr.employees
select *from employees where salary>=10000
SELECT FIRST_NAME, HIRE_DATE FROM EMPLOYEES WHERE hire_date between '1993-06-20' and '1996-10-26'
select *from hr.employees where hire_date> '2000-02-03'
select *from hr.employees where employee_id in(150,160)
select first_name,salary,commission_pct,hire_date from hr.employees where salary<10000 
select first_name,last_name from employees where first_name like 'S%' or last_name like'S%'
select *from hr.employees where year(hire_date) ='may'
select *from employees 	where commission_pct is null and salary between 5000 and 10000 and department_id=30
select first_name,hire_date,sysdate(),datediff(sysdate(),hire_date)/365 from employees
select first_name,hire_date FROM EMPLOYEES WHERE hire_date='2001-01-01'
SELECT FIRST_NAME, LAST_NAME FROM EMPLOYEES WHERE INSTR(LAST_NAME,'B') > 3
SELECT UPPER(FIRST_NAME), LOWER(EMAIL) FROM EMPLOYEES WHERE UPPER(FIRST_NAME)= UPPER(EMAIL)
select *from employees where to_char(hire_date,'YYYY')=to_char(sys_date,'YYYY')
SELECT SYSDATE - to_date('01-jan-2011') FROM DUAL
select concat(ucase(left(first_name,1)),substring(first_name,2)),concat(ucase(left(last_name,1)),substring(last_name,2))from employees
select *from employees where year(hire_date)=year("1987-01-01")
select year(curdate());
------------------------------------------------------------------------------------
select *from hr.jobs
select JOB_TITLE, MAX_SALARY-MIN_SALARY DIFFERENCE FROM JOBS WHERE MAX_SALARY BETWEEN 10000 AND 20000
select job_title,substr(job_title,1 instr(job_title,' ')-1) from jobs
select *from jobs order by job_title desc
