

CREATE DATABASE student_detailsTable

show tables
DROP TABLE student_info
CREATE TABLE Student_info (Roll_no CHAR(4) 
                          ,Student_Name CHAR(12)
                          ,Address CHAR(25)
                          ,City CHAR(10)
                          ,PRIMARY KEY(Roll_no));
SELECT* FROM student_info
INSERT INTO student_info  VALUES('104','Shubham','Mohan Nagar','nagpur')
							   ,('102','abhi','narendra Nagar','amaravati')
                               ,('103','pranay','manish Nagar','nagpur')
INSERT INTO student_info  VALUES('101','Shubham','Mohan Nagar','nagpur')
CREATE TABLE Student_result (
                          stud_roll_no CHAR(4)
                          ,Result_status CHAR(10)
                         , CONSTRAINT fk_student FOREIGN KEY (stud_roll_no)  
                          REFERENCES student_info(Roll_no) fk_student
                          );
DROP TABLE Student_result

SELECT* FROM Student_result
INSERT INTO student_result  VALUES('104','pass')
                                  ,('101','fail')

CREATE TABLE Student_fees (stud_roll_no CHAR(4),
                          fees CHAR(10),
                          CONSTRAINT fk_student_fees FOREIGN KEY (stud_roll_no)  
                          REFERENCES student_info(Roll_no) 
                          );
INSERT INTO Student_fees  VALUES('104','10000'),
								('102','20000'),
                                ('103','30000'),
                                ('101','40000')
SELECT* FROM Student_fees

SELECT Student_Name,city FROM student_info

SELECT Roll_no,city FROM student_info

SELECT Student_Name FROM student_info where City='Nagpur'

SELECT Student_Name,city,roll_no FROM student_info where Address='mohan nagar'

SELECT stud_roll_no FROM student_fees where fees>25000

SELECT stud_roll_no FROM student_fees where fees>25000 and fees<35000

SELECT stud_roll_no FROM student_fees where fees>25000 or fees<10000

SELECT stud_roll_no FROM student_fees where fees>25000 or fees<10000

select* from student_result

--bcoz foreign key is applied on it
delete from student_info where Roll_no='104'  
delete from student_result where Result_status='fail'
update student_result set Result_status='fail' 
insert into student_result values('102','pass','B'), 
                                  ('102','pass','C') 
							      ('101','fail'),
                                  ('103','pass'),
                                  ('104','fail')

update student_result set Result_status='fail' where stud_roll_no='102'
delete from student_result
update student_result set Result_status='fail' 
truncate table student_result
ALTER TABLE student_result RENAME COLUMN Result_status TO result;
alter table student_result add result_grade char(1)
select* from student_result
INSERT INTO student_info  VALUES('105','neha','Mohan Nagar','nagpur'),
                                ('106','pranay','shankar Nagar','wardha'),
                                ('107','ram','ram Nagar','pune'),
                                ('108','shiva','patel lay out','mumbai'),
                                ('109','ashu','burdi ','wardha'),
                                ('110','pranay','narendra Nagar','mumbai')
update student_result set result_grade='A' where  result_grade is null
update student_result set result_grade='E' where stud_roll_no between '101' and '102'
update student_result set result_grade='B' where stud_roll_no='102' or stud_roll_no='101'
insert into student_result values('105','pass','C'),
								 ('106','fail','D'),
                                 ('107','pass','A'),
                                 ('108','fail','C')
select* from student_result order by result_grade Asc, stud_roll_no Asc
create table student_marks(roll_no char(4),
                           physics char(3),
                           chemistry char(3),
                           math char(3));
select* from student_marks
create database Teacher
use Teacher
create table student_marks(emp_id char(4),
                           Name varchar(30));
CREATE TABLE Student_info (Roll_no CHAR(4) 
                          ,Student_Name CHAR(12)
                          ,Address CHAR(25)
                          ,City CHAR(10)
                          ,PRIMARY KEY(Roll_no));
INSERT INTO student_info  VALUES('104','Shubham','Mohan Nagar','nagpur')
							   ,('102','abhi','narendra Nagar','amaravati')
                               ,('103','pranay','manish Nagar','nagpur')
alter table student_marks add primary key (emp_id)
select* from student_marks
alter table student_marks add  email_id char(30)
alter table student_marks add constraint fk_mail foreign key (email_id) references Student_info (Roll_no)
select* from student_marks
use sakila
show tables
select* from actor_info
select* from actor
insert into actor values(500,'bhagyashri','jiddewar',"2021-09-15" " 16:30:30")
select film_info, last_update from actor left join actor_info on actor.actor_id=actor_info.actor_id
select film_info, last_update from actor inner join actor_info on actor.actor_id=actor_info.actor_id
select film_info, last_update from actor right join actor_info on actor.actor_id=actor_info.actor_id


                          



                                
                          
                                  
                                  
                                  
                                  
                                  
                                  
                                  


