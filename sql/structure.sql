CREATE DATABASE airport_db;

USE airport_db;

CREATE TABLE pilots(
    id int NOT NULL AUTO_INCREMENT,
    firstname varchar(40) NOT NULL,
    lastname varchar(40) NOT NULL,
    rang varchar(20) NOT NULL,
    code varchar(20) UNIQUE NOT NULL,
    PRIMARY KEY(id)
    );

CREATE TABLE airplanes(
    id int NOT NULL AUTO_INCREMENT,
    brend varchar(40) NOT NULL,
    model varchar(40) NOT NULL,
    capacity int NOT NULL,
    number varchar(40) UNIQUE,
    PRIMARY KEY(id)
    );

CREATE TABLE flights(
    id int NOT NULL AUTO_INCREMENT,
    airplane_id int,
    pilot_id int,
    departure_date date NOT NULL,
    departure_time time NOT NULL,
    flight_number varchar(10) UNIQUE NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY (airplane_id) REFERENCES airplanes(id),
    FOREIGN KEY (pilot_id) REFERENCES pilots(id)
    );