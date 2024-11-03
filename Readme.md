# Proyecto Dockerizado

Este repositorio contiene los archivos necesarios para dockerizar una aplicación compuesta por un frontend, un backend y una base de datos PostgreSQL.

## Dockerfiles

### Dockerfile Backend

El Dockerfile para el backend define el entorno de ejecución del servidor de la aplicación. Utiliza la imagen base `amazoncorretto:21.0.3-alpine3.19` y realiza las siguientes acciones:

1. Copia el código fuente del proyecto al contenedor.
2. Ejecuta Maven para limpiar y empaquetar la aplicación.
3. Define el comando para ejecutar la aplicación.

### Dockerfile Frontend

El Dockerfile para el frontend define el entorno de compilación y ejecución de la interfaz de usuario de la aplicación. Utiliza la imagen base `node:20.11.1-alpine3.19` y realiza las siguientes acciones:

1. Instala npm globalmente.
2. Copia el código fuente del proyecto al contenedor.
3. Instala las dependencias del proyecto.
4. Construye la aplicación.

### Dockerfile PostgreSQL

El Dockerfile para PostgreSQL define el entorno de ejecución del servidor de base de datos PostgreSQL. Utiliza la imagen base `postgres:13` y realiza las siguientes acciones:

1. Define las variables de entorno para la configuración de PostgreSQL.
2. Persiste los datos de la base de datos en un volumen.

## Docker Compose

El archivo `docker-compose.yml` define los servicios necesarios para la aplicación:

- **frontend**: Servicio para el frontend de la aplicación.
- **backend**: Servicio para el backend de la aplicación.
- **postgresql**: Servicio para la base de datos PostgreSQL.

Los servicios se conectan a una red personalizada llamada `udemy-network` para facilitar la comunicación entre ellos.

## Uso

Para ejecutar la aplicación con Docker Compose, asegúrate de tener Docker y Docker Compose instalados en tu sistema. Luego, ejecuta el siguiente comando en la raíz del proyecto:

 `docker compose build --no-cache`
