create schema if not exists aerolinea_schema;

#Tabla cliente
create table `aerolinea_schema`.`Cliente`(
 `cliente_id`int not null auto_increment,
 `nombre` varchar(20),
 `rut` varchar(15),
 `correo` varchar(25),
 `edad` bit,
 primary key (`cliente_id`));
 
 #Tabla ticket
 create table `aerolinea_schema`.`Ticket`(
 `ticket_id`int not null auto_increment,
 `categoria` varchar(20),
 `numero_asiento` varchar(15),
 `valor` int not null,
 primary key (`ticket_id`));
 
 
#Tabla historial
create table `aerolinea_schema`.`Historial`(
`historial_id` int not null auto_increment,
primary key (`historial_id`));


#Tabla vuelos
create table `aerolinea_schema`.`Vuelos`(
`vuelos_id` int not null auto_increment,
`destino` varchar(10),
`hora` datetime,
`nombre_vuelo` varchar(10),
`origen` varchar(10),
primary key(`vuelos_id`));

#Añadiendo y creando foreign key "cliente_id" a la tabla historial
alter table aerolinea_schema.Historial add cliente_id int not null;
alter table aerolinea_schema.Historial add constraint historialCliente foreign key(cliente_id) references aerolinea_schema.Cliente(cliente_id);

#Añadiendo y creando foreign key "vuelos_id" a la tabla historial
alter table aerolinea_schema.Historial add vuelos_id int not null;
alter table aerolinea_schema.Historial add constraint historialVuelos foreign key(vuelos_id) references aerolinea_schema.Vuelos(vuelos_id);


alter table aerolinea_schema.Vuelos add historial_id int not null;
alter table aerolinea_schema.Vuelos add constraint vuelosHistorial foreign key(historial_id) references aerolinea_schema.Historial(historial_id);


ALTER TABLE aerolinea_schema.Cliente CHANGE COLUMN edad edad int not null;
ALTER TABLE aerolinea_schema.vuelos CHANGE COLUMN hora hora date;

alter table aerolinea_schema.ticket add cliente_id int not null;
alter table aerolinea_schema.ticket add constraint ticketCliente foreign key(cliente_id) references aerolinea_schema.Cliente(cliente_id);

alter table aerolinea_schema.ticket add vuelos_id int not null;
alter table aerolinea_schema.ticket add constraint ticketVuelos foreign key(vuelos_id) references aerolinea_schema.Vuelos(vuelos_id);

INSERT INTO aerolinea_schema.cliente(nombre, rut, correo, edad) VALUES ('Nicolas', '20.129.256-5', 'dunefremens8@gmail.com', 24);
INSERT INTO aerolinea_schema.cliente(nombre, rut, correo, edad) VALUES ('Matias', '22.139.256-6', 'matias8@gmail.com', 24);

INSERT INTO aerolinea_schema.historial(cliente_id, vuelos_id) VALUES (1, 1);
INSERT INTO aerolinea_schema.historial(cliente_id, vuelos_id) VALUES (2, 2);

INSERT INTO aerolinea_schema.vuelos(destino, hora, nombre_vuelo, origen, historial_id) VALUES ('Cancun', '2022-11-09',  'vuelo01', 'Santiago',1);
INSERT INTO aerolinea_schema.vuelos(destino, hora, nombre_vuelo, origen, historial_id) VALUES ('Francia', '2022-11-09', 'vuelo02', 'Santiago',2);
#SIN TERMINAR
INSERT INTO aerolinea_schema.ticket(categoria, numero_asiento, valor) VALUES ('Internacion', 1,  50000);
INSERT INTO aerolinea_schema.vuelos(destino, hora, nombre_vuelo, origen, historial_id) VALUES ('Francia', '2022-11-09', 'vuelo02', 'Santiago',2);

Delete from aerolinea_schema.vuelos
where vuelos_id = 3;

-- JAMAS PERO JAMAS NO COLOCAR UN WHERE

SELECT * FROM aerolinea_schema.vuelos;