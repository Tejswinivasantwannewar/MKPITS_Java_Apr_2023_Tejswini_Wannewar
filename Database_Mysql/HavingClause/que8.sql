-- 8. Long rentals:
-- List films with an average rental duration of more than 7 days.

select * from rental
select * from inventory
select * from film
select title,rental_id,avg(rental_duration)from film join inventory on 
inventory.film_id=film.film_id join rental on
rental.inventory_id=inventory.inventory_id group by rental_id

having avg(rental_duration)<7


