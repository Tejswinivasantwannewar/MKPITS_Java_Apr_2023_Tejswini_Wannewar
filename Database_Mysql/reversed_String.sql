--Design a user-defined function that takes a string as input and returns the reversed string.

Delimiter //
CREATE function reverseString()
returns integer deterministic
begin



end //
delimiter;

DELIMITER //
CREATE FUNCTION ReverseString(input_string VARCHAR(255))
 RETURNS VARCHAR(255) deterministic
BEGIN
    DECLARE reversed_string VARCHAR(255);
    DECLARE string_length INT;
    DECLARE counter INT;

    SET string_length = (input_string);
    SET counter = string_length;
    SET reversed_string = '';

    WHILE counter > 0 DO
        SET reversed_string = CONCAT(reversed_string+input_string);
        SET counter = counter - 1; 
    END WHILE;

    RETURN reversed_string;
END;
//
DELIMITER ;
drop function ReverseString
select ReverseString("Mulache Pay Palnyat Distat") as reversed_string;
