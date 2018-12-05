/*
 Navicat Premium Data Transfer

 Source Server         : 192
 Source Server Type    : MySQL
 Source Server Version : 50719
 Source Host           : 10.10.10.192
 Source Database       : power

 Target Server Type    : MySQL
 Target Server Version : 50719
 File Encoding         : utf-8

 Date: 12/05/2018 20:08:24 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `area`
-- ----------------------------
DROP TABLE IF EXISTS `area`;
CREATE TABLE `area` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL COMMENT '区域',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `area`
-- ----------------------------
BEGIN;
INSERT INTO `area` VALUES ('1', '南阳', '2018-10-25 11:29:58', '2018-10-30 02:31:09'), ('2', '郑州', '2018-10-25 11:30:05', '2018-10-30 02:31:22'), ('3', '洛阳', '2018-10-30 15:32:04', '2018-10-30 02:32:16');
COMMIT;

-- ----------------------------
--  Table structure for `charge`
-- ----------------------------
DROP TABLE IF EXISTS `charge`;
CREATE TABLE `charge` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL COMMENT '联系人',
  `phone` varchar(255) DEFAULT NULL COMMENT '联系方式',
  `address` varchar(255) DEFAULT NULL COMMENT '地址',
  `charge` decimal(65,10) DEFAULT NULL COMMENT '电费',
  `pay_time` int(10) DEFAULT '1' COMMENT '缴费时间',
  `bill_time` timestamp NULL DEFAULT NULL COMMENT '缴费时间',
  `prepay` decimal(65,10) DEFAULT NULL COMMENT '预缴电费',
  `property_ddress` varchar(255) DEFAULT NULL COMMENT '物业地址',
  `status` int(10) DEFAULT '0' COMMENT '缴费状态',
  `time_type` int(10) DEFAULT '0' COMMENT '时间类型',
  `type` int(10) DEFAULT NULL COMMENT '区域类型',
  `finsish_time` timestamp NULL DEFAULT NULL COMMENT '完成时间',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `charge`
-- ----------------------------
BEGIN;
INSERT INTO `charge` VALUES ('20', 'wang是', '18510869004', '北京', '123.0000000000', '28', '2018-10-24 03:11:35', '213.0000000000', 'sfsd', '1', '0', '1', null, '2018-10-26 16:11:35', '2018-10-26 16:46:46'), ('21', '看就看', '18037310248', 'dfsdffd', '123.0000000000', '29', '2018-10-22 00:00:00', '213.0000000000', 'fsfds', '0', '1', '2', null, '2018-10-26 16:22:26', '2018-10-26 16:22:26'), ('22', '看就看', '18037310248', 'dfsdffd', '123.0000000000', '29', '2018-10-28 00:00:00', '213.0000000000', 'fsfds', '0', '0', '1', null, '2018-10-26 16:23:12', '2018-10-26 16:23:12'), ('25', 'ljl', '12312', 'asdsadas', '123.0000000000', '23', '2019-01-22 21:17:08', '23.0000000000', 'sad', '1', '1', '3', null, '2018-10-29 12:09:01', '2018-10-31 11:17:08'), ('26', '离网', '18510869004', '你看哈看见好看', '232.0000000000', '27', '2018-11-26 00:00:00', '353.0000000000', '啊发发', '1', '0', '2', null, '2018-10-29 16:47:59', '2018-10-29 16:47:59'), ('27', 'sad', '12321', 'dasdas', '123.0000000000', '12', '2019-01-12 02:52:43', '23.0000000000', 'asdasd', '0', '1', '2', null, '2018-10-29 16:52:43', '2018-10-29 16:52:43'), ('28', 'dadsdsd', '13123', 'sdasfa', '123.0000000000', '25', '2018-11-25 02:54:56', '53.0000000000', 'dasdas', '0', '0', '1', null, '2018-10-29 16:54:55', '2018-10-29 16:54:55'), ('29', 'dadsdsd', '13123', '破多的', '123.0000000000', '26', '2018-11-26 03:16:15', '53.0000000000', 'dasdas', '1', '0', '2', null, '2018-10-29 16:55:12', '2018-10-29 17:16:14'), ('30', '欧尼', '1312', '贾凯里尼看来', '432.0000000000', '28', '2019-01-28 02:37:26', '466.0000000000', '多福多寿', '2', '1', '3', '2018-10-29 04:33:17', '2018-10-29 17:17:14', '2018-10-31 16:37:25');
COMMIT;

-- ----------------------------
--  Table structure for `message`
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `charge_id` int(10) NOT NULL COMMENT '联系人关联',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `message`
-- ----------------------------
BEGIN;
INSERT INTO `message` VALUES ('1', '离网', '26', '2018-10-30 17:03:02', '2018-10-30 17:03:02');
COMMIT;

-- ----------------------------
--  Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` tinyint(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `creat_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `user`
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES ('4', '18510869004', '5f4dcc3b5aa765d61d8327deb882cf99', '2018-10-17 12:10:59', '2018-10-17 12:10:59');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
