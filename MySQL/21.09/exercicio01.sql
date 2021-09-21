CREATE DATABASE db_generation_game_online;
USE db_generation_game_online;

CREATE TABLE tb_classe(
	id BIGINT(10) AUTO_INCREMENT NOT NULL,
    classe VARCHAR(20) NOT NULL,    
    regiao VARCHAR(5) NOT NULL,
    ativo BOOLEAN NOT NULL,
    PRIMARY KEY (id)
);
INSERT INTO tb_classe(classe,regiao,ativo)
	VALUES("Arqueiro", "Sul", TRUE),
	("Mago", "Norte", TRUE),
	("Guerreiro", "Leste", TRUE),
	("Caçador", "Oeste", TRUE),
	("Lampeão","Norte", TRUE);

CREATE TABLE tb_personagem (
	id BIGINT(10) AUTO_INCREMENT NOT NULL,
    nome VARCHAR(20) NOT NULL,
    grupo VARCHAR(20) NOT NULL,
    ataque INT NOT NULL,
    defesa INT NOT NULL,
    nivel INT NOT NULL,
    PRIMARY KEY(id),
    classe_id BIGINT(4) NOT NULL,
    FOREIGN KEY (classe_id) REFERENCES tb_classe(id)
);

INSERT INTO tb_personagem(nome,grupo,ataque,defesa,nivel,classe_id)
VALUES("Math","Scoolters",2000, 4000, 12, 1),
("Rafa", "Tgider", 5000, 1500, 18,2),
("Evy", "Butchers", 6000, 1200, 20, 3),
("Leo", "Cruds", 3000, 4000, 15, 4),
("Let", "Scroncks", 5000, 2000, 17, 5),
("Vini", "Treghtys", 7000, 4000, 21, 2),
("Gen", "Gener", 2000, 3000, 11, 4),
("Rack", "Ration", 4000, 1600, 15, 1);

SELECT * FROM tb_personagem WHERE ataque > 2000;
SELECT * FROM tb_personagem WHERE defesa > 1000 AND defesa < 2000;

SELECT * FROM tb_personagem WHERE tb_personagem.nome LIKE "%C%";

SELECT tb_personagem.nome, tb_personagem.grupo, tb_personagem.ataque, tb_personagem.defesa, tb_personagem.nivel,
tb_classe.classe, tb_classe.regiao FROM tb_personagem
INNER JOIN tb_classe ON tb_classe.id = tb_personagem.classe_id;	

SELECT * FROM tb_personagem WHERE classe_id = 1;
