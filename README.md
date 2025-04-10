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
   - `-e` corresponde
