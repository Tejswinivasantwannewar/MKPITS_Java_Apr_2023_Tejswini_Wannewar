
 
 -- (49) List the rental date and rental duration for each rental made by 
 -- customer "David Clark".

    select* from customer
	select* from rental 
	select*from inventory 
    select* from film
    
 select title,rental_date from film join inventory
 on inventory.film_id=film.film_id join rental
 on rental.inventory_id=inventory.inventory_id join customer 
 on customer.customer_id=rental.customer_id  where first_name='mary' and
 last_name='smith'
    