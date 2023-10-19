use sakila
show tables

create table Marks_of_student(Roll_no int,physics int,chemistry int , maths int)
select * from Marks_of_student
insert  into Marks_of_student values (1,50,60,70);
								  -- (2,80,50,60), 
							      -- (3,38,50,70),
								  -- (4,60,50,60);                                  

                            drop table Marks_of_student 
                            
                            update Marks_of_student set physics = physics + 10 where Roll_no=1;                            
