--User Table insert Scripts
INSERT INTO USER (id, enabled, password, username) VALUES (1, 1, 'password', 'admin');
INSERT INTO USER (id, enabled, password, username) VALUES (2, 1, 'sree', 'sree');
INSERT INTO USER (id, enabled, password, username) VALUES (3, 1, 'mike', 'mike');
INSERT INTO USER (id, enabled, password, username) VALUES (4, 0, 'john', 'john');

--Role Table insert Scripts
INSERT INTO ROLE (id, role) VALUES (1, 'ADMIN');
INSERT INTO ROLE (id, role) VALUES (2, 'EMPLOYEE');
INSERT INTO ROLE (id, role) VALUES (3, 'EMPLOYER');
INSERT INTO ROLE (id, role) VALUES (4, 'CUSTOMER');
INSERT INTO ROLE (id, role) VALUES (5, 'VENDOR');

--User_Roles Table insert Scripts
INSERT INTO USER_ROLES (user_id, role_id) VALUES (1, 1);
INSERT INTO USER_ROLES (user_id, role_id) VALUES (1, 2);
INSERT INTO USER_ROLES (user_id, role_id) VALUES (2, 3);
INSERT INTO USER_ROLES (user_id, role_id) VALUES (3, 4);
INSERT INTO USER_ROLES (user_id, role_id) VALUES (4, 5);

--Customer Table insert Scripts
INSERT INTO CUSTOMER (id, email_id, first_name, last_name, mobile_number) VALUES (1, 'jake@sample.com', 'jake', 'johnson', '234-989-2334');
INSERT INTO CUSTOMER (id, email_id, first_name, last_name, mobile_number) VALUES (2, 'margaret@outlook.com', 'margaret', 'nicolas', '555-989-2334');
INSERT INTO CUSTOMER (id, email_id, first_name, last_name, mobile_number) VALUES (3, 'richard@outlook.com', 'richard', 'dave', '354-234-1111');
INSERT INTO CUSTOMER (id, email_id, first_name, last_name, mobile_number) VALUES (4, 'jimmy@gmail.com', 'jimmy', 'jackson', '222-312-5689');
INSERT INTO CUSTOMER (id, email_id, first_name, last_name, mobile_number) VALUES (5, 'gregory@yahoo.com', 'gregory', 'waugh', '434-879-4628');

--Item table insert scripts
INSERT INTO ITEM (id, available, description, name) VALUES (1, 1, 'Best item in town', 'item one');
INSERT INTO ITEM (id, available, description, name) VALUES (2, 1, 'Best item in Country', 'item two');
INSERT INTO ITEM (id, available, description, name) VALUES (3, 1, 'Best item in state', 'item three');
INSERT INTO ITEM (id, available, description, name) VALUES (4, 1, 'Best item on planet', 'item four');
INSERT INTO ITEM (id, available, description, name) VALUES (5, 0, 'Not in stock item', 'item five');