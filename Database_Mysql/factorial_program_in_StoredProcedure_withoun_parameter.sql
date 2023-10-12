----------------factorial program using while loop-----------------
DELIMITER //
CREATE  PROCEDURE `new_factorial`()
BEGIN
declare factorial int;
declare number int;
declare counter int;
SET number = 5;
SET factorial = 1;
SET counter = 1;


WHILE counter <=number DO
    SET factorial = factorial * counter;
    SET counter = counter + 1;
END WHILE;

SELECT factorial;
END
//
DELIMITER ;
call new_factorial;
drop procedure new_factorial;