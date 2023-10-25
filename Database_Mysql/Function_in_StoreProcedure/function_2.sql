-- Problem Statement 2: 
-- Calculate Age from Birthdate
-- Develop a user-defined function that takes a person's birthdate as input and calculates their current age in years.

select* from store
drop function calculateAge

DELIMITER //

CREATE FUNCTION calculateAge(birthDate date) 
RETURNS int 
DETERMINISTIC
BEGIN
    DECLARE age int;
 set age=datediff(current_Date(),birthDate)/365;
   return age;
  
END//
DELIMITER ;

select calculateAge('1993-04-17')