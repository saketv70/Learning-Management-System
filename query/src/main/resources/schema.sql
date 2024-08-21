CREATE TABLE IF NOT EXISTS `query` (
    `query_id` INT AUTO_INCREMENT PRIMARY KEY,
    `joiner_id` INT NOT NULL,
    `mentor_id` INT NOT NULL,
    `description` VARCHAR(30) NOT NULL,
    `is_resolved` BIT NOT NULL,
    `response` VARCHAR(30) NOT NULL
);
