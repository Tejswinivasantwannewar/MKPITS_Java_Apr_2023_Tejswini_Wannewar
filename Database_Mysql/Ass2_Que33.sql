use sakila
 
 -- (33)Get the first name, last name, and email of customers who have rented more than 20 films.

   select* from customer
   select* from rental 
   select*from inventory 
   select*from film
   
 select rental.customer_id, first_name,last_name,email,count(rental_id)  as 'no. of films' from customer join rental 
 on rental.customer_id= customer.customer_id group by customer_id
 having count(rental_id)>20