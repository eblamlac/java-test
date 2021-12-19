create database if not exists yonghedb charset utf8;
use yonghedb;
drop table if exists emp;
create table emp(
id int primary key auto_increment,
name varchar(100),
job varchar(100),
salary  double
)
insert into emp values(null,"王海涛","无头程序员",2900);
insert into emp values(null,"俩三","无头程序员",2901);
insert into emp values(null,"陈阿三","无头程序员",2902);
insert into emp values(null,"那你","无头程序员",2903);