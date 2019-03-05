CREATE TABLE products (
                        id NUMERIC PRIMARY KEY,
                        name CHARACTER VARYING (255),
                        amount NUMERIC,
                        price NUMERIC
);

INSERT INTO products (id, name, amount, price)
VALUES
(1,	'Two-door wardrobe',	100,	80),
(2,	'Dining table',	1000,	560),
(3,	'Towel holder',	10000,	5.50),
(4,	'Computer desk',	350,	100),
(5,	'Chair',	3000,	210.64),
(6,	'Single bed',	750,	99);

/*
--- Problema:

O setor financeiro da empresa precisa de um relatório que mostre o código e o
nome dos produtos cujo preço são menores que 10 ou maiores que 100.

*/

SELECT id, name FROM products WHERE price < 10 OR price > 100;
