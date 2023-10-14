use sakila
 
 -- (3) Calculate the average rental duration (in days) for each film.
   select* from rental
   select* from inventory
   select* from film

   select inventory.film_id,avg(datediff(return_date,rental_date)) as "Average rental duration for each film"
   from rental join inventory on rental.inventory_id=inventory.inventory_id 
   join film on film.film_id=inventory.film_id
   group by film_id