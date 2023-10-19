use sakila
show tables

create table Marks_of_student(Roll_no int,physics int,chemistry int , maths int)
select * from Marks_of_student
insert  into Marks_of_student values (1,50,60,70),
								  (2,80,50,60), 
							      (3,38,50,70),
								  (4,60,50,60);                                  

                            drop table Marks_of_student      

 
create table Total_details(Roll_no int,Total int)
select * from Total_details
 drop table Total_details


delimiter //
create trigger update_marks_Of_Student
after insert on Marks_of_student
for each row
begin
insert into Total_details values (new.Roll_no,new.physics+new.chemistry+new.maths);
end //
delimiter ;

drop trigger update_marks_Of_Student





