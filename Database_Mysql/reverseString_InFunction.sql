--Design a user-defined function that takes a string as input and returns the reversed string.


DELIMITER //
CREATE FUNCTION ReverseStringCharacter( input_string VARCHAR(255))
 RETURNS VARCHAR(255) deterministic
BEGIN
    DECLARE reversed_string VARCHAR(255);
   SET reversed_string = reverse(input_string);
RETURN reversed_string;
END;
//
DELIMITER ;

drop function ReverseStringCharacter
select ReverseStringCharacter("Mulache Pay Palnyat Distat") as reversed_string;
