drop TABLE user if EXISTS;
CREATE TABLE user(id bigint generated BY DEFAULT AS IDENTITY ,username VARCHAR(255),age INT,PRIMARY KEY(id));