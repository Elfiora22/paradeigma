CREATE  table user(
id int,
name VARCHAR (25),
PRIMARY KEY (id)
);

CREATE TABLE pet(
id int,
NAME VARCHAR (25),
user_id int,
CONSTRAINT user_fk FOREIGN KEY (user_id)REFERENCES user(id)
);