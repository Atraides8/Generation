SELECT * FROM generation_schema.articulo;
SELECT * FROM generation_schema.cliente;

INSERT INTO generation_schema.historial (pedido) VALUES ('dos zapatos');

INSERT INTO generation_schema.cliente (nombre_usuario, email, fechaNacimiento, rut, historial_id) VALUES ('Benja', 'benja@gmail.com');

