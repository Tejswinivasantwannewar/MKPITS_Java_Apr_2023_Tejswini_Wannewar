-- 10. Customers with diverse film preferences:
-- Find customers who have rented films from at least 5 different categories.
select * from rental
select * from inventory
select * from film
select * from film_category
select category_id ,customer.customer_id,first_name from customer join rental on
rental.customer_id=customer.customer_id join inventory on 
rental.inventory_id=inventory.inventory_id join film on 
inventory.film_id=film.film_id join film_category on film.film_id=film_category.film_id 
group by category_id


having customer_id >=5 



An index in SQL is a database structure that improves the speed of data retrieval operations on
 database tables. It is a data structure that provides a way to quickly look up records in a 
table based on the values in one or more columns. Indexes are essentially a copy of a
 


