-- phpMyAdmin SQL Dump
-- version 4.0.6
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Apr 23, 2014 at 09:14 AM
-- Server version: 5.5.33
-- PHP Version: 5.5.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Database: `codesales`
--

-- --------------------------------------------------------

--
-- Table structure for table `adminCommunity`
--

CREATE TABLE `adminCommunity` (
  `comm_id` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  PRIMARY KEY (`comm_id`,`user_id`),
  KEY `FK2F6E955A9EAF2585` (`user_id`),
  KEY `FK2F6E955A56914E4C` (`comm_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `adminCommunity`
--

INSERT INTO `adminCommunity` (`comm_id`, `user_id`) VALUES
(2, 3),
(1, 5);

-- --------------------------------------------------------

--
-- Table structure for table `algorithms`
--

CREATE TABLE `algorithms` (
  `alg_ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `admin_comment` varchar(1024) DEFAULT NULL,
  `admin_result` varchar(64) NOT NULL,
  `alg_category` varchar(512) NOT NULL,
  `alg_codepath` varchar(100) NOT NULL,
  `alg_codepath_server` varchar(100) NOT NULL,
  `alg_description` longtext NOT NULL,
  `alg_filepath` varchar(1024) NOT NULL,
  `alg_filepath_server` varchar(100) NOT NULL,
  `alg_name` varchar(512) NOT NULL,
  `alg_picture` varchar(1024) NOT NULL,
  `alg_picture_server` varchar(100) NOT NULL,
  `alg_price` varchar(100) NOT NULL,
  `alg_related_algs` varchar(1024) NOT NULL,
  `alg_related_papers` varchar(1024) NOT NULL,
  `alg_tags` varchar(512) NOT NULL,
  `alg_title` varchar(512) NOT NULL,
  `author` varchar(255) DEFAULT NULL,
  `author_comment` varchar(1024) DEFAULT NULL,
  `copyright` varchar(100) NOT NULL,
  `current_status` varchar(64) NOT NULL,
  `publish` varchar(100) NOT NULL,
  `resubmit` varchar(100) DEFAULT NULL,
  `resubmit_date` varchar(100) DEFAULT NULL,
  `review_result` varchar(64) NOT NULL,
  `saleOption` varchar(100) NOT NULL,
  `submit_date` varchar(255) DEFAULT NULL,
  `test_results` varchar(64) NOT NULL,
  `comm_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`alg_ID`),
  KEY `FK_qat7tl5awbkwqfycgdtf91nlw` (`comm_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `algorithms`
--

INSERT INTO `algorithms` (`alg_ID`, `admin_comment`, `admin_result`, `alg_category`, `alg_codepath`, `alg_codepath_server`, `alg_description`, `alg_filepath`, `alg_filepath_server`, `alg_name`, `alg_picture`, `alg_picture_server`, `alg_price`, `alg_related_algs`, `alg_related_papers`, `alg_tags`, `alg_title`, `author`, `author_comment`, `copyright`, `current_status`, `publish`, `resubmit`, `resubmit_date`, `review_result`, `saleOption`, `submit_date`, `test_results`, `comm_ID`) VALUES
(1, '', 'Accept', 'test', 'NaiveBayes (1).zip', '1394775589726.zip', '<p>	test</p><p>	tests</p>', 'What is twitter-a social net or news media (1).pdf', '1394775589713.pdf', 'test by other user', 'Linear-svm-scatterplot.svg (1) (1).png', '1394775589726.png', '$100.00', 'NA', 'test', 'test', 'test by other user', 'david.xie', '', 'true', 'Accept', 'yes', NULL, NULL, 'Accept', 'true', '14-03-2014', 'Accept', 2),
(2, '', 'Accept', 'ddd', 'ckeditor_3.6.6.1.zip', '1395377643376.zip', '<p>	dddd</p><p>	ddd</p>', 'practiceA-M (1).pdf', '1395377643317.pdf', 'dddddddd', 'test1.gif', '1395377643376.gif', '$10.00', 'NA', 'ddd', 'ddd', 'dddddddd', 'david.xie', 'hi admin!', 'true', 'Revirew - Ongoing', 'no', 'true', '21-03-2014', 'Ongoing', 'true', '21-03-2014', 'Waiting', 2),
(3, 'pass!', 'Accept', 'security', 'maven-eclipse_plugin.zip', '1396798424601.zip', '<p>	security</p><p>	security</p>', 'SAD-pgm14_E.pdf', '1396798424546.pdf', 'security', 'Linear-svm-scatterplot.svg (1).png', '1396798424584.png', '$100.00', 'NA', 'security', 'security', 'security', 'guodong.long', '', 'true', 'Review - Ongoing', 'no', NULL, NULL, 'Ongoing', 'true', '07-04-2014', 'Waiting', 1);

-- --------------------------------------------------------

--
-- Table structure for table `algorithms_Backup`
--

CREATE TABLE `algorithms_Backup` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `admin_comment` varchar(1024) DEFAULT NULL,
  `admin_result` varchar(64) NOT NULL,
  `alg_ID` bigint(20) DEFAULT NULL,
  `alg_category` varchar(512) NOT NULL,
  `alg_codepath` varchar(100) NOT NULL,
  `alg_codepath_server` varchar(100) NOT NULL,
  `alg_description` longtext NOT NULL,
  `alg_filepath` varchar(1024) NOT NULL,
  `alg_filepath_server` varchar(100) NOT NULL,
  `alg_name` varchar(512) NOT NULL,
  `alg_picture` varchar(1024) NOT NULL,
  `alg_picture_server` varchar(100) NOT NULL,
  `alg_price` varchar(100) NOT NULL,
  `alg_related_algs` varchar(1024) NOT NULL,
  `alg_related_papers` varchar(1024) NOT NULL,
  `alg_tags` varchar(512) NOT NULL,
  `alg_title` varchar(512) NOT NULL,
  `author` varchar(255) DEFAULT NULL,
  `author_comment` varchar(1024) DEFAULT NULL,
  `backup_date` varchar(100) NOT NULL,
  `copyright` varchar(100) NOT NULL,
  `current_status` varchar(64) NOT NULL,
  `publish` varchar(100) NOT NULL,
  `resubmit` varchar(100) DEFAULT NULL,
  `resubmit_date` varchar(100) DEFAULT NULL,
  `review_result` varchar(64) NOT NULL,
  `saleOption` varchar(100) NOT NULL,
  `submit_date` varchar(255) DEFAULT NULL,
  `test_results` varchar(64) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `algorithms_Backup`
--

INSERT INTO `algorithms_Backup` (`id`, `admin_comment`, `admin_result`, `alg_ID`, `alg_category`, `alg_codepath`, `alg_codepath_server`, `alg_description`, `alg_filepath`, `alg_filepath_server`, `alg_name`, `alg_picture`, `alg_picture_server`, `alg_price`, `alg_related_algs`, `alg_related_papers`, `alg_tags`, `alg_title`, `author`, `author_comment`, `backup_date`, `copyright`, `current_status`, `publish`, `resubmit`, `resubmit_date`, `review_result`, `saleOption`, `submit_date`, `test_results`) VALUES
(1, NULL, 'Waiting', 1, 'test', 'NaiveBayes (1).zip', '1394775589726.zip', '<p>	test</p><p>	tests</p>', 'What is twitter-a social net or news media (1).pdf', '1394775589713.pdf', 'test by other user', 'Linear-svm-scatterplot.svg (1) (1).png', '1394775589726.png', '$100.00', 'NA', 'test', 'test', 'test by other user', 'david.xie', '', '14-03-2014', 'true', 'new', 'no', NULL, NULL, 'Waiting', 'true', '14-03-2014', 'Waiting'),
(2, NULL, 'Waiting', 2, 'ddd', 'ckeditor_3.6.6.1.zip', '1395377643376.zip', '<p>	dddd</p><p>	ddd</p>', 'practiceA-M (1).pdf', '1395377643317.pdf', 'dddddddd', 'test1.gif', '1395377643376.gif', '$10.00', 'NA', 'dddd', 'dddd', 'dddddddd', 'david.xie', '', '21-03-2014', 'true', 'new', 'no', NULL, NULL, 'Waiting', 'true', '21-03-2014', 'Waiting'),
(3, NULL, 'Waiting', 2, 'ddd', 'ckeditor_3.6.6.1.zip', '1395377643376.zip', '<p>	dddd</p><p>	ddd</p>', 'practiceA-M (1).pdf', '1395377643317.pdf', 'dddddddd', 'test1.gif', '1395377643376.gif', '$10.00', 'NA', 'ddd', 'ddd', 'dddddddd', 'david.xie', 'hi admin!', '21-03-2014', 'true', 'new', 'no', 'true', '21-03-2014', 'Waiting', 'true', '21-03-2014', 'Waiting'),
(4, NULL, 'Waiting', 3, 'security', 'maven-eclipse_plugin.zip', '1396798424601.zip', '<p>	security</p><p>	security</p>', 'SAD-pgm14_E.pdf', '1396798424546.pdf', 'security', 'Linear-svm-scatterplot.svg (1).png', '1396798424584.png', '$100.00', 'NA', 'security', 'security', 'security', 'guodong.long', '', '07-04-2014', 'true', 'new', 'no', NULL, NULL, 'Waiting', 'true', '07-04-2014', 'Waiting');

-- --------------------------------------------------------

--
-- Table structure for table `algorithms_review`
--

CREATE TABLE `algorithms_review` (
  `algorithms_alg_ID` bigint(20) NOT NULL,
  `reviews_id` bigint(20) NOT NULL,
  PRIMARY KEY (`algorithms_alg_ID`,`reviews_id`),
  UNIQUE KEY `reviews_id` (`reviews_id`),
  UNIQUE KEY `UK_kn9kc0cediutq1h03ghv9br1b` (`reviews_id`),
  KEY `FK190EF2137FFF38FD` (`algorithms_alg_ID`),
  KEY `FK190EF21324714802` (`reviews_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `algorithms_review`
--

INSERT INTO `algorithms_review` (`algorithms_alg_ID`, `reviews_id`) VALUES
(1, 2),
(1, 3),
(2, 4),
(2, 5),
(3, 6),
(3, 7);

-- --------------------------------------------------------

--
-- Table structure for table `algorithms_testing`
--

CREATE TABLE `algorithms_testing` (
  `algorithms_alg_ID` bigint(20) NOT NULL,
  `testings_id` bigint(20) NOT NULL,
  PRIMARY KEY (`algorithms_alg_ID`,`testings_id`),
  UNIQUE KEY `testings_id` (`testings_id`),
  UNIQUE KEY `UK_86trp0g06bh4m3fmf545ets9f` (`testings_id`),
  KEY `FK72768EB57AA524FC` (`testings_id`),
  KEY `FK72768EB57FFF38FD` (`algorithms_alg_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `algorithms_testing`
--

INSERT INTO `algorithms_testing` (`algorithms_alg_ID`, `testings_id`) VALUES
(1, 1),
(1, 2);

-- --------------------------------------------------------

--
-- Table structure for table `community`
--

CREATE TABLE `community` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `description` varchar(5000) DEFAULT NULL,
  `name` varchar(512) NOT NULL,
  `admin` varchar(512) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `community`
--

INSERT INTO `community` (`id`, `description`, `name`, `admin`) VALUES
(1, 'Graph Learning', 'Graph Learning', 'shirui.pan'),
(2, 'General', 'General', 'guodong.long');

-- --------------------------------------------------------

--
-- Table structure for table `community_algorithms`
--

CREATE TABLE `community_algorithms` (
  `community_id` bigint(20) NOT NULL,
  `algorithms_alg_ID` bigint(20) NOT NULL,
  PRIMARY KEY (`community_id`,`algorithms_alg_ID`),
  UNIQUE KEY `algorithms_alg_ID` (`algorithms_alg_ID`),
  UNIQUE KEY `UK_6ipfk48htnt08bltkjm80hyld` (`algorithms_alg_ID`),
  KEY `FKBAAB23FA7FFF38FD` (`algorithms_alg_ID`),
  KEY `FKBAAB23FAB9CF444F` (`community_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `community_algorithms`
--

INSERT INTO `community_algorithms` (`community_id`, `algorithms_alg_ID`) VALUES
(2, 1),
(2, 2),
(1, 3);

-- --------------------------------------------------------

--
-- Table structure for table `lookup`
--

CREATE TABLE `lookup` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `type` varchar(512) NOT NULL,
  `value` varchar(512) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=13 ;

--
-- Dumping data for table `lookup`
--

INSERT INTO `lookup` (`id`, `type`, `value`) VALUES
(1, 'language', 'Java'),
(2, 'language', 'C Language'),
(3, 'language', 'C++'),
(4, 'language', 'Matlab'),
(5, 'language', 'Ruby'),
(6, 'language', 'Python'),
(7, 'language', 'R Language'),
(8, 'language', 'C#'),
(9, 'language', 'PHP'),
(10, 'category', 'Data Mining'),
(11, 'category', 'Active Learning'),
(12, 'category', 'Machine Learning');

-- --------------------------------------------------------

--
-- Table structure for table `review`
--

CREATE TABLE `review` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `dueDate` varchar(100) DEFAULT NULL,
  `isTester` varchar(10) DEFAULT NULL,
  `price` varchar(255) DEFAULT NULL,
  `results` longtext NOT NULL,
  `reviewFile` varchar(1024) DEFAULT NULL,
  `reviewFile_server` varchar(100) DEFAULT NULL,
  `status` varchar(64) NOT NULL,
  `alg_ID` bigint(20) NOT NULL,
  `user_ID` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKC84EF7589EAF2585` (`user_ID`),
  KEY `FKC84EF7582F3F3E42` (`alg_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Dumping data for table `review`
--

INSERT INTO `review` (`id`, `dueDate`, `isTester`, `price`, `results`, `reviewFile`, `reviewFile_server`, `status`, `alg_ID`, `user_ID`) VALUES
(2, NULL, 'Yes', '$100.00', '<p>\r\n	ssss</p>\r\n', 'NaiveBayes (1).zip', '1394775761429.zip', 'Weak Accept', 1, 2),
(3, NULL, 'Yes', '$100.00', '<p>\r\n	ssss</p>\r\n<p>\r\n	ss</p>\r\n', 'users(1).txt', '1394775713461.txt', 'Accept', 1, 3),
(4, NULL, NULL, NULL, 'Ongoing', NULL, NULL, 'Ongoing', 2, 2),
(5, NULL, 'Yes', '$10.00', '<p>\r\n	dssfsdf</p>\r\n<p>\r\n	fafa</p>\r\n', NULL, '', 'Accept', 2, 3),
(6, NULL, NULL, NULL, 'Ongoing', NULL, NULL, 'Ongoing', 3, 2),
(7, NULL, NULL, NULL, 'Ongoing', NULL, NULL, 'Ongoing', 3, 4);

-- --------------------------------------------------------

--
-- Table structure for table `role`
--

CREATE TABLE `role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `description` varchar(5000) DEFAULT NULL,
  `name` varchar(512) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `role`
--

INSERT INTO `role` (`id`, `description`, `name`) VALUES
(1, 'System admin', 'ROLE_ADMIN'),
(2, 'Algorithm Tester', 'ROLE_USER'),
(4, 'Algorithm Publisher', 'ROLE_PUBLISHER'),
(5, 'Community Admin', 'ROLE_COMM_ADMIN');

-- --------------------------------------------------------

--
-- Table structure for table `testing`
--

CREATE TABLE `testing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `dueDate` varchar(100) DEFAULT NULL,
  `price` varchar(255) DEFAULT NULL,
  `results` longtext NOT NULL,
  `status` varchar(64) NOT NULL,
  `testFile` varchar(1024) DEFAULT NULL,
  `testFile_server` varchar(100) DEFAULT NULL,
  `alg_ID` bigint(20) NOT NULL,
  `user_ID` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKAB3732109EAF2585` (`user_ID`),
  KEY `FKAB3732102F3F3E42` (`alg_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `testing`
--

INSERT INTO `testing` (`id`, `dueDate`, `price`, `results`, `status`, `testFile`, `testFile_server`, `alg_ID`, `user_ID`) VALUES
(1, NULL, '$100.00', '<p>\r\n	pass?</p>\r\n', 'Accept', 'chosen_v1.1.0.zip', '1394775840257.zip', 1, 2),
(2, NULL, '$100.00', '<p>\r\n	passsss!</p>\r\n', 'Accept', NULL, '', 1, 3);

-- --------------------------------------------------------

--
-- Table structure for table `userAlgorithm`
--

CREATE TABLE `userAlgorithm` (
  `alg_id` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  PRIMARY KEY (`alg_id`,`user_id`),
  KEY `FK8280FCE49EAF2585` (`user_id`),
  KEY `FK8280FCE42F3F3E42` (`alg_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `userAlgorithm`
--

INSERT INTO `userAlgorithm` (`alg_id`, `user_id`) VALUES
(3, 3),
(1, 4),
(2, 4);

-- --------------------------------------------------------

--
-- Table structure for table `userCommunity`
--

CREATE TABLE `userCommunity` (
  `comm_id` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  PRIMARY KEY (`comm_id`,`user_id`),
  KEY `FK1CD5785E9EAF2585` (`user_id`),
  KEY `FK1CD5785E56914E4C` (`comm_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `userCommunity`
--

INSERT INTO `userCommunity` (`comm_id`, `user_id`) VALUES
(1, 2),
(1, 3),
(1, 4);

-- --------------------------------------------------------

--
-- Table structure for table `userRole`
--

CREATE TABLE `userRole` (
  `role_id` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  PRIMARY KEY (`role_id`,`user_id`),
  KEY `FKF01D02E1F98461A5` (`role_id`),
  KEY `FKF01D02E19EAF2585` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `userRole`
--

INSERT INTO `userRole` (`role_id`, `user_id`) VALUES
(1, 1),
(2, 3),
(2, 4),
(4, 3),
(5, 2),
(5, 3),
(5, 5);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `admin` varchar(20) DEFAULT NULL,
  `country` varchar(50) DEFAULT NULL,
  `createTime` varchar(255) DEFAULT NULL,
  `currontVisitTime` varchar(255) DEFAULT NULL,
  `email` varchar(128) DEFAULT NULL,
  `firstName` varchar(128) DEFAULT NULL,
  `lastName` varchar(128) DEFAULT NULL,
  `organization` varchar(255) DEFAULT NULL,
  `password` varchar(255) NOT NULL,
  `phoneNumber` varchar(20) DEFAULT NULL,
  `previosVisitTime` varchar(255) DEFAULT NULL,
  `publisher` varchar(20) DEFAULT NULL,
  `research` varchar(1024) DEFAULT NULL,
  `username` varchar(128) NOT NULL,
  `version` int(11) DEFAULT NULL,
  `website` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `admin`, `country`, `createTime`, `currontVisitTime`, `email`, `firstName`, `lastName`, `organization`, `password`, `phoneNumber`, `previosVisitTime`, `publisher`, `research`, `username`, `version`, `website`) VALUES
(1, 'yes', 'Australia', '2014-03-13', NULL, 'admin@researchermall.com', 'Admin', 'Admin', 'UTS', 'codesales_admin', '0424796357', NULL, 'no', 'data mining', 'admin', NULL, NULL),
(2, 'no', 'Australia', '2014-03-13 15:12', NULL, 'xuepingpeng@yahoo.com', 'Xueping', 'Peng', 'uts', 'codesales', NULL, NULL, 'no', 'data mining, clustering', 'xueping.peng', 10, NULL),
(3, 'no', 'Australia', '2014-03-13 15:12', NULL, 'guodong.long@uts.edu.au', 'Guodong', 'Long', 'uts', 'codesales', NULL, NULL, 'no', 'data mining, clustering', 'guodong.long', 16, NULL),
(4, 'no', 'Australia', '2014-03-13 15:13', NULL, 'david.xie@gmail.com', 'David', 'Xie', 'uts', 'codesales', NULL, NULL, 'yes', 'data mining', 'david.xie', 10, NULL),
(5, 'no', 'Australia', '2014-03-13 15:16', NULL, 'shirui.pan@student.uts.edu.au', 'Shirui', 'Pan', 'uts', 'codesales', NULL, NULL, 'no', 'data mining, Group Mining', 'shirui.pan', 7, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `users_review`
--

CREATE TABLE `users_review` (
  `users_id` bigint(20) NOT NULL,
  `reviews_id` bigint(20) NOT NULL,
  PRIMARY KEY (`users_id`,`reviews_id`),
  UNIQUE KEY `reviews_id` (`reviews_id`),
  UNIQUE KEY `UK_p7ol9b694e9jg1l800wtwtdph` (`reviews_id`),
  KEY `FKE2460D6F24714802` (`reviews_id`),
  KEY `FKE2460D6F979FFE28` (`users_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users_review`
--

INSERT INTO `users_review` (`users_id`, `reviews_id`) VALUES
(2, 2),
(3, 3),
(2, 4),
(3, 5),
(2, 6),
(4, 7);

-- --------------------------------------------------------

--
-- Table structure for table `users_testing`
--

CREATE TABLE `users_testing` (
  `users_id` bigint(20) NOT NULL,
  `testings_id` bigint(20) NOT NULL,
  PRIMARY KEY (`users_id`,`testings_id`),
  UNIQUE KEY `testings_id` (`testings_id`),
  UNIQUE KEY `UK_af1oq778s5wq4xn4tkpi2rr75` (`testings_id`),
  KEY `FKD022DED97AA524FC` (`testings_id`),
  KEY `FKD022DED9979FFE28` (`users_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users_testing`
--

INSERT INTO `users_testing` (`users_id`, `testings_id`) VALUES
(2, 1),
(3, 2);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `adminCommunity`
--
ALTER TABLE `adminCommunity`
  ADD CONSTRAINT `FK2F6E955A56914E4C` FOREIGN KEY (`comm_id`) REFERENCES `community` (`id`),
  ADD CONSTRAINT `FK2F6E955A9EAF2585` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);

--
-- Constraints for table `algorithms`
--
ALTER TABLE `algorithms`
  ADD CONSTRAINT `FK_qat7tl5awbkwqfycgdtf91nlw` FOREIGN KEY (`comm_ID`) REFERENCES `community` (`id`);

--
-- Constraints for table `algorithms_review`
--
ALTER TABLE `algorithms_review`
  ADD CONSTRAINT `FK190EF21324714802` FOREIGN KEY (`reviews_id`) REFERENCES `review` (`id`),
  ADD CONSTRAINT `FK190EF2137FFF38FD` FOREIGN KEY (`algorithms_alg_ID`) REFERENCES `algorithms` (`alg_ID`);

--
-- Constraints for table `algorithms_testing`
--
ALTER TABLE `algorithms_testing`
  ADD CONSTRAINT `FK72768EB57AA524FC` FOREIGN KEY (`testings_id`) REFERENCES `testing` (`id`),
  ADD CONSTRAINT `FK72768EB57FFF38FD` FOREIGN KEY (`algorithms_alg_ID`) REFERENCES `algorithms` (`alg_ID`);

--
-- Constraints for table `community_algorithms`
--
ALTER TABLE `community_algorithms`
  ADD CONSTRAINT `FKBAAB23FA7FFF38FD` FOREIGN KEY (`algorithms_alg_ID`) REFERENCES `algorithms` (`alg_ID`),
  ADD CONSTRAINT `FKBAAB23FAB9CF444F` FOREIGN KEY (`community_id`) REFERENCES `community` (`id`);

--
-- Constraints for table `review`
--
ALTER TABLE `review`
  ADD CONSTRAINT `FKC84EF7582F3F3E42` FOREIGN KEY (`alg_ID`) REFERENCES `algorithms` (`alg_ID`),
  ADD CONSTRAINT `FKC84EF7589EAF2585` FOREIGN KEY (`user_ID`) REFERENCES `users` (`id`);

--
-- Constraints for table `testing`
--
ALTER TABLE `testing`
  ADD CONSTRAINT `FKAB3732102F3F3E42` FOREIGN KEY (`alg_ID`) REFERENCES `algorithms` (`alg_ID`),
  ADD CONSTRAINT `FKAB3732109EAF2585` FOREIGN KEY (`user_ID`) REFERENCES `users` (`id`);

--
-- Constraints for table `userAlgorithm`
--
ALTER TABLE `userAlgorithm`
  ADD CONSTRAINT `FK8280FCE42F3F3E42` FOREIGN KEY (`alg_id`) REFERENCES `algorithms` (`alg_ID`),
  ADD CONSTRAINT `FK8280FCE49EAF2585` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);

--
-- Constraints for table `userCommunity`
--
ALTER TABLE `userCommunity`
  ADD CONSTRAINT `FK1CD5785E56914E4C` FOREIGN KEY (`comm_id`) REFERENCES `community` (`id`),
  ADD CONSTRAINT `FK1CD5785E9EAF2585` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);

--
-- Constraints for table `userRole`
--
ALTER TABLE `userRole`
  ADD CONSTRAINT `FKF01D02E19EAF2585` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`),
  ADD CONSTRAINT `FKF01D02E1F98461A5` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`);

--
-- Constraints for table `users_review`
--
ALTER TABLE `users_review`
  ADD CONSTRAINT `FKE2460D6F24714802` FOREIGN KEY (`reviews_id`) REFERENCES `review` (`id`),
  ADD CONSTRAINT `FKE2460D6F979FFE28` FOREIGN KEY (`users_id`) REFERENCES `users` (`id`);

--
-- Constraints for table `users_testing`
--
ALTER TABLE `users_testing`
  ADD CONSTRAINT `FKD022DED97AA524FC` FOREIGN KEY (`testings_id`) REFERENCES `testing` (`id`),
  ADD CONSTRAINT `FKD022DED9979FFE28` FOREIGN KEY (`users_id`) REFERENCES `users` (`id`);
