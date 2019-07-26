--  Drop table

--  DROP TABLE superebay.product;

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

insert into product ('torradeira black&decker 110''eletro', 4, 3.99, 'torradeira preta black&decker');
