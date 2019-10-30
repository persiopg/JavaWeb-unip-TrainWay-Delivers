
drop table tb_lanches

INSERT INTO tb_lanches
VALUES
(1, 'Mc Feliz', 25.00,'lanche feliz ',0.15, './Img/download.jpg'),
(2,'Subway',25.00,'metro lanche',0.15,'./Img/subwayLanche.jpg'),
(3,'Lanche',25.00'lanche lanche test',0.15,,'./Img/lanche.jpg');

select * from tb_lanches

drop table tb_pao;
drop table tb_molho;
drop table tb_hambuger;
drop table tb_salada;
drop table tb_queijo;
drop table tb_condimentos;

CREATE TABLE tb_lanches(
id_lanche		INTEGER,
nm_lanche		VARCHAR(60),
preco			float,
descr			Varchar(255),
tempoMont		float,
caminhoImg		VARCHAR(60),
CONSTRAINT pk_tb_lanches_id_lanche PRIMARY KEY (id_lanche));

create table tb_pao(
id_pao			integer,
qte			integer,
nm_pao			varchar(60),
preco			float,
descr			varchar(255),
caminhoImg		varchar(60),
constraint pk_tb_pao_id_pao primary key (id_pao));

create table tb_molho(
id_molho		integer,
nm_molho		varchar(60),
qte			integer,
preco			float,
descr			varchar(255),
caminhoImg		varchar(60),
constraint pk_tb_pao_id_molho primary key (id_molho));

create table tb_hambuger(
id_hambuger		integer,
qte			integer,
nm_hambuger		varchar(60),
preco			float,
descr			varchar(255),
caminhoImg		varchar(60),
constraint pk_tb_pao_id_ham primary key (id_hambuger));

create table tb_salada(
id_salada		integer,
qte 			integer,
nm_salada		varchar(60),
preco			float,
descr			varchar(255),
caminhoImg		varchar(60),
constraint pk_tb_pao_id_salada primary key (id_salada));

create table tb_queijo(
id_queijo		integer,
qte			integer,
nm_queijo		varchar(60),
preco			float,
descr			varchar(255),
caminhoImg		varchar(60),
constraint pk_tb_pao_id_que primary key (id_queijo));

create table tb_condimentos(
id_cond			integer,
qte			integer,
nm_cond			varchar(60),
preco			float,
descr			varchar(255),
caminhoImg		varchar(60),
constraint pk_tb_pao_id_cond primary key (id_cond));

create table tb_lanche_criados(
id_lc_criado		integer,
id_pao			integer,
id_molho		integer,
id_hambuger		integer,
id_salada		integer,
id_queijo		integer,
id_cond			integer,
constraint pk_tb_lanche_criado_id_lc_cr primary key(id_lc_criado),
constraint fk_tb_lanche_criado_id_pao foreign key(id_pao) references tb_pao(id_pao),
constraint fk_tb_lanche_criado_id_molho foreign key(id_molho) references tb_molho(id_molho),
constraint fk_tb_lanche_criado_id_ham foreign key(id_hambuger) references tb_hambuger(id_hambuger),
constraint fk_tb_lanche_criado_id_sal foreign key(id_salada) references tb_salada(id_salada),
constraint fk_tb_lanche_criado_id_pao foreign key(id_queijo) references tb_queijo(id_queijo),
constraint fk_tb_lanche_criado_id_pao foreign key(id_cond) references tb_condimentos(id_cond));
