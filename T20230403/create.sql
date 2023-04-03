drop database if exists yootk;
create database yootk character set UTF8;
use yootk;

create table users (
    mid varchar(50),
    name varchar(50),
    password varchar(50),
    constraint pk_mid primary key (mid)
);

insert into users(mid, name, password)
values ('muyan', 'yootk', 'java');
insert into users(mid, name, password)
values ('admin', 'iee', 'hello');
commit ;
