CREATE DATABASE db_pizzaria_legal;

USE db_pizzaria_legal;

CREATE TABLE tb_categoria(
	id BIGINT(4) AUTO_INCREMENT NOT NULL,
    categoria VARCHAR(20) NOT NULL,
    classificacao INT NOT NULL,
    disponivel BOOLEAN NOT NULL,
    PRIMARY KEY(id)
);
INSERT INTO tb_categoria(categoria, classificacao, disponivel)
VALUES ("Salgada",9 , TRUE),
("Doce", 7, TRUE),
("Vegana Doce", 10, TRUE),
("Vegana Salgada", 10, TRUE),
("Gourmet", 8, FALSE);

CREATE TABLE tb_pizza(
	id BIGINT(4) AUTO_INCREMENT NOT NULL,
    nome VARCHAR(20) NOT NULL,
    tamanho VARCHAR(20) NOT NULL,
    adicional VARCHAR(50) NOT NULL,    
    quantidade INT NOT NULL,
    preco FLOAT NOT NULL,
    PRIMARY KEY(id),
    categoria_id BIGINT(4) NOT NULL,
    FOREIGN KEY (categoria_id) REFERENCES tb_categoria(id) 
);

INSERT INTO tb_pizza(nome, tamanho, adicional, quantidade, preco, categoria_id)
VALUES("Calabresa", "Grande", "", 1, 39.90, 1),
("Mussarela", "Pequena", "Borda sem recheio", 2, 39.90,1),
("Chocolate e Morango","Pequena", "",1, 49.90, 2),
("Chocolate e Morango","Grande", "", 2, 89.90, 3),
("Calabresa", "Grande", "Sem cebola", 1, 69.90, 4),
("Marguerita", "Pequena", "", 1, 79.90, 5),
("mussarela", "Grande", "Borda sem recheio", 1, 59.90, 4),
("Chocolate com banana", "Pequena", "", 1, 39.90,3);

SELECT * FROM tb_pizza WHERE preco > 45;
SELECT * FROM tb_pizza WHERE preco BETWEEN 29 AND 60;
SELECT * FROM tb_pizza WHERE nome LIKE '%C%';

SELECT tb_pizza.nome, tb_pizza.tamanho, tb_pizza.adicional, tb_categoria.categoria
FROM tb_pizza INNER JOIN tb_categoria ON tb_categoria.id = tb_pizza.categoria_id;

SELECT tb_pizza.nome, tb_pizza.tamanho, tb_pizza.adicional, tb_categoria.categoria
FROM tb_pizza INNER JOIN tb_categoria ON tb_categoria.id = tb_pizza.categoria_id WHERE tb_categoria.categoria="Vegana Salgada";

