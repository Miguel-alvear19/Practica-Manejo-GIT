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





