**15** 
### Tipos de datos primitivos en java 
- **Byte** Tiene un tamaño de 8 bits, su rango de valores es de (-128 a 127) y su uso principal es el almacenamiento eficiente en grandes arreglos.

- **short** Tiene un tamaño de 16 bits, su rango de valores es de (-32759 a 32767) y su uso principal es en valores numericos pequeños. 

- **Int** Tiene un tamaño de 32 bits, su rango de valores es de (-2,147,483,648 a 2,147,483,647) y su uso principal es en enteros estandar para la mayoria de calculos.

- **long** Tiene un tamaño de 64 bits, su rango de valores es de (-9,223,372,036,854,775,808 a 9,223,372,036,854,775,807) y su uso principal es en enteros muy grandes. 

- **Float** Tiene un tamaño de 32 bits, su rango de valores es de (~7 digitos decimales de precision) y su uso principal es en decimales de precision simple.

- **Double** Tiene un tamaño de 64 bits, su rango de valores es de (~15 digitos decimales de precision) y su uso principal es en decimales de precision doble. 

---------------------------------------------------------------------------------------------

**16** 
### Condicionales 

#### IF 
- Evalua una condicion booleana, si es **True**, ejecuta el bloque de codigo.
    - **if**(x > 0)
    {System.out.println("x es positivo");}

#### ELSE 
- Permite ejcutar un bloque alternativo su la condicion es **False**.
    - **if** (x > 0) {
    System.out.println("x es positivo");
} **else** {
    System.out.println("x no es positivo");
}

#### SWITCH 
- Evalúa una expresión y ejecuta el bloque correspondiente a un caso.
    - **switch** (dia) {
    case 1: System.out.println("Lunes"); break;
    case 2: System.out.println("Martes"); break;
    default: System.out.println("Otro día");
}

### Bucles 

#### FOR 
- Repite un bloque un número determinado de veces.
    - **for** (int i = 0; i < 5; i++) {
    System.out.println("Iteración " + i);
}

#### WHILE 
- Repite mientras la condición sea **True**
    - **while** (x < 10) {
    x++;
}

#### DO-WHILE 
- Similar a **while**, pero garantiza al menos una ejecución antes de evaluar la condición.
    - **do** {
    x++;
} **while** (x < 10);

---------------------------------------------------------------------------------------------

**17** 
Usar nombres significativos para variables y métodos es una práctica fundamental en programación porque impacta directamente en la claridad, mantenibilidad y calidad del código. Aquí te lo resumo de manera estructurada: 

- **Claridad** Un buen nombre transmite el propósito sin necesidad de comentarios adicionales.
- **Mantenibilidad** Facilita que otros (o tú mismo en el futuro) entiendan el código rápidamente.

---------------------------------------------------------------------------------------------

**18** 
### Programacion Orientada a Objetos (POO)
- La Programación Orientada a Objetos (POO) es un paradigma de programación que organiza el software en torno a objetos, en lugar de funciones o procedimientos aislados. Cada objeto combina:
- Datos (atributos o propiedades).
- Comportamientos (métodos o funciones asociadas).

---------------------------------------------------------------------------------------------

**19** 
### Los 4 Pilares de la POO 

#### Encapsulamiento
- Ocultar los detalles internos de una clase y exponer solo lo necesario mediante métodos públicos. Protege los datos y mejora la seguridad.

#### Herencia 
- Permite que una clase (hija) reutilice atributos y métodos de otra clase (padre). Favorece la reutilización y jerarquía.

#### Abstraccion 
- Simplificar la complejidad mostrando solo lo esencial. Se logra con clases abstractas e interfaces.

#### Polimorfismo 
- Capacidad de que un mismo método tenga diferentes comportamientos según el objeto que lo implemente.

---------------------------------------------------------------------------------------------

**20** 
### Que es la Herencia en POO
- La herencia en Programación Orientada a Objetos (POO) es un mecanismo que permite crear nuevas clases a partir de otras ya existentes, reutilizando sus atributos y métodos. En Java, es uno de los pilares fundamentales de la POO y se utiliza para establecer relaciones jerárquicas entre clases.

### ¿Como se utiliza?

- **Superclase**(clase padre): Es la clase original de la cual se heredan propiedades y comportamientos.
- **Subclase**(clase hija): Es la clase que hereda de la superclase y puede añadir o modificar funcionalidades. 
- **Extends**: Palabra clave utilizada para indicar que una clase hereda de otra. 
- **@override**: Permite definir el comportamiento de un metodo heredado.

---------------------------------------------------------------------------------------------

**21** 
### Modificadores de acceso 

- En Java, los modificadores de acceso son palabras clave que definen el nivel de visibilidad y accesibilidad de clases, métodos, atributos y constructores. Son esenciales para aplicar el principio de encapsulamiento, uno de los pilares de la Programación Orientada a Objetos.

### Modificadores mas comunes en Java

- **Public**: Accesible desde cualquier clase, sin importar el paquete.
- **Private**: Accesible solo dentro de la misma clase. Protege los datos internos.
- **Protected**: Accesible dentro del mismo paquete y por subclases (incluso en otros paquetes).
- **Default**: Accesible solo dentro del mismo paquete.

---------------------------------------------------------------------------------------------

**22** 
### Variable de entorno
- Una variable de entorno es un valor almacenado en el sistema operativo que puede ser accedido por programas y procesos durante su ejecución. Se utilizan para definir configuraciones externas al código, como rutas de archivos, credenciales o parámetros de ejecución, y son fundamentales para que las aplicaciones funcionen de manera flexible y segura.

### Importancia
- Permite difinir rutas, puertos o parametros sin modificar el codigo.
- El mismo programa puede ejecutarse en distintos entornos cambiando solo las variables de entorno.
- Se usan para almacenar credenciales o tokens sensibles, evitando que queden expuestos en el código.
- Cambiar una variable es más sencillo que recompilar o editar múltiples archivos de código.

---------------------------------------------------------------------------------------------









