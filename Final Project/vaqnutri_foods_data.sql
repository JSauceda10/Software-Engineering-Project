-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: vaqnutri
-- ------------------------------------------------------
-- Server version	5.7.20-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `foods_data`
--

DROP TABLE IF EXISTS `foods_data`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `foods_data` (
  `id` int(11) NOT NULL,
  `food` varchar(45) NOT NULL,
  `category` int(11) NOT NULL,
  `image` varchar(45) NOT NULL,
  `serving size` varchar(45) NOT NULL,
  `calories` decimal(6,3) NOT NULL,
  `fats` decimal(6,3) NOT NULL,
  `cholesterol` decimal(6,3) NOT NULL,
  `sodium` decimal(6,3) NOT NULL,
  `potassium` decimal(6,3) NOT NULL,
  `carbohydrates` decimal(6,3) NOT NULL,
  `proteins` decimal(6,3) NOT NULL,
  PRIMARY KEY (`id`,`food`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `foods_data`
--

LOCK TABLES `foods_data` WRITE;
/*!40000 ALTER TABLE `foods_data` DISABLE KEYS */;
INSERT INTO `foods_data` VALUES (0,'apple',3,'apple.jpg','198',0.300,0.000,0.002,0.192,24.700,191.500,0.500),(0,'avocado',1,'avocado.jpg','145',234.000,21.400,0.000,0.010,0.708,12.500,2.900),(0,'banana',0,'banana.jpg','108',105.000,0.200,0.000,0.001,0.194,12.400,0.600),(0,'Cheerios',2,'cheerios.png','28',100.000,2.000,0.000,0.140,0.180,20.000,3.000),(0,'Fiber One 100% Whole Wheat Bread',2,'fiberone-bread-wholewheat.png','48',15.000,1.500,0.000,0.170,0.000,23.000,5.000),(0,'Fiber One Cereal Original',2,'FiberOne_Cereal_Original.png','30',60.000,1.000,0.000,0.110,0.110,25.000,2.000),(0,'Fiber One Multigrain Bread',2,'FiberOne_Bread_Multigrain-1.png','48',110.000,1.500,0.000,0.135,0.000,25.000,4.000),(0,'spinach',0,'spinach.jpg','31',7.000,0.100,0.000,0.024,0.167,1.100,0.900);
/*!40000 ALTER TABLE `foods_data` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-12-13 23:58:10
