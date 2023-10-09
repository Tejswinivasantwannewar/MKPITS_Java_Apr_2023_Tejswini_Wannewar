
 
 -- (47) Get the first name, last name, and email of customers who have rented
 -- more than 12 films.
    select* from customer
	select* from rental 
	select*from inventory 
    select* from film
    
 select rental.customer_id, first_name,last_name, count(rental_id) as 'No. of Movies' 
  from customer join rental on 
  rental.customer_id=customer.customer_id group by customer_id
  having count(rental_id)>12