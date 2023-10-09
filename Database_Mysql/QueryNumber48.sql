 -- (48) Retrieve the film titles and rental dates for all rentals made by the 
 -- customer with customer_id 1200.
 -- titled "Inferno Kilometer"
    select* from customer
	select* from rental 
	select*from inventory 
    select* from film
    
select title,rental_date from film join inventory
 on inventory.film_id=film.film_id join rental
 on rental.inventory_id=inventory.inventory_id join customer 
 on customer.customer_id=rental.customer_id  where customer.customer_id=1200