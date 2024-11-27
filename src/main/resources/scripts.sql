CREATE TABLE tasks (
                       task_id DOUBLE NOT NULL,
                       title VARCHAR(45) NULL,
                       description VARCHAR(45) NULL,
                       status VARCHAR(45) NULL,
                       priority VARCHAR(45) NULL,
                       dueDate DATE NULL,
                       PRIMARY KEY (task_id));

INSERT INTO test.tasks (task_id,title) VALUES (1234 , 'TASK1');
INSERT INTO test.tasks (task_id,title) VALUES (5678 , 'TASK2');
INSERT INTO test.tasks (task_id,title) VALUES (9101 , 'TASK3');


CREATE TABLE users (
               user_id DOUBLE NOT NULL,
               username VARCHAR(45) NULL,
               password VARCHAR(45) NULL,
               first_name VARCHAR(45) NULL,
               last_name VARCHAR(45) NULL,
               role VARCHAR(45) NULL,
               PRIMARY KEY (user_id));


INSERT INTO test.users (user_id,username, password, role) VALUES (1 , 'Ahmed','Ahmed','ADMIN');
INSERT INTO test.users (user_id,username, password, role) VALUES (2 , 'Mohamed','Mohamed','USER');