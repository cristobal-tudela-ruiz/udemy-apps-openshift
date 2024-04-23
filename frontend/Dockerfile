# Define la imagen base para la compilación del proyecto usando Node.js
FROM node:20.11.1-alpine3.19 AS builder

# Cambia al usuario root para instalar npm globalmente
USER root

# Instala una versión específica de npm globalmente
RUN npm install -g npm@10.5.2

# Copia todo el contenido del directorio actual al directorio /usr/src/ en el contenedor
COPY ./ /usr/src/

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /usr/src/

# Instala las dependencias del proyecto
RUN npm install

# Ejecuta el comando npm para construir el proyecto
RUN npm run build

# Define la imagen base para la ejecución de la aplicación
FROM node:20.11.1-alpine3.19

# Cambia al usuario root para instalar serve globalmente
USER root

# Instala serve globalmente para servir archivos estáticos
RUN npm install -g serve

# Copia el directorio de construcción desde la imagen anterior al directorio /app/build en el contenedor actual
COPY --from=builder /usr/src/build /app/build

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /app/

# Establece el usuario que ejecutará la aplicación en el contenedor
USER 1001

# Define el comando para ejecutar la aplicación cuando el contenedor se inicie
CMD [ "serve", "-s", "build" ]