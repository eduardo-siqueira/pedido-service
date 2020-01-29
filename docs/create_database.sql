-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema eicon
-- -----------------------------------------------------

create database eicon;
create user 'easuser'@'%' identified by '100100a';
grant all on eicon.* to 'easuser'@'%';

-- -----------------------------------------------------
-- Schema eicon
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `eicon` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `eicon` ;

-- -----------------------------------------------------
-- Table `eicon`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `eicon`.`cliente` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `data_inclusao` DATETIME(6) NOT NULL,
  `data_nascimento` DATETIME(6) NOT NULL,
  `nome` VARCHAR(40) NOT NULL,
  `sobrenome` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `eicon`.`status`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `eicon`.`status` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `descricao` VARCHAR(60) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `eicon`.`pedido`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `eicon`.`pedido` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `data_pedido` DATETIME(6) NOT NULL,
  `valor_total` DOUBLE NOT NULL,
  `cliente_id` INT NULL DEFAULT NULL,
  `status_id` INT NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `FK30s8j2ktpay6of18lbyqn3632` (`cliente_id` ASC) VISIBLE,
  INDEX `FKmaw3ohk6ya0dvhhbj9tu1qird` (`status_id` ASC) VISIBLE,
  CONSTRAINT `FK30s8j2ktpay6of18lbyqn3632`
    FOREIGN KEY (`cliente_id`)
    REFERENCES `eicon`.`cliente` (`id`),
  CONSTRAINT `FKmaw3ohk6ya0dvhhbj9tu1qird`
    FOREIGN KEY (`status_id`)
    REFERENCES `eicon`.`status` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `eicon`.`produto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `eicon`.`produto` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `ativo` INT NOT NULL,
  `descricao` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `eicon`.`pedido_item`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `eicon`.`pedido_item` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `quantidade` INT NOT NULL,
  `valor` DOUBLE NOT NULL,
  `pedido_id` INT NULL DEFAULT NULL,
  `produto_id` INT NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `FKeyouxfvoi291lpo5168e6wpej` (`pedido_id` ASC) VISIBLE,
  INDEX `FK8eyfr31j751fjws2y012awmpg` (`produto_id` ASC) VISIBLE,
  CONSTRAINT `FK8eyfr31j751fjws2y012awmpg`
    FOREIGN KEY (`produto_id`)
    REFERENCES `eicon`.`produto` (`id`),
  CONSTRAINT `FKeyouxfvoi291lpo5168e6wpej`
    FOREIGN KEY (`pedido_id`)
    REFERENCES `eicon`.`pedido` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
