 -- Calculate Total Order Value
-- Design a user-defined function that takes order quantity and unit price as input and calculates the total order value for each order.

DELIMITER //

CREATE FUNCTION CalculateTotalOrderValue(quantity INT,unit_price int)
 RETURNS INTEGER deterministic
BEGIN
    DECLARE totalValue int;
    set totalValue=(quantity * unit_price);
    RETURN totalValue;
END //

DELIMITER ;
DROP function CalculateTotalOrderValue

    SELECT "QUANTITY*UNITT_PRICE",CalculateTotalOrderValue(9,7) as totalValue

-- Replace 1 with the order_id you want to calculate the total value for

