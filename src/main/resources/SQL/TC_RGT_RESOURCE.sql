/*
Navicat MySQL Data Transfer

Source Server         : 120.55.81.129
Source Server Version : 80019
Source Host           : 120.55.81.129:3306
Source Database       : crud

Target Server Type    : MYSQL
Target Server Version : 80019
File Encoding         : 65001

Date: 2020-02-03 17:15:15
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for TC_RGT_RESOURCE
-- ----------------------------
DROP TABLE IF EXISTS `TC_RGT_RESOURCE`;
CREATE TABLE `TC_RGT_RESOURCE` (
  `RESOURCE_ID` varchar(255) NOT NULL,
  `RESOURCE_NM` varchar(255) DEFAULT NULL,
  `RESOURCE_NO` varchar(255) DEFAULT NULL,
  `RESOURCE_TP` varchar(255) DEFAULT NULL,
  `RESOURCE_EFFECT_FLG` varchar(255) DEFAULT NULL,
  `PARENT_NO` varchar(255) DEFAULT NULL,
  `RESOURCE_LVL` varchar(255) DEFAULT NULL,
  `RESOURCE_ORD` varchar(255) DEFAULT NULL,
  `PARENT_NM` varchar(255) DEFAULT NULL,
  `HIDE_IN_MENU` varchar(255) DEFAULT NULL,
  `HIDE_CHILDREN_IN_MENU` varchar(255) DEFAULT NULL,
  `STATUS` varchar(255) DEFAULT NULL,
  `DEL_FLG` varchar(255) DEFAULT NULL,
  `SYS_ID` varchar(255) DEFAULT NULL,
  `RESOURCE_PATH` varchar(255) DEFAULT NULL,
  `RESOURCE_ICON` varchar(255) DEFAULT NULL,
  `LOCATION` varchar(255) DEFAULT NULL,
  `IS_LEAF` varchar(255) DEFAULT NULL,
  `CREATE_USER_NO` varchar(255) DEFAULT NULL,
  `CREATE_ORG_NO` varchar(255) DEFAULT NULL,
  `UPDATE_USER_NO` varchar(255) DEFAULT NULL,
  `UPDATE_ORG_NO` varchar(255) DEFAULT NULL,
  `UPDATE_TIMESTMP` date DEFAULT NULL,
  `MAINTENANCE_DATE` varchar(8) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of TC_RGT_RESOURCE
-- ----------------------------
INSERT INTO `TC_RGT_RESOURCE` VALUES ('1', '首页', 'RES000001', '0', '1', '000000', '1', '0', null, null, null, null, null, null, '/dashboard', null, null, '2', null, null, null, null, null, null);
INSERT INTO `TC_RGT_RESOURCE` VALUES ('2', '分析页', 'RES0000010', '0', '1', 'RES000001', '2', '0', null, null, null, null, null, null, '/dashboard/analysis', null, null, null, null, null, null, null, null, null);
INSERT INTO `TC_RGT_RESOURCE` VALUES ('3', '系统管理', 'RES000004', '0', '1', '000000', '1', '4', null, null, null, null, null, null, '/system', null, null, null, null, null, null, null, null, null);
INSERT INTO `TC_RGT_RESOURCE` VALUES ('4', '资源管理', 'RES0000040', '0', '1', 'RES000004', '2', '0', null, null, null, null, null, null, '/system/resource', null, null, null, null, null, null, null, null, null);
INSERT INTO `TC_RGT_RESOURCE` VALUES ('5', '字典管理', 'RES0000041', '0', '1', 'RES000004', '2', '1', null, null, null, null, null, null, '/system/sysdics', null, null, null, null, null, null, null, null, null);
INSERT INTO `TC_RGT_RESOURCE` VALUES ('864f18e630ba4588897067b418c3677f', '监控页', 'RES0000011', '0', '1', 'RES000001', '2', '1', null, null, null, '1', '2', 'TEST', '/dashboard/monitor', null, null, '1', null, null, null, null, null, null);
