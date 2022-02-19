create database todo;
CREATE USER 'java'@'localhost' IDENTIFIED BY 'password';
GRANT ALL ON toDoList.* TO 'java'@'localhost';