#Insertar valores a articula segun los parametros "nombre" y "precio" (se puede poner cualquier cantidad de parametros que soporte "articulo"
INSERT INTO generation_schema.articulo(nombre, precio) VALUES ('Celular', 150000);
INSERT INTO generation_schema.articulo(nombre, precio) VALUES ('Audifonos inalam', 30000);
INSERT INTO generation_schema.articulo(articulo_id, nombre, precio) VALUES (8,'Mouse', 30000);
INSERT INTO generation_schema.articulo(nombre, precio) VALUES ('PadMouse', 2000);
INSERT INTO generation_schema.articulo(articulo_id, nombre, precio) VALUES (7, 'Lapiz', 2000);

#Modificar datos teniendo todos los datos especificos, aqui se "dirige" a articulo(articulo_id, nombre, precio) con los valores dados (7, "lapiz", 2000)
#y  luego lo puedo cambiar indicandole en este caso el nombre y el string que quiero que ponga ahora.
INSERT INTO generation_schema.articulo(articulo_id, nombre, precio) VALUES(7, 'Lapiz', 2000)
ON duplicate key update nombre = 'LapizMina';

#Modificar datos teniendo al menos un dato especifico.
UPDATE generation_schema.articulo
SET nombre = 'Celular Samsung', precio = 1000000
WHERE articulo_id = 3; #El WHERE funciona igual que el if en java, donde podemos usar tambien "and","or","<",">",">=", etc

SET SQL_SAFE_UPDATES = 0;

SELECT * FROM generation_schema.articulo;