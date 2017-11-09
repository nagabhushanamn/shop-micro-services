
drop table ACCOUNTS if exists;

create table ACCOUNTS(
	USER_NAME varchar(100) primary key,
	NAME varchar(100) NOT NULL,
	PASSWORD varchar(100) NOT NULL,
	EMAIL varchar(100) NOT NULL,
);
