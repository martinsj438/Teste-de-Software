/* Arquivo SQL */

CREATE DATABASE IF NOT EXISTS newspaper;

USE newspaper;

CREATE TABLE IF NOT EXISTS 	usuarios(
	id_usuario INT AUTO_INCREMENT PRIMARY KEY,
	nome VARCHAR(40) NOT NULL,
	email VARCHAR(40) NOT NULL,
	usuario VARCHAR(40) NOT NULL,
	senha VARCHAR(40) NOT NULL
);

CREATE TABLE IF NOT EXISTS 	logado(
	id_logado INT AUTO_INCREMENT PRIMARY KEY,
	estado BOOLEAN NOT NULL,
	id_usu INT NOT NULL,
	FOREIGN KEY (id_usu) REFERENCES usuarios(id_usuario)
);

INSERT INTO usuarios(nome,email,usuario,senha) VALUES
	("administrador geral","adm@mail.com","admin","admin"),
	("professor","prof@mail.com","prof","1234"),
	("aluno","aluno@mail.com","aluno","1234");
	

SELET * FROM usuario;
	
SELET * FROM usuario WHERE id=1;

UPDATE usuario SET nome="alunos" WHERE id=3;

DELET * FROM usuario WHERE id=2;

DROP TABLE usuario;

SHOW DATABASES;

SHOW TABLES;
