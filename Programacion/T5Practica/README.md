# Práctica 5 - T5Practica

# Cuestionario de Preguntas

## 1. ¿Qué vamos a hacer?
La Práctica consiste en implementar un árbol general de cada nodo es variable, desde cero en el caso de una hoja, hasta cierto número máximo que se llama grado del árbol. La altura de una hoja es 1, si el árbol tiene hijos entonces su altura es 1 más el máximo de alturas de sus hijos. 

## 2. ¿Con qué lo vamos a hacer?
Con el notepad++ para editar el código y el javac para compilar el programa java.
					
## 3. ¿Cómo se ha hecho?
Para ello disponemos de la Clase Nodo con sus atributos:
	
		nodosHijos -> Es un entero que nos indica el número de hijos que tiene un nodo
		arboles -> Es una cadena que no indica el árbol general con todos sus nodos 
		puntero -> Es un entero que nos indica la dirección al siguiente nodo hijo
		alturaPadre -> Es un entero que nos indica la altura que tiene el padre

sus métodos:

		Nodo(String arboles,int puntero, int alturaPadre) 
		
			 Es el constructor de la clase, le pasamos como parámetros
		
						árbol -> el árbol o los casos de prueba
						puntero -> un entero que será un puntero a la dirección del siguiente nodo
						alturaPadre -> un entero que será la altura que tiene el padres					

		int getAltura() -> En un método que nos devolverá la altura

		int getPuntero() -> Es un método que no devolverá un puntero al siguiente nodo 
	
y la Clase Main:

Primero la aplicación nos pedirá cuantos árboles vamos a querer, después nos pedirá que le indiquemos la descripción de los casos de 
prueba, cada árbol consiste en a despcripción general en una línea, para ello tenemos que introducir el número de hijos que tiene cada la raiz y después aparecen las descripcones de cada uno de sus hijos de izquierda a derecha.

									Descripción de un árbol general -> 2 4 0 0 2 0 1 0 0 0 

Despues deberemos ir recorriendo la cadena o árbol para ver los nodos o hijos que tiene en el caso de que un dígito sea distinto de cero, quiere decir que tiene nodos hijos, con los cual tenemos que consultar sus nodos hijos, para ello tenemos un puntero que apuntará a la dirección del nodo hijo, es decir vamos recorriendo la cadena averiguando los casos de prueba o nodos que hay 

## 4. ¿Para qué se ha hecho?
Para aprender a crear clases en Java con sus métodos y sus atributos.

## 5. ¿Donde se ha hecho?
En casa y las dudas en clase

## 6. ¿Quién lo ha hecho?
Jose María Noriega Vázquez

## 7. ¿Cuándo se ha hecho?
No he entendido la práctica, la he intentado hacer, pero desde el principio no la entendí.

## Captura 
No hago captura de pantallas porque la práctica no me funciona correctamente, no he entendido el ejercicio y no la he podido implementar
correctamente. Pero si en la medida de lo posible he hecho la documentación.
