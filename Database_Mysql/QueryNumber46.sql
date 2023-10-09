 -- (46) Display the names of customers who have rented the film 
 -- titled "Inferno Kilometer"
    select* from customer
	select* from rental 
	select*from inventory 
    select* from film
    
 select first_name,last_name from customer join rental on
 rental.customer_id=customer.customer_id join inventory on
 inventory.inventory_id=rental.inventory_id join film on
 film.film_id=inventory.film_id where title="Inferno Kilometer"