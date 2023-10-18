-- 9. Retrieve the total revenue generated for each city.

select * from payment -- customer_id
select * from customer -- customer_id,address_id
select * from address -- address_id,country_id
select * from city -- country_id

   select city.city_id,sum(amount) as "Total revenue by each city"
   from payment join customer on customer.customer_id=payment.customer_id 
   join address on address.address_id=customer.address_id 
   join city on city.city_id=address.city_id group by city_id