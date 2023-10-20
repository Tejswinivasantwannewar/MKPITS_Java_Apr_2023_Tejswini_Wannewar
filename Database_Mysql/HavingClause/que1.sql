-- 1. High revenue categories:
-- Find categories with an average rental revenue greater than $10.
select * from rental -- rental_id
select * from payment

select rental.rental_id,avg(amount) from payment join rental on
rental.rental_id=payment.rental_id group by rental.rental_id 
having avg(amount)>10