create table students_table
(
    id   serial primary key ,
    name text,
    age  int
);
select * from students_table where id=3;

delete from students_table where id>0;