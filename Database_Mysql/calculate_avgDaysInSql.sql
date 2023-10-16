CREATE procedure 


use sakila

	select * from film
    select * from inventory
    select * from rental
    
    select film.film_id,title,round(avg(datediff(return_date,rental_date))) as Avgdays from film join inventory 
    on film.film_id=inventory.film_id join rental
    on inventory.inventory_id=rental.inventory_id
    group by film_id
    having AvgDays>=max(Avgdays)
    order by AvgDays desc;
    