select * from member;

insert into member(id,pwd,name,gender) VALUES('test',123,'test','중성');
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


select name||'('|| id ||')' 회원조회 from member;



select name || '('||id||')'  회원조회 from member;
