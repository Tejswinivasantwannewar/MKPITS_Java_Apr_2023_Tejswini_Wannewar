---------------------1.	Retrieve the names of all customers and the titles of the films they have rented.

use sakila
show tables
select * from customer
select * from actor where first_name="nick" and actor_id=2

select first_name ,title from customer join rental 
on rental.customer_id=customer.customer_id join inventory
 on inventory.inventory_id=rental.inventory_id join film
 on film.film_id=inventory.film_id 



----------------2	Display the rental date and return date for each rental along with---------
----------- the customers first name and last name.---------

use sakila
show tables
select * from rental
select * from customer
select rental_date,return_date,first_name,last_name from rental join customer 
on customer.customer_id=rental.customer_id

---------------------3.	List the names of actors who have appeared in the film titled "Chamber Italian".------------


use sakila 
show tables
select first_name, title from actor join film_actor
 on film_actor.actor_id=actor.actor_id join film
 on 




