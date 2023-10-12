use sakila
 
 -- (1)  Factorial by repeat loop
 drop procedure factorialByRepeatantLoop
   -- ============ create a store procedure ============
   Delimiter //
   create procedure factorialByRepeatantLoop(n int)
begin
   declare i int ; 
   declare number1 int ; 
   set number1=1;
   set i=1;
   
   repeat
   set number1=number1*i;
   set i=i+1;
   until i>n  -- whenever the condition false the loop stop
    end repeat;
      select number1;
end
  //
  delimiter ;
  -- ============ call store procedure =================
  call factorialByRepeatantLoop(5)
    
  
  

  
  