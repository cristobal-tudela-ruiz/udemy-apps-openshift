/* -------------------------- LIMPIAR -------------------------- */
DROP TABLE IF EXISTS producto;
/* -------------------------- TABLAS -------------------------- */
CREATE TABLE producto (
	id SERIAL PRIMARY KEY,
	titulo VARCHAR (40) NOT NULL,
	resumen VARCHAR (250) NOT NULL,
	detalle VARCHAR (700) NOT NULL,
	id_categoria INT NOT NULL,
	id_sub_categoria INT NOT NULL,
	marca VARCHAR (50) NOT NULL,
	nombre_foto VARCHAR (200) NOT NULL
);
/* -------------------------- PRODUCTOS -------------------------- */
insert into producto (id, titulo, resumen, detalle, id_categoria, id_sub_categoria, marca, nombre_foto)
values (1, 'PC Gamer i3 / RX 580 8Gb / 16Gb / 512 Gb', 'Resumen de la publicacion ...', 'aqui deberi ir el detalle para el pc ...', 1, 2, 'CompuExpert', 'pc-gamer.png');
