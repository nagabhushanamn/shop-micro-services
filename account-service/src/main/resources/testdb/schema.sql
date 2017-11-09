
drop table PRODUCTS if exists;

create table PRODUCTS(
	ID bigint identity primary key,
	NAME varchar(100) NOT NULL,
	PRICE decimal(8,2),
	make_date date,
	description varchar(256)
);
