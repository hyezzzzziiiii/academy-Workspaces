create table member(
	name varchar2(30),
	userid varchar2(10),
	pwd varchar2(10),
	email varchar2(20),
	phone varchar2(15),
	admin number(1) default 0, --일반사용자 : 0, 관리자 :1
	primary key(userid)

); 

INSERT INTO member VALUES('이소미','somi', '1234', 'gmd@naver.com', '010-1234-1234', 0);
INSERT INTO member VALUES('전상오', 'sang12', '1234','h12@naver.com','010-5555-6666', 0);
INSERT INTO member VALUES('김빛나', 'light', '1234','yoon1@daum.net', '010-9999-3333', 1);
	
select * from member;