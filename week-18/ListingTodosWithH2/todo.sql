create database todo;

CREATE USER 'java'@'localhost' IDENTIFIED BY '12345';
GRANT ALL ON todo.* TO 'java'@'localhost';

drop user java@localhost;
flush privileges;



insert into to_do values(6,1,'make bed',1);
insert into to_do values(7,1,'eat breakfast',1);
insert into to_do values(8,1,'sweep the floor',1);
insert into to_do values(9,1,'wash the dishes',1);
insert into to_do values(10,1,'cook dinner',1);

Select * from to_do;