# 删除老数据库
drop database if exists tushu;

# 创建新库
create database if not exists tushu;

# 进入操作
use tushu;

# 序列化服务
create table if not exists sequence (
  tb_name varchar(200) not null comment '表名',
  id int unsigned not null auto_increment comment '自增ID',

  primary key (id),
  unique key (tb_name, id)
) engine = InnoDB default charset = utf8;

alter table sequence comment '提供控制一致性的表';

# 图书馆
create table if not exists libernary (
  id varchar(30) primary key comment '图书馆ID',
  name varchar(200) not null comment '图书馆名称',
  gmt_create datetime not null comment '创建时间',
  gmt_modified datetime comment '修改时间',

  unique(name)
) engine = InnoDB default charset = utf8;

alter table libernary comment '图书馆信息';


# 图书分类
create table if not exists book_category (
  id varchar(30) primary key comment '图书类目ID',
  parent_id varchar(30) comment '父ID',
  name varchar(200) not null comment '分类名称',
  gmt_create datetime not null comment '创建时间',
  gmt_modified datetime comment '修改时间',

  unique key (name)
) engine = InnoDB default charset = utf8;

alter table book_category comment '图书分类';

# 图书
create table if not exists book (
  id varchar(30) primary key comment '图书ID',
  book_search_no varchar(45) not null comment '图书检索号',
  book_type_id varchar(30) not null comment '图书所属类目ID',
  left_count int unsigned default 0 not null comment '图书剩余数量',
  order_count int unsigned default 0 not null comment '被预定的图书数量',
  borrow_count int unsigned default 0 not null comment '被借阅量',
  borrow_total_count int unsigned default 0 not null comment '被借阅次数',
  status varchar(45) not null comment '图书状态：',
  chinese_name varchar(300) not null comment '中文名',
  name varchar(300) comment '图书原名',
  author varchar(300) not null comment '作者',
  publisher varchar(300) comment '出版社/刊物',
  publisher_no varchar(300) comment '出版刊物号',
  publisher_date datetime comment '出版日期',
  gmt_create datetime not null comment '创建时间',
  gmt_modified datetime comment '修改时间',


  foreign key(book_type_id) 
    references book_category(id)
) engine = InnoDB default charset = utf8;

alter table book comment '图书表';

# 用户表
create table if not exists user (
  id varchar(30) primary key comment '用户ID',
  libernary_id varchar(30) not null comment '图书馆ID',
  login_name varchar(200) not null comment '登录名',
  password varchar(100) not null comment '密钥',
  real_name varchar(200) not null comment '真实名字',
  nick_name varchar(200) comment '昵称',
  type varchar(45) not null comment '用户类型',
  status varchar(45) not null comment '用户状态',
  mobile varchar(20) comment '手机号',
  email varchar(100) comment '邮箱',
  gmt_create datetime not null comment '创建时间',
  gmt_modified datetime comment '修改时间',

  foreign key(libernary_id)
    references libernary(id),
  unique(login_name)
) engine = InnoDB default charset = utf8;

alter table user comment '用户表';

# 用户表
create table if not exists book_item (
  id varchar(30) primary key comment '图书实例ID',
  user_id varchar(30) comment '借阅者ID',
  book_id varchar(30) not null comment '所属图书ID',
  libernary_id varchar(30) not null comment '图书馆信息',
  status varchar(45) not null comment '图书状态',
  borrow_deadline datetime comment '借阅归还日期',
  borrow_left_times int unsigned default 0 comment '剩余借阅次数',
  floor varchar(200) comment '图书所在楼层',
  bookself_no varchar(200) comment '图书所在书架信息',
  bookself_raw varchar(200) comment '图书所在行号',
  bookself_cloumn varchar(200) comment '图书所在列号',
  gmt_create datetime not null comment '创建时间',
  gmt_modified datetime comment '修改时间',

  foreign key(user_id)
    references user(id),
  foreign key(book_id)
    references book(id),
  foreign key(libernary_id)
    references libernary(id)
) engine = InnoDB default charset = utf8;

alter table book_item comment '图书实例列表';

# 兴趣小组
create table if not exists interest_group (
  id varchar(30) primary key comment '兴趣组ID',
  name varchar(200) not null comment '兴趣组名字',
  tag varchar(200) comment '标签',
  gmt_create datetime not null comment '创建时间',
  gmt_modified datetime comment '修改时间',

  unique(name)
) engine = InnoDB default charset = utf8;

alter table interest_group comment '兴趣小组';

# 用户-兴趣组关联关系
create table if not exists user_interest_group (
  id varchar(30) primary key comment '主键',
  user_id varchar(30) not null comment '兴趣组用户ID',
  interest_group_id varchar(30) not null comment '兴趣组ID',
  gmt_create datetime not null comment '创建时间',
  gmt_modified datetime comment '修改时间',

  foreign key(user_id)
    references user(id),
  foreign key(interest_group_id)
    references interest_group(id)
) engine = InnoDB default charset = utf8;

alter table user_interest_group comment '记录用户与兴趣组关联关系';

# 图书收藏夹
create table if not exists book_store (
  id varchar(30) primary key comment '主键',
  user_id varchar(30) not null comment '用户ID',
  book_id varchar(30) not null comment '收藏图书ID',
  gmt_create datetime not null comment '创建时间',
  gmt_modified datetime comment '修改时间',

  foreign key(user_id)
    references user(id),
  foreign key(book_id)
    references book(id)  
) engine = InnoDB default charset = utf8;

alter table book_store comment '记录用户收藏图书关系';

# 图书借阅关系
create table if not exists book_order (
  id varchar(30) primary key comment '主键',
  user_id varchar(30) not null comment '用户ID',
  book_item_id varchar(30) not null comment '借阅图书ID',
  gmt_create datetime not null comment '创建时间',
  gmt_modified datetime comment '修改时间',

  foreign key(user_id)
    references user(id),
  foreign key(book_item_id)
    references book_item(id)  
) engine = InnoDB default charset = utf8;

alter table book_order comment '图书借阅关系';

# seeding data
