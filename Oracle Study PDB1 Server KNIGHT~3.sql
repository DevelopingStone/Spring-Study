select * from member;

insert into member(id,pwd,name,gender) VALUES('test',123,'test','Áß¼º');
rollback;
select * from member;


DELETE member WHERE id='test';
select * from member;
commit;

select * from member;
BEGIN;

select id from member where ID='DevRock';

select pwd+1 pwd from member;

select 'a'||1 plus from dual;

select * from member where regdate is null;


select * from member;
insert into member (id, pwd) values ('test1',0);
insert into member (id, pwd) values ('test2',1);
insert into member (id, pwd) values ('test3',2);

select * from member where pwd not in(0,2,7);




