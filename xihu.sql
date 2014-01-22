DELIMITER $$

DROP DATABASE IF EXISTS `xihu`$$
CREATE DATABASE `xihu` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin$$
USE xihu$$

CREATE TABLE `xihu`.`t_user`
(
	`userid` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	`username` VARCHAR(30) NULL,
	`password` VARCHAR(32) NULL,
	`lastlogdate` DATETIME NULL,
	`lastlogip` VARCHAR(23) NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin$$

CREATE TABLE `xihu`.`t_loginlog`
(
	`loginid` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	`userid` INT NOT NULL,
	`logdate` DATETIME NULL,
	`logip` VARCHAR(23) NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin$$

INSERT INTO `xihu`.`t_user` (`username`, `password`) VALUES ('wyg', '1')$$
INSERT INTO `xihu`.`t_user` (`username`, `password`) VALUES ('jyw', '1')$$


