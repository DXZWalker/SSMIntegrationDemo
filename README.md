# 创建数据库
```
create database myssm character set utf8;
```

# 创建表结构
```
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(32) NOT NULL COMMENT '用户名称',
  `birthday` date DEFAULT NULL COMMENT '生日',
  `sex` char(1) DEFAULT NULL COMMENT '性别',
  `address` varchar(256) DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;
```

# 添加记录
```
INSERT INTO `user` VALUES ('1', 'Switch', '2017-01-09', '1', '北京市');
INSERT INTO `user` VALUES ('2', 'Kity', '2017-01-02', '2', '上海市');
INSERT INTO `user` VALUES ('3', '张三', '2016-12-13', '1', '广州市');
INSERT INTO `user` VALUES ('4', '李四', '2015-06-17', '2', '深圳市');
INSERT INTO `user` VALUES ('5', '王五', '2017-06-06', '1', '北京市');
INSERT INTO `user` VALUES ('6', '张张', '2014-01-02', '2', '北京市');
```

