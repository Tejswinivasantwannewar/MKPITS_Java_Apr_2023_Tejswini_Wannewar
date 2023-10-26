use sakila
 select* from city
 -- (1)  Display the number by using Basic loop
 drop procedure explicitCursor
   -- ============ create a store procedure ============
   Delimiter //
   create procedure explicitCursor()
begin
   declare first_Name varchar(50) ;
   declare last_Name varchar(50) ; 
   declare city_ varchar(50);
   declare done integer;
   
   declare myCursor cursor for 
	 select city,first_Name,last_Name from city join address on address.city_id=city.city_id 
     join customer on customer.address_id=address.address_id;
    
    declare continue handler for Not found set done=1;
    open myCursor;
    label:loop
       fetch myCursor into city_,first_Name,last_Name;
       insert into new_name_city values (city_,first_Name,last_Name);
     if done=1 then
      leave label;
	 end if;
	end loop label;
   close myCursor;
end
  //
  delimiter ;
  -- ============ call store procedure =================
  call explicitCursor();
    
select* from new_name_city
ALTER TABLE new_name_city ADD first_name varchar(50);
ALTER TABLE new_name_city ADD last_name varchar(50);
ALTER TABLE new_name_city drop column cust_name  
