USE generation;

CREATE TABLE alunos(
	id 	BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(20),
    turma varchar(2),
    periodo VARCHAR(10),
    nota INT
);
INSERT INTO alunos (nome, turma, periodo, nota)
VALUES ("Matheus Monteiro","3B", "Manhã", 8 ),
("Julia Marie", "5A", "Tarde", 5),
("João Victor", "8C", "Manhã", 9),
("Marcos Vinicios", "6B", "Tarde", 6),
("Evelyn Arruda", "3A", "Noite", 9),
("Kauana", "3B", "Noite", 10),
("Rafaela", "2D", "Noite", 7),
("Larissa Silva", "8A", "Tarde", 9);

SELECT * FROM alunos where nota > 7;
SELECT * FROM alunos where nota < 7;

UPDATE alunos SET nome = "Julio", turma = "2A", periodo = "Manhã", nota = 5 where id =2;




