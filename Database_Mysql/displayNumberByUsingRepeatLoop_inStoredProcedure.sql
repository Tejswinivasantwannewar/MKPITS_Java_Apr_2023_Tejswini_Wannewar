use sakila
 
 -- (1)  Display the number by using repeatant loop
 drop procedure displayNumberByUsingRepeatLoop
   -- ============ create a store procedure ============
   Delimiter //
   create procedure displayNumberByUsingRepeatLoop(n int)
begin
   declare counter int ; 
   declare string varchar(50); 
    set string="";
    set counter=1;
   
   repeat 
    set string= concat(string,counter,",");
    set counter=counter+1; -- 2,3,4,5,6
    until counter>n
    end repeat;
      select string;
end
  //
  delimiter ;
  -- ============ call store procedure =================
  call displayNumberByUsingRepeatLoop(5)
    
  
  
