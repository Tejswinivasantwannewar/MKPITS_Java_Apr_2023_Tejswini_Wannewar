use sakila
show tables
select * from actor where first_name="nick" and actor_id=2
select first_name ,title from customer join rental 
on rental.customer_id=customer.customer_id join inventory
 on inventory.inventory_id=rental.inventory_id join film
 on film.film_id=inventory.film_id 
