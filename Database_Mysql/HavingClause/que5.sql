-- 5. Actors in popular films:
-- Show actors who have appeared in more than 10 films.


select * from actor
select * from film
select * from film_actor


select actor.actor_id,first_name,last_name from actor join film_actor on 
film_actor.actor_id=actor.actor_id join film on 
film_actor.film_id=film.film_id group by  actor.actor_id
having count(film.film_id) >10