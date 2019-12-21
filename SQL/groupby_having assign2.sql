-----------------------------------------assignment 2--------------------------
use hr
select *from employees
select *from jobs
select *from job_history
select *from departments
select *from locations;
select hire_date from employees where year(hire_date)=year(curdate())group by month(hire_date);
select month(hire_date),count(*)from employees where year(hire_date)=year(sysdate)group by month(hire_date)
select manager_id,count(manager_id) from HR.employees group by manager_id;
select employee_id, max(end_date) from HR.job_history group by employee_id;
select hire_date,count(hire_date) from employees group by hire_date having datediff(hire_date,'DD')>15;
select hire_date from employees where day(hire_date)>15;
select country_id,count(city) from HR.locations group by country_id;
select department_id,avg(salary) from employees where commission_pct is not null group by department_id
select job_id,count(*),sum(salary),max(salary)-min(salary) from employees group by job_id
select job_id,avg(salary) from employees group by job_id having avg(salary)>10000
select year(hire_date)from hr.employees group by year(hire_date) having count(employee_id)>10;
select department_id from hr.employees where commission_pct is not null group by department_id having count(commission_pct)>5;
select employee_id from job_history group by employee_id having count(*)>1
select job_id from job_history where start_date-end_date>100 group by job_id having count(job_id)>3
select department_id,year(hire_date),count(employee_id) from employees group by department_id,year(hire_date)order by department_id
select department_id from employees group by department_id,manager_id having count(employee_id)>5
--------------------------------------assignment 3--------------------------------------------------------------
select *from employees
select *from departments;
select *from employees
select *from jobs
select *from departments where department_id in(select department_id from employees group by department_id having max(salary)>10000)
select *from departments where manager_id in(select employee_id from employees where first_name='smith'


















-----------------------------------------------------------------------------------------
use hr
select *from product1
select *from orders1
create table product1(pid int primary key,pname varchar(30),price int)
insert into product1 values(3,'earphones',800)
create table orders1(oid int,odate date,pid int,foreign key(pid) references product1(pid))
insert into orders1 values(103,'2019-08-12',3)
select *from product1 inner join orders1 on product1.pid=orders1.pid





