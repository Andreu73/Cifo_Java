DROP TABLE CAR IF EXISTS;
DROP TABLE CATEGORY IF EXISTS;
CREATE SEQUENCE my_seq START WITH 7 INCREMENT BY 1;

CREATE TABLE CATEGORY (CATEGORYID BIGINT NOT NULL, NAME VARCHAR(255) NOT NULL, PRIMARY KEY (CATEGORYID));

CREATE TABLE CAR (ID BIGINT NOT NULL, MODEL VARCHAR(255) NOT NULL, ID_CATEGORY BIGINT NOT NULL, 
PRIMARY KEY (ID), FOREIGN KEY (ID_CATEGORY) REFERENCES CATEGORY (CATEGORYID));

