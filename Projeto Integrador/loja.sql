create database loja;

use loja;
drop database loja;
create table cliente(
cpf varchar(40)not null primary key,
nome varchar(60)not null,
telefone varchar(20)not null,
endereco varchar(40)not null,
email varchar(40)not null);	

create table produto(
 cod VARCHAR(10) not null primary key,
 produto VARCHAR(60) not null,
 fornecedor VARCHAR(40) not null,
 quantidade VARCHAR(20) not null,
 precovenda VARCHAR(20) not null,
 precocompra VARCHAR(20) not null);

create table marca(
nome varchar(40)not null primary key,
modelo varchar(40)not null,
tamanho varchar(20)not null,
cor varchar(20)not null,
cod VARCHAR(10) not null,
foreign key (cod)references produto(cod));	

create table pedido(
cod varchar(40)not null primary key,
produto varchar(60)not null,
marca varchar(60)not null,
preco varchar(60)not null,
quantidade varchar(80)not null);

create table fornecedor(
codfornecedor varchar(40)not null primary key,
nome varchar(40)not null,
cod varchar(10)not null,
foreign key (cod)references produto(cod));
	
select * from cliente;    

select * from produto;

select * from pedido;

select * from loja;