CREATE TABLE MEM(
	ID VARCHAR2(10),
	NAME VARCHAR2(15),
	PWD VARCHAR2(20),
	PHONE VARCHAR2(15)
);
	
INSERT INTO MEM VALUES('SOMI', '이소미', '1234', '010-1234-1234');
INSERT INTO MEM VALUES('SANG', '전상오', '1234', '010-5555-6666');
INSERT INTO MEM VALUES('LIGHT', '김빛나', '1234', '010-2222-3333');
	
select * from mem;
alter table mem modify name varchar2(30);

select * from booklist;
alter table in_out drop constraint fk1;
alter table booklist modify booknum number(4);