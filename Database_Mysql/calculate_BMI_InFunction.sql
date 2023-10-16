

--Create a user-defined function that takes a persons weight (in kilograms) and height (in meters) as input and calculates their BMI.


Delimiter //

CREATE function Calculate_BMI(height double,weight int)
returns double deterministic
begin
declare calculated_BMI_AS_Per_heightAndWeight double;
set calculated_BMI_AS_Per_heightAndWeight=weight/sqrt(height);
return calculated_BMI_AS_Per_heightAndWeight;

end //
delimiter ;
select Calculate_BMI(5.11,65) as calculated_BMI_AS_Per_heightAndWeight