use tushu;

create table user (
  id varchar(30) primary key comment '主键',
  login_name varchar(100) not null comment '登录名',
  passwd varchar(100) not null comment '密钥',
  name varchar(100) not null comment '用户名', 
  type int not null comment '用户类型, 1-学生',
  gmt_create datetime not null comment '创建时间',
  gmt_modified datetime comment '修改时间',

    unique(login_name)
) engine = InnoDB default charset = utf8;

alter table user comment '用户表';

create table book (
	id varchar(30) primary key,
    name varchar(200) not null comment '书名',
    user_id varchar(30) comment '借阅者',
    gmt_create datetime not null comment '创建时间',
    gmt_modified datetime comment '修改时间',


    foreign key(user_id) 
       references user(id)
) engine = InnoDB default charset = utf8;

alter table book comment '图书表';

insert into user (id, login_name, passwd, name, type, gmt_create, gmt_modified) values ('00000000001', '201122010328', '123456', '陈源', 1, now(), now());
insert into book (id, name, user_id, gmt_create, gmt_modified) values ('00000000001', '程序员的自我修养', '00000000001', now(), now());
