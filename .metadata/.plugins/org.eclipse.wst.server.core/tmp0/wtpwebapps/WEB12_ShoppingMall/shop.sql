drop table worker purge;
-- 관리자정보 저장 테이블

create table worker( 
	id varchar2(20) primary key,
	pwd varchar2(20),
	name varchar2(40),
	phone varchar2(20)
);

-- 쇼핑몰 회원들의 정보를 저장하는 테이블
-- 기본키를 삭제하되 참조되는 항목들도 같이 삭제하세요
alter table member drop primary key cascade; 
-- 기존 member 테이블 삭제
drop table member purge;

create table member( 
	id varchar2(20) primary key,
	pwd varchar2(20), 
	name varchar2(40),
	email varchar2(40),
	zip_num varchar2(7), -- 우편번호
	address varchar2(100),
	phone varchar2(20),
	useyn char(1) default 'y', --현재 id 사용여부(활동중/비활동중)
	indate date default sysdate --가입일
);

​
alter table product drop primary key cascade;
drop table product purge;

create table product(
	pseq number(5) primary key,
	name varchar2(100),
	kind char(1), 
	price1 number(7) default '0', --원가
	price2 number(7) default '0', --판매가
	price3 number(7) default '0', --수익
	content varchar2(1000), --상품설명 내용
	image varchar2(50) default 'default.jpg', --상품이미지
	useyn char(1) default 'y', -- 현재 판매중여부
	bestyn char(1) default 'n', --베스트 상품 y/n
	indate date default sysdate --등록일
);

drop sequence product_seq;
create sequence product_seq start with 1;

​

alter table cart drop primary key cascade;
drop table cart purge;

create table cart (
cseq number(10) primary key, -- 장바구니번호
id varchar2(16) references member(id), -- 주문자 아이디(FK :　member.id) 
pseq number(5) references product(pseq), -- 주문 상품번호(FK :product.pseq) 
quantity number(5) default 1, -- 주문 수량
result char(1) default '1', -- 1:미처리 2:처리
indate date default SYSDATE -- 주문일
);

drop sequence cart_seq;
create sequence cart_seq start with 1;

​
alter table orders drop primary key cascade;
drop table orders purge;


create table orders(
	oseq number(10) primary key, -- 주문번호 
	id varchar2(16) references member(id), -- 주문자 아이디
	indate date default sysdate -- 주문일
);

​
drop sequence orders_seq;
create sequence orders_seq start with 1;


alter table order_detail drop primary key cascade;
drop table order_detail purge;

​
create table order_detail(
	odseq number(10) primary key, -- 주문상세번호
	oseq number(10) references orders(oseq), -- 주문번호 
	pseq number(5) references product(pseq), -- 상품번호
	quantity number(5) default 1, -- 주문수량
	result char(1) default '1' -- 1: 미처리 2: 처리 
);

drop sequence order_detail_seq;
create sequence order_detail_seq start with 1;

​

alter table qna drop primary key cascade;
drop table qna purge;

create table qna (
qseq number(5) primary key, -- 글번호 
subject varchar2(300), -- 제목
content varchar2(1000), -- 문의내용
reply varchar2(1000), -- 답변내용
id varchar2(20), -- 작성자(FK : member.id) 
rep char(1) default '1', --1:답변 무 2:답변 유 
indate date default sysdate -- 작성일
); 

drop sequence qna_seq;
create sequence qna_seq start with 1;


alter table address drop primary key cascade;
drop table address purge;


CREATE TABLE address (
	zip_num VARCHAR2(7) NOT NULL,
	sido VARCHAR2(30) NOT NULL,
	gugun VARCHAR2(30) NOT NULL,
	dong VARCHAR2(100) NOT NULL,
	zip_code VARCHAR2(30) ,
	bunji VARCHAR2(30) 
);

​

insert into worker values('admin', 'admin', '관리자', '010-777-7777');
insert into worker values('scott', 'tiger', '강희준', '010-6400-6068');


insert into member(id, pwd, name, zip_num, address, phone) values
('one', '1111', '김나리', '133-110', '서울시 성동구 성수동1가 1번지21호', 
'017-777-7777');
insert into member(id, pwd, name, zip_num, address, phone) values
('two', '2222', '이백합', '130-120', 
'서울시 송파구 잠실2동 리센츠 아파트 201동 505호', '011-123-4567');

insert into product(pseq, name, kind, price1, price2, price3, content, image) 
values(product_seq.nextval, '크로그다일부츠', '2', 40000, 50000, 10000, 
'오지니랄 크로그다일부츠 입니다.', 'w2.jpg');
insert into product(pseq, name, kind, price1, price2, price3, content, image, bestyn) 
values(product_seq.nextval, '롱부츠', '2', 40000, 50000, 10000,'따뜻한 롱부츠 입니다.', 'w-28.jpg', 'n');
insert into product(pseq, name, kind, price1, price2, price3, content, image, bestyn) 
values(product_seq.nextval, '힐', '1', 10000, 12000, 2000, '여성용전용 힐', 'w-26.jpg', 'n');
insert into product(pseq, name, kind, price1, price2, price3, content, image, bestyn) 
values(product_seq.nextval, '슬리퍼', '4', 5000, 5500, 500, '편안한 슬리퍼입니다.', 'w-25.jpg', 'y');
insert into product(pseq, name, kind, price1, price2, price3, content, image, bestyn) 
values(product_seq.nextval, '회색힐', '1', 10000, 12000, 2000, '여성용전용 힐', 'w9.jpg', 'n');
insert into product(pseq, name, kind, price1, price2, price3, content, image) 
values(product_seq.nextval, '여성부츠', '2', 12000, 18000, 6000, '여성용 부츠', 'w4.jpg');
insert into product(pseq, name, kind, price1, price2, price3, content, image, bestyn) 
values(product_seq.nextval, '핑크샌달', '3', 5000, 5500, 500,'사계절용 샌달입니다.', 'w-10.jpg', 'y');
insert into product(pseq, name, kind, price1, price2, price3, content, image, bestyn) 
values(product_seq.nextval, '슬리퍼', '3', 5000, 5500, 500, '편안한 슬리퍼입니다.', 'w11.jpg', 'y');
insert into product(pseq, name, kind, price1, price2, price3, content, image) 
values( product_seq.nextval, '스니커즈', '4', 15000, 20000, 5000,
'활동성이 좋은 스니커즈입니다.', 'w1.jpg');
insert into product(pseq, name, kind, price1, price2, price3, content, image, bestyn) 
values( product_seq.nextval, '샌달', '3', 5000, 5500, 500, '사계절용 샌달입니다.', 'w-09.jpg','n');
insert into product(pseq, name, kind, price1, price2, price3, content, image, bestyn) 
values( product_seq.nextval, '스니커즈', '5', 15000, 20000, 5000, 
'활동성이 좋은 스니커즈입니다.', 'w-05.jpg','n');

insert into cart(cseq, id, pseq, quantity) values(cart_seq.nextval, 'one', 1, 1);

insert into orders(oseq, id) values(orders_seq.nextval, 'two'); 
insert into orders(oseq, id) values(orders_seq.nextval, 'one');
insert into orders(oseq, id) values(orders_seq.nextval, 'one');
insert into orders(oseq, id) values(orders_seq.nextval, 'two');


insert into order_detail(odseq, oseq, pseq, quantity) values(order_detail_seq.nextval, 1, 1, 1);
insert into order_detail(odseq, oseq, pseq, quantity) values(order_detail_seq.nextval, 1, 2, 5);
insert into order_detail(odseq, oseq, pseq, quantity) values(order_detail_seq.nextval, 2, 4, 3);
insert into order_detail(odseq, oseq, pseq, quantity) values(order_detail_seq.nextval, 2, 5, 2);
insert into order_detail(odseq, oseq, pseq, quantity) values(order_detail_seq.nextval, 3, 3, 1);
insert into order_detail(odseq, oseq, pseq, quantity) values(order_detail_seq.nextval, 3, 2, 1);
insert into order_detail(odseq, oseq, pseq, quantity) values(order_detail_seq.nextval, 4, 6, 2);
insert into order_detail(odseq, oseq, pseq, quantity) values(order_detail_seq.nextval, 4, 1, 2);


insert into qna(qseq, subject, content, id)
values(qna_seq.nextval, '테스트', '질문내용1','one');
insert into qna(qseq, subject, content, id)
values(qna_seq.nextval, '테스트2', '질문내용2','one');


create or replace view cart_view
as 
select c.cseq, c.id, m.name as mname, c.pseq, p.name as pname, c.quantity, 
		p.price2, c.result, c.indate 
from cart c, product p, member m 
where c.pseq = p.pseq and m.id = c.id;

select * from cart_view; -- view는 실제 존재하지 않는 테이블 (급조되는 것이므로 메모리 절약됨)


create or replace view order_view 
as
select d.odseq, o.oseq, o.id, o.indate, d.pseq, d.quantity, d.result,
m.name as mname, m.zip_num, m.address, m.phone, 
p.name as pname, p.price2
from orders o, order_detail d, member m, product p 
where o.oseq = d.oseq and o.id = m.id and d.pseq = p.pseq;

select * from order_view

create or replace view best_pro_view
as 
select * from(
select rownum, pseq, name, price2, image
from product where bestyn='y' order by indate desc
) where rownum <=4;

select * from best_pro_view

create or replace view new_pro_view
as 
select * from(
select rownum, pseq, name, price2, image
from product where useyn='y' order by indate desc
) where rownum <=4;

select * from new_pro_view
select * from address -- 이클립스는 최대 500개까지 나옴 
-- 로컬디스트 c에 있는 zip.sql을 command에서 실행 
select count(*) from address

 
 update order_detail set result='2' where oseq=22
 select * from order_view
 
 
 insert into product(pseq, name, kind, price1, price2, price3, 
 content, image, bestyn)
 values(product_seq.nextval, '여성용 힐', '1', 40000, 50000, 10000, '따뜻한 롱부츠입니다.', 'w-12.jpg', 'y');
 
  insert into product(pseq, name, kind, price1, price2, price3, 
 content, image, bestyn)
 values(product_seq.nextval, '여성용 힐', '1', 40000, 50000, 10000, '따뜻한 롱부츠입니다.', 'w-14.jpg', 'y');
 
  insert into product(pseq, name, kind, price1, price2, price3, 
 content, image, bestyn)
 values(product_seq.nextval, '여성용 힐', '1', 40000, 50000, 10000, '라인이 살아있는 힐입니다.', 'w-14.jpg', 'y');
 
  insert into product(pseq, name, kind, price1,  price2, price3, 
 content, image, bestyn)
 values(product_seq.nextval, '스니커즈', '4', 40000, 50000, 10000, '남녀 공용 스니커즈입니다.', 'w-05.jpg', 'y');
 
  insert into product(pseq, name, kind, price1, price2, price3, 
 content, image, bestyn)
 values(product_seq.nextval, '샌들', '3', 40000, 50000, 10000, '여성용샌들입니다.', 'w-07.jpg', 'y');
 
  insert into product(pseq, name, kind, price1, price2, price3, 
 content, image, bestyn)
 values(product_seq.nextval, '부츠', '2', 40000, 50000, 10000, '사계절용 롱부츠 입니다.', 'w-08.jpg', 'y');
 
 
insert into member(id, pwd, name, zip_num, address, phone, email) values
('one1', '1111', '김나라', '133-110', '서울시 성동구 성수동1가 1번지21호', 
'017-777-7777', '123@naver.com');
insert into member(id, pwd, name, zip_num, address, phone, email) values
('two2', '2222', '이백희', '130-120', 
'서울시 송파구 잠실2동 리센츠 아파트 201동 505호', '011-123-4567','123@naver.com');
insert into member(id, pwd, name, zip_num, address, phone, email) values
('one3', '1111', '김나가', '133-110', '서울시 성동구 성수동1가 1번지21호', 
'017-777-7777', '123@naver.com'); 
insert into member(id, pwd, name, zip_num, address, phone, email) values
('two4', '2222', '이백후', '130-120', 
'서울시 송파구 잠실2동 리센츠 아파트 201동 505호', '011-123-4567','123@naver.com');
insert into member(id, pwd, name, zip_num, address, phone, email) values
('one5', '1111', '김나이', '133-110', '서울시 성동구 성수동1가 1번지21호', 
'017-777-7777', '123@naver.com'); 
insert into member(id, pwd, name, zip_num, address, phone, email) values
('two2', '2222', '이백지', '130-120', 
'서울시 송파구 잠실6동 리센츠 아파트 201동 505호', '011-123-4567','123@naver.com');
insert into member(id, pwd, name, zip_num, address, phone, email) values
('one7', '1111', '김나아', '133-110', '서울시 성동구 성수동1가 1번지21호', 
'017-777-7777', '123@naver.com'); 
insert into member(id, pwd, name, zip_num, address, phone, email) values
('two8', '2222', '이백하', '130-120', 
'서울시 송파구 잠실3동 리센츠 아파트 201동 505호', '011-123-4567','123@naver.com');


insert into qna(qseq, subject, content, id)
values(qna_seq.nextval, '교환문의', '사이즈교환부탁드립니다.','one7');
insert into qna(qseq, subject, content, id)
values(qna_seq.nextval, '배송이 느립니다.', '환불해주세요','one5');
insert into qna(qseq, subject, content, id)
values(qna_seq.nextval, '교환문의', '사이즈교환부탁드립니다.','one7');
insert into qna(qseq, subject, content, id)
values(qna_seq.nextval, '배송이 느립니다.', '환불해주세요','one5');
insert into qna(qseq, subject, content, id)
values(qna_seq.nextval, '교환문의', '사이즈교환부탁드립니다.','one7');
insert into qna(qseq, subject, content, id)
values(qna_seq.nextval, '배송이 느립니다.', '환불해주세요','one5');
insert into qna(qseq, subject, content, id)
values(qna_seq.nextval, '교환문의', '사이즈교환부탁드립니다.','one7');
insert into qna(qseq, subject, content, id)
values(qna_seq.nextval, '배송이 느립니다.', '환불해주세요','one5');
insert into qna(qseq, subject, content, id)
values(qna_seq.nextval, '교환문의', '사이즈교환부탁드립니다.','one7');
insert into qna(qseq, subject, content, id)
values(qna_seq.nextval, '배송이 느립니다.', '환불해주세요','one5');
insert into qna(qseq, subject, content, id)
values(qna_seq.nextval, '교환문의', '사이즈교환부탁드립니다.','one7');
insert into qna(qseq, subject, content, id)
values(qna_seq.nextval, '배송이 느립니다.', '환불해주세요','one5');
insert into qna(qseq, subject, content, id)
values(qna_seq.nextval, '교환문의', '사이즈교환부탁드립니다.','one7');
insert into qna(qseq, subject, content, id)
values(qna_seq.nextval, '배송이 느립니다.', '환불해주세요','one5');
insert into qna(qseq, subject, content, id)
values(qna_seq.nextval, '교환문의', '사이즈교환부탁드립니다.','one7');
insert into qna(qseq, subject, content, id)
values(qna_seq.nextval, '배송이 느립니다.', '환불해주세요','one5');
insert into qna(qseq, subject, content, id)
values(qna_seq.nextval, '교환문의', '사이즈교환부탁드립니다.','one7');
insert into qna(qseq, subject, content, id)
values(qna_seq.nextval, '배송이 느립니다.', '환불해주세요','one5');
insert into qna(qseq, subject, content, id)
values(qna_seq.nextval, '교환문의', '사이즈교환부탁드립니다.','one7');
insert into qna(qseq, subject, content, id)
values(qna_seq.nextval, '배송이 느립니다.', '환불해주세요','one5');
insert into qna(qseq, subject, content, id)
values(qna_seq.nextval, '교환문의', '사이즈교환부탁드립니다.','one7');
insert into qna(qseq, subject, content, id)
values(qna_seq.nextval, '배송이 느립니다.', '환불해주세요','one5');
insert into qna(qseq, subject, content, id)
values(qna_seq.nextval, '교환문의', '사이즈교환부탁드립니다.','one7');
insert into qna(qseq, subject, content, id)
values(qna_seq.nextval, '배송이 느립니다.', '환불해주세요','one5');

 
 
 
 
 
 
 
 
 

