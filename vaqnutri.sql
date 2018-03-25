-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: vaqnutri
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
-- Table structure for table `food_groups`
--

DROP TABLE IF EXISTS `food_groups`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `food_groups` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `cssid` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `food_groups`
--

LOCK TABLES `food_groups` WRITE;
/*!40000 ALTER TABLE `food_groups` DISABLE KEYS */;
INSERT INTO `food_groups` VALUES (1,'Vegetables, salads, fruits','vegetables_category'),(2,'Wholemeal cereals and breads','wholemeal_category'),(3,'Milk, yogurt and cheese','dairy_category'),(4,'Meat, poultry, fish, eggs','meat_category'),(5,'Fats, spreads and oils','oils_category'),(6,'Foods and drinks high in fat','junk_category');
/*!40000 ALTER TABLE `food_groups` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `foods`
--

DROP TABLE IF EXISTS `foods`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `foods` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `groupId` int(11) NOT NULL,
  `image` varchar(255) NOT NULL,
  `amount` varchar(45) NOT NULL,
  `calories` double NOT NULL,
  `fats` double NOT NULL,
  `cholesterol` double NOT NULL,
  `sodium` double NOT NULL,
  `potassium` double NOT NULL,
  `carbohydrates` double NOT NULL,
  `proteins` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=121 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `foods`
--

LOCK TABLES `foods` WRITE;
/*!40000 ALTER TABLE `foods` DISABLE KEYS */;
INSERT INTO `foods` VALUES (1,'Apple',1,'apple.jpg','128',198,0.3,0,0.002,0.1915,24.7,191.5),(2,'Avocado',1,'avocado.jpg','146',145,234,21.4,0,0.01,0.708,12.5),(3,'Banana',1,'banana.jpg','118',105,0.4,0,0.001,0.422,27,1.3),(4,'Broccoli',1,'broccoli.jpg','148',50,0.5,0,0.049,0.468,10,4.2),(5,'Cabbage',1,'cabbage.jpg','23',6,0,0,0.004,0.039,1.3,0.3),(6,'Carrot',1,'carrot.jpg','61',25,0.1,0,0.042,0.195,6,0.6),(7,'Cucumber',1,'cucumber.png','52',8,0.1,0,0.001,0.076,1.9,0.3),(8,'Eggplant',1,'eggplant.jpg','82',20,0.1,0,0.002,0.188,4.8,0.8),(9,'Grapefruit',1,'grapefruit.jpg','123',52,0.2,0,0,0.166,13,0.9),(10,'Grapes',1,'grapes.jpg','92',62,0.3,0,0.002,0.176,16,0.6),(11,'Lettuce',1,'lettuce.jpg','36',5,0.1,0,0.01,0.07,1,0.5),(12,'Mango',1,'mango.jpg','336',201,1.3,0,0.003,0.564,50,2.8),(13,'Orange',1,'orange.jpg','96',45,0.1,0,0,0.174,11,0.9),(14,'Papaya',1,'papaya.jpg','157',67,0.4,0,0.013,0.286,17,0.7),(15,'Pineapple',1,'pineapple.jpg','905',452,1.1,0,0.009,0.986,119,4.9),(16,'Potato',1,'potato.png','213',163,0.2,0,0.013,0.897,37,4.3),(17,'Spinach',1,'spinach.jpg','30',7,0.1,0,0.024,0.167,1.1,0.9),(18,'Strawberry',1,'strawberry.jpg','12',4,0,0,0,0.018,0.9,0.1),(19,'Tomato',1,'tomato.jpg','123',22,0.2,0,0.006,0.292,4.8,1.1),(20,'Watermelon',1,'watermelon.jpg','280',85,0.4,0,0.003,0.314,21,1.7),(21,'Amaranth',2,'amaranth.jpg','193',717,14,0,0.008,0.98,126,26),(22,'Barley',2,'barley.jpg','100',354,2.3,0,0.012,0.452,73,12),(23,'Brown Rice',2,'brownrice.jpg','195',216,1.8,0,0.01,0.084,45,5),(24,'Buckwheat',2,'Buckwheat.jpg','168',155,1.2,0,0.015,0.135,25,5.2),(25,'Bulgur',2,'Bulgur.jpg','140',479,1.9,0,0.024,0.574,106,17),(26,'Flax',2,'Flax.jpg','10.3',55,4.3,0,0.003,0.084,3,1.9),(27,'Millet',2,'Millet.jpg','100',378,4.2,0,0.005,0.195,73,11),(28,'Oats',2,'Oats.jpg','100',389,7,0,0.002,0.429,66,17),(29,'Oat Bread',2,'OatBread.jpg','38',100,2,0,0.135,0,18,3),(30,'Oatmeal',2,'Oatmeal.jpg','234',158,3.2,0,0.115,0.143,27,6),(31,'Popcorn',2,'Popcorn.jpg','28.4',106,1.2,0,0.002,0.078,21,3.1),(32,'Cereal Flakes',2,'CerealFlakes.jpg','50',175,1,0,0.152,0.16,41,6),(33,'Rolled Oats',2,'RolledOats.jpg','100',379,6.52,0,0.006,0.362,67.7,13.15),(34,'Rye',2,'Rye.jpg','169',571,2.8,0,0.003,0.862,128,17),(35,'Whole Wheat Bread',2,'WholeWheatBread.jpg','100',247,3.4,0,0.4,0.248,41,13),(36,'White Rice',2,'WhiteRice.jpg','158',206,0.4,0,0.002,0.055,45,4.3),(37,'Oat Cereal',2,'NatureValley_BoxedCereal_BakedOatBites.png','',24,210,6,0,0.16,0.105,34),(38,'Oatmeal Maple',2,'NatureValley_OatmealCups_MaplePecanCrunch.png','',48,290,8,0,0.15,0.21,47),(39,'Granola Bars',2,'NatureValley_CrunchyBar_OatsnHoney.png','',16,190,7,0,0.18,0,29),(40,'Granola Rasin',2,'ErinBakers-Granola-Oatmeal-Raisin.jpg','',55,250,9,0,0.01,0,38),(41,'Reduced Fat 2% Milk',3,'2percentmilk.jpg','',240,150,8,0.035,0.12,0.38,12),(42,'Low Fat 1% Milk',3,'1percentmilk.jpg','',240,150,8,0.035,0.12,0.38,12),(43,'Whole Milk',3,'wholemilk.jpg','',240,150,8,0.035,0.12,0.38,12),(44,'Almondmilk',3,'almondmilk.jpg','',240,30,2.5,0,0.15,0.16,1),(45,'Brand Milk',3,'condensedmilk.jpg','',39,130,3,0.01,0.04,0,23),(46,'Silk Vanilla Soymilk',3,'silksoymilk.jpg','',240,30,3.5,0,0.1,0.3,9),(47,'Chocolate Soy Milk',3,'chocolatesoymilk.jpg','',240,70,3,0,0.125,0.29,5),(48,'Yogurt',3,'vanillayogurt.jpg','',240,110,0,0.005,0.105,0.32,20),(49,'Strawberry Yogurt',3,'strawberryyogurt.jpg','',225,200,1.5,0.01,0.1,0.3,39),(50,'Non-Fat Greek Yogurt',3,'chobaniblueberry_greekyogurt.jpg','',150,120,0,0.005,0.06,0.22,18),(51,'Nonfat Yogurt',3,'plainyogurt.jpg','',225,120,0,0.005,0.15,0.51,18),(52,'Lowfat Yogurt',3,'probioticbananayogurt.jpg','',240,240,2.5,0.01,0.13,0.42,45),(53,'Non-Fat Greek Yogurt',3,'chobanivanillayogurt.jpg','',170,0,0.01,0.095,0.36,23,20),(54,'Banana Yogurt',3,'bananacreampie_yogurt.jpg','',170,90,0,0.005,0.08,0,16),(55,'Cheese',3,'velveetacheese.jpg','',21,40,2,0.001,0.32,0,3),(56,'Parmesan Grated Cheese',3,'parmesangratedcheese.jpg','',30,20,1.5,0.005,0.085,0,0),(57,'American Cheese',3,'americancheese.jpg','',21,70,5,0.02,0.27,0,2),(58,'Low Fat American Cheese',3,'delideluxe_americancheese.jpg','',19,30,4.5,0.015,0.3,0,1),(59,'Mozzarella Cheese',3,'mozzarellacheese.jpg','',28,80,5,0.015,0.2,0.025,1),(60,'Borden Cheese',3,'bordencheese.jpg','',21,45,5,0.015,0.29,0,3),(61,'Ground Beef',4,'ground_beefroll.jpg','',112,340,30,0.085,0.075,0,0),(62,'Ground Turkey',4,'ground_turkey.jpg','',112,150,8,0.08,0.095,0,0),(63,'Beef Burgers',4,'beef_burger.jpg','',113,290,23,0.09,0.085,0.31,0),(64,'Vienna Sausage',4,'spam.jpg','',56,180,16,0.04,0.79,0,1),(65,'Chicken Drumsticks',4,'chicken_drumsticks.jpg','',112,90,10,0.1,0.16,0,0),(66,'Chicken Breasts',4,'chicken_breast.jpg','',112,20,2.5,0.065,0.18,0,0),(67,'Chicken Wings',4,'chicken_wing.jpg','',112,220,17,0.105,0.19,0,0),(68,'LowFat Chicken Breast',4,'chicken_breastinwater.jpg','',56,45,1,0.025,0.26,0.14,0),(69,'Light Tuna',4,'light_tuna.jpg','',56,45,0.5,0.02,0.18,0.11,0),(70,'Tilpia Filets',4,'tilapia_fillet.jpg','',113,100,1.5,0.05,0.025,0,0),(71,'Raw Shrimp',4,'shrimp_raw.jpg','',85,50,0.5,0.125,0.64,0.22,0),(72,'White Eggs',4,'greatvalue_largeeggs.jpg','',56,70,5,0.185,0.07,0,0),(73,'Brown Eggs',4,'farmhouse_browneggs.jpg','',50,70,5,0.185,0.07,0,0),(74,'Liquid Egg Whites',4,'liquid_eggwhite.jpg','',46,25,0,0,0.075,0.06,1),(75,'Pinto Beans',4,'pinto_beans.jpg','',35,90,0,0,0.005,0.49,20),(76,'Black Beans',4,'black_beans.jpg','',35,100,0.5,0,0,0.49,22),(77,'Red Kidney Beans',4,'kidney_beans.jpg','',35,100,0,0,0.005,0.48,21),(78,'Pecans Halves',4,'fisher_pecanhalves.jpg','',28,190,20,0,0,0,4),(79,'Almonds',4,'wholenatural_almonds.jpg','',28,160,14,0,0,0.21,6),(80,'Pistachios',4,'pistachios.jpg','',30,160,14,0,0.16,0.31,8),(81,'Butter',5,'SmartBalancebutter.png','',33,60,7,0,70,0,0),(82,'Peanutbutter',5,'wowbutter.jpg','',16,200,15,0,100,300,8),(83,'AlmondButter',5,'barneyandcoalmond.jpg','',14,180,15,0,100,0,8),(84,'Butter',5,'butterspray.jpg','',1700,0,0,0,0,0,0),(85,'Butter',5,'canolabutter.jpg','',30,100,11,15,85,0,0),(86,'Butter',5,'canolaolivebutter.jpg','',30,100,11,15,85,0,0),(87,'Creamcheese',5,'creamcheese.jpg','',7,80,7,20,125,0,2),(88,'Hummus',5,'hummus.jpg','',10,70,5,0,130,0,4),(89,'AlmondButter',5,'justin\'salmond.jpg','',12,190,18,0,0,3500,6),(90,'Butter',5,'lightspreadbutter.jpg','',30,40,4,0,80,3500,0),(91,'AlmondButter',5,'maranathaalmond.jpg','',11,190,16,0,0,3500,7),(92,'AlmondButter',5,'nutsnmorealmond.jpg','',14,207,15,1,56,3500,6),(93,'Butter',5,'omegabutter.jpg','',32,70,8,0,80,3500,0),(94,'PeanutButter',5,'omegapeanutbutter.jpg','',30,100,11,15,85,3500,0),(95,'AlmondButter',5,'onceagainalmond.jpg','',15,190,17,0,0,3500,6),(96,'Oil',5,'bertolli.jpg','',102,120,14,0,0,0,0),(97,'Ricotta',5,'ricotta.jpg','',30,100,11,15,85,3500,0),(98,'AlmondButter',5,'Sam\'sAlmondButter.jpg','',11,190,16,0,60,65,7),(99,'Butter',5,'wildfriendsalmond.jpg','',1,190,17,0,90,3500,7),(100,'Oil',5,'canolaoil.jpg','',48,120,14,0,0,0,0),(101,'Potato Chips',6,'chips.png','',28,160,10,0,170,350,15),(102,'Crackers',6,'crackers.png','',33,90,5,0,130,0,9),(103,'Cookies',6,'cookie.jpg','',30,130,5,0,65,0,20),(104,'Popcorn',6,'popcorn.jpg','',39,130,2,0,190,230,27),(105,'Coke',6,'coke.jpg','',35,140,0,0,45,0,39),(106,'Cheerios',6,'cheerios.png','',30,120,2,0,270,170,20),(107,'Ketchup',6,'ketchup.jpg','',15,25,0,0,200,0,6),(108,'Chicken Soup',6,'chickenSoup.jpg','',18.9,70,1,15,750,0,10),(109,'Bread',6,'bread.jpg','',40,100,1,0,180,0,20),(110,'Tortilla',6,'tortilla.jpg','',49,140,3.5,0,420,0,24),(111,'Cheetos',6,'hotCheetos.png','',28,160,11,0,250,0,13),(112,'Pizza',6,'pizza.png','',175,410,19,35,660,0,48),(113,'Margarine',6,'margarine.jpg','',85,250,11,5,350,0,33),(114,'French Fry',6,'frenchFry.jpg','',114,350,18,0,220,0,45),(115,'Ice Cream',6,'iceCream.jpg','',65,150,9,80,45,0,15),(116,'Candy Bar',6,'candyBar.jpg','',78,320,17,15,220,0,40),(117,'Cheese',6,'cheese.jpg','',28.35,100,10,30,230,0,0),(118,'Soy Sauce',6,'soySauce.jpg','',6,15,0,0,125,0,3),(119,'Cake',6,'poundCake.jpg','',65,230,10,55,135,0,34),(120,'Bacon',6,'bacon.png','',32,170,17,25,220,0,0);
/*!40000 ALTER TABLE `foods` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-12-04 21:51:13
