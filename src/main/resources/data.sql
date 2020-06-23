INSERT INTO USERS (EMAIL, FIRST_NAME, LAST_NAME, PASSWORD)
VALUES ('user@gmail.com', 'User_First', 'User_Last', 'password'),
       ('admin@javaops.ru', 'Admin_First', 'Admin_Last', 'admin');

INSERT INTO USER_ROLE (ROLE, USER_ID)
VALUES ('ROLE_USER', 1),
       ('ROLE_ADMIN', 2),
       ('ROLE_USER', 2);

INSERT INTO restaurants (name, address)
VALUES ('Celler de Can Roca Restaurant', 'Spain'),--10004
       ('Noma Restaurant', 'Copenhagen'),--10005
       ('Sato Restaurant', 'Mexico');--10006

INSERT INTO menus (rest_id, date_menu)
VALUES (1, '2020-05-01'),--10000 10 10007
       (2, '2020-05-01'),--10001 11 10008
       (3, '2020-05-01')--10002 12 10009
      ;

INSERT INTO meals (menu_id, name, price)
VALUES (1, 'Salad', 5.50),-- 10014
       (2, 'juice', 4.50),-- 10015
       (3, 'soup', 3.05);