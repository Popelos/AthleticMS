CREATE DATABASE IF NOT EXISTS athleticms;
use athleticms;

CREATE TABLE IF NOT EXISTS `team`(
`id`	INT UNSIGNED NOT NULL AUTO_INCREMENT,
`sport` ENUM('Volleyball','Basketball','Soccer'),

PRIMARY KEY  (`id`)
);

CREATE TABLE IF NOT EXISTS `stadium`(
`id`	   INT UNSIGNED NOT NULL AUTO_INCREMENT,
`location` ENUM('North','East','South','West'),

PRIMARY KEY  (`id`)
);

CREATE TABLE IF NOT EXISTS `athlete`(
 `id`            INT UNSIGNED NOT NULL AUTO_INCREMENT,
 `name`    		 VARCHAR(45)  NOT NULL,
 `age`           INT UNSIGNED NOT NULL,
 `height`        DECIMAL(3,2) NOT NULL,
 `weight`        DECIMAL(4,1) NOT NULL,
 `date_of_birth` DATE NOT NULL,
 `tid`           INT UNSIGNED,
 
 PRIMARY KEY (`id`),
 CONSTRAINT `FK_athlete_tid_team_id` FOREIGN KEY (`tid`) REFERENCES `team` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE IF NOT EXISTS `coach`(
`id`         INT UNSIGNED NOT NULL AUTO_INCREMENT,
`name`       VARCHAR(45)  NOT NULL,
`salary`     DECIMAL(7,2) NOT NULL,
`start_date` DATE NOT NULL,
`tid`        INT UNSIGNED NOT NULL,

PRIMARY KEY  (`id`),
CONSTRAINT `FK_coach_tid_team_id` FOREIGN KEY (`tid`) REFERENCES `team`(`id`) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE IF NOT EXISTS `games`(
`id`	    INT UNSIGNED NOT NULL AUTO_INCREMENT,
`tid`	    INT UNSIGNED NOT NULL,
`sid`       INT UNSIGNED NOT NULL,
`game_date` DATE NOT NULL,
`result`    ENUM('won','lost','draw'),

PRIMARY KEY  (`id`),
CONSTRAINT `FK_games_tid_team_id`    FOREIGN KEY (`tid`) REFERENCES `team`    (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT `FK_games_sid_stadium_id` FOREIGN KEY (`sid`) REFERENCES `stadium` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE IF NOT EXISTS `trainings`(
`id`	       INT UNSIGNED NOT NULL AUTO_INCREMENT,
`aid`		   INT UNSIGNED NOT NULL,
`sid`		   INT UNSIGNED NOT NULL,
`training_date` DATE NOT NULL,
`attended`	   BOOLEAN NOT NULL, 	

PRIMARY KEY  (`id`),
CONSTRAINT `FK_trainings_sid_stadium_id` FOREIGN KEY (`sid`) REFERENCES `stadium` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT `FK_trainings_aid_athlete_id` FOREIGN KEY (`aid`) REFERENCES `athlete` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE IF NOT EXISTS `performances`(
`id`	       INT UNSIGNED NOT NULL AUTO_INCREMENT,
`gid`		   INT UNSIGNED NOT NULL,
`aid`		   INT UNSIGNED NOT NULL,
`performance`  INT UNSIGNED NOT NULL, 		
		
PRIMARY KEY  (`id`),
CONSTRAINT `FK_performances_aid_athlete_id` FOREIGN KEY (`aid`) REFERENCES `athlete` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT `FK_performances_gid_game_id`    FOREIGN KEY (`gid`) REFERENCES `games`   (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT `performance_check` CHECK (`performance`<=100)
);