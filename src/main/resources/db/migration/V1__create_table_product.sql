--  Drop table

CREATE TABLE product (
	id_product INT NOT NULL PRIMARY KEY  AUTO_INCREMENT,
	product_name varchar(100) NOT NULL,
	category varchar(100) NOT NULL,
	amount INT NOT NULL,
	price DOUBLE NOT NULL,
	descricao varchar(200) NOT NULL
	
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8;

INSERT INTO superebay.product (product_name,category,amount,price,descricao) VALUES 
('torradeira black&decker 110''''eletro','eletro',13,3.99,'torradeira preta black&decker')
,('video-game ps4 branco','diversao e entreterimento',3,1.999,'Ps4 branco slim 2 consoles e 2 jogos')
;
