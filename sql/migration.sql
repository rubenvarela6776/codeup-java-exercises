CREATE DATABASE IF NOT EXISTS tables_example;
USE tables_example;

CREATE TABLE `employees` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(300) NOT NULL,
  `address` varchar(256) DEFAULT NULL,
  `age` int(11) DEFAULT '18',
  `job_description` text,
  `birthday` date NOT NULL,
  `salary_in_cents` int(10) unsigned NOT NULL,
  `ssn` char(9) NOT NULL,
  `created_at` datetime NOT NULL,
  `is_full_time` tinyint(1) DEFAULT '1',
  PRIMARY KEY (`id`)
)
  ENGINE=InnoDB
  DEFAULT CHARSET=utf8;