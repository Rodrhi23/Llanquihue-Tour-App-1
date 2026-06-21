# Llanquihue-Tour-App-1
# Sistema de Tours Llanquihue 

Este es un proyecto en Java hecho para la gestión y búsqueda de tours turísticos. El programa funciona directamente en la consola (CMD).

# ¿Qué hace el programa?

* **Carga automática:** Lee los datos de los tours y guías directo desde un archivo de texto (`.txt`).
* **Buscador interactivo:** Permite que el usuario escriba por teclado el ID de un tour para buscarlo al tiro.
* **Seguridad contra errores:** Si el usuario se equivoca y escribe letras en vez de números, el programa no se cae gracias a un control de errores (`try-catch`).
* **Uso de Clases:** Aplica el concepto de Composición (un Tour tiene un Guía, y un Guía tiene sus Datos de Contacto).

# Cómo correr el programa en el CMD

Para ejecutar el proyecto por fuera de NetBeans, abre el CMD en la carpeta principal y escribe:
 
java -cp target\classes main.Main
