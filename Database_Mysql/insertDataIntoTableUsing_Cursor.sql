
use sakila
create table  student_d(Cust_name varchar(255), city_name varchar(255))
select * from student_d
drop table student_d
delimiter //
create procedure insert_city_name()
begin
declare f_name varchar(255);
declare c_name varchar(255);
declare done integer;
declare myCursor cursor for

select first_name,city from city join address on 
city.city_id=address.city_id join customer
on address.address_id=customer.address_id ;

declare continue handler for not found set done=1;
open myCursor;
insert_details:loop
fetch myCursor into f_name,c_name;
insert into student_d values (f_name,c_name);
if done=1 then 
leave insert_details;
end if;
end loop;
close myCursor;
end //
delimiter ;
drop procedure insert_city_name

call insert_city_name()