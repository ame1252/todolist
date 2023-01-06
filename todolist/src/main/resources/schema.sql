CREATE TABLE IF NOT EXISTS todo_item (
     id bigint not null AUTO_INCREMENT PRIMARY KEY,
     title VARCHAR(50) NOT NULL,
     body VARCHAR(255),
     is_completed BOOLEAN NOT NULL DEFAULT FALSE,
     PRIMARY KEY (id)
);
