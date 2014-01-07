-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jan 07, 2014 at 03:26 PM
-- Server version: 5.5.16
-- PHP Version: 5.3.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `mssystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE IF NOT EXISTS `category` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`id`, `name`) VALUES
(1, 'Fruits\n '),
(2, 'vegitable'),
(3, 'Leaves');

-- --------------------------------------------------------

--
-- Table structure for table `item`
--

CREATE TABLE IF NOT EXISTS `item` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `image` varchar(200) NOT NULL,
  `name` varchar(100) NOT NULL,
  `category_id` int(10) unsigned NOT NULL,
  `unit_id` int(11) NOT NULL,
  PRIMARY KEY (`id`,`category_id`) USING BTREE,
  KEY `FK_item_1` (`category_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=22 ;

--
-- Dumping data for table `item`
--

INSERT INTO `item` (`id`, `image`, `name`, `category_id`, `unit_id`) VALUES
(1, 'images/items/apple.png', 'apple', 1, 1),
(2, 'images/items/carrot.png', 'carrot', 2, 3),
(3, 'images/items/banana.png', 'banana', 1, 3),
(4, 'images/items/beet.png', 'Beet', 2, 3),
(5, 'images/items/BellPepper.png', 'BellPepper', 2, 1),
(6, 'images/items/Garlic.png', 'Garlic', 2, 1),
(7, 'images/items/Coconut.png', 'Coconut', 2, 1),
(8, 'images/items/Chilli.png', 'Chilli', 2, 1),
(9, 'images/items/Lettuce.png', 'Lettuce ', 2, 1),
(10, 'images/items/Spinach.png', 'Spinach', 3, 1),
(11, 'images/items/Cauliflower.png', 'Cauliflower', 2, 1),
(12, 'images/items/Watermelon.png', 'Watermelon', 1, 1),
(13, 'images/items/Lime.png', 'Lime', 2, 1),
(14, 'images/items/Avocado.png', 'Avocado', 1, 2),
(15, 'images/items/BasilFresh.png', 'BasilFresh', 3, 4),
(16, 'images/items/bellred.png', 'bellred', 2, 1),
(17, 'images/items/BitterGourd.png', 'BitterGourd', 2, 1),
(18, 'images/items/leeks.png', 'leeks', 2, 1),
(19, 'images/items/papaya.png', 'papaya', 1, 1),
(20, 'images/items/Parsley.png', 'Parsley', 3, 4),
(21, 'images/items/Strawberry.png', 'Strawberry', 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `scraped_name_item_unit`
--

CREATE TABLE IF NOT EXISTS `scraped_name_item_unit` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `scraped_name` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `scraped_name_item_unit`
--

INSERT INTO `scraped_name_item_unit` (`id`, `scraped_name`) VALUES
(1, 'TIARA ROLLO SWISS ROLL 30G');

-- --------------------------------------------------------

--
-- Table structure for table `shop`
--

CREATE TABLE IF NOT EXISTS `shop` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `imageUrl` varchar(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `address` varchar(1000) NOT NULL,
  `longitude` varchar(45) NOT NULL,
  `latitude` varchar(45) NOT NULL,
  `nearest_town` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `shop`
--

INSERT INTO `shop` (`id`, `imageUrl`, `name`, `address`, `longitude`, `latitude`, `nearest_town`) VALUES
(1, 'images/shops/keelsSuper.jpg', 'Keels Super', 'no 32,Colombo', '2', '3', 'Colombo'),
(2, 'images/shops/cargills.jpg', 'Cargills Food City', 'no 54, kandy', '3', '3', 'kandy'),
(3, 'images/shops/arpico.gif', 'Arpico Super Center', 'de mal road, kandy', '2', '5', 'kandy'),
(4, 'images/shops/walmart.jpg', 'Wal Mart', 'raja mawatha, matale', '6', '8', 'matale');

-- --------------------------------------------------------

--
-- Table structure for table `shopping_list`
--

CREATE TABLE IF NOT EXISTS `shopping_list` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(10) unsigned NOT NULL,
  `created_date` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_user_shopping_list_1` (`user_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `shopping_list`
--

INSERT INTO `shopping_list` (`id`, `user_id`, `created_date`) VALUES
(1, 1, '2013-07-08 00:00:00'),
(2, 2, '2013-12-03 00:00:00'),
(3, 3, '2013-12-04 00:00:00'),
(4, 3, '2007-12-12 00:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `shopping_list_item`
--

CREATE TABLE IF NOT EXISTS `shopping_list_item` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `shopping_list_id` int(10) unsigned NOT NULL,
  `item_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_shopping_list_item_1` (`shopping_list_id`),
  KEY `FK_shopping_list_item_2` (`item_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Dumping data for table `shopping_list_item`
--

INSERT INTO `shopping_list_item` (`id`, `shopping_list_id`, `item_id`) VALUES
(1, 2, 2),
(2, 2, 3),
(3, 1, 4),
(4, 1, 5),
(5, 3, 2),
(6, 3, 4);

-- --------------------------------------------------------

--
-- Table structure for table `shop_item_unit_price`
--

CREATE TABLE IF NOT EXISTS `shop_item_unit_price` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `shop_id` int(10) unsigned NOT NULL,
  `item_id` int(10) unsigned NOT NULL,
  `price` double NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_shop_item_unit_price_1` (`shop_id`),
  KEY `FK_shop_item_unit_price_2` (`item_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=43 ;

--
-- Dumping data for table `shop_item_unit_price`
--

INSERT INTO `shop_item_unit_price` (`id`, `shop_id`, `item_id`, `price`) VALUES
(1, 2, 1, 150),
(2, 2, 3, 225),
(3, 2, 4, 500),
(4, 1, 2, 430),
(5, 1, 1, 300),
(6, 1, 4, 300),
(7, 3, 5, 60),
(8, 3, 7, 65),
(9, 3, 2, 35),
(10, 4, 8, 45),
(11, 4, 5, 46),
(12, 4, 12, 56),
(13, 1, 3, 45),
(14, 1, 5, 30),
(15, 2, 2, 60),
(16, 2, 5, 20),
(17, 3, 1, 30),
(18, 3, 3, 50),
(19, 3, 4, 70),
(20, 4, 1, 30),
(21, 4, 2, 40),
(22, 4, 3, 50),
(23, 4, 4, 40),
(24, 1, 6, 50),
(25, 2, 6, 60),
(26, 3, 6, 50),
(27, 4, 6, 40),
(28, 1, 7, 40),
(29, 2, 7, 90),
(30, 4, 7, 30),
(31, 3, 8, 40),
(32, 2, 8, 70),
(33, 1, 8, 50),
(34, 1, 9, 50),
(35, 1, 10, 40),
(36, 2, 9, 20),
(37, 2, 10, 40),
(38, 3, 9, 30),
(39, 3, 10, 30),
(40, 4, 9, 30),
(41, 4, 10, 45),
(42, 4, 11, 35);

-- --------------------------------------------------------

--
-- Table structure for table `unit`
--

CREATE TABLE IF NOT EXISTS `unit` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `unit`
--

INSERT INTO `unit` (`id`, `name`) VALUES
(1, 'kg'),
(2, 'nos'),
(3, 'piece'),
(4, 'bunches');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `username`, `password`) VALUES
(1, 'aa', 'aa'),
(2, 'bb', 'bb'),
(3, 'cc', 'cc'),
(4, 'dd', 'dd');

-- --------------------------------------------------------

--
-- Table structure for table `user_shop`
--

CREATE TABLE IF NOT EXISTS `user_shop` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(10) unsigned NOT NULL,
  `shop_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_user_shop_1` (`shop_id`),
  KEY `FK_user_shop_2` (`user_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `user_shop`
--

INSERT INTO `user_shop` (`id`, `user_id`, `shop_id`) VALUES
(1, 1, 1),
(2, 1, 2),
(3, 2, 3),
(4, 2, 4);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
