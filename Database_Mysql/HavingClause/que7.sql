-- 7. Active customers:
-- Identify customers who have rented in the last 30 days.

select * from rental
select * from customer

select  customer.customer_id ,count(rental.rental_id) from customer join rental  on
rental.customer_id=customer.customer_id group by customer_id
having count(rental.rental_id)>30

