CREATE TABLE tb_user
(
    id         UUID         NOT NULL,
    first_name VARCHAR(255) NOT NULL,
    last_name  VARCHAR(255) NOT NULL,
    email      VARCHAR(255),
    CONSTRAINT pk_tb_user PRIMARY KEY (id)
);