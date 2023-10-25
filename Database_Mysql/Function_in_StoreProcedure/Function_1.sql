-- Problem Statement 1: 
-- Calculate Total Order Value
-- Design a user-defined function that takes order quantity and unit price as input and calculates the total order value for each order.


DELIMITER //
CREATE FUNCTION calculateTotal(price int ,quantity int)
RETURNS int
DETERMINISTIC
BEGIN
    return price*quantity;
    
END//
DELIMITER ;

select calculateTotal(1000,10) as 'Total Order Value'