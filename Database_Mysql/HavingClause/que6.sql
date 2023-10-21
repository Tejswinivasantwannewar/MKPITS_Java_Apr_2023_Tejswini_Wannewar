--  6. Staff with high customer interactions:
--  List staff members who have handled more than 500 customer transactions.

select  * from staff -- staff_id
select  * from payment -- staff_id

select staff.staff_id ,payment_id from payment join staff on
staff.staff_id=payment.staff_id
group by payment.payment_id
having payment.payment_id>500





