create database Exercise2;

use Exercise2;

create table Users(uID int not null, name text,PRIMARY KEY (uID));
create table Tasks(tID int not null, uID int, description text, done boolean,PRIMARY KEY (tID));

insert into Users values(1,'Ferda');
insert into Users values(2,'Martina');

insert into Tasks values (1,1,'Sleep',true);
insert into Tasks values (2,1,'Eat breakfast',true);
insert into Tasks values (3,1,'Sit on a windowsill',false);
insert into Tasks values (4,1,'Get treats',true);
insert into Tasks values (5,1,'Eat second breakfast',true);
insert into Tasks values (6,1,'Nap',true);
insert into Tasks values (7,1,'Eat lunch',false);
insert into Tasks values (8,1,'Get more treats',false);
insert into Tasks values (9,2,'Buy milk',true);
insert into Tasks values (10,2,'Walk the dog',true);
insert into Tasks values (11,2,'Buy more treats',true);
insert into Tasks values (12,2,'Feed the cat',true);

select * from Tasks  inner join Users on tasks.uID=users.uID where Users.name = "Ferda" and tasks.done=false;

update tasks set done=true where tID=6;

select * from tasks where description="Nap";

delete from tasks where tID=10;

select users.name, tasks.description, tasks.done from Tasks inner join Users on tasks.uID = users.uID;