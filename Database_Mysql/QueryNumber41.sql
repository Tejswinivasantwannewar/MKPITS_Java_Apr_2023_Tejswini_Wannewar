
 use sakila
 -- (41) List the film titles and rental dates for all rentals made by customer "Matthew Smith".

select*from film
select* from inventory
select*from rental
select* from customer

	select title,rental_date from film join inventory on
    inventory.film_id=film.film_id join rental on 
    rental.inventory_id=inventory.inventory_id join customer 
    on customer.customer_id=rental.customer_id where first_name='Matthew' and
    last_name='Smith'