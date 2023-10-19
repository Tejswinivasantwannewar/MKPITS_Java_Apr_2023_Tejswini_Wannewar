-- 8. Determine the count of rentals for each film.
select * from rental -- inventory _id
select * from inventory -- inventory_id,film_id
select * from film -- film_id

 select count(rental_id) from rental join inventory on
 inventory.inventory_id=rental.inventory_id join film on
 film.film_id=inventory.film_id group by film.film_id