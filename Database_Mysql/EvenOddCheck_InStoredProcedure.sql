DELIMITER //

create procedure evenOddCheckNumber1(number1 int)
begin
if (number1%2=0) then   
select "number is even",number1;
else
select "number is odd",number1;
end if;
end
// delimiter ;

call evenOddCheckNumber1(4)
drop procedure tableOfRandomNumber
