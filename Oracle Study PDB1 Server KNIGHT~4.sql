select * from member where name like '%��%';
select * from member;
update member SET �ֹε�Ϲ�ȣ = '889030-1012517' where id ='test2' ;

commit;









select * from member where REGEXP_LIKE(�ֹε�Ϲ�ȣ,'^\d{6}-\d{7}$');
