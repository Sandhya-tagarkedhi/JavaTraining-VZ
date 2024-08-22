use Sandhya;
create table Customers(custid int primary key,custname varchar(20) not null);
create table Orders(orderid int primary key ,ordernumber int not null,custid int,foreign key(custid) REFERENCES Customers(custid));
insert into Customers (custid, custname)VALUES (1, 'John'), (2, 'Jane'), (3, 'Bob');
insert into Orders (orderid, ordernumber, custid) VALUES (1, 101, 1), (2, 102, 2), (3, 103, 3);
select * from Customers;
select * from Orders;
show tables;
select * from test;