# Konecta Techinical Test
Este es el servicio de prueba para la compañia Konecta

En la siguiente ruta se puede incontrar información del servicio
primero debe subirse el servicio.

 http://localhost:8080/swagger-ui.html

1-Subir Postgresql en local y crear la Base de datos con el nombre : "testkonecta"
2-Crear las tablas necesarias con los siguientes comandos :

       CREATE TABLE empleados(
       	id BIGINT primary key,
       	fechaIngreso Date,
       	nombre VARCHAR,
       	salario BIGINT
       	
       );
       
       CREATE TABLE solicitud(
       	id BIGINT primary key,
       	codigo VARCHAR,
       	descripcion VARCHAR,
       	resumen VARCHAR,
       	id_empleado BIGINT
       	
       );
       
       
3-Iniciar proyecto

4-Consumir servicios

    Listar Empleado: http://localhost:8080/empleado/listar
    Listar Solicitudes : http://localhost:8080/solicitud/listar

# Herramientas
 - PostgreSQL 12.4
 - Spring Boot
 - Java 14
 - Server Undertow
 - JPA
 - Thymeleaf
 - SWAGGER
 - Java 8


