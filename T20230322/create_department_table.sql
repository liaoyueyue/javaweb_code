drop database if exists yootk;
create database yootk character set UTF8;
use yootk;

create table dept
(
    no   bigint auto_increment,
    name varchar(50),
    loc  varchar(50),
    constraint pk_no primary key (no)
) engine = InnoDB
  default charset = utf8;

insert into dept(name, loc)
values ('开发部', '成都');
insert into dept(name, loc)
values ('教学部', '北京');
insert into dept(name, loc)
values ('财务部', '上海');
insert into dept(name, loc)
values ('市场部', '深圳');
insert into dept(name, loc)
values ('后勤部', '洛阳');
insert into dept(name, loc)
values ('公关部', '广州');

commit;

