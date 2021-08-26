drop table board purge;
create table board(
	num number(5) primary key,
	pass varchar2(30),
	userid varchar2(30),
	email varchar2(30),
	title varchar2(100),
	content varchar2(1000),
	readcount number(4) default 0,
	writedate date default sysdate
);

create sequence board_seq start with 1 increment by 1;
select * from member;

Insert into board(num, userid, email, pass, title, content)
values(board_seq.nextVal, 'somi', 'abcd@naver.com', '1234', '첫방문','반갑습니다');
Insert into board(num, userid, email, pass, title, content)
values(board_seq.nextVal, 'light', 'adddnaver.com', '1234', '게시판 개설','축하드립니다');
Insert into board(num, userid, email, pass, title, content)
values(board_seq.nextVal, 'sang12', 'bnbn@naver.com', '1234', 
'돼지골마을','돼지 삼겹살이 맛있습니다');
Insert into board(num, userid, email, pass, title, content)
values(board_seq.nextVal, 'scott', 'gre@daum.ner', '1234', '2020년 겨울' , 
'날씨 춥고, 한파가 기승을 부립니다');

select * from board

update board set userid='scott' where num=5;




Insert into board(num, userid, email, pass, title, content)
values(board_seq.nextVal, 'somi', 'abcd@naver.com', '1234', 
'맛집 탐방 후기','맛집이라고 하기엔 그저그랬습니다');
Insert into board(num, userid, email, pass, title, content)
values(board_seq.nextVal, 'scott', 'adddnaver.com', '1234', 
'코로나19','사회적 거리두기 2.5단계 - 모두 거리두기에 동참해주세요');
Insert into board(num, userid, email, pass, title, content)
values(board_seq.nextVal, 'sang12', 'bnbn@naver.com', '1234', 
'돼지골마을','돼지 삼겹살이 맛있습니다');
Insert into board(num, userid, email, pass, title, content)
values(board_seq.nextVal, 'light', 'gre@daum.ner', '1234', 
'2021년 겨울' , '날씨 강추위가 1월 초반내내 기승을 부릴 예정이랍니다');
Insert into board(num, userid, email, pass, title, content)
values(board_seq.nextVal, 'light', 'gre@daum.ner', '1234', 
'2021년 소띠해입니다' , '신축년이랍니다.');

delete from board where num=105
select * from board;
select * from board where num>=98 and num<=107;
select * from (select rownum as rn, board.* from board ) 
where rn>=97 and rn<=106;

select * from (select rownum as rn, board.* from board order by num desc) 
where rn>=1 and rn<=10

--1
select * from board order by num desc
-- 2
select rownum as rn, t.*  from (select * from board order by num desc) t;
--3
select * from
( select rownum as rn, t.*  from (select * from board order by num desc) t )
where rn>=1 and rn <=10;


create table reply(
	num number(7) primary key,
	boardnum number(5),
	userid varchar2(20),
	writedate date default sysdate,
	content varchar2(1000)
);

create sequence reply_seq start with 1 increment by 1;

select * from reply


alter table board add replycnt number(3);

select * from board;






