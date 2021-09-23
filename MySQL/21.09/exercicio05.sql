CREATE DATABASE db_construindo_a_nossa_vida;

USE db_construindo_a_nossa_vida;

CREATE TABLE tb_categoria(
	id BIGINT AUTO_INCREMENT NOT NULL,
    categoria VARCHAR(20) NOT NULL,
    corredor VARCHAR(20) NOT NULL,
    ativo BOOLEAN NOT NULL,
    PRIMARY KEY(id)
);

INSERT INTO tb_categoria(categoria, corredor, ativo)
	VALUES("Ferramentas", "Corredor 1", TRUE),
	("Pisos","Corredor 2", TRUE),
	("Fios","Corredor 3", TRUE),
	("Elétrica","Corredor 4", TRUE),
	("Outros","Corredor 5", FALSE);
    
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
	VALUES("Chave de Fenda", 3, 9.50, 19, 1),
	("Chave Phillips", 2, 5.30, 11, 1),
	("Piso Laminado", 6, 3.90, 200,2),
	("Fio de Cobre", 11, 4.90, 100, 3),
	("Medidor Elétrico" , 4, 3.50, 20, 4),
	("Lampada", 4, 4.80, 17, 4),
	("Parafuso", 29, 54.90,40,5),
	("Prego", 25, 51.20, 20, 5);
    
SELECT * FROM tb_produto WHERE preco > 50;
SELECT * FROM tb_produto WHERE preco BETWEEN 3 AND 60;
SELECT * FROM tb_produto WHERE nome LIKE '%C%';

SELECT tb_produto.nome, tb_produto.quantidade, tb_produto.preco, tb_categoria.categoria, tb_categoria.corredor
FROM tb_produto RIGHT JOIN tb_categoria ON tb_categoria.id = tb_produto.categoria_id;

SELECT tb_produto.nome, tb_produto.quantidade, tb_produto.preco, tb_categoria.categoria, tb_categoria.corredor
FROM tb_produto RIGHT JOIN tb_categoria ON tb_categoria.id = tb_produto.categoria_id WHERE tb_categoria.categoria = "Eletrica";
    