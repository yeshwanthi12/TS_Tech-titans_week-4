use yesh
create table stu(age int,name varchar(20),percentage float)
select *from stu
insert into stu values(20,'yeshu',20.0)
insert into stu(age,name)values(25,'yes')
delete from stu
alter table stu add column rollno int 
update stu set rollno=1 where name='yeshu'
update stu set rollno=2 where name='yes'
update stu set percentage=100 where name='yes'
alter table stu change percentage marks varchar(20)
select *from stu where age=20
select *from stu where marks>10
select *from stu where marks<50