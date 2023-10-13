

DELIMITER //

create procedure print5(number1 int)
begin
declare counter int ;
set counter=0;
while (counter <1) do
set counter = counter+1;
end while;
select "hiii",number1;
end
// delimiter ;

call print5(5);