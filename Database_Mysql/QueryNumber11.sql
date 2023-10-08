-- 11.	List the film titles and rental dates for all rentals made by customer "Mary Johnson".
USE sakila
SHOW TABLES
SELECT * FROM film
SELECT * FROM inventory
SELECT * FROM rental
SELECT * FROM customer

SELECT title, rental_date FROM film JOIN inventory 
ON film.film_id = inventory.film_id JOIN rental
ON inventory.inventory_id = rental.inventory_id JOIN customer