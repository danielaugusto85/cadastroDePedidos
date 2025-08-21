create table pedido(
	id				uuid			primary key,
	nomecliente		varchar(50)		not null,
	datapedido		date			not null,
	valor			decimal(10,2)	not null,
	descricao		varchar(150)	not null
);