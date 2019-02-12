/*
 Navicat Premium Data Transfer

 Source Server         : 腾讯云
 Source Server Type    : MySQL
 Source Server Version : 50642
 Source Host           : 212.64.51.218:3306
 Source Schema         : scarf

 Target Server Type    : MySQL
 Target Server Version : 50642
 File Encoding         : 65001

 Date: 26/01/2019 18:47:14
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_test
-- ----------------------------
DROP TABLE IF EXISTS `tb_test`;
CREATE TABLE `tb_test`  (
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sex` int(2) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '测试DB';

-- ----------------------------
-- Records of tb_test
-- ----------------------------
BEGIN;
INSERT INTO `tb_test` VALUES (1, '熊大', 1), (2, '熊二', 1), (3, '张三', 1), (4, '赵四', 2), (5, '王五', 2);
COMMIT;

-- ----------------------------
-- Table structure for ylink_emp
-- ----------------------------
DROP TABLE IF EXISTS `ylink_emp`;
CREATE TABLE `ylink_emp`  (
  `emp_id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `emp_no` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '工号',
  `emp_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '员工姓名',
  `emp_project` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '项目',
  `emp_sex` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '1' COMMENT '性别，1男，2女',
  `emp_level` int(2) NULL DEFAULT NULL COMMENT '等级，1低，2中，3高，4其他',
  PRIMARY KEY (`emp_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '员工表';

-- ----------------------------
-- Records of ylink_emp
-- ----------------------------
BEGIN;
INSERT INTO `ylink_emp` VALUES (1, '00223337', '全智强', '1', '1', NULL), (2, '00223339', '唐瑞龙', '1', '1', NULL), (3, '00223363', '黎小华', '1', '2', NULL), (4, '00223364', '杨峻', '1', '1', NULL), (5, '00223398', '温晓慧', '1', '2', NULL), (6, '00223434', '徐剑', '1', '1', NULL), (7, '00223515', '李伟龙', '1', '1', NULL), (8, '00223551', '张永兵', '1', '1', NULL), (9, '00223559', '田川', '1', '1', NULL), (10, '00227662', '郑占昂', '1', '1', NULL), (11, '00227916', '邢华进', '1', '1', NULL), (12, '00227944', '曾恒毅', '1', '1', NULL), (13, '00227966', '熊曹军', '1', '1', NULL), (14, '00228007', '许文莉', '1', '2', NULL), (15, '00228299', '张培根', '1', '1', NULL);
COMMIT;

-- ----------------------------
-- Table structure for ylink_leave
-- ----------------------------
DROP TABLE IF EXISTS `ylink_leave`;
CREATE TABLE `ylink_leave`  (
  `leave_id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `leave_type` int(2) NULL DEFAULT NULL COMMENT '请假类型，1调休，2事假，3病假，4年假',
  `emp_id` int(11) NULL DEFAULT NULL,
  `sdatetime` timestamp(0) NULL DEFAULT NULL COMMENT '开始时间',
  `edatetime` timestamp(0) NULL DEFAULT NULL COMMENT '结束时间',
  `days` float(10, 0) NULL DEFAULT NULL COMMENT '请假天数',
  PRIMARY KEY (`leave_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '请假信息';

-- ----------------------------
-- Table structure for ylink_over
-- ----------------------------
DROP TABLE IF EXISTS `ylink_over`;
CREATE TABLE `ylink_over`  (
  `over_id` int(11) NOT NULL,
  `emp_id` int(11) NULL DEFAULT NULL COMMENT '员工id',
  `sdatetime` datetime(0) NULL DEFAULT NULL COMMENT '开始时间',
  `edatetime` datetime(0) NULL DEFAULT NULL COMMENT '结束时间',
  `cdatetime` datetime(0) NULL DEFAULT NULL COMMENT '起算时间',
  `hours` int(2) NULL DEFAULT NULL COMMENT '加班小时数',
  `holidayflag` int(1) NULL DEFAULT NULL COMMENT '是否节假日，0否，1是',
  PRIMARY KEY (`over_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '加班表';

-- ----------------------------
-- Table structure for ylink_project
-- ----------------------------
DROP TABLE IF EXISTS `ylink_project`;
CREATE TABLE `ylink_project`  (
  `p_id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '项目id',
  `p_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '项目名称',
  `useable` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '1' COMMENT '可用标志，0停用，1启用',
  PRIMARY KEY (`p_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '项目表';

-- ----------------------------
-- Records of ylink_project
-- ----------------------------
BEGIN;
INSERT INTO `ylink_project` VALUES (1, '工行信息部', '1');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
