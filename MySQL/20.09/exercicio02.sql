USE generation;

CREATE TABLE loja(
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(20) NOT NULL,
    categoria VARCHAR(20) NOT NULL,
    estoque INT NOT NULL
);
INSERT INTO loja(nome, categoria, estoque, preco)
VALUES("Camisa Polo", "Vestuário", 15, 400),
("Calça Jeans", "Vestuário", 13, 515),
("Tenis Vibe Roots", "Calçados", 20, 700),
("Chinelo Pulma", "Calçados", 14, 300),
("Blusa Manga Longa","Vestuário ", 10, 600),
("Camiseta Regata", "Vestuário", 21, 300),
("Shorts Maculino", "Vestuário", 12, 200),
("Sunga G", "Praia", 15, 120);

SELECT * FROM loja WHERE preco < 500;
SELECT * FROM loja WHERE preco > 500;

UPDATE loja SET nome = "Meia cano alto", categoria="Vestuário", estoque = 11, preco=50 where id = 2;





#alter table loja add preco decimal(10,2);