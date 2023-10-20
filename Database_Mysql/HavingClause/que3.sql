-- 3. Popular languages:
-- List languages with more than 50 films.



select * from language
select * from film


select language.name ,film_id from film join language on
film.language_id=language.language_id 
group by film_id
having film_id >50