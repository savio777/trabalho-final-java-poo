create database trab_ferds;

use trab_ferds;

create table aluno(
	id_alu int primary key auto_increment,
    nome varchar(150),
    numero varchar(100),
    cpf varchar(15),
    endereco varchar(200),
    ano_nasc int,
    numMatricula int,
    serie int,
    nome_pai varchar(150),
    nome_mae varchar(150)
);

create table usuario(
	id int primary key auto_increment,
    nome varchar(150),
    numero varchar(100),
    cpf varchar(15),
    endereco varchar(200),
    email varchar(150),
    senha varchar(150)
);