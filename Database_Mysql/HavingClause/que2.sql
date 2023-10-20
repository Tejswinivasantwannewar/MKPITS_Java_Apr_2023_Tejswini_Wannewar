
-- 2. Customers with many rentals:
-- Identify customers who have rented more than 30 films


use sakila
select * from customer
select * from rental
select * from film
select * from inventory

select first_name,last_name,customer.customer_id ,count(rental_id) as "rented film"from film join inventory on 
inventory.film_id=film.film_id join rental on 
rental.inventory_id=inventory.inventory_id join customer on
customer.customer_id=rental.customer_id group by customer.customer_id
having count(rental_id)>30
