CREATE TABLE IF NOT EXISTS `query` (
    `query_id` INT AUTO_INCREMENT PRIMARY KEY,
    `description` VARCHAR(30) NOT NULL,
    `response` VARCHAR(30) NOT NULL,
    `joiner_id` INT NOT NULL,
    `mentor_id` INT NOT NULL
);
