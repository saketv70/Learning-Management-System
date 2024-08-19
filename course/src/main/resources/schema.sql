CREATE TABLE IF NOT EXISTS `course` (
    `course_id` INT AUTO_INCREMENT PRIMARY KEY,
    `title` VARCHAR(30) NOT NULL,
    `duration` VARCHAR(30) NOT NULL,
    `uploaded_by` INT NOT NULL,
    `category` VARCHAR(10) NOT NULL,
    `is_approved` BIT NOT NULL
);