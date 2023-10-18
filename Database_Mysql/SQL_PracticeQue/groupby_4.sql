-- 6. Calculate the count of rentals handled by each staff member.

select * from rental
select * from staff
select * from payment
select first_name,last_name,count(rental.rental_id) from rental join payment on
rental.rental_id=payment.rental_id join staff on
staff.staff_id=payment.staff_id group by staff.staff_id