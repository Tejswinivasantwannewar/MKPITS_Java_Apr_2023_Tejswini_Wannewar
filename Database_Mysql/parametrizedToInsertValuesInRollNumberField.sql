CREATE DATABASE Student_Details123
USE Student_Details123
CREATE TABLE Student_rollNumber123 (Roll_no CHAR(10));

show tables
select * from Student_rollNumber123

DELIMITER //
CREATE PROCEDURE insert_RollNumberIntoExistingTable2(rn int ,num int )

begin
declare rn int;
while rn<=num do
insert into Student_rollNumber123 values  (rn); 
set rn=rn+1;
end while;
END
// DELIMITER ;

call insert_RollNumberIntoExistingTable2(8,96)
drop procedure insert_RollNumberIntoExistingTable2
TRUNCATE TABLE Student_rollNumber123

