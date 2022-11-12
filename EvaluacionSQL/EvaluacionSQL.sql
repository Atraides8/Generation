#Creacion de esquema "evaluacion_schema"
CREATE schema IF NOT EXISTS evaluacion_schema;

#------------------------------------------------------------------------------------------------------------------------------------------------------#

#Tabla Productos
CREATE TABLE `evaluacion_schema`.`Productos`( #Creacion de tabla "Productos"
`producto_id` int NOT NULL AUTO_INCREMENT,  #Se guarda columna del id del producto (auto incrementado)
`nombre_producto` VARCHAR (15) NOT NULL, #Se guarda columna para nombre del producto
`tipo_producto` VARCHAR(15) NOT NULL, #Se guarda columna para el tipo de producto
`precio_venta_unitario` INT NOT NULL, #Se guarda columna para el precio unitario de venta del producto
`costo_unitario` INT NOT NULL, #Se guarda columna para el costo unitario del producto para el local
`cantidad_total` INT NOT NULL, #Se guarda columna de la cantidad total del producto
PRIMARY KEY (`producto_id`)); #Se define PK al id del producto


#Tabla Ventas
CREATE TABLE `evaluacion_schema`.`Ventas`( #Creacion de tabla "Venta"
`venta_id` INT NOT NULL AUTO_INCREMENT,  #Se guarda columna del id de la venta (auto incrementado)
`n_producto_vendido` INT NOT NULL, #Se guarda columna el numero de veces que el producto fue vendido
`fecha_venta` DATE, #Se guarda columna para la fecha en la que se hizo la venta
PRIMARY KEY (`venta_id`)); #Se define PK al id de la venta


#Tabla Historial Ventas
CREATE TABLE `evaluacion_schema`.`historialVentas`( #Creacion de tabla "historialVentas"
`historial_venta_id` INT NOT NULL AUTO_INCREMENT,  #Se guarda columna del id del historial ventas
PRIMARY KEY (`historial_venta_id`)); #Se define PK al id del historial ventas



#Tabla Proveedores
CREATE TABLE `evaluacion_schema`.`Proveedores`( #Creacion de tabla "Proveedores"
`proveedor_id` INT NOT NULL AUTO_INCREMENT,  #Se guarda columna del id del proveedor (auto incrementado)
`nombre_proveedor` VARCHAR (15) NOT NULL, #Se guarda columna para nombre del proveedor
`rut_proveedor` VARCHAR(15) NOT NULL, #Se guarda columna para el rut del proveedor
`tipo_proveedor` VARCHAR(15) NOT NULL, #Se guarda columna para el tipo de proveedor
`correo_proveedor` VARCHAR(50) NOT NULL, #Se guarda columna para el correo electronico del proveedor
`telefono_proveedor` INT NOT NULL, #Se guarda columna para el telefono del proveedor
PRIMARY KEY (`proveedor_id`)); #Se define PK al id del proveedor

#------------------------------------------------------------------------------------------------------------------------------------------------------#

#Relacionando tablas

#Añadiendo una FK "proveedor_id" a la tabla "Productos"
alter table evaluacion_schema.Productos add proveedor_id int not null;
alter table evaluacion_schema.Productos add constraint productosProveedor foreign key(proveedor_id) references evaluacion_schema.Proveedores(proveedor_id);

#Añadiendo una FK "producto_id" a la tabla "historialVentas"
alter table evaluacion_schema.historialVentas add producto_id int not null;
alter table evaluacion_schema.historialVentas add constraint historialVentas_producto foreign key(producto_id) references evaluacion_schema.Productos(producto_id);
#Añadiendo una FK "venta_id" a la tabla "historialVentas"
alter table evaluacion_schema.historialVentas add venta_id int not null;
alter table evaluacion_schema.historialVentas add constraint historialVentas_ventas foreign key(venta_id) references evaluacion_schema.Ventas(venta_id);

#------------------------------------------------------------------------------------------------------------------------------------------------------#

#Insertando datos

#Se inserta el producto "Papas Lays" con sus respectivos datos
INSERT INTO evaluacion_schema.Productos(nombre_producto, tipo_producto, precio_venta_unitario, costo_unitario, cantidad_total, proveedor_id) VALUES ('Papas Lays', 'Snack', 700, 400, 30, 1);

#Se inserta el producto "Queso soprole" con sus respectivos datos
INSERT INTO evaluacion_schema.Productos(nombre_producto, tipo_producto, precio_venta_unitario, costo_unitario, cantidad_total, proveedor_id) VALUES ('Queso Soprole', 'Lacteos', 6000, 3000, 30, 2);

#Se inserta el producto "Bistec sopraval" con sus respectivos datos
INSERT INTO evaluacion_schema.Productos(nombre_producto, tipo_producto, precio_venta_unitario, costo_unitario, cantidad_total, proveedor_id) VALUES ('Bistec sopraval', 'Carniceria', 8000, 4000, 30, 3);

#Se inserta el producto "Alimento dog" con sus respectivos datos
INSERT INTO evaluacion_schema.Productos(nombre_producto, tipo_producto, precio_venta_unitario, costo_unitario, cantidad_total, proveedor_id) VALUES ('Alimento Dog', 'Mascotas', 23000, 10000, 30, 4);

#Se inserta el producto "Jugo lorida" con sus respectivos datos
INSERT INTO evaluacion_schema.Productos(nombre_producto, tipo_producto, precio_venta_unitario, costo_unitario, cantidad_total, proveedor_id) VALUES ('Jugo Lorida', 'Botilleria', 8000, 4000, 30, 5);



#---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------#

#Insertando datos de proovedores:
#Proveedor "Alin Burgos"
INSERT INTO evaluacion_schema.Proveedores(nombre_proveedor, rut_proveedor, tipo_proveedor, correo_proveedor, telefono_proveedor) VALUES ('Alin Burgos', '182229993', 'Snacks', 'pro@gmail.com', 777888999);

#Proveedor "Abril Mayacaya"
INSERT INTO evaluacion_schema.Proveedores(nombre_proveedor, rut_proveedor, tipo_proveedor, correo_proveedor, telefono_proveedor) VALUES ('Abril Mayacaya', '1822293', 'Lacteos', 'pro2@gmail.com', 778999);

#Proveedor "Nicolas Pelado"
INSERT INTO evaluacion_schema.Proveedores(nombre_proveedor, rut_proveedor, tipo_proveedor, correo_proveedor, telefono_proveedor) VALUES ('Nicolas Pelado', '2039485', 'Carnes', 'pro3@gmail.com', 777888990);

#Proveedor "Lucas Andre"
INSERT INTO evaluacion_schema.Proveedores(nombre_proveedor, rut_proveedor, tipo_proveedor, correo_proveedor, telefono_proveedor) VALUES ('Lucas Andre', '205647389', 'Mascotas', 'pro4@gmail.com', 12345667);

#Proveedor "Diego Squema"
INSERT INTO evaluacion_schema.Proveedores(nombre_proveedor, rut_proveedor, tipo_proveedor, correo_proveedor, telefono_proveedor) VALUES ('Diego Squema', '99857464', 'Botilleria', 'pro5@gmail.com', 95784564);


#---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------#

#Insertando datos de ventas:

INSERT INTO evaluacion_schema.Ventas(n_producto_vendido, fecha_venta) VALUES (5, '2022-11-09'); #Papas

INSERT INTO evaluacion_schema.Ventas(n_producto_vendido, fecha_venta) VALUES (7, '2022-11-09'); #Quesos

INSERT INTO evaluacion_schema.Ventas(n_producto_vendido, fecha_venta) VALUES (5, '2022-11-09'); #Jugos

#---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------#
#Insetando datos de historial:

INSERT INTO evaluacion_schema.historialventas(historial_venta_id, producto_id, venta_id) VALUES (1, 1, 1); 
INSERT INTO evaluacion_schema.historialventas(historial_venta_id, producto_id, venta_id) VALUES (2, 2, 2); 
INSERT INTO evaluacion_schema.historialventas(historial_venta_id, producto_id, venta_id) VALUES (3, 5, 3); 

#---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------#

#Consulta de datos
#Se traen los datos del proveedor con el respectivo producto que vendio.
SELECT proveedores.nombre_proveedor, proveedores.rut_proveedor, proveedores.tipo_proveedor, productos.nombre_producto
FROM evaluacion_schema.proveedores
RIGHT JOIN evaluacion_schema.productos on evaluacion_schema.proveedores.proveedor_id = evaluacion_schema.productos.producto_id;
