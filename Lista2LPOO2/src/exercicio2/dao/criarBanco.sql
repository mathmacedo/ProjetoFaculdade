/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  macedo
 * Created: Apr 11, 2019
 */

CREATE TABLE pedido (
	id serial PRIMARY KEY,
	nome_cliente VARCHAR(100),
	valor_total_permitido FLOAT
);

CREATE TABLE item_de_pedido (
	id serial PRIMARY KEY, 
	nome VARCHAR(100),
	preco FLOAT, 
	quantidade INT,
	id_pedido INT,
	CONSTRAINT fk_id_pedido FOREIGN KEY (id_pedido) REFERENCES pedido (id)
);

