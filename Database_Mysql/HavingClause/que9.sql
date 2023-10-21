-- 9. Highly rented films:
-- Identify films that have been rented more than 30 times.

select * from rental
select * from inventory
select * from film
select film.film_id,count(rental_id)from film join inventory on 
inventory.film_id=film.film_id join rental on
rental.inventory_id=inventory.inventory_id group by film_id
having count(rental_id)>30
