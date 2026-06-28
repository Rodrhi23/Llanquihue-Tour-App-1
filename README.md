# LlanquihueTourApp1

## Semana 6 - Creando jerarquías de clases con herencia simple

## Descripción
En esta semana se implementó una jerarquía de clases para representar los distintos 
servicios turísticos que ofrece la agencia Llanquihue Tour, aplicando herencia simple, 
uso de super() y sobreescritura del método toString().

## Clases creadas

- **ServicioTuristico**: Superclase con los atributos comunes nombre y duracionHoras.
- **RutaGastronomica**: Subclase que agrega el atributo numeroDeParadas.
- **PaseoLacustre**: Subclase que agrega el atributo tipoEmbarcacion.
- **ExcursionCultural**: Subclase que agrega el atributo lugarHistorico.
- **GestorServicios**: Clase encargada de crear instancias de prueba de cada subclase.

## Instrucciones para ejecutar Main

1. Abrir el proyecto en NetBeans.
2. Asegurarse de que el archivo tours.txt esté en la raíz del proyecto.
3. Ejecutar la clase Main.java ubicada en el paquete main.
4. El programa mostrará primero los tours existentes, luego pedirá un ID para buscar
   y finalmente mostrará los servicios turísticos de la jerarquía implementada.
