select * from payment
select * from customer



DELIMITER //
create procedure sumOfCustomerPayment(In cust_id int)
BEGIN
select sum(amount)  as "payment of customer",cust_id from payment  where customer_id =cust_id;
END
// DELIMITER ;
drop procedure  sumOfCustomerPayment
call sumOfCustomerPayment(1)