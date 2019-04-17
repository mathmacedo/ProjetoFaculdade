/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  macedo
 * Created: Apr 16, 2019
 */

create table tb_cliente (
	id_cliente serial primary key,
	cpf_cliente varchar(11),
	nome_cliente varchar(100),
	email_cliente varchar(100),
	data_cliente date,
	rua_cliente varchar(100),
	nr_cliente int,
	cep_cliente varchar(8),
	cidade_cliente varchar(100),
	uf_cliente varchar(2)
);

insert into tb_cliente (cpf_cliente, nome_cliente, email_cliente, data_cliente, rua_cliente, nr_cliente, cep_cliente, cidade_cliente, uf_cliente) values ('09119263996', 'matheus macedo', 'matheus@teste.com', '1997/07/09', 'joão havro' , 2155, '82560020', 'curitiba', 'pr');


