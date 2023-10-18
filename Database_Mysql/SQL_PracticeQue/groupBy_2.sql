-- 2. Determine the count of rentals for each customer.
select * from rental  -- customer_id
select *from customer  -- customer_id
select first_name ,last_name ,count(rental_id)  from rental join customer on 
customer.customer_id=rental.customer_id  group by customer.customer_id
