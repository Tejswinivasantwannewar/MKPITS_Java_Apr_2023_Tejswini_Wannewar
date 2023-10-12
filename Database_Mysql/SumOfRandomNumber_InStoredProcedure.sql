DELIMITER //
CREATE PROCEDURE SumOfRandomNUmber_repeatant(num int)
BEGIN
declare counter int;
declare sum int;
set counter = 1;
set sum = 1;

repeat 
set sum = sum + counter;
set counter = counter + 1;
until counter > num
end repeat;
select sum;
END
//
DELIMITER ;

call SumOfRandomNUmber_repeatant(5)