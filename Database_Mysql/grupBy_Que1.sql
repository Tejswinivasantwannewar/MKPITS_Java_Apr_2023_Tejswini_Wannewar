use sakila
 
 -- (1) 	Retrieve the total revenue generated for each film category.
 
   select*from film_category
   select* from film
   select*from inventory 
   select*from rental
   select*from payment
   
   select film_category.category_id,sum(amount) as "revenue generate by each film category"
   from payment join rental on rental.rental_id=payment.rental_id 
   join inventory on inventory.inventory_id=rental.inventory_id
   join film on film.film_id=inventory.film_id 
   join film_category on film_category.film_id=film.film_id
   group by category_id
   