-- create a table for storing the data from cursor which is fetched from database by using explicit cursor

use sakila
show tables
select * from city
select * from payment

create table New_Name_City( Name_ varchar(50),
                            City varchar(50)
   
                           );