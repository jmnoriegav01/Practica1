# Práctica 3 - JavaBasicIO

# Cuestionario de Preguntas

## 1. ¿Qué vamos a hacer?
La Práctica consiste en mostrar por pantalla el nombre del sistema operativo, el nombre de usuario del sistema, pedir dos numeros
por teclado y mostrar el color azul el resultado de divisir los dos numeros y en color rojo su resto. 

## 2. ¿Con qué lo vamos a hacer?
Vamos a implementar la clase Main con el notepad++

## 3. ¿Cómo se ha hecho?
Primero hemos guardado en constantes los códigos de los colores ANSI_BLUE (azul), ANSI_RED (rojo) y el color por ANSI_RESET (por defecto, dichos colores tiene un código de color asociado, para el color ANSI_BLUE (azul) tiene el \u001B[34m, para el color ANSI_ RED(rojo) tiene el \u001B[31m y para el color ANSI_RESET (por defecto) tiene el \u001B[0m.

La primera parte del programa consiste en mostrar por pantalla el nombre del sistema operativo y el nombre de usuario, para ello tenemos una clase llamada System con la propiedad getProperty("nombre") es un nombre o constante con la cual indicamos que valor queremos obtener en nuestro caso sería os.name para obtener el valor del nombre del sistema operativo y el valor user.name para obtener el nombre de usuario del sistema operativo.

La segunda parte de la aplicación consiste en pedir dos números por teclado y mostrar en color azul el resultado de su división y en color rojo en resultado de su resto. Para ello con la clase SCANNER nos declaramos la entidad teclado y llamado al método nextInt() de dicha entidad podemos pedir por pantalla cualquier numero, en este caso el operador1 y el operador2. Después simplemente son operacions ,matemáticas para mostrar los resultados obtenidos con el operador / (División) y con el operador % (Resto).

Para mostrar por pantalla texto en color azul o rojo simplemente debemos concatenar la constante del código de color con lo que queremos mostrar por ejemplo:

                            System.out.print(ANSI_BLUE + "Texto a mostrar en azul" + ANSI_RESET);


## 4. ¿Para qué se ha hecho?
Para practica la entrada salida en JAVA

## 5. ¿Donde se ha hecho?
En clase y en casa

## 6. ¿Quién lo ha hecho?
Jose María Noriega Vázquez

## 7. ¿Cuándo se ha hecho?
Cuando me he enterado de lo que había que hacer y como había que hacerlo

