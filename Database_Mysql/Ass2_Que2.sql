use sakila
 -- (2) Retrieve the rental date and return date for each rental made by customer "Laura Martinez".

   select* from customer
   select* from rental 
   select*from inventory 
   select*from actor
  select rental_date,return_date from customer join rental on customer.customer_id=rental.customer_id 
  join inventory on inventory.inventory_id=rental.inventory_id
  join film on film.film_id=inventory.film_id 
  where title="Golden Groove"