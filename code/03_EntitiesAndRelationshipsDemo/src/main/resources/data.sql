insert into COURSES(COURSE_ID ,COURSE_NAME ) values
(101,'Data Structure'),
(102,'Advance Java'),
(103, 'Python'),
(104,'Spring Boot 5'),
(105,'Parallel Computing');

insert into STUDENT_PASSPORT(PASSPORT_ID ,PASSPORT_NUMBER ) values
(301,'A2096457'),
(302,'B8722775'),
(303,'C4185542'),
(304,'D3556956'),
(305,'E6555659');

insert into STUDENTS(STUD_ID ,STUD_FULLNAME, PASSPORT_ID) values
(201,'Vijay R. Gawade',301),
(202,'Shubham Indurkar',302),
(203,'Prachi Sutane',303),
(204,'Karuna Rane',304),
(205,'Nidhi Deshpande',305);


insert into STUDENT_REVIEWS (STUD_REVIEW_ID,STUD_REVIEW_DESCRIPTION ,STUD_REVIEW_RATING ,COURSE_ID ) values
(401,'Good','4',101),
(402,'Average','3',101),
(403,'Best','4.5',101),
(404,'bad','2.5',101),
(405,'Good','3',101),
(406,'need improvement','3.5',102),
(407,'best','4.5',103),
(408,'Excellent','5',104),
(409,'Poor','2',105);