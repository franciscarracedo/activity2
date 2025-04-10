# Actividad 2

## Pasos para ejecutar el aplicativo

1. **Clonar el repositorio del aplicativo**
   ```
   git clone <url-del-repositorio>
   ```

2. **Compilar y empaquetar el proyecto**
   En la consola, ejecuta el siguiente comando:
   ```
   mvn clean package
   ```

3. **Identificar el archivo JAR**
   Luego de empaquetar, encontrarás el archivo en la carpeta `target` con el nombre:
   ```
   actividad2-0.0.1-SNAPSHOT.jar
   ```

4. **Ejecutar el aplicativo desde la consola**
   Usa el siguiente comando para interactuar con el aplicativo:
   ```
   java -jar target/actividad2-0.0.1-SNAPSHOT.jar -n Juan -e 25
   ```
   Donde:
   - `-n` corresponde al nombre.
   - `-e` corresponde a la edad.

### Ejemplo:
   Si usas el comando anterior, en la consola debería aparecer algo como:
   ```
   Nombre: Juan
   Edad: 25
   ```

---

## Detalles del proyecto

El aplicativo fue creado inicialmente usando [Spring Initializr](https://start.spring.io/).

Posteriormente, modifiqué el proyecto agregando las siguientes librerías:
- **[commons-cli](https://commons.apache.org/proper/commons-cli/)**: Para manejar los argumentos de la línea de comandos.
- **[log4j](http://logging.apache.org/log4j/2.x/)**: Para registrar logs en la aplicación.

Además, solicité a una inteligencia artificial ejemplos de código para las librerías antes mencionadas. La LIM (Language Integrated Model) utilizada fue la que proporciona **IntelliJ IDEA Ultimate**.

---
