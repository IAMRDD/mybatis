package com.dd.mybatis.vo;

import lombok.Data;

/**
 * 用户表VO
 */

@Data
public class User {
    /**
     * CREATE TABLE `user_info` (
     *   `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '用户编号',
     *   `username` varchar(20) NOT NULL COMMENT '用户名',
     *   `password` char(32) NOT NULL COMMENT '密码',
     *   `email` varchar(50) NOT NULL COMMENT '邮箱',
     *   `age` tinyint(3) unsigned NOT NULL DEFAULT '18' COMMENT '年龄',
     *   `sex` enum('man','woman','baomi') NOT NULL DEFAULT 'baomi' COMMENT '性别',
     *   `tel` char(11) NOT NULL COMMENT '电话',
     *   `addr` varchar(50) NOT NULL DEFAULT 'beijing' COMMENT '地址',
     *   `card` char(18) NOT NULL COMMENT '身份证号',
     *   `married` tinyint(1) NOT NULL DEFAULT '0' COMMENT '0代表未结婚，1代表已结婚',
     *   `salary` float(8,2) NOT NULL DEFAULT '0.00' COMMENT '薪水',
     *   PRIMARY KEY (`id`),
     *   UNIQUE KEY `username` (`username`),
     *   UNIQUE KEY `email` (`email`),
     *   UNIQUE KEY `tel` (`tel`),
     *   UNIQUE KEY `card` (`card`)
     * ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
     */
    private Integer id;
    private String username;
    private String password;
    private String email;
    private Byte age;
    private String sex;
    private String tel;
    private String addr;
    private String card;
    private Byte married;
    private Float salary;
}
