use sakila
 
 -- (1)  Display the number by using Basic loop
 drop procedure displayNumberByUsingBasicLoop
   -- ============ create a store procedure ============
   Delimiter //
   create procedure displayNumberByUsingBasicLoop1(n int)
begin
   declare counter int ; 
   declare string varchar(50); 
    set string="";
    set counter=1;
   
   label: loop
    set string= concat(string,counter,",");
    set counter=counter+1; -- 2,3,4,5,6
    
    if counter>n then
    leave label;
    end if;
    end loop label ;
      select string;
end
  //
  delimiter ;
  -- ============ call store procedure =================
  call displayNumberByUsingBasicLoop1(5)
    
  
  

  
  