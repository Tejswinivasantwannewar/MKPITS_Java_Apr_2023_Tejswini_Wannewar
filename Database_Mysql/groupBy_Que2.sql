use sakila
 
 -- (2) 	Determine the count of rentals for each customer.

   select* from customer
   select* from rental 
   select*from inventory 
   select*from film
   
select customer.customer_id,first_name,last_name,count(rental_id) as Number_of_rental 
from customer join rental
on rental.customer_id=customer.customer_id
group by customer_id