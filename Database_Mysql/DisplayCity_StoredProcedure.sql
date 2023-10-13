-------------name of city ,names of customer of that city-----------------

USE SAKILA 
show tables
select * from city
select * from address





DELIMITER //
CREATE procedure city1( In cityname varchar(50) )
BEGIN

select first_name,last_name,city from city join address on address.city_id=city.city_id join customer 
on customer.address_id=address.address_id where city=cityname;

END
// DELIMITER ;

drop procedure city1
call city1("Abu dhabi")










