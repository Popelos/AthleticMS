INSERT INTO `athleticms`.`team` (`sport`) VALUES ('Volleyball');
INSERT INTO `athleticms`.`team` (`sport`) VALUES ('Basketball');
INSERT INTO `athleticms`.`team` (`sport`) VALUES ('Soccer');

INSERT INTO `athleticms`.`stadium` (`location`) VALUES ('North');
INSERT INTO `athleticms`.`stadium` (`location`) VALUES ('East');
INSERT INTO `athleticms`.`stadium` (`location`) VALUES ('South');
INSERT INTO `athleticms`.`stadium` (`location`) VALUES ('West');

INSERT INTO `athleticms`.`athlete` (`name`, `age`, `height`, `weight`, `date_of_birth`, `tid`) VALUES ('Jack', '20', '1.73', '75.2', '2000-08-07', '1');
INSERT INTO `athleticms`.`athlete` (`name`, `age`, `height`, `weight`, `date_of_birth`, `tid`) VALUES ('Joe', '19', '1.88', '88.5', '2001-06-03', '1');
INSERT INTO `athleticms`.`athlete` (`name`, `age`, `height`, `weight`, `date_of_birth`, `tid`) VALUES ('Nick', '18', '1.79', '71.3', '2002-03-17', '1');
INSERT INTO `athleticms`.`athlete` (`name`, `age`, `height`, `weight`, `date_of_birth`, `tid`) VALUES ('John', '21', '1.75', '76.5', '1999-01-09', '2');
INSERT INTO `athleticms`.`athlete` (`name`, `age`, `height`, `weight`, `date_of_birth`, `tid`) VALUES ('Jim', '23', '1.90', '95.8', '1997-08-12', '2');
INSERT INTO `athleticms`.`athlete` (`name`, `age`, `height`, `weight`, `date_of_birth`, `tid`) VALUES ('George', '21', '1.81', '80.1', '1999-01-09', '2');
INSERT INTO `athleticms`.`athlete` (`name`, `age`, `height`, `weight`, `date_of_birth`, `tid`) VALUES ('Peter', '24', '1.73', '75.5', '1996-02-10', '3');
INSERT INTO `athleticms`.`athlete` (`name`, `age`, `height`, `weight`, `date_of_birth`, `tid`) VALUES ('Alex', '20', '1.77', '76.1', '2000-07-13', '3');
INSERT INTO `athleticms`.`athlete` (`name`, `age`, `height`, `weight`, `date_of_birth`, `tid`) VALUES ('Mat', '18', '1.83', '80.1', '2002-05-18', '3');

INSERT INTO `athleticms`.`coach` (`name`, `salary`, `start_date`, `tid`) VALUES ('Antony', '2500', '2000-10-15', '1');
INSERT INTO `athleticms`.`coach` (`name`, `salary`, `start_date`, `tid`) VALUES ('Ian', '1900', '2012-07-12', '2');
INSERT INTO `athleticms`.`coach` (`name`, `salary`, `start_date`, `tid`) VALUES ('Carlos', '1300', '2018-08-05', '3');

INSERT INTO `athleticms`.`games` (`tid`, `sid`, `game_date`, `result`) VALUES ('1', '1', '2020-05-15', 'won');
INSERT INTO `athleticms`.`games` (`tid`, `sid`, `game_date`, `result`) VALUES ('1', '2', '2020-06-18', 'lost');
INSERT INTO `athleticms`.`games` (`tid`, `sid`, `game_date`, `result`) VALUES ('2', '3', '2020-07-02', 'lost');
INSERT INTO `athleticms`.`games` (`tid`, `sid`, `game_date`, `result`) VALUES ('2', '3', '2020-06-18', 'won');
INSERT INTO `athleticms`.`games` (`tid`, `sid`, `game_date`, `result`) VALUES ('3', '4', '2020-01-05', 'draw');
INSERT INTO `athleticms`.`games` (`tid`, `sid`, `game_date`, `result`) VALUES ('3', '4', '2020-05-18', 'won');

INSERT INTO `athleticms`.`performances` (`gid`, `aid`, `performance`) VALUES ('1', '1', '60');
INSERT INTO `athleticms`.`performances` (`gid`, `aid`, `performance`) VALUES ('2', '1', '72');
INSERT INTO `athleticms`.`performances` (`gid`, `aid`, `performance`) VALUES ('1', '2', '32');
INSERT INTO `athleticms`.`performances` (`gid`, `aid`, `performance`) VALUES ('2', '2', '85');
INSERT INTO `athleticms`.`performances` (`gid`, `aid`, `performance`) VALUES ('1', '3', '90');
INSERT INTO `athleticms`.`performances` (`gid`, `aid`, `performance`) VALUES ('2', '3', '67');
INSERT INTO `athleticms`.`performances` (`gid`, `aid`, `performance`) VALUES ('3', '4', '55');
INSERT INTO `athleticms`.`performances` (`gid`, `aid`, `performance`) VALUES ('4', '4', '69');
INSERT INTO `athleticms`.`performances` (`gid`, `aid`, `performance`) VALUES ('3', '5', '88');
INSERT INTO `athleticms`.`performances` (`gid`, `aid`, `performance`) VALUES ('4', '5', '35');
INSERT INTO `athleticms`.`performances` (`gid`, `aid`, `performance`) VALUES ('3', '6', '89');
INSERT INTO `athleticms`.`performances` (`gid`, `aid`, `performance`) VALUES ('4', '6', '77');
INSERT INTO `athleticms`.`performances` (`gid`, `aid`, `performance`) VALUES ('5', '7', '63');
INSERT INTO `athleticms`.`performances` (`gid`, `aid`, `performance`) VALUES ('6', '7', '28');
INSERT INTO `athleticms`.`performances` (`gid`, `aid`, `performance`) VALUES ('5', '8', '19');
INSERT INTO `athleticms`.`performances` (`gid`, `aid`, `performance`) VALUES ('6', '8', '86');
INSERT INTO `athleticms`.`performances` (`gid`, `aid`, `performance`) VALUES ('5', '9', '62');
INSERT INTO `athleticms`.`performances` (`gid`, `aid`, `performance`) VALUES ('6', '9', '90');

INSERT INTO `athleticms`.`trainings` (`aid`, `sid`, `taining_date`, `attended`) VALUES ('1', '1', '2020-01-15', '1');
INSERT INTO `athleticms`.`trainings` (`aid`, `sid`, `taining_date`, `attended`) VALUES ('1', '2', '2020-02-03', '1');
INSERT INTO `athleticms`.`trainings` (`aid`, `sid`, `taining_date`, `attended`) VALUES ('2', '1', '2020-01-15', '1');
INSERT INTO `athleticms`.`trainings` (`aid`, `sid`, `taining_date`, `attended`) VALUES ('2', '2', '2020-02-03', '0');
INSERT INTO `athleticms`.`trainings` (`aid`, `sid`, `taining_date`, `attended`) VALUES ('3', '1', '2020-01-15', '0');
INSERT INTO `athleticms`.`trainings` (`aid`, `sid`, `taining_date`, `attended`) VALUES ('3', '2', '2020-02-03', '1');
INSERT INTO `athleticms`.`trainings` (`aid`, `sid`, `taining_date`, `attended`) VALUES ('4', '3', '2020-01-19', '1');
INSERT INTO `athleticms`.`trainings` (`aid`, `sid`, `taining_date`, `attended`) VALUES ('4', '3', '2020-02-20', '1');
INSERT INTO `athleticms`.`trainings` (`aid`, `sid`, `taining_date`, `attended`) VALUES ('5', '3', '2020-01-19', '0');
INSERT INTO `athleticms`.`trainings` (`aid`, `sid`, `taining_date`, `attended`) VALUES ('5', '3', '2020-02-20', '0');
INSERT INTO `athleticms`.`trainings` (`aid`, `sid`, `taining_date`, `attended`) VALUES ('6', '3', '2020-01-19', '1');
INSERT INTO `athleticms`.`trainings` (`aid`, `sid`, `taining_date`, `attended`) VALUES ('6', '3', '2020-02-20', '0');
INSERT INTO `athleticms`.`trainings` (`aid`, `sid`, `taining_date`, `attended`) VALUES ('7', '4', '2020-01-05', '1');
INSERT INTO `athleticms`.`trainings` (`aid`, `sid`, `taining_date`, `attended`) VALUES ('7', '4', '2020-02-06', '0');
INSERT INTO `athleticms`.`trainings` (`aid`, `sid`, `taining_date`, `attended`) VALUES ('8', '4', '2020-01-05', '1');
INSERT INTO `athleticms`.`trainings` (`aid`, `sid`, `taining_date`, `attended`) VALUES ('8', '4', '2020-02-06', '1');
INSERT INTO `athleticms`.`trainings` (`aid`, `sid`, `taining_date`, `attended`) VALUES ('9', '4', '2020-01-05', '0');
INSERT INTO `athleticms`.`trainings` (`aid`, `sid`, `taining_date`, `attended`) VALUES ('9', '4', '2020-02-06', '1');

