/*
Navicat MySQL Data Transfer

Source Server         : 本机mysql
Source Server Version : 50540
Source Host           : localhost:3306
Source Database       : it_seq

Target Server Type    : MYSQL
Target Server Version : 50540
File Encoding         : 65001

Date: 2020-12-01 14:38:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `desc` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES ('1001', 'A1001', 'aaaa');
INSERT INTO `customer` VALUES ('1002', 'A1002', 'bbbb');
INSERT INTO `customer` VALUES ('1003', 'A1003', 'cccccc');
INSERT INTO `customer` VALUES ('1004', 'A1004', 'ddddd');
INSERT INTO `customer` VALUES ('1005', 'A1005', 'dddd');
INSERT INTO `customer` VALUES ('1006', 'A1006', 'dsfsfd');
INSERT INTO `customer` VALUES ('1007', 'A1007', 'sdasd');
INSERT INTO `customer` VALUES ('1008', 'A1008', 'sadasd');
INSERT INTO `customer` VALUES ('1009', 'A1009', '545654');
INSERT INTO `customer` VALUES ('1010', 'A1010', 'sdsas');
INSERT INTO `customer` VALUES ('1011', 'A1011', 'asd');

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `user_name` varchar(20) NOT NULL COMMENT '用户名',
  `password` varchar(20) NOT NULL COMMENT '密码',
  `name` varchar(30) DEFAULT NULL COMMENT '姓名',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1331050484575752195 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES ('2', 'lisi', '123456', '李四', '20', 'test2@itcast.cn');
INSERT INTO `tb_user` VALUES ('3', 'wangwu', '123456', '王五', '28', 'test3@itcast.cn');
INSERT INTO `tb_user` VALUES ('4', 'zhaoliu', '123456', '赵六', '21', 'test4@itcast.cn');
INSERT INTO `tb_user` VALUES ('5', 'sunqi', '123456', '孙七', '24', 'test5@itcast.cn');
INSERT INTO `tb_user` VALUES ('6', '王二狗', '123456', null, '20', '123366');
INSERT INTO `tb_user` VALUES ('1331050484575752194', '王二狗', '123456', null, '20', '123366');
