--Calculate Age from Birthdate
--Develop a user-defined function that takes a persons birthdate as input and calculates their current age in years.


DELIMITER //
CREATE function calculate_age_from_birthdate(Birth_year int ,current_year int)
returns integer deterministic
BEGIN
    DECLARE Age_of_Person int ;
    set Age_of_Person= current_year-Birth_year;
return Age_of_Person;
END //
DELIMITER ;
drop function calculate_age_from_birthdate

SELECT calculate_age_from_birthdate(1999,2023) AS Age_of_Person;
