CREATE DATABASE  IF NOT EXISTS `loja_filmes` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `loja_filmes`;
-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: loja_filmes
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `filmes`
--

DROP TABLE IF EXISTS `filmes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `filmes` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) DEFAULT NULL,
  `descricao` varchar(250) DEFAULT NULL,
  `ano` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `filmes`
--

LOCK TABLES `filmes` WRITE;
/*!40000 ALTER TABLE `filmes` DISABLE KEYS */;
INSERT INTO `filmes` VALUES (1,'Pânico','Terror, grupo de jovens recebem ligações e morrem',1996),(2,'Pânico 2','Terror,continuação do sucesso Pânico 1',1997),(3,'Pânico 3','Terror,fim da trilogia ',2000),(4,'Pânico 4','Terror, O terror retorna para a pacata cidade de woodsburo',2011),(5,'Missão impossivel','Ação, Mistérios precisam ser resolvidos após uma missão ter falhado ',1996),(6,'Missão impossivel 2','Ação, Ethan Hunt retorna para liderar sua equipe em uma missão que pretende capturar um vírus mortal ',2000),(7,'Missão impossivel 3','Ação, Aposentado do serviço ativo e treinando recrutas para a Força Missão Impossível, ',2006),(8,'Missão Impossível - Protocolo Fantasma','Ação, Quando a IMF é fechada depois de ser envolvida em um plano terrorista internacional, o agente Ethan Hunt e sua equipe tentam limpar o nome da organização. ',2011),(9,'Missão Impossível: Nação Secreta','Ação, O agente do IMF Ethan Hunt e sua equipe enfrentam uma das missões mais difíceis: erradicar o Sindicato',2015),(10,'Missão: Impossível - Fallout','Ação, Em uma perigosa tarefa para recuperar plutônio roubado, Ethan Hunt opta por salvar sua equipe em vez de completar a missão. ',2018),(11,'Clube dos cinco','Comédia,Jovens precisam passar o dia de sabado na detenção do colégio',1985),(12,'American pie','Comédia,American Pie é uma franquia de filmes de comédia pastelão, concebidas por Adam Herz.',1999),(13,'American pie 2','Comédia,Depois de um ano separados - frequentando escolas diferentes e conhecendo pessoas diferentes - os rapazes alugam uma casa de praia e prometem que será o melhor verão de todos os tempos. ',2001),(14,'American pie 3 - o casamento','Comédia,jim pede a mão da sua namorada em casamento',2003),(15,'American pie Reencontro','Comédia, Após 10 anos os amigos se reencontram ',2012),(16,'Matrix','Ação, Um jovem programador é atormentado por estranhos pesadelos nos quais sempre está conectado por cabos a um imenso sistema de computadores do futuro. ',1999),(17,'Matrix Reloaded','Ação, As máquinas estão realizando uma grande ofensiva contra Zion ',2003),(18,'Matrix Revolutions','Ação, Após enfrentar os sentinelas no mundo real, Neo, a maior esperança da humanidade, está preso entre a Matrix e a realidade. ',2003),(19,'Matrix Ressurections','Ação, Quarto filme da franquia matrix',2021),(20,'Mal posso esperar','Comédia, O ano letivo chegou ao fim e todos se reúnem na casa de um aluno rico para uma festa de arromba.',1998);
/*!40000 ALTER TABLE `filmes` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-10-30 18:58:15
