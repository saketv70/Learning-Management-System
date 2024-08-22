CREATE TABLE IF NOT EXISTS `Employee` (
    employee_id INT AUTO_INCREMENT PRIMARY KEY,
    employee_name VARCHAR(40) NOT NULL,
    email VARCHAR(40) NOT NULL,
    role VARCHAR(10),
    created_at DATE NOT NULL,
    created_by VARCHAR(30) NOT NULL,
    updated_at DATE DEFAULT NULL,
    updated_by VARCHAR(30) DEFAULT NULL
);

CREATE TABLE IF NOT EXISTS `JoinerMentorConnection` (
    connection_id INT AUTO_INCREMENT PRIMARY KEY,
    joiner_id INT NOT NULL,
    mentor_id INT NOT NULL
);
