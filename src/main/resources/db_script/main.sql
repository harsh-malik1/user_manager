--  create database

CREATE database user_manager_v1 ;

--     using our database
use user_manager_v1 ;

--     making table in a databse
GRANT ALL PRIVILEGES ON USER_MANAGER_V1.* TO 'root'@'localhost' IDENTIFIED BY '#nit#nit';

CREATE table users
(
    user_id    INT         NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(50) NOT NULL,
    last_name  VARCHAR(50) NOT NULL,
    email      VARCHAR(255) NOT NULL UNIQUE,
    password   VARCHAR(255) NOT NULL,
    created_at TIMESTAMP,
    updated_at TIMESTAMP,
    PRIMARY KEY (user_id)
);

