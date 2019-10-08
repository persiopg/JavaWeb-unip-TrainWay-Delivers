CREATE TABLE tb_lanches(
id_lanches	integer ,
nm_lanche	Varchar(60),
preco		numeric(7,2),
tempoMont	numeric(4,2),
caminhoImg	Varchar(60),
constraint pk_tb_lanches_id primary key (id_lanches));

drop table tb_lanches

INSERT INTO tb_lanches
VALUES
(1, 'Mc Feliz', 25.00,0.15, './Img/download.jpg'),
(2,'Subway',25.00,0.15,'./Img/subwayLanche.jpg'),
(3,'Lanche',25.00,0.15,'./Img/lanche.jpg');

select * from tb_lanches

CREATE TABLE tb_lanches(
id_lanche		INTEGER,
nm_lanche		VARCHAR(60),
preco			NUMERIC(7,2),
tempoMont		NUMERIC(4,2),
caminhoImg		VARCHAR(60),
CONSTRAINT pk_tb_lanches_id_lanche PRIMARY KEY (id_lanche));
