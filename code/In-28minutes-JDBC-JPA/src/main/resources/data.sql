create table Student(
	stud_id integer not null,
	full_name varchar(255) not null,
	location varchar(255),
	birth_date timestamp,
	
	primary key(stud_id)
);

insert into student values(100,'Vijay Gawade','Pendur',sysdate());
insert into student values(101,'Prasad Dicholkar','Talwade',sysdate());
insert into student values(102,'Haresh M','Shiroda',sysdate());
insert into student values(103,'Rangita Tamankar','Hodawade',sysdate());
insert into student values(104,'Sandeep Parab','Mumbai',sysdate());
insert into student values(105,'Santosh Dabholkar','Zarap',sysdate());
insert into student values(106,'Nana Gawade','Matond',sysdate());
insert into student values(107,'Shubhangi Lubade','Malvan',sysdate());
insert into student values(108,'Arun Dicholkar','Vengurla',sysdate());
insert into student values(109,'Shubham Indurkar','Warje',sysdate());
insert into student values(110,'Nidhi Deshpande','Kotharud',sysdate());