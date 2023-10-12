DELIMITER //


CREATE  PROCEDURE new_while_loop1()
BEGIN
 DECLARE counter INT DEFAULT 1;
  
  WHILE counter <= 10 DO
    -- Your loop logic goes here
    -- For example, you can print the counter value
    SELECT counter;
    
    -- Increment the counter
    SET counter = counter + 1;
  END WHILE;
END
// DELIMITER ;
call new_while_loop;
call new_while_loop1;

