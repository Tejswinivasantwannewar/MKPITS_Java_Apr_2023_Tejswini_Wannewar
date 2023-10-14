CREATE DATABASE Student_Details1

USE Student_Details1

create table student_marks(roll_no int,
                           physics int,
                           chemistry int,
                           math int);
select* from student_marks

truncate table student_marks;

insert  into student_marks values (1,10,20,30),
								  (2,20,30,40), 
							      (3,30,40,50),
								  (4,40,50,60);

DELIMITER //
CREATE PROCEDURE incrementStudentMarks(rollno int,incrementBy int)
BEGIN

UPDATE student_marks SET  physics=physics+incrementBy, chemistry=chemistry+incrementBy, math=math+incrementBy 
 where roll_no=rollno;

END
// DELIMITER ;
call incrementStudentMarks(1,5)

                                 
                               