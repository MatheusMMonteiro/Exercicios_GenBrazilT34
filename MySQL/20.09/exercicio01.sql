use generation;
create table funcionario (
	id bigint auto_increment primary key,
    funcionario varchar(30) not null,
    funcao varchar(20) not null,
    salario decimal(4) not null
);
insert into funcionario(funcionario, funcao, salario)
values("Matheus Monteiro", "DEV", 4000),
("Evelyn Arruda", "Back End Java", 4000),
("Rafaela Silva", "Front End Java", 4000),
("Gabriel Silva", "DEvOps", 1900),
("Julio Almeida", "Estagiário", 1400);

select * from funcionario where salario > 2000;
select * from funcionario where salario < 2000;

update funcionario set funcionario = "Paulo Lopes", funcao = "Analista", salario = 6000 where id = 3;

