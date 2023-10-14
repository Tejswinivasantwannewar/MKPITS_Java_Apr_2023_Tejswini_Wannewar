use sakila
 
 -- (47) List the rental date and rental duration for each rental made by customer "James Clark".

   select* from customer
   select* from rental 
   select*from inventory 
   select*from film
   
  select rental_date,rental_duration from film join inventory on film.film_id=inventory.film_id 
  join rental on rental.inventory_id=inventory.inventory_id join customer 
  on customer.customer_id=rental.customer_id where first_name="james" and last_name="clark"