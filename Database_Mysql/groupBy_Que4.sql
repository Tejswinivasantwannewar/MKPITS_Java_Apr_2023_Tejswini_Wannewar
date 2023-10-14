use sakila
 
 -- (4) Find the total revenue generated for each month.

   select* from payment
   
 select month(payment_date),sum(amount) as "Total Revenue" 
 from payment
 group by month(payment_date)