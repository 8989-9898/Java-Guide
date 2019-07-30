create table tbl_dept (
  deptid varchar(20) primary key
  comment '部门编号',
  name   varchar(20) comment '部门名称'
)
  comment '测试代理模式的部门表';

create table tbl_user (
  userid varchar(20) primary key
  comment '员工编号',
  name   varchar(20) comment '员工姓名',
  deptid varchar(20) comment '部门编号，外键',
  sex    varchar(20) comment '性别',
  constraint tbl_user_fk foreign key (deptid) references tbl_dept (deptid)
)
  comment '测试代理模式的员工表';


/* 部门编号安照层级进行编码，如 01 是最高级，那 0101,0102 就是他的下级，以此类推 */
insert into tbl_dept
values ('01', '总公司'),
  ('0101', '一分公司'),
  ('0102', '二分公司'),
  ('010101', '开发部'),
  ('010102', '测试部'),
  ('010201', '开发部'),
  ('010202', '客服部');

insert into tbl_user values
  ('user0001','张三','010101','男'),
  ('user0002','李四','010101','男'),
  ('user0003','王五','010102','男'),
  ('user0004','赵六','010101','男'),
  ('user0005','田七','010102','男'),
  ('user0006','叶枫','010101','男'),
  ('user0007','乔峰','010102','男'),
  ('user0008','虚竹','010101','男');

select * from tbl_user;
select * from tbl_dept;