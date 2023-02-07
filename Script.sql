drop database if exists DEX;
create database if not exists DEX;

USE DEX;

CREATE TABLE AVE (
codigoAve int auto_increment not null, 

especie varchar (100) not null, 

familia varchar (100) not null, 

subfamilia varchar (100) not null, 

nomeIngles varchar (100) not null, 

estadoConservacao varchar(100) not null, 

PRIMARY KEY (codigoAve)); 



CREATE TABLE ALUNO ( 

codigoAluno int auto_increment not null, 

matricula varchar (40) not null, 

nomeCompleto varchar(50) not null, 

emailResponsavel varchar (50) not null, 

endereco varchar (200) not null, 
 dataNascimento varchar (20) not null, 
 
PRIMARY KEY (codigoAluno)) ;


show tables;
describe ave;
