CREATE TABLE student(
                        nic VARCHAR(15) PRIMARY KEY,
                        name VARCHAR(20) NOT NULL,
                        address VARCHAR(200) NOT NULL
);

CREATE TABLE student_contact (
                                 student_nic VARCHAR(15),
                                 contact VARCHAR(15) PRIMARY KEY,
                                 FOREIGN KEY (student_nic) REFERENCES student(nic)
);

CREATE TABLE user (
                      username VARCHAR(300) PRIMARY KEY,
                      name VARCHAR(300) NOT NULL,
                      password VARCHAR(50) NOT NULL
);

CREATE TABLE course (
                        code VARCHAR(50) PRIMARY KEY,
                        name VARCHAR(300) NOT NULL
);

CREATE TABLE batch (
                       batch_id VARCHAR(100) PRIMARY KEY,
                       course_code VARCHAR(100),
                       duration VARCHAR(50),
                       fee DECIMAL(10, 2),
                       FOREIGN KEY (course_code) REFERENCES course(code)
);

CREATE TABLE module (
                        code VARCHAR(100) PRIMARY KEY,
                        type VARCHAR(100) NOT NULL,
                        credits INT NOT NULL,
                        name VARCHAR(100) NOT NULL
);

CREATE TABLE course_details (
                                course_code VARCHAR(100),
                                module_code VARCHAR(100),
                                PRIMARY KEY (course_code, module_code),
                                FOREIGN KEY (course_code) REFERENCES course(code),
                                FOREIGN KEY (module_code) REFERENCES module(code)
);

CREATE TABLE registration (
                              student_nic VARCHAR(15),
                              username VARCHAR(100),
                              batch_id VARCHAR(100),
                              date DATE,
                              PRIMARY KEY (student_nic, username, batch_id),
                              FOREIGN KEY (student_nic) REFERENCES student(nic),
                              FOREIGN KEY (username) REFERENCES user(username),
                              FOREIGN KEY (batch_id) REFERENCES batch(batch_id)
);

CREATE TABLE take (
                      batch_id VARCHAR(100),
                      student_id VARCHAR(15),
                      module_code VARCHAR(100),
                      PRIMARY KEY (batch_id, student_id, module_code),
                      FOREIGN KEY (batch_id) REFERENCES batch(batch_id),
                      FOREIGN KEY (student_id) REFERENCES student(nic),
                      FOREIGN KEY (module_code) REFERENCES module(code)
);
