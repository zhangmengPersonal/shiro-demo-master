/*
Navicat MySQL Data Transfer

Source Server         : local_conn
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : sunguser

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-09-13 18:03:04
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for hibernate_sequence
-- ----------------------------
DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of hibernate_sequence
-- ----------------------------
INSERT INTO `hibernate_sequence` VALUES ('1');
INSERT INTO `hibernate_sequence` VALUES ('1');
INSERT INTO `hibernate_sequence` VALUES ('1');

-- ----------------------------
-- Table structure for sys_permission
-- ----------------------------
DROP TABLE IF EXISTS `sys_permission`;
CREATE TABLE `sys_permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `name` varchar(20) COLLATE utf8_unicode_ci NOT NULL COMMENT '权限名称',
  `description` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '权限描述',
  `url` varchar(255) COLLATE utf8_unicode_ci NOT NULL COMMENT '权限url',
  `pid` int(11) NOT NULL COMMENT '权限pid',
  `create_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of sys_permission
-- ----------------------------
INSERT INTO `sys_permission` VALUES ('1', '权限1', '这是第一个测试权限', 'http://baidu.com', '0', '2018-06-26 09:25:55', '2018-06-26 09:25:55');
INSERT INTO `sys_permission` VALUES ('2', '权限2', '这是第二个测试权限', 'http://v.qq.com', '0', '2018-06-24 17:22:18', '2018-06-24 17:22:21');
INSERT INTO `sys_permission` VALUES ('3', '权限3', '这是第三个测试权限', 'http://iqiyi.com', '0', '2018-06-24 20:42:10', '2018-06-24 20:42:12');
INSERT INTO `sys_permission` VALUES ('4', 'ROLE_USER', '用户权限', 'http://im.qq.com', '0', '2018-06-26 09:38:39', '2018-06-26 09:38:42');

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) COLLATE utf8_unicode_ci NOT NULL COMMENT '角色名称',
  `create_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('1', '角色1', '2018-06-22 16:38:17', '2018-06-22 16:38:19');
INSERT INTO `sys_role` VALUES ('2', '角色2', '2018-06-24 14:42:28', '2018-06-24 14:42:30');

-- ----------------------------
-- Table structure for sys_role_permission
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_permission`;
CREATE TABLE `sys_role_permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sys_role` int(11) NOT NULL COMMENT '角色',
  `sys_permission` int(11) NOT NULL COMMENT '权限',
  `create_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`),
  KEY `FK8puvrlqf22jwufjw1fmpq46fr` (`sys_permission`),
  KEY `FKhk79rsc35s6eihvugo60jpslo` (`sys_role`),
  CONSTRAINT `FK8puvrlqf22jwufjw1fmpq46fr` FOREIGN KEY (`sys_permission`) REFERENCES `sys_permission` (`id`),
  CONSTRAINT `FKhk79rsc35s6eihvugo60jpslo` FOREIGN KEY (`sys_role`) REFERENCES `sys_role` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of sys_role_permission
-- ----------------------------
INSERT INTO `sys_role_permission` VALUES ('1', '1', '1', '2018-06-24 17:21:06', '2018-06-24 17:21:09');
INSERT INTO `sys_role_permission` VALUES ('2', '1', '2', '2018-06-24 17:22:37', '2018-06-24 17:22:40');
INSERT INTO `sys_role_permission` VALUES ('3', '2', '3', '2018-06-26 19:46:24', '2018-06-26 19:46:24');

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `user_name` varchar(20) COLLATE utf8_unicode_ci NOT NULL COMMENT '用户名',
  `password` varchar(200) COLLATE utf8_unicode_ci NOT NULL COMMENT '密码',
  `nick_name` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '昵称',
  `real_name` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '真实名称',
  `email` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '电子邮箱',
  `call_number` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '电话号码',
  `address` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '地址',
  `salt` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `create_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', 'hoosung', '$2a$10$KZohE7/gu/BwC9kL/6n4Eegh5A2ovIu2guUVQzakRLeOol/IUd8jy', 'hoofungson', '*松', 'hoofungson@163.com', '187****0781', '四川.平昌', null, '2018-06-25 17:02:06', '2018-06-25 17:02:06');
INSERT INTO `sys_user` VALUES ('2', 'larry', '2675e93482b5be14c07b24c014f1ae8d', null, null, null, null, null, 'qwetg', '2018-09-13 17:55:38', '2018-09-13 17:55:38');

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `sys_user` int(11) NOT NULL COMMENT '用户',
  `sys_role` int(11) NOT NULL COMMENT '角色',
  `create_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`),
  KEY `FKcscra6fiflc99n0c4949j4xcw` (`sys_role`),
  KEY `FKal5cyo0iq2amm11r0gotugnny` (`sys_user`),
  CONSTRAINT `FKal5cyo0iq2amm11r0gotugnny` FOREIGN KEY (`sys_user`) REFERENCES `sys_user` (`id`),
  CONSTRAINT `FKcscra6fiflc99n0c4949j4xcw` FOREIGN KEY (`sys_role`) REFERENCES `sys_role` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------
INSERT INTO `sys_user_role` VALUES ('1', '1', '1', '2018-06-22 16:37:35', '2018-06-22 16:37:38');
INSERT INTO `sys_user_role` VALUES ('2', '1', '2', '2018-06-26 09:24:05', '2018-06-26 09:24:05');
