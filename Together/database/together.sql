-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- المزود: localhost
-- أنشئ في: 02 يونيو 2012 الساعة 15:08
-- إصدارة المزود: 5.5.8
--  PHP إصدارة: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- قاعدة البيانات: `together`
--

-- --------------------------------------------------------

--
-- بنية الجدول `actvetes`
--

CREATE TABLE IF NOT EXISTS `actvetes` (
  `id_act` int(4) NOT NULL,
  `act_name` varchar(15) NOT NULL,
  `act_phon#no` int(13) NOT NULL,
  `act_date` date NOT NULL,
  PRIMARY KEY (`id_act`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- إرجاع أو استيراد بيانات الجدول `actvetes`
--


-- --------------------------------------------------------

--
-- بنية الجدول `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `id_no` int(5) NOT NULL,
  `name` varchar(15) NOT NULL,
  `age` int(5) NOT NULL,
  `city` varchar(15) NOT NULL,
  `phon_no` int(10) NOT NULL,
  PRIMARY KEY (`id_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- إرجاع أو استيراد بيانات الجدول `user`
--

