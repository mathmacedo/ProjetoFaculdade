/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  macedo
 * Created: Apr 8, 2019
 */

create table tb_usuario (
    id serial primary key,
    login_usuario varchar(50),
    senha_usuario varchar(50),
    nome_usuario varchar(100)
);

insert into tb_usuario(login_usuario, senha_usuario, nome_usuario) values('teste', 'teste', 'teste');
insert into tb_usuario(login_usuario, senha_usuario, nome_usuario) values('mathues', 'matheus', 'matheus');
insert into tb_usuario(login_usuario, senha_usuario, nome_usuario) values('mathues', 'macedo', 'matheus');