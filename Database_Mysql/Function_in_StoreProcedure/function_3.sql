-- Problem Statement 3:
-- String Reversal
-- Design a user-defined function that takes a string as input and returns the reversed string.

DELIMITER //

CREATE FUNCTION stringReversal(string varchar(50)) 
RETURNS varchar(50)
DETERMINISTIC
BEGIN
    return reverse(string);
  
END//
DELIMITER ;

select stringReversal("Shubham")