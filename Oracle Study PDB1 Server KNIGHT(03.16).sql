select * from member;

insert into member(id,pwd,name,gender) VALUES('test',123,'test','Áß¼º');
rollback;
select * from member;


DELETE member WHERE id='test';
select * from member;
commit;

select * from member;


