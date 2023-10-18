-- 1 groupby--

select title,sum(amount) from payment join rental on 
rental.rental_id=payment.rental_id join inventory on
inventory.inventory_id=rental.inventory_id join film on 
film.film_id=inventory.film_id join film_category on
film_category.film_id=film.film_id group by film_category.film_id
