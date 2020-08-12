CREATE DATABASE demo;

CREATE TABLE People (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(45) NOT NULL,
  email varchar(45) NOT NULL,
  address varchar(45) NOT NULL,
  PRIMARY KEY (id)
);