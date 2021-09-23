CREATE DATABASE db_cursoDaMinhaVida;

USE db_cursoDaMinhaVida;

CREATE TABLE tb_categoria(
	id BIGINT AUTO_INCREMENT NOT NULL,
    categoria VARCHAR(20) NOT NULL,
    periodo VARCHAR(20) NOT NULL,
    ativo BOOLEAN NOT NULL,
    PRIMARY KEY(id)
);

INSERT INTO tb_categoria(categoria, periodo, ativo)
	VALUES("TI e Software", "Noturno", TRUE),
	("Design","Manhã", TRUE),
	("Informática","Tarde", TRUE),
	("Administração","Manhã", TRUE),
	("Negócios","Noite", FALSE);
    
CREATE TABLE tb_produto(
	id BIGINT AUTO_INCREMENT NOT NULL,
    nome VARCHAR(50) NOT NULL,
    cargaHoraria INT NOT NULL,
    preco FLOAT NOT NULL,
    instrutor VARCHAR(50) NOT NULL,
    PRIMARY KEY(id),
    categoria_id BIGINT NOT NULL,
    FOREIGN KEY (categoria_id) REFERENCES tb_categoria(id)
);

INSERT INTO tb_produto(nome, cargaHoraria, preco, instrutor, categoria_id)
	VALUES("Java", 190, 12.90, "Tiago", 1),
	("Python", 40, 5, "Tiago", 1),
	("Design Gráfico", 60, 15, "Gabriela",2),
	("Manutenção de Hardware", 110, 54.50, "Gabriel", 3),
	("Gestão de Tempo" , 40, 3.50, "Matheus", 4),
	("Liderança", 30, 4.80, "Matheus", 4),
	("Empreedodorismo", 29, 54.90, "Bruno", 5),
	("Comunicação", 25, 51.20, "Julia", 5);
    
SELECT * FROM tb_produto WHERE preco > 50;
SELECT * FROM tb_produto WHERE preco BETWEEN 3 AND 60;
SELECT * FROM tb_produto WHERE nome LIKE '%C%';

SELECT tb_produto.nome, tb_produto.preco, tb_produto.cargaHoraria, tb_categoria.categoria, tb_categoria.periodo
FROM tb_produto RIGHT JOIN tb_categoria ON tb_categoria.id = tb_produto.categoria_id;

SELECT tb_produto.nome, tb_produto.preco, tb_produto.cargaHoraria, tb_categoria.categoria, tb_categoria.periodo
FROM tb_produto RIGHT JOIN tb_categoria ON tb_categoria.id = tb_produto.categoria_id WHERE tb_categoria.categoria = "Administração";