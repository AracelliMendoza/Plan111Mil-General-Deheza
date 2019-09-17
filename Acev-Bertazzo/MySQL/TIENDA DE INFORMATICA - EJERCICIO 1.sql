/*TIENDA DE INFORMATICA - EJERCICIO 1*/
/*1*/select Nombre from ARTICULOS;
/*2*/select Nombre, Precio from ARTICULOS;
/*3*/select Nombre from	ARTICULOS where Precio <= 200;
/*4*/select * from ARTICULOS where	Precio between 60 and 120;
/*5*/select Nombre, (Precio/45.7) from ARTICULOS;
/*6*/select avg (Precio) from ARTICULOS;
/*7*/select avg (Precio) from ARTICULOS where Fabricante = 2;
/*8*/select count Nombre from ARTICULOS where Precio >= 180;
/*9*/select Nombre, Precio from ARTICULOS where Precio >= 180 order by Precio desc, Nombre;
/*10 sin inner join*/select * from ARTICULOS, FABRICANTES where ARTICULOS.Fabricantes = FABRICANTES.Codigo;
/*10 con inner join*/select * from ARTICULOS inner join FABRICANTES on ARTICULOS.Fabricantes = FABRICANTES.Codigo;
/*11*/select ARTICULOS.Nombre, ARTICULOS.Precios,FABRICANTES.Nombre from ARTICULOS INNER JOIN FABRICANTES on ARTICULOS.Fabricantes = FABRICANTES.Codigo;
/*12*/SELECT avg(Precio), Fabricantes FROM ARTICULOS GROUP BY Fabricantes;
/*13*/SELECT avg(ARTICULOS.Precio), FABRICANTES.Nombre FROM ARTICULOS INNER JOIN FABRICANTES on ARTICULOS.Fabricantes =FABRICANTES.Codigo GROUP BY FABRICANTES.Nombre;
/*14*/ SELECT avg(Precio), FABRICANTES.Nombre FROM ARTICULOS INNER JOIN FABRICANTES on ARTICULOS.Fabricantes = FABRICANTES.Codigo;
/*15*/ SELECT Nombre, min(Precio) FROM ARTICULOS;
/*16*/ SELECT ARTICULOS.Nombre, max(ARTICULoS.Precio), FABRICANTES.Nombre FROM ARTICULOS INNER JOIN FABRICANTES on ARTICULOS.Fabricantes = FABRICANTES.Codigo GROUP BY ARTICULOS.Fabricante;
/*17*/ INSERT INTO ARTICULOS (Nombre, Precio, Fabricante) VALUES (Altavoces, 70, 2);
/*18*/ UPDATE ARTICULOS SET Nombre = "Impresora laser" WHERE Codigo = 8;
/*19*/ UPDATE ARTICULOS SET Precio = 0.9*Precio;
/*20*/ UPDATE ARTICULOS SET Precio = Precio-10 WHERE Precio >= 120;
