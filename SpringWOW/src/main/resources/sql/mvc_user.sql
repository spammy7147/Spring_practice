CREATE TABLE mvc_user(

	account VARCHAR(100) PRIMARY KEY,
	password VARCHAR(80) NOT NULL,
	name VARCHAR(100) NOT NULL,
	reg_date TIMESTAMP DEFAULT SYSDATE

);

ALTER TABLE mvc_user ADD session_id VARCHAR2(80) DEFAULT 'none' NOT NULL;
ALTER TABLE mvc_user ADD limit_time TIMESTAMP;