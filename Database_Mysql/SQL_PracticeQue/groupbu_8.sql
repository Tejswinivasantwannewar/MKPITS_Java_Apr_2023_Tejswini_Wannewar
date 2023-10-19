 -- 10. Calculate the count of rentals for each film language.

select * from rental 
select * from inventory
select * from film
select * from language

select language.language_id,name,count(rental_id)from rental join inventory on
inventory.inventory_id=rental.inventory_id join film 
on film.film_id=inventory.film_id join language on
language.language_id=film.language_id group by language.language_id
   


   
    