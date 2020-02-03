/*
Navicat MySQL Data Transfer

Source Server         : 120.55.81.129
Source Server Version : 80019
Source Host           : 120.55.81.129:3306
Source Database       : crud

Target Server Type    : MYSQL
Target Server Version : 80019
File Encoding         : 65001

Date: 2020-02-03 22:22:00
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
INSERT INTO `TC_RGT_RESOURCE` VALUES ('2', '分析页', 'RES0000010', '0', '1', 'RES000001', '2', '0', null, null, null, null, null, null, '/dashboard/analysis', null, null, '1', null, null, null, null, null, null);
INSERT INTO `TC_RGT_RESOURCE` VALUES ('3', '系统管理', 'RES000004', '0', '1', '000000', '1', '4', null, null, null, null, null, null, '/system', null, null, '2', null, null, null, null, null, null);
INSERT INTO `TC_RGT_RESOURCE` VALUES ('4', '资源管理', 'RES0000040', '0', '1', 'RES000004', '2', '0', null, null, null, null, null, null, '/system/resource', null, null, '1', null, null, null, null, null, null);
INSERT INTO `TC_RGT_RESOURCE` VALUES ('5', '字典管理', 'RES0000041', '0', '1', 'RES000004', '2', '1', null, null, null, null, null, null, '/system/sysdics', null, null, '1', null, null, null, null, null, null);
INSERT INTO `TC_RGT_RESOURCE` VALUES ('864f18e630ba4588897067b418c3677f', '监控页', 'RES0000011', '0', '1', 'RES000001', '2', '1', null, null, null, '1', '2', 'TEST', '/dashboard/monitor', null, null, '1', null, null, null, null, null, null);
INSERT INTO `TC_RGT_RESOURCE` VALUES ('e1d224df725754c7f8564f692de8be99', '工作台', 'RES0000012', '0', '1', 'RES000001', '2', '2', null, null, null, '1', '2', 'TEST', '/dashboard/workplace', null, null, '1', null, null, null, null, null, null);
INSERT INTO `TC_RGT_RESOURCE` VALUES ('40d0061a2eabdac17a8de3c90ed26fe6', '公用组件', 'RES000002', '0', '1', '000000', '1', '1', null, null, null, '1', '2', 'TEST', '/DIYcompoment', null, null, '2', null, null, null, null, null, null);
INSERT INTO `TC_RGT_RESOURCE` VALUES ('1820c50fa5f8b97f5fd43bcdedaeb711', '组件', 'RES0000020', '0', '1', 'RES000002', '2', '0', null, null, null, '1', '2', 'TEST', '/DIYcompoment/commoncomponent', null, null, '1', null, null, null, null, null, null);
INSERT INTO `TC_RGT_RESOURCE` VALUES ('304e9b9ee1ef79acb38dcd2e0d62e3d4', '用户管理', 'RES0000042', '0', '1', 'RES000004', '2', '2', null, null, null, '1', '2', 'TEST', '/system/userinfo', null, null, '1', null, null, null, null, null, null);
INSERT INTO `TC_RGT_RESOURCE` VALUES ('9850ed12336d86f82dddd6be46259d44', '删除', 'RES00000231', '1', '2', 'RES0000042', '3', '0', null, null, null, '1', '2', 'TEST', '/system/userinfo', null, null, '1', null, null, null, null, null, '20200203');
INSERT INTO `TC_RGT_RESOURCE` VALUES ('a61f12ccd1ce764f900e32ddf0f16291', '表单页', 'RES000003', '0', '1', '000000', '1', '2', null, null, null, '1', '2', 'TEST', '/form', null, null, '2', null, null, null, null, null, null);
INSERT INTO `TC_RGT_RESOURCE` VALUES ('31f136128e417f4b0c158e17d1f77942', '基础表单', 'RES0000030', '0', '1', 'RES000003', '2', '0', null, null, null, '1', '2', 'TEST', '/form/basic-form', null, null, '1', null, null, null, null, null, null);
INSERT INTO `TC_RGT_RESOURCE` VALUES ('269fb1669dbb1edbdf16985c3fb5c230', '分步表单', 'RES0000031', '0', '1', 'RES000003', '2', '1', null, null, null, '1', '2', 'TEST', '/form/step-form', null, null, '1', null, null, null, null, null, null);
INSERT INTO `TC_RGT_RESOURCE` VALUES ('495a84474947c5a132017edb850b751d', '高级表单', 'RES0000032', '0', '1', 'RES000003', '2', '2', null, null, null, '1', '2', 'TEST', '/form/advanced-form', null, null, '1', null, null, null, null, null, null);
INSERT INTO `TC_RGT_RESOURCE` VALUES ('f2bf1e7d4e303483fb3b9ab64cb03448', '详情页', 'RES000005', '0', '1', '000000', '1', '4', null, null, null, '1', '2', 'TEST', '/profile', null, null, '2', null, null, null, null, null, null);
INSERT INTO `TC_RGT_RESOURCE` VALUES ('3f81deaca21901e32f765d611abb2754', '基础详情页', 'RES0000050', '0', '1', 'RES000005', '2', '0', null, null, null, '1', '2', 'TEST', '/profile/basic', null, null, '1', null, null, null, null, null, null);
INSERT INTO `TC_RGT_RESOURCE` VALUES ('1fcc580d84271b966c479365b2a17b3b', '高级详情页', 'RES0000051', '0', '1', 'RES000005', '2', '1', null, null, null, '1', '2', 'TEST', '/profile/advanced', null, null, '1', null, null, null, null, null, null);
INSERT INTO `TC_RGT_RESOURCE` VALUES ('86c8d87ad2dec347617b3992f2dc2ac9', '图表', 'RES000006', '0', '1', '000000', '1', '5', null, null, null, '1', '2', 'TEST', '/charts', null, null, '2', null, null, null, null, null, null);
INSERT INTO `TC_RGT_RESOURCE` VALUES ('49c36d05dd026f652d74c0dc7567c47c', '组织结构图', 'RES0000060', '0', '1', 'RES000006', '2', '0', null, null, null, '1', '2', 'TEST', '/charts/orgtree', null, null, '1', null, null, null, null, null, null);
INSERT INTO `TC_RGT_RESOURCE` VALUES ('1d41a091bdd0981ad09d9adee92ec5ac', '阿里G6', 'RES000006**', '0', '1', 'RES000006', '2', '1', null, null, null, '1', '2', 'TEST', '/charts/G6', null, null, '1', null, null, null, null, null, null);
