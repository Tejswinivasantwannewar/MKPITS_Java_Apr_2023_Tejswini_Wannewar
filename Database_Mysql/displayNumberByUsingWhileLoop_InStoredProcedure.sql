use sakila
 
 -- (1)  Display the number by using while loop
 drop procedure displayNumberByUsingWhileLoop
   -- ============ create a store procedure ============
   Delimiter //
   create procedure displayNumberByUsingWhileLoop(n int)
begin
   declare counter int ; 
   declare string varchar(50); 
    set string="";
    set counter=1;
   
   while counter<=n do 
    set string= concat(string,counter,",");
    set counter=counter+1; -- 2,3,4,5,6
    end while;
      select string;
end
  //
  delimiter ;
  -- ============ call store procedure =================
  call displayNumberByUsingWhileLoop(5)