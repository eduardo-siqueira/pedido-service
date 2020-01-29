use eicon;

-- tabela status
insert into status (descricao) values ('Aberto');
insert into status (descricao) values ('Enviado');
insert into status (descricao) values ('Recebido');
insert into status (descricao) values ('Finalizado');
insert into status (descricao) values ('Reprovado');

-- tabela cliente
insert into cliente (data_inclusao, data_nascimento, nome, sobrenome) values (curdate(), '1987-7-04', 'Luis', 'Alves Dias');
insert into cliente (data_inclusao, data_nascimento, nome, sobrenome) values (curdate(), '1984-12-24', 'Valter', 'Cambraia de Albuquerque');
insert into cliente (data_inclusao, data_nascimento, nome, sobrenome) values (curdate(), '1990-1-30', 'Camila', 'Figueira Castro');
insert into cliente (data_inclusao, data_nascimento, nome, sobrenome) values (curdate(), '1975-6-5', 'Joana', 'Almeida Neves');
insert into cliente (data_inclusao, data_nascimento, nome, sobrenome) values (curdate(), '1940-6-5', 'Maria', 'Aparecida Silva');
insert into cliente (data_inclusao, data_nascimento, nome, sobrenome) values (curdate(), '1998-2-12', 'Felipe', 'Borestein Ramos');
insert into cliente (data_inclusao, data_nascimento, nome, sobrenome) values (curdate(), '1992-8-19', 'Elza', 'Gomide Guedes');
insert into cliente (data_inclusao, data_nascimento, nome, sobrenome) values (curdate(), '1994-1-07', 'Leonardo', 'Guimaraes Enzo');
insert into cliente (data_inclusao, data_nascimento, nome, sobrenome) values (curdate(), '1972-8-19', 'Moacir', 'Edan Tranido');
insert into cliente (data_inclusao, data_nascimento, nome, sobrenome) values (curdate(), '1984-3-05', 'Patricia', 'Silva Siqueira');

-- tabela produto
insert into produto (descricao, ativo) values ('Leite Integral', true);
insert into produto (descricao, ativo) values ('Oleo de Soja', true);
insert into produto (descricao, ativo) values ('Arroz Agulhinha', true);
insert into produto (descricao, ativo) values ('Feijão Carioca', true);
insert into produto (descricao, ativo) values ('Azeite Extra Virgem', true);
insert into produto (descricao, ativo) values ('Maionese 500ml', true);
insert into produto (descricao, ativo) values ('Molho de Tomate', true);
insert into produto (descricao, ativo) values ('Fraldas XXG 50 UN', true);
insert into produto (descricao, ativo) values ('Cerveja Heineken 6 UN', true);
insert into produto (descricao, ativo) values ('Pao de Forma Integral', true);

-- tabela pedido/pedido_item
insert into pedido (data_pedido, valor_total, cliente_id, status_id) values ('2019-10-4', 2456.78, 1, 1);
insert into pedido_item (quantidade, valor, pedido_id, produto_id) values (30, 34.01, 1, 1);
insert into pedido_item (quantidade, valor, pedido_id, produto_id) values (30, 23.43, 1, 2);
insert into pedido_item (quantidade, valor, pedido_id, produto_id) values (30, 54.32, 1, 3);

insert into pedido (data_pedido, valor_total, cliente_id, status_id) values ('2019-10-5', 1346.90, 2, 2);
insert into pedido_item (quantidade, valor, pedido_id, produto_id) values (30, 21.43, 2, 4);
insert into pedido_item (quantidade, valor, pedido_id, produto_id) values (30, 43.01, 2, 5);
insert into pedido_item (quantidade, valor, pedido_id, produto_id) values (30, 55.78, 2, 6);

insert into pedido (data_pedido, valor_total, cliente_id, status_id) values ('2019-10-6', 456.78, 3, 3);
insert into pedido_item (quantidade, valor, pedido_id, produto_id) values (30, 12.01, 3, 7);
insert into pedido_item (quantidade, valor, pedido_id, produto_id) values (30, 43.44, 3, 8);
insert into pedido_item (quantidade, valor, pedido_id, produto_id) values (30, 56.54, 3, 9);
insert into pedido_item (quantidade, valor, pedido_id, produto_id) values (30, 87.98, 3, 10)

insert into pedido (data_pedido, valor_total, cliente_id, status_id) values ('2019-10-7', 65.78, 4, 4);
insert into pedido_item (quantidade, valor, pedido_id, produto_id) values (30, 34.01, 4, 1);
insert into pedido_item (quantidade, valor, pedido_id, produto_id) values (30, 23.43, 4, 2);
insert into pedido_item (quantidade, valor, pedido_id, produto_id) values (30, 54.32, 4, 3);

insert into pedido (data_pedido, valor_total, cliente_id, status_id) values ('2019-10-8', 3453.87, 5, 5);
insert into pedido_item (quantidade, valor, pedido_id, produto_id) values (30, 21.43, 5, 4);
insert into pedido_item (quantidade, valor, pedido_id, produto_id) values (30, 43.01, 5, 5);
insert into pedido_item (quantidade, valor, pedido_id, produto_id) values (30, 55.78, 5, 6);

insert into pedido (data_pedido, valor_total, cliente_id, status_id) values ('2019-10-4', 543.22, 6, 1);
insert into pedido_item (quantidade, valor, pedido_id, produto_id) values (30, 12.01, 6, 7);
insert into pedido_item (quantidade, valor, pedido_id, produto_id) values (30, 43.44, 6, 8);
insert into pedido_item (quantidade, valor, pedido_id, produto_id) values (30, 56.54, 6, 9);
insert into pedido_item (quantidade, valor, pedido_id, produto_id) values (30, 87.98, 6, 10);

insert into pedido (data_pedido, valor_total, cliente_id, status_id) values ('2019-10-5', 87.77, 7, 2);
insert into pedido_item (quantidade, valor, pedido_id, produto_id) values (30, 34.01, 7, 1);
insert into pedido_item (quantidade, valor, pedido_id, produto_id) values (30, 23.43, 7, 2);
insert into pedido_item (quantidade, valor, pedido_id, produto_id) values (30, 54.32, 7, 3);

insert into pedido (data_pedido, valor_total, cliente_id, status_id) values ('2019-10-6', 4321.80, 8, 3);
insert into pedido_item (quantidade, valor, pedido_id, produto_id) values (30, 21.43, 8, 4);
insert into pedido_item (quantidade, valor, pedido_id, produto_id) values (30, 43.01, 8, 5);
insert into pedido_item (quantidade, valor, pedido_id, produto_id) values (30, 55.78, 8, 6);

insert into pedido (data_pedido, valor_total, cliente_id, status_id) values ('2019-10-7', 5000.01, 9, 4);
insert into pedido_item (quantidade, valor, pedido_id, produto_id) values (30, 12.01, 9, 7);
insert into pedido_item (quantidade, valor, pedido_id, produto_id) values (30, 43.44, 9, 8);
insert into pedido_item (quantidade, valor, pedido_id, produto_id) values (30, 56.54, 9, 9);
insert into pedido_item (quantidade, valor, pedido_id, produto_id) values (30, 87.98, 9, 10);

insert into pedido (data_pedido, valor_total, cliente_id, status_id) values ('2019-10-9', 432.54, 10, 5);
insert into pedido_item (quantidade, valor, pedido_id, produto_id) values (30, 21.43, 10, 4);
insert into pedido_item (quantidade, valor, pedido_id, produto_id) values (30, 43.01, 10, 5);
insert into pedido_item (quantidade, valor, pedido_id, produto_id) values (30, 55.78, 10, 6);