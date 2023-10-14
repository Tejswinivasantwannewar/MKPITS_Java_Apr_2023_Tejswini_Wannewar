select * from payment
select * from customer



DELIMITER //
create procedure sumOfCustomerPayment(In cust_id int , OUT total_amount int )
BEGIN
select sum(amount) into total_amount from payment  where customer_id =cust_id;
END
// DELIMITER ;
drop procedure  sumOfCustomerPayment

CALL sumOfCustomerPayment (2,@total_amount)

select @total_amount