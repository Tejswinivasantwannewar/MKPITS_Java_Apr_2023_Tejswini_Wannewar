-- 4. Stores with high revenue:
-- Find stores with total revenue exceeding $5000.

select * from store


select store.store_id,sum(amount) from payment join staff on 
payment.staff_id=staff.staff_id join store on
store.address_id=staff.store_id group by store.store_id
having sum(amount)>5000