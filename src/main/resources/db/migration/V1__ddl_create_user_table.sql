CREATE TABLE users (
 id BIGINT AUTO_INCREMENT  ,
 username VARCHAR(255),
 email VARCHAR(255)
 firstname VARCHAR(255),
 lastname VARCHAR(255),
 password VARCHAR(255),
 PRIMARY key (id),
 constraint unique_username unique (username),
 constraint unique_useremail unique (username)
);