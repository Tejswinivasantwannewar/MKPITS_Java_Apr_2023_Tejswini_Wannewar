--Generate a Unique Customer ID
--Design a user-defined function that generates a unique customer ID based on a predefined pattern and the customers personal details.7


delimiter //
CREATE function get_uniqeId(First_name varchar(50),last_name varchar(50),mobile_number varchar(50) ,unique_id varchar(50) )
returns varchar(50) deterministic
begin
declare  uniqe_id varchar(50);
set  uniqe_id =concat(left(First_name,4),right(last_name,4),right(mobile_number,5),left(unique_id,1));
return uniqe_id;
end //
delimiter ;
select get_uniqeId("tejswini","wannewar","9284186651","@#$%")