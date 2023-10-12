DELIMITER //
 CREATE procedure marks_Compare(In marks int)
 BEGIN
 if(marks<50) then
 select "fail";
 else
 if
 (marks>=50 and marks<=60) then
 select "pass";
 end if;
 end if;
 end 
 // DELIMITER ;
 
CALL marks_Compare(90);