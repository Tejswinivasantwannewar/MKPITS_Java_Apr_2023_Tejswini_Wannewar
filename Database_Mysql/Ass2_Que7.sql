
 
 -- (7) List the rental date and return date for all rentals made by customer "Sarah Thomas".
   select* from customer
   select* from rental 
   select*from inventory 
   select*from film
  select rental_date,return_date from inventory
  join rental on rental.inventory_id=inventory.inventory_id join customer 
  on customer.customer_id=rental.customer_id where customer.first_name="Sarah" and last_name="Thomas"