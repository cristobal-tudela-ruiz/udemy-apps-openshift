# Define la imagen base para la compilación del proyecto usando Maven
FROM maven:3.9.6-amazoncorretto-21-debian AS builder

# Etiqueta para identificar al creador de la imagen
LABEL maintainer="Cristóbal Tudela Ruiz"

# Copia todo el contenido del directorio actual al directorio /usr/src/ en el contenedor
COPY ./ /usr/src/

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /usr/src/

# Ejecuta el comando Maven para limpiar y compilar el proyecto
RUN mvn clean package

# Define la imagen base para la ejecución de la aplicación
FROM amazoncorretto:21.0.3-alpine3.19

# Copia el archivo JAR generado durante la compilación desde la imagen anterior al directorio /app/ en el contenedor actual
COPY --from=builder /usr/src/target/backend-0.0.1.jar /app/backend-0.0.1.jar

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /app/

# Establece el usuario que ejecutará la aplicación en el contenedor
USER 1001

# Define el comando para ejecutar la aplicación cuando el contenedor se inicie
CMD ["java", "-jar", "backend-0.0.1.jar"]