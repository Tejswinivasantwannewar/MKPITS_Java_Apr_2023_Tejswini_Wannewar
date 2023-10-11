 
 -- (21) Get the first name, last name, and email of customers who have rented more than 18 films.

   select* from customer
   select* from rental 
   select*from inventory 
   select*from film
   
select first_name,last_name,email,count(customer.customer_id) from customer join rental on customer.customer_id=rental.customer_id 
 join inventory on inventory.inventory_id=rental.inventory_id join film on film.film_id=inventory.film_id
 group by customer.customer_id having count(customer.customer_id)>18
  