use sakila
show tables
select * from product
select * from sale

delimiter //
create trigger insert_data 
after
insert on sale 
for each row
begin
update product
set prod_quantity=prod_quantity-new.prod_quant
where prod_id=new.product_id;
end //
delimiter ;
drop trigger insert_data

