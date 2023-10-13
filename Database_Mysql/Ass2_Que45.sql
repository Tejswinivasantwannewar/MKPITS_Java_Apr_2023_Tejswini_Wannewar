use sakila
 
 -- (45) 	Get the first name, last name, and email of customers who have rented more than 22 films.


   select* from customer
   select* from rental 
   select*from inventory 
   select*from film
   
  select customer.customer_id, first_name,last_name,email,count(rental_id) from customer
  join rental on customer.customer_id=rental.customer_id
  join inventory on inventory.inventory_id=rental.inventory_id group by customer_id 
  having count(rental_id)>22