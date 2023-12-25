create database BankDeatailsMVC_JSP
use BankDeatailsMVC_JSP
create table BankDeatailsMVC_JSP_Table(User_id varchar(255) primary key, UserPassword varchar(25),Customer_Name varchar(255),Customer_Address varchar(255),Customer_City varchar(255),
							  Customer_Mobile varchar(255),Customer_Balance int)
                              
select * from BankDeatailsMVC_JSP_Table  

  
create table Transactions_MVC_JSP(User_Id varchar(20),Transaction_date date,Amount int ,Transaction_type varchar(20),
foreign key (User_Id ) references BankDeatailsMVC_JSP_Table(User_id))

select * from Transactions_MVC_JSP




create table Admin(user_id varchar(25),User_Password varchar(100))
select * from Admin

create table Log(logTime timestamp ,Task varchar(200),user_id  varchar(29))
select * from Log

