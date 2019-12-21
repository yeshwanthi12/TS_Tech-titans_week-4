use yesh
select *from stu
insert into stu values(22,'sul',50,3)
insert into stu values(21,'mahi',80,4)
insert into stu values(26,'joe',100,5)
insert into stu values(23,'john',90,6)
alter table stu add place varchar(30) not null
update stu set place='rayachoty' where name='yeshu'
update stu set place='kadapa' where name='yes'
update stu set place='tirupathi' where name='sul'
update stu set place='piler' where name='mahi'
update stu set place='hyd' where name='joe'
update stu set place='banglore' where name='john'
..............................................................
create table cus_tbl(cusid int not null auto_increment,cusname varchar(40)not null,cuslastname varchar(60)not null,primary key(cusid))
select *from cus_tbl
describe cus_tbl
insert into cus_tbl values(1,'yeshu','N')
insert into cus_tbl values(2,'yes','Y')
insert into cus_tbl values(3,'mahi','M')
insert into cus_tbl values(4,'sul','C')
insert into cus_tbl values(5,'john','A')
alter table cus_tbl add place varchar(30)not null
update cus_tbl set place='rayachoty' where cusname='yeshu'
update cus_tbl set place='kadapa' where cusname='yes'
update cus_tbl set place='piler' where cusname='mahi'
update cus_tbl set place='tirupathi' where cusname='sul'
update cus_tbl set place='hyd' where cusname='john'
delete from cus_tbl where cusid=5
rollback
select *from cus_tbl where place='piler'
select *from cus_tbl where cusid < 2
select *from cus_tbl where cusid=1 and cusname='yeshu'
select *from cus_tbl where cusname='mahi' or place='tirupathi'
select *from cus_tbl where cusid between 1 and 3
select *from cus_tbl where cusid in(1,3,4)

---------------------------------------------------------
use hr
select *from hr.employees
select *from hr.departments
select distinct department_id,manager_id from employees
select distinct department_id from employees
select *from employees where manager_id=103 order by salary=4800
select *from employees where manager_id=103 order by salary 
select first_name from employees order by first_name
select first_name from employees order by first_name desc
select (count)first_name 
select first_name from hr.employees where salary>(select salary from hr.employees where employee_id=102)
select department_name from hr.departments where department_id=(select department_id from hr.employees where employee_id=102)
select *from hr.employees where (employee_id % 2)=0
select *from hr.employees order by salary desc limit 2,1
select *from hr.employees order by employee_id desc limit 5
select employees.manager_id,last_name,first_name from hr.employees inner join hr.departments on hr.employees.manager_id=hr.departments.manager_id;
select employees.manager_id,last_name,first_name from hr.employees left join hr.departments on hr.employees.manager_id=hr.departments.manager_id;
select employees.manager_id,last_name from hr.employees right join hr.departments on hr.employees.manager_id=hr.departments.manager_id;
.................................................................................................................................
use hr
select *from hr.employees
select *from employees where salary>=10000
select first_name,hire_date from hr.employees where between 1994-06-07 and 1998-07-01 order by hire_date
select *from hr.employees where hire_date> '2000-02-03'
select *from hr.employees where employee_id in(150,160)
select first_name,salary,commission_pct,hire_date from hr.employees where salary<10000 
select first_name,last_name from employees where first_name like 'S%' or last_name like'S%'


select *from hr.jobs
SELECT JOB_TITLE, MAX_SALARY-MIN_SALARY DIFFERENCE FROM JOBS WHERE MAX_SALARY BETWEEN 10000 AND 20000
select *from jobs order by job_title desc
select 




















