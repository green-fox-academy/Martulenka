create database todo;

CREATE USER 'java'@'localhost' IDENTIFIED BY '12345';
GRANT ALL ON todo.* TO 'java'@'localhost';

drop user java@localhost;
flush privileges;