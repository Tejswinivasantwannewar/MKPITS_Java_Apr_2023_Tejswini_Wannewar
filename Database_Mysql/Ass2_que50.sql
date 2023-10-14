use sakila
 
 -- (50) Retrieve the rental date and return date for each rental made by customer "Michelle Johnson".

   select* from customer
   select* from rental 
   select*from inventory 
   select*from film
   
  select rental_date,return_date from film join inventory on film.film_id=inventory.film_id 
  join rental on rental.inventory_id=inventory.inventory_id join customer 
  on customer.customer_id=rental.customer_id where first_name="Michelle" and last_name="Johnson"