/*
 Navicat Premium Data Transfer

 Source Server         : 127.0.0.1
 Source Server Type    : MySQL
 Source Server Version : 50719
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 50719
 File Encoding         : 65001

 Date: 14/03/2020 22:52:54
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_person
-- ----------------------------
DROP TABLE IF EXISTS `t_person`;
CREATE TABLE `t_person`  (
  `Fid` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `Fname` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '名字',
  `Fpass_word` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `Fsex` tinyint(3) NOT NULL COMMENT '性别 0 女 1 男',
  PRIMARY KEY (`Fid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_person
-- ----------------------------
INSERT INTO `t_person` VALUES (1, 'lingheng', '123456', 1);

SET FOREIGN_KEY_CHECKS = 1;
