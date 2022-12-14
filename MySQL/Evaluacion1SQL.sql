#Creacion de esquema "evaluacion_schema"
CREATE schema IF NOT EXISTS evaluacion_schema;

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
`correo_proveedor` VARCHAR(15) NOT NULL, #Se guarda columna para el correo electronico del proveedor
`telefono_proveedor` INT NOT NULL, #Se guarda columna para el telefono del proveedor
PRIMARY KEY (`proveedor_id`)); #Se define PK al id del proveedor

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






