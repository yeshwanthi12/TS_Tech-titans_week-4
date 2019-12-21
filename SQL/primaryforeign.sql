use yesh
create table emp(name varchar(20),id int,sal float,cmpname varchar(30))
select *from emp
insert into emp values('yeshu',1,5000,'CTS');
insert into emp values('mahi',2,4000,'CTS');
insert into emp values('sul',3,6000,'TCS');
insert into emp values('chan',4,8000,'TCS');
insert into emp values('sita',5,2000,'Amazon');
insert into emp values('john',6,3000,'Wipro');
alter table emp add dob 
update emp set dob=2019-07-20 where id=1
update emp set dob=1995-11-15 where id=2
alter table emp drop dob
alter table emp drop column dob
alter table emp add to place varchar(30)
alter table emp add place varchar(30) NOT NULL
update emp set place='rayachoty' where id=1
update emp set place='piler' where id=2
update emp set place='tirupathi' where id=3
update emp set place='kadapa' where id=4
update emp set place='hyd' where id=5
update emp set place='banglore' where id=6
select *from emp where sal between 1000 and 5000
select *from customers where limit=3
select *from emp where limit 3
alter table emp add (dob date not null,lastname varchar(30));
update emp set dob='2019-07-20' where id=1
update emp set dob='1994-07-20' where id=1
update emp set dob='1995-11-15' where id=2
update emp set dob='1998-09-07' where id=3
update emp set dob='2000-10-12' where id=4
update emp set dob='1998-07-12' where id=5
update emp set dob='1995-12-15' where id=6
update emp set lastname='N' where id=2
update emp set lastname='M' where id=3
update emp set lastname='S' where id=4
update emp set lastname='Y' where id=5
update emp set lastname='A' where id=6
select avg(sal) from emp
select count(name)from emp 
select first(name)from emp
select name from emp limit 1
select last(cmpname) from emp
select max(sal) from emp
select min(sal)from emp
select sum(sal)from emp
SELECT SUM (sal) AS "Total sal"  
FROM emp WHERE Total sal > 3000;  
select avg(sal)AS "sal" from emp where sal>3000
select min(sal) from emp
select min(sal)AS "min sal" from emp 
select ucase(name) from emp
select lcase(name) from emp
select sysdate()
select current_date();
select now()
select sum(sal)from emp
select distinct name,lastname from emp




---------------------------------------------------
use yesh
create table persons(personid int primary key,lastname varchar(30),firstname varchar(40),age int check(age>18))
select *from persons
insert into persons values(1,'N','yeshu',20)
insert into persons values(2,'M','mahitha',19)
insert into persons values(3,'C','sul',22)
insert into persons values(4,'A','joe',25)        
-------------------------------------------------------
create table orders(orderid int,ordernumber int,personid int,foreign key(personid) references persons(personid))  
select *from orders                                                                             
insert into orders values(1,22,1)
insert into orders values(2,33,1)
insert into orders values(2,34,2)
insert into orders values(3,35,3)
insert into orders values(4,36,4)

----------------------------------------------------------------------------
select *from hr.locations
use hr
select count(country_id) from hr.locations  group by country_id;
select max(location_id) from hr.locations where 








