CREATE TABLE IF NOT EXISTS `Course` (
    `course_id` INT AUTO_INCREMENT PRIMARY KEY,
    `title` VARCHAR(30) NOT NULL,
    `duration` VARCHAR(30) NOT NULL,
    `uploaded_by` INT NOT NULL,
    `category` VARCHAR(10) NOT NULL,
    `is_approved` BIT NOT NULL
);

CREATE TABLE IF NOT EXISTS `joinerXcourse` (
    `id` INT AUTO_INCREMENT PRIMARY KEY
    `joiner_id` INT NOT NULL,
    `course_id` INT NOT NULL,
    `is_completed` BIT NOT NULL DEFAULT FALSE
);