/*
 Navicat Premium Data Transfer

 Source Server         : 129.28.167.200
 Source Server Type    : MySQL
 Source Server Version : 80016
 Source Host           : 129.28.167.200:3306
 Source Schema         : crud

 Target Server Type    : MySQL
 Target Server Version : 80016
 File Encoding         : 65001

 Date: 19/11/2019 16:36:40
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for SYS_DIC
-- ----------------------------
DROP TABLE IF EXISTS `SYS_DIC`;
CREATE TABLE `SYS_DIC` (
  `DICTIONARY_NO` varchar(40) COLLATE utf8mb4_bin NOT NULL COMMENT '字典编号',
  `DICTIONARY_NM` varchar(128) COLLATE utf8mb4_bin NOT NULL COMMENT '字典名字',
  `DICTIONARY_CATEGORY_NO` varchar(40) COLLATE utf8mb4_bin NOT NULL COMMENT '字典类别编号',
  `DICTIONARY_CATEGORY_NM` varchar(128) COLLATE utf8mb4_bin NOT NULL COMMENT '字典类别名字',
  `STATUS_FLAG` varchar(1) COLLATE utf8mb4_bin NOT NULL COMMENT '状态标志',
  `LEVEL_NO` varchar(40) COLLATE utf8mb4_bin NOT NULL COMMENT '级别编号',
  `SEQUENCE_NUM` varchar(22) COLLATE utf8mb4_bin NOT NULL COMMENT '顺序数量',
  `SYSTEM_NO` varchar(40) COLLATE utf8mb4_bin NOT NULL COMMENT '系统编号',
  `CREATE_USER_NO` varchar(40) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '创建用户编号',
  `CREATE_ORG_NO` varchar(40) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '创建机构编号',
  `UPDATE_USER_NO` varchar(40) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '更新用户编号',
  `UPDATE_ORG_NO` varchar(40) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '更新机构编号',
  `UPDATE_TIMESTMP` timestamp(6) NULL DEFAULT NULL COMMENT '更新时间',
  `MAINTENANCE_DATE` varchar(8) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '维护日期',
  `DELETE_FLAG` varchar(1) COLLATE utf8mb4_bin NOT NULL COMMENT '删除标志',
  PRIMARY KEY (`DICTIONARY_NO`,`DICTIONARY_CATEGORY_NO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='数据字典实体';

-- ----------------------------
-- Records of SYS_DIC
-- ----------------------------
BEGIN;
INSERT INTO `SYS_DIC` VALUES ('1', '女', 'SEX', '性别', '1', '1', '1', 'TEST', NULL, NULL, NULL, NULL, NULL, NULL, '2');
INSERT INTO `SYS_DIC` VALUES ('1', '是', 'YES_OR_NO', '是否', '1', '1', '0', 'TEST', NULL, NULL, NULL, NULL, NULL, NULL, '2');
INSERT INTO `SYS_DIC` VALUES ('10', '身份证', 'CERTFCT_TYPE', '证件类型', '1', '1', '0', 'TEST', NULL, NULL, NULL, NULL, NULL, NULL, '2');
INSERT INTO `SYS_DIC` VALUES ('11', '护照', 'CERTFCT_TYPE', '证件类型', '1', '1', '1', 'TEST', NULL, NULL, NULL, NULL, NULL, NULL, '2');
INSERT INTO `SYS_DIC` VALUES ('12', '警官证', 'CERTFCT_TYPE', '证件类型', '1', '1', '2', 'TEST', NULL, NULL, NULL, NULL, NULL, NULL, '2');
INSERT INTO `SYS_DIC` VALUES ('13', '学生证', 'CERTFCT_TYPE', '证件类型', '1', '1', '3', 'TEST', NULL, NULL, NULL, NULL, NULL, NULL, '2');
INSERT INTO `SYS_DIC` VALUES ('14', '统一社会信用代码证', 'CERTFCT_TYPE', '证件类型', '1', '1', '4', 'TEST', NULL, NULL, NULL, NULL, NULL, NULL, '2');
INSERT INTO `SYS_DIC` VALUES ('15', '组织机构代码', 'CERTFCT_TYPE', '证件类型', '1', '1', '5', 'TEST', NULL, NULL, NULL, NULL, NULL, NULL, '2');
INSERT INTO `SYS_DIC` VALUES ('16', '港澳居民居住证', 'CERTFCT_TYPE', '证件类型', '1', '1', '6', 'TEST', NULL, NULL, NULL, NULL, NULL, NULL, '2');
INSERT INTO `SYS_DIC` VALUES ('17', '军官证', 'CERTFCT_TYPE', '证件类型', '1', '1', '7', 'TEST', NULL, NULL, NULL, NULL, NULL, NULL, '2');
INSERT INTO `SYS_DIC` VALUES ('2', '男', 'SEX', '性别', '1', '1', '0', 'TEST', NULL, NULL, NULL, NULL, NULL, NULL, '2');
INSERT INTO `SYS_DIC` VALUES ('2', '否', 'YES_OR_NO', '是否', '1', '1', '1', 'TEST', NULL, NULL, NULL, NULL, NULL, NULL, '2');
COMMIT;

-- ----------------------------
-- Table structure for SYS_TREE_DIC
-- ----------------------------
DROP TABLE IF EXISTS `SYS_TREE_DIC`;
CREATE TABLE `SYS_TREE_DIC` (
  `DICTIONARY_NO` varchar(40) COLLATE utf8mb4_bin NOT NULL COMMENT '字典编号||选项编号',
  `DICTIONARY_NM` varchar(255) COLLATE utf8mb4_bin NOT NULL COMMENT '字典名称||选项名称',
  `HIGHER_LEVEL_DICTIONARY_NO` varchar(40) COLLATE utf8mb4_bin NOT NULL COMMENT '上级字典编号||上级选项编号',
  `NODE_ROUTE_CONTENT` varchar(2000) COLLATE utf8mb4_bin NOT NULL COMMENT '节点路径内容||节点路径内容',
  `DICTIONARY_CATEGORY_NO` varchar(40) COLLATE utf8mb4_bin NOT NULL COMMENT '字典类别编号||选项类别编号',
  `DICTIONARY_CATEGORY_NM` varchar(128) COLLATE utf8mb4_bin NOT NULL COMMENT '字典类别名称||选项类别名称',
  `STATUS_FLAG` varchar(1) COLLATE utf8mb4_bin NOT NULL COMMENT '状态标志||状态标志',
  `LEVEL_NO` varchar(40) COLLATE utf8mb4_bin NOT NULL COMMENT '级别编号||级别编号',
  `SEQUENCE_NUM` int(22) NOT NULL COMMENT '顺序数量||顺序号',
  `SYSTEM_NO` varchar(40) COLLATE utf8mb4_bin NOT NULL COMMENT '系统编号||系统编号',
  `CREATE_USER_NO` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '创建用户编号',
  `CREATE_ORG_NO` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '创建机构编号',
  `UPDATE_USER_NO` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '更新用户编号',
  `UPDATE_ORG_NO` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '更新机构编号',
  `UPDATE_TIMESTMP` timestamp(6) NULL DEFAULT NULL COMMENT '更新时间',
  `MAINTENANCE_DATE` varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '维护日期',
  `DELETE_FLAG` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '删除标志',
  `IS_LEAF_NODE` varchar(1) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '是否叶子节点',
  PRIMARY KEY (`DICTIONARY_NO`,`DICTIONARY_CATEGORY_NO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='树状数据字典';

-- ----------------------------
-- Records of SYS_TREE_DIC
-- ----------------------------
BEGIN;
INSERT INTO `SYS_TREE_DIC` VALUES ('500000', '重庆市', 'all', 'all,500000', 'STD_GB_AREA', '行政区划', '1', '1', 1, 'TEST', NULL, NULL, NULL, NULL, NULL, NULL, '2', '2');
INSERT INTO `SYS_TREE_DIC` VALUES ('500100', '市辖区', '500000', 'all,500000,500100', 'STD_GB_AREA', '行政区划', '1', '2', 1, 'TEST', NULL, NULL, NULL, NULL, NULL, NULL, '2', '2');
INSERT INTO `SYS_TREE_DIC` VALUES ('500122', '渝北区', '500100', 'all,500000,500100,500122', 'STD_GB_AREA', '行政区划', '1', '3', 1, 'TEST', NULL, NULL, NULL, NULL, NULL, NULL, '2', '1');
INSERT INTO `SYS_TREE_DIC` VALUES ('500200', '县', '500000', 'all,500000,500200', 'STD_GB_AREA', '行政区划', '1', '2', 1, 'TEST', NULL, NULL, NULL, NULL, NULL, NULL, '2', '1');
INSERT INTO `SYS_TREE_DIC` VALUES ('510000', '四川省', 'all', 'all,510000', 'STD_GB_AREA', '行政区划', '1', '1', 1, 'TEST', NULL, NULL, NULL, NULL, NULL, NULL, '2', '2');
INSERT INTO `SYS_TREE_DIC` VALUES ('511000', '内江市', '510000', 'all,510000,511000', 'STD_GB_AREA', '行政区划', '1', '2', 1, 'TEST', NULL, NULL, NULL, NULL, NULL, NULL, '2', '2');
INSERT INTO `SYS_TREE_DIC` VALUES ('511024', '威远县', '511000', 'all,510000,511000,511024', 'STD_GB_AREA', '行政区划', '1', '3', 1, 'TEST', NULL, NULL, NULL, NULL, NULL, NULL, '2', '1');
COMMIT;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `USER_ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `USERNAME` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `PASSWORD` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `DEPT_ID` bigint(20) DEFAULT NULL COMMENT '部门ID',
  `EMAIL` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '邮箱',
  `MOBILE` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '联系电话',
  `STATUS` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '状态 0锁定 1有效',
  `CREATE_TIME` datetime NOT NULL COMMENT '创建时间',
  `MODIFY_TIME` datetime DEFAULT NULL COMMENT '修改时间',
  `LAST_LOGIN_TIME` datetime DEFAULT NULL COMMENT '最近访问时间',
  `SSEX` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '性别 0男 1女 2保密',
  `IS_TAB` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '是否开启tab，0关闭 1开启',
  `THEME` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '主题',
  `AVATAR` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '头像',
  `DESCRIPTION` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`USER_ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='用户表';

-- ----------------------------
-- Table structure for test_user
-- ----------------------------
DROP TABLE IF EXISTS `test_user`;
CREATE TABLE `test_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '姓名//姓名',
  `password` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '密码//密码',
  `sex` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '性别//性别',
  `IDnumber` int(40) NOT NULL COMMENT 'ID识别号//ID识别号',
  `description` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '描述//描述',
  `birthDate` varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '生日//生日',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='测试用户表';

-- ----------------------------
-- Records of test_user
-- ----------------------------
BEGIN;
INSERT INTO `test_user` VALUES (1, 'SpringBoot', '123456', '1', 772763, '我叫SpringBooot', '19960122');
INSERT INTO `test_user` VALUES (2, '李彩', '654321', '2', 445555, '我叫李彩', '16671209');
INSERT INTO `test_user` VALUES (6, '小凡', '34567', '2', 456666, '三生三世十里桃花', '19980906');
INSERT INTO `test_user` VALUES (9, '姚军', 'yaojun123456', '1', 333330, '姚军yaojun', '20000923');
INSERT INTO `test_user` VALUES (10, 'c饿死', '788888', '2', 567777, '臭屁述吃不吃烧烤', '19950913');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
