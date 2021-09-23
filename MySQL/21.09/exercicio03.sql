CREATE DATABASE db_farmacia_do_bem;
USE db_farmacia_do_bem;

CREATE TABLE tb_categoria(
	id BIGINT(4) AUTO_INCREMENT NOT NULL,
    categoria VARCHAR(20) NOT NULL,
    corredor VARCHAR(20) NOT NULL,    
    PRIMARY KEY(id)
);
INSERT INTO tb_categoria(categoria, corredor)
VALUES("Corpo", "Corredor A"),
("Cabelo","Corredor B"),
("Higiene Pessoal","Corredor C"),
("Rosto","Corredor D"),
("Bomboniere","Corredor E");

CREATE TABLE tb_produto(
	id BIGINT(4) AUTO_INCREMENT NOT NULL,
    nome VARCHAR(20) NOT NULL,
    marca VARCHAR(20) NOT NULL,
    quantidade INT NOT NULL,
    categoria_id BIGINT(4) NOT NULL,
    preco FLOAT NOT NULL,
    FOREIGN KEY(categoria_id) REFERENCES tb_categoria(id),
    PRIMARY KEY(id)
);

INSERT INTO tb_produto(nome,marca,quantidade,preco,categoria_id)
VALUES("Batom", "Davene", 2, 15.50, 4),
("Creme Corporal", "Nivea", 4, 8.00, 1),
("Absorvente", "Always", 2, 8.50, 3),
("Maquiagem", "Davene", 1, 11.50, 4),
("Chiclete","7Bello", 10, 5.40, 5),
("Shampoo","Saloon Line", 1, 70.99, 2),
("Condicionador","Saloon Line", 1, 60.99, 2),
("Creme Pentear","Saloon Line", 1, 50.99, 2);

SELECT * FROM tb_produto WHERE preco > 50;
SELECT * FROM tb_produto WHERE preco BETWEEN 3 AND  60;
SELECT * FROM tb_produto WHERE nome LIKE '%B%';

SELECT tb_produto.nome, tb_produto.marca, tb_produto.quantidade, tb_categoria.categoria, tb_categoria.corredor
FROM tb_produto INNER JOIN tb_categoria ON tb_categoria.id = tb_produto.categoria_id;

SELECT tb_produto.nome, tb_produto.marca, tb_produto.quantidade, tb_categoria.categoria, tb_categoria.corredor
FROM tb_produto INNER JOIN tb_categoria ON tb_categoria.id = tb_produto.categoria_id WHERE tb_categoria.categoria = "Cabelo";


