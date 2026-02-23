-- Proyecto 4 : Intro BBDD SQL
-- Nombre : Adrián Delgado Gómez
-- Voy intentando hacer esto lo mejor que puedo y a veces no doy más jaja He puesto comentarios donde
-- más me han costado para recordar que hace cada cosa.


--                      Query 1
-- Vuelos y su identificador que figuren con status On Time

SELECT flight_id,
       flight_no
FROM   flights
WHERE  status = 'On Time';


--                      Query 2
-- Todas las columnas de bookings con cantidad total mayor a 1.000.000
-- son rublos porque la base de datos es rusa

SELECT *
FROM   bookings
WHERE  total_amount > 1000000;


--                      Query 3
-- Todas las columnas de los modelos de aviones disponibles
-- la tabla tiene una s al final aircrafts_data, compruebo con \dt antes

SELECT *
FROM   aircrafts_data;


--                      Query 4
-- Identificadores de vuelo que han volado con un Boeing 737 codigo 733
-- necesito JOIN para cruzar flights con aircrafts_data y sacar el codigo del avion

SELECT f.flight_id,
       f.flight_no
FROM   flights          AS f
JOIN   aircrafts_data   AS a  ON f.aircraft_code = a.aircraft_code
WHERE  a.aircraft_code = '733';


--                      Query 5
-- Informacion detallada de los tickets de personas llamadas Irina
-- uso LIKE porque el nombre viene en mayusculas tipo IRINA IVANOVA

SELECT *
FROM   tickets
WHERE  passenger_name LIKE 'IRINA%';


--  QUERIES OPCIONALES  (para seguir practicando)


--                      Query 6  (opcional)
-- Ciudades con mas de un aeropuerto
-- HAVING es como un WHERE pero para grupos, me costo pillarlo

SELECT city,
       COUNT (*) AS numAeropuertos
FROM   airports_data
GROUP  BY city
HAVING COUNT (*) > 1;


--                      Query 7  (opcional)
-- Numero de vuelos por modelo de avion
-- agrupo contando despues del JOIN

SELECT a.model,
       COUNT (f.flight_id) AS numVuelos
FROM   flights          AS f
JOIN   aircrafts_data   AS a  ON f.aircraft_code = a.aircraft_code
GROUP  BY a.model
ORDER  BY numVuelos DESC;


--                      Query 8  (opcional)
-- Reservas con mas de un billete
-- cuento tickets por book_ref y me quedo con los que tienen mas de 1

SELECT book_ref,
       COUNT (*) AS numBilletes
FROM   tickets
GROUP  BY book_ref
HAVING COUNT (*) > 1
ORDER  BY numBilletes DESC;


--                      Query 9  (opcional)
-- Vuelos con retraso de salida superior a una hora
-- resto las fechas directamente y comparo con INTERVAL, mas limpio que sacar minutos

SELECT flight_id,
       flight_no,
       scheduled_departure,
       actual_departure,
       (actual_departure - scheduled_departure) AS retraso
FROM   flights
WHERE  actual_departure IS NOT NULL
  AND  (actual_departure - scheduled_departure) > INTERVAL '1 hour'
ORDER  BY retraso DESC;
