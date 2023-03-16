select * from member where name like '%가%';
select * from member;
update member SET 주민등록번호 = '889030-1012517' where id ='test2' ;

commit;









select * from member where REGEXP_LIKE(주민등록번호,'^\d{6}-\d{7}$');
