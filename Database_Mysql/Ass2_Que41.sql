use sakila
 
 -- (41) Get the film titles and rental dates for all rentals made on November 8, 2005.

   select* from customer
   select* from rental 
   select*from inventory 
   select*from film
   
  select title,rental_date from film join inventory on film.film_id=inventory.film_id 
  join rental on rental.inventory_id=inventory.inventory_id where date(rental_date)="2005-11-08"