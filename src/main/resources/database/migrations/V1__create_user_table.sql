CREATE SCHEMA IF NOT EXISTS users;

CREATE TABLE user(
    id INTEGER PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    cpf VARCHAR(255) NOT NULL,
    endereco VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    telefone VARCHAR(255) NOT NULL,
    data_cadastro TIMESTAMP NOT NULL
);