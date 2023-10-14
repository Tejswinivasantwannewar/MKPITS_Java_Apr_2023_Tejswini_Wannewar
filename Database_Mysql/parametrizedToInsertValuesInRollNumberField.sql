CREATE DATABASE Student_Details
USE Student_Details
CREATE TABLE Student_rollNumber (Roll_no CHAR(10));

show tables
select * from Student_rollNumber

DELIMITER //
CREATE PROCEDURE insert_RollNumberIntoExistingTable2(rn int ,num int )
begin
declare rn int;
set rn = 1;
while rn<=num do
insert into Student_rollNumber values  (rn); 
set rn=rn+1;
end while;

END
// DELIMITER ;

call insert_RollNumberIntoExistingTable2(8,96)
drop procedure insert_RollNumberIntoExistingTable2

