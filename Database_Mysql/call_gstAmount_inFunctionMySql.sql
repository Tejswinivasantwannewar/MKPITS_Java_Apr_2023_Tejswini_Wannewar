

select * from payment
drop funciton callGst

Delimiter //
CREATE FUNCTION CALLGST(P_amt DECIMAL (5,2))
RETURNS DECIMAL(5,2) DETERMINISTIC
BEGIN
DECLARE gst int;
set gst = P_amt*0.18;
return gst;
end //
  DELIMITER ;
  

  select payment_id,amount,callgst(amount) as gst, amount + callgst(amount) from payment;
  
  Calculate Total Order Value
Design a user-defined function that takes order quantity and unit price as input and calculates the total order value for each order.
create function 
