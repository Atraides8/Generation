CREATE schema IF NOT EXISTS generation_schema; #CREACION DE ESQUEMA 
CREATE TABLE `generation_schema`.`Articulo`( #CRECION DE TABLA "Articulo"
`articulo_id` int NOT NULL AUTO_INCREMENT,  #GUARDANDO VARIABLE "articulo_id" auto incrementado
`nombre` VARCHAR (20) NOT NULL,
`precio` INT NOT NULL,
PRIMARY KEY (`articulo_id`));

CREATE TABLE `generation_schema`.`cliente`(
`cliente_id` INT NOT NULL auto_increment,
`nombre` varchar (20) not null,
`email`varchar(40) not null,
`fechaNacimiento` date not null,
`rut`varchar(15) not null,
PRIMARY KEY (`cliente_id`));

Create table `generation_schema`.`Historial`(
`historial_id` int not null auto_increment,
primary key (`historial_id`));

#Se altera la tabla "cliente" para añadirle "historial_id" del tipo "int not null"
alter table generation_schema.cliente Add historial_id int not null;

#Para asi decirle al programa que las relaciones mediante la creacion de la foreign key "historial_id"
#Para esto hacemos lo siguiente, alteramos la tabla cliente para decirle que cree la foreign key "historial_id"
#que proviene de "historial" todo esto queda definido en "clienteHistorial"
alter table generation_schema.cliente Add constraint clienteHistorial foreign key(historial_id) references generation_schema.historial(historial_id);

#DROP TABLE sirve para borrar una tabla que no tiene relacion, en este caso no se puede borrar con este metodo a "historial"
DROP TABLE generation_schema.historial;

#Para eliminar la tabla anterior se hace lo siguiente
#Aqui "alteramos" la tabla "historial" y eliminamos la foreign key "clienteHistorial",
#de esta manera la tabla la podemos eliminar con el metodo anterior.
ALTER TABLE generation_schema.cliente DROP foreign key clienteHistorial;
ALTER TABLE generation_schema.historial DROP foreign key clienteHistorial;

ALTER TABLE generation_schema.cliente CHANGE COLUMN nombre nombre_usuario VARCHAR(20);

ALTER TABLE generation_schema.historial ADD pedido varchar(50);

#Entonces ahora si se puede borrar con el metodo dicho anteriormente
DROP TABLE generation_schema.historial;

