CREATE DATABASE db_cidade_das_frutas;

USE db_cidade_das_frutas;

CREATE TABLE tb_categoria(
	id BIGINT AUTO_INCREMENT NOT NULL,
    categoria VARCHAR(20) NOT NULL,
    barraca VARCHAR(20) NOT NULL,
    ativo BOOLEAN NOT NULL,
    PRIMARY KEY(id)
);

INSERT INTO tb_categoria(categoria, barraca, ativo)
	VALUES("Banana", "Barraca 1", TRUE),
	("Laranja","Barraca 2", TRUE),
	("Limão","Barraca 3", TRUE),
	("Figo","Barraca 4", TRUE),
	("Maçã","Barraca 5", FALSE);

CREATE TABLE tb_produto(
	id BIGINT AUTO_INCREMENT NOT NULL,
    nome VARCHAR(20) NOT NULL,
    quantidade INT NOT NULL,
    preco FLOAT NOT NULL,
    estoque INT NOT NULL,
    PRIMARY KEY(id),
    categoria_id BIGINT NOT NULL,
    FOREIGN KEY (categoria_id) REFERENCES tb_categoria(id)
);

INSERT INTO tb_produto(nome, quantidade, preco, estoque, categoria_id)
	VALUES("Banana Prata", 3, 9.50, 19, 1),
	("Banana da terra", 2, 5.30, 11, 1),
	("Laranja Lima", 6, 3.90, 200,2),
	("Limão Siciliano", 11, 4.90, 100, 3),
	("Figo seco" , 4, 3.50, 20, 4),
	("Figo fresco", 4, 4.80, 17, 4),
	("Maçã Argentina", 29, 54.90,40,5),
	("Maça Fuggi", 25, 51.20, 20, 5);

SELECT * FROM tb_produto WHERE preco > 50;
SELECT * FROM tb_produto WHERE preco BETWEEN 3 AND 60;
SELECT * FROM tb_produto WHERE nome LIKE '%C%';

SELECT tb_produto.nome, tb_produto.quantidade, tb_produto.preco, tb_categoria.categoria, tb_categoria.barraca
FROM tb_produto RIGHT JOIN tb_categoria ON tb_categoria.id = tb_produto.categoria_id;

SELECT tb_produto.nome, tb_produto.quantidade, tb_produto.preco, tb_categoria.categoria, tb_categoria.barraca
FROM tb_produto RIGHT JOIN tb_categoria ON tb_categoria.id = tb_produto.categoria_id WHERE tb_categoria.categoria = "Banana";

