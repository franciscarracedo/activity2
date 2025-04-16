Alumno: Francisco Carracedo

🧪 Instrucciones para ejecutar la aplicación

Cloná este repositorio:

    git clone https://github.com/franciscarracedo/activity2.git    

Ingresá al directorio del proyecto y compilá con Maven:

    mvn clean package

Localizá el archivo .jar generado en la carpeta target. El nombre por defecto es:

    actividad2-0.0.1-SNAPSHOT.jar

Ejecutá la aplicación desde consola con el siguiente comando:

    java -jar target/actividad2-0.0.1-SNAPSHOT.jar -n Juan -e 25

    -n corresponde al nombre

    -e corresponde a la edad

Salida esperada:

    Hola, Juan. Tienes 25 años.

🛠️ Tecnologías utilizadas

Este proyecto fue generado inicialmente con Spring Initializr.

Luego se modificó para agregar el uso de las siguientes librerías:

    commons-cli para el manejo de argumentos por consola.

    log4j para el sistema de logging.

Como apoyo, se utilizaron ejemplos generados por una IA integrada en IntelliJ IDEA Ultimate.
