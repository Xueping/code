/*
SQLyog Community v10.3 
MySQL - 5.0.90-community-nt : Database - community
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`community` /*!40100 DEFAULT CHARACTER SET utf8 */;

/*Table structure for table `td_algorithm` */

DROP TABLE IF EXISTS `td_algorithm`;

CREATE TABLE `td_algorithm` (
  `ID` int(10) NOT NULL auto_increment COMMENT 'PK',
  `Name` varchar(35) NOT NULL COMMENT '算法名称',
  `Desc` varchar(200) default NULL COMMENT '详细描述',
  `CategoryId` int(10) NOT NULL COMMENT '分类ID',
  `Language` varchar(10) default NULL COMMENT '编写所用语言',
  `Forsale` tinyint(1) default '0' COMMENT '是否在前台销售',
  `Available` tinyint(1) default '0' COMMENT '是否在社区内下载',
  `CommunityId` int(10) NOT NULL COMMENT '归属社区的ID',
  `Status` char(2) NOT NULL COMMENT '算法状态',
  `Tag` varchar(250) default NULL COMMENT '标签',
  `BasePrice` decimal(10,2) unsigned zerofill default NULL COMMENT '作者建议价格',
  `RetailPrice` decimal(10,2) unsigned zerofill default NULL COMMENT '零售价格',
  `FileCode` blob NOT NULL COMMENT '上传的代码文件',
  `FileDoc` blob NOT NULL COMMENT '上传的帮助文档',
  `SUID` varchar(6) default NULL COMMENT '前台用的仓库代码',
  `Locked` tinyint(1) default '0' COMMENT '算法已被锁定',
  `Version` varchar(35) default NULL COMMENT '版本号',
  `DownloadedTimes` int(15) unsigned zerofill default NULL COMMENT '下载次数',
  `FrontViewTimes` int(10) unsigned zerofill default NULL COMMENT '前台浏览次数',
  `CreateBy` int(10) NOT NULL,
  `CreateDate` timestamp NOT NULL default CURRENT_TIMESTAMP,
  `UpdateBy` int(10) default NULL,
  `UpdateDate` datetime default NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Table structure for table `td_algorithm_review` */

DROP TABLE IF EXISTS `td_algorithm_review`;

CREATE TABLE `td_algorithm_review` (
  `ID` int(10) NOT NULL auto_increment COMMENT 'PK',
  `AlgorId` int(10) NOT NULL COMMENT '算法ID',
  `UserId` int(10) NOT NULL COMMENT '用户ID',
  `Comments` varchar(250) default NULL COMMENT '点评',
  `Picture` blob COMMENT '上传文件',
  `ReviewDate` datetime default NULL COMMENT '检查时间',
  `Status` char(2) NOT NULL COMMENT '当前评价状态',
  `CreateBy` int(10) NOT NULL,
  `CreateDate` timestamp NOT NULL default CURRENT_TIMESTAMP,
  `UpdateBy` int(10) default NULL,
  `UpdateDate` datetime default NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Table structure for table `td_algorithm_status_history` */

DROP TABLE IF EXISTS `td_algorithm_status_history`;

CREATE TABLE `td_algorithm_status_history` (
  `ID` int(10) NOT NULL auto_increment COMMENT 'PK',
  `AlgorId` int(10) NOT NULL COMMENT '算法ID',
  `OldStatus` char(2) NOT NULL COMMENT '旧的状态',
  `NewStatus` char(2) NOT NULL COMMENT '新的状态',
  `MustNotified` tinyint(1) NOT NULL COMMENT '这个改变是否通知作者',
  `CreateBy` int(10) NOT NULL,
  `CreateDate` timestamp NOT NULL default CURRENT_TIMESTAMP,
  `UpdateBy` int(10) default NULL,
  `UpdateDate` datetime default NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Table structure for table `td_beneficiary` */

DROP TABLE IF EXISTS `td_beneficiary`;

CREATE TABLE `td_beneficiary` (
  `ID` int(10) NOT NULL auto_increment COMMENT 'PK',
  `AlgorId` int(10) NOT NULL COMMENT '算法ID',
  `UserId` int(10) NOT NULL COMMENT '用户ID',
  `SharePercent` int(3) NOT NULL COMMENT '用户所占比例',
  `ListOrder` int(2) NOT NULL COMMENT '用户在显示作者时的排位',
  `CreateBy` int(10) NOT NULL,
  `CreateDate` timestamp NOT NULL default CURRENT_TIMESTAMP,
  `UpdateBy` int(10) default NULL,
  `UpdateDate` datetime default NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Table structure for table `td_category` */

DROP TABLE IF EXISTS `td_category`;

CREATE TABLE `td_category` (
  `ID` int(10) NOT NULL auto_increment COMMENT 'PK',
  `Name` varchar(35) NOT NULL COMMENT '分类名称',
  `Desc` varchar(200) default NULL COMMENT '详细描述',
  `ParentId` int(10) NOT NULL COMMENT '父级ID，如果没有就为-1',
  PRIMARY KEY  (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Table structure for table `td_community` */

DROP TABLE IF EXISTS `td_community`;

CREATE TABLE `td_community` (
  `ID` int(11) NOT NULL auto_increment COMMENT 'PK',
  `Name` varchar(35) NOT NULL COMMENT '名称',
  `School` varchar(35) default NULL COMMENT '所在学校或学院',
  `Desc` varchar(100) default NULL COMMENT '详细描述',
  `Enabled` tinyint(4) NOT NULL COMMENT '社区有效',
  `OwnerId` int(10) NOT NULL COMMENT '所有者ID',
  `CreateBy` int(10) NOT NULL,
  `CreateDate` timestamp NOT NULL default CURRENT_TIMESTAMP,
  `UpdateBy` int(10) default NULL,
  `UpdateDate` datetime default NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Table structure for table `td_invitation` */

DROP TABLE IF EXISTS `td_invitation`;

CREATE TABLE `td_invitation` (
  `ID` int(10) NOT NULL auto_increment COMMENT 'PK',
  `CommunityId` int(10) NOT NULL COMMENT '要加入的社区',
  `Invitor` int(10) NOT NULL COMMENT '邀请人',
  `Invitee` int(10) NOT NULL COMMENT '被邀请人',
  `Result` tinyint(1) NOT NULL default '0' COMMENT '同意或者拒绝',
  `InvitationCode` varchar(50) NOT NULL COMMENT '生成的唯一号GUID',
  `CreateBy` int(10) NOT NULL,
  `CreateDate` timestamp NOT NULL default CURRENT_TIMESTAMP,
  `UpdateBy` int(10) default NULL,
  `UpdateDate` datetime default NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Table structure for table `td_member` */

DROP TABLE IF EXISTS `td_member`;

CREATE TABLE `td_member` (
  `ID` int(10) NOT NULL auto_increment COMMENT 'PK',
  `CommunityId` int(10) NOT NULL COMMENT '社区ID',
  `UserId` int(10) NOT NULL COMMENT '用户ID',
  `Role` varchar(5) NOT NULL COMMENT '成员的身份，管理员或普通成员',
  `Confirmed` tinyint(1) NOT NULL COMMENT '成员是否确定加入',
  `ExpireDate` datetime NOT NULL COMMENT '成员有效日期',
  `CreateBy` int(10) NOT NULL,
  `CreateDate` timestamp NULL default NULL,
  `UpdateBy` int(10) default NULL,
  `UpdateDate` datetime default NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Table structure for table `td_role` */

DROP TABLE IF EXISTS `td_role`;

CREATE TABLE `td_role` (
  `ID` int(10) NOT NULL auto_increment COMMENT 'PK',
  `RoleName` varchar(35) NOT NULL COMMENT '角色名称',
  `Desc` varchar(200) default NULL COMMENT '详细描述',
  `AllowLogin` tinyint(1) NOT NULL default '1' COMMENT '允许登录',
  `AllowDownload` tinyint(1) NOT NULL default '1' COMMENT '允许下载算法',
  `AllowJoin` tinyint(1) NOT NULL default '1' COMMENT '允许加入社区',
  `AllowCreateCommunity` tinyint(1) NOT NULL default '1' COMMENT '允许创建社区',
  `AllowSendMessage` tinyint(1) NOT NULL default '1' COMMENT '允许发送消息给别的用户',
  `CreateBy` int(10) NOT NULL,
  `CreateDate` timestamp NOT NULL default CURRENT_TIMESTAMP,
  `UpdateBy` int(10) default NULL,
  `UpdateDate` datetime default NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Table structure for table `td_user` */

DROP TABLE IF EXISTS `td_user`;

CREATE TABLE `td_user` (
  `ID` int(10) NOT NULL auto_increment COMMENT 'PK',
  `FirstName` varchar(20) NOT NULL COMMENT '名字',
  `LastName` varchar(20) NOT NULL COMMENT '姓氏',
  `Country` varchar(3) NOT NULL COMMENT '所在国家',
  `Title` varchar(10) default NULL COMMENT '抬头',
  `Organization` varchar(35) default NULL COMMENT '所在研究机构',
  `Speciality` varchar(100) default NULL COMMENT '研究领域',
  `LastLogin` datetime NOT NULL COMMENT '最后登录时间',
  `Email` varchar(200) NOT NULL COMMENT '联系邮件',
  `Phone` varchar(12) NOT NULL COMMENT '电话',
  `UserName` varchar(20) NOT NULL COMMENT '用户名，必须在表内唯一',
  `Password` varchar(40) NOT NULL COMMENT '加密后的密码',
  `Enabled` tinyint(1) NOT NULL COMMENT '帐号有效',
  `AccountNonExpired` tinyint(1) NOT NULL COMMENT '帐号不过期',
  `PasswordNonExpired` tinyint(1) NOT NULL COMMENT '密码不过期',
  `AccountNonLocked` tinyint(1) NOT NULL COMMENT '帐号不锁定',
  `CreateBy` int(10) NOT NULL,
  `CreateDate` timestamp NOT NULL default CURRENT_TIMESTAMP,
  `UpdateBy` int(10) default NULL,
  `UpdateDate` datetime default NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Table structure for table `td_user_role` */

DROP TABLE IF EXISTS `td_user_role`;

CREATE TABLE `td_user_role` (
  `ID` int(10) NOT NULL auto_increment COMMENT 'PK',
  `RoleId` int(10) NOT NULL COMMENT '角色ID',
  `UserId` int(10) NOT NULL COMMENT '用户ID',
  `CreateBy` int(10) NOT NULL,
  `CreateDate` timestamp NOT NULL default CURRENT_TIMESTAMP,
  `UpdateBy` int(10) default NULL,
  `UpdateDate` datetime default NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
