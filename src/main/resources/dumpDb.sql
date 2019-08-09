-- MySQL dump 10.13  Distrib 5.6.45, for Win64 (x86_64)
--
-- Host: localhost    Database: superebay
-- ------------------------------------------------------
-- Server version	5.6.45-log

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
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product` (
  `id_product` int(11) NOT NULL AUTO_INCREMENT,
  `product_name` varchar(100) NOT NULL,
  `category` varchar(100) NOT NULL,
  `amount` int(11) NOT NULL,
  `price` double NOT NULL,
  `descricao` varchar(200) NOT NULL,
  PRIMARY KEY (`id_product`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `login` (
  `id_login` int(11) NOT NULL AUTO_INCREMENT,
  `id_user` int(11) DEFAULT NULL,
  `data_login` datetime DEFAULT NULL,
  PRIMARY KEY (`id_login`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES (1,44234,NULL),(2,44234,'2019-07-24 17:19:09'),(3,4423,'2019-07-24 17:29:36'),(4,4423,'2019-07-24 17:32:44'),(5,4423,'2019-07-24 17:33:32'),(6,4422,'2019-07-24 17:34:24'),(7,7862,'2019-07-25 13:52:49');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-07-26 14:43:27


CREATE TABLE `client` (
  `id_client` int(11) NOT NULL AUTO_INCREMENT,
  `client_name` varchar(100) NOT NULL,
  `cpf` int(11) NOT NULL,
  `age` int(11) NOT NULL,
  `zip_code` varchar(20) NOT NULL,
  `street` varchar(120) NOT NULL,
  `number` int(11) NOT NULL,
  `district` varchar(110) NOT NULL,
  `city` varchar(110) NOT NULL,
  `country` varchar(100) NOT NULL,
  `state` varchar(100) NOT NULL,
  PRIMARY KEY (`id_client`)
) ENGINE=MEMORY DEFAULT CHARSET=latin1;


CREATE TABLE client (
  id_client int not null AUTO_INCREMENT PRIMARY KEY,
  client_name varchar(100) NOT NULL,
  cpf int NOT NULL,
  age int NOT NULL,
  zip_code varchar(20) NOT NULL,
  street varchar(120) NOT NULL,
  number int NOT NULL,
  district varchar(110) NOT NULL,
  city varchar(110) NOT NULL,
  country varchar(100) NOT NULL,
  state varchar(100) NOT NULL
);

CREATE table order_bay(
	order_id int not null AUTO_INCREMENT PRIMARY key, 
	id_product int not null, 
	id_client int not null,
	total_order double not null,
	state_order varchar(100));

ALTER TABLE superebay.order_bay ADD CONSTRAINT FK_CLIENT FOREIGN KEY (id_client) REFERENCES superebay.client(id_client) ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE superebay.order_bay ADD CONSTRAINT FK_PRODUCT FOREIGN KEY (id_product) REFERENCES superebay.product(id_product) ON DELETE CASCADE ON UPDATE CASCADE;

INSERT INTO client values(1,'Guilherme Alves', 0000000000, 23, '2234433', 'Rua do Bauru', 226, 'Virgina', 'Hoostford', 'Unite States', 'Ca');
INSERT INTO client values(2,'Maria Sila', 11111111, 24, '455565', 'Rua do Euro', 1122, 'Brasil', 'Uberlandia', 'Brasil', 'Mg');
INSERT INTO client values(4,'Maria Aparecida', 4444444, 24, '455565', 'Rua do Euro', 1122, 'Brasil', 'Uberlandia', 'Brasil', 'Mg');
INSERT INTO client values(5,'Maria Clara', 55555555, 24, '455565', 'Rua do Euro', 1122, 'Brasil', 'Uberlandia', 'Brasil', 'Mg');
INSERT INTO client values(6,'Suzana Alves', 6666666, 24, '455565', 'Rua do Euro', 1122, 'Brasil', 'Uberlandia', 'Brasil', 'Mg');
INSERT INTO client values(7,'Valeria Souza', 777777, 24, '455565', 'Rua do Euro', 1122, 'Brasil', 'Uberlandia', 'Brasil', 'Mg');
INSERT INTO client values(8,'Vilmar Rezende', 88888888, 24, '455565', 'Rua do Euro', 1122, 'Brasil', 'Uberlandia', 'Brasil', 'Mg');
INSERT INTO client values(9,'Carolina Moura', 99999, 24, '455565', 'Rua do Euro', 1122, 'Brasil', 'Uberlandia', 'Brasil', 'Mg');
INSERT INTO client values(10,'Manoel Minato', 010101010, 24, '455565', 'Rua do Euro', 1122, 'Brasil', 'Uberlandia', 'Brasil', 'Mg');
