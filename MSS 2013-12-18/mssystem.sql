-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Feb 05, 2014 at 06:24 PM
-- Server version: 5.5.24-log
-- PHP Version: 5.3.13

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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=33 ;

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
(21, 'images/items/Strawberry.png', 'Strawberry', 1, 1),
(22, 'images/items/Coconut.png', 'coconut', 2, 1),
(23, 'images/items/Kankun.png', 'Kankun', 3, 4),
(24, 'images/items/Cabbage.png', 'Cabbage', 2, 1),
(25, 'images/items/Ginger.png', 'Ginger', 2, 1),
(26, 'images/items/Mint.png', 'Mint', 3, 4),
(27, 'images/items/Capsicum.png', 'Capsicum', 2, 1),
(28, 'images/items/Pineapple.png', 'Pineapple', 1, 2),
(29, 'images/items/Lettuce - Red.png', 'Lettuce - Red', 2, 1),
(30, 'images/items/Chives.png', 'Chives ', 3, 4),
(31, 'images/items/Thyme.png', 'Thyme', 3, 4),
(32, 'images/items/Cucumber.png', 'Cucumber ', 2, 1);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
