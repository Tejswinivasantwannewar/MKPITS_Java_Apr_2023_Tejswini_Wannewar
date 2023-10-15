use sakila
 
 -- (6)  Calculate the count of rentals handled by each staff member.

   select* from rental
   select* from staff
   
   select staff.staff_id,count(rental_id) as "rentals handled by staff"
   from rental join staff on staff.staff_id=rental.staff_id 
   group by staff_id
  