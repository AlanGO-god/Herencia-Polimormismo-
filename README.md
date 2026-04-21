# Herencia-Polimormismo-
# Programación Orientada a Objetos: Sobrecarga, Herencia y Polimorfismo

## Descripción

Este repositorio contiene una guía práctica sobre conceptos fundamentales de Programación Orientada a Objetos (POO), con ejemplos enfocados en Java. Aquí se explican temas esenciales como **sobrecarga**, **herencia**, **polimorfismo**, **interfaces**, **clases abstractas** y **paquetes/librerías**.

---

# Índice

1. Sobrecarga

   * 1.1 Conversión de tipos
   * 1.2 Sobrecarga de métodos
   * 1.3 Sobrecarga de operadores
2. Herencia

   * 2.1 Introducción a la herencia
   * 2.2 Herencia simple
   * 2.3 Herencia múltiple
   * 2.4 Parte protegida (`protected`)
   * 2.5 Redefinición de métodos (`override`)
3. Polimorfismo y reutilización

   * 3.1 Concepto de polimorfismo
   * 3.2 Clases abstractas
   * 3.3 Interfaces
   * 3.4 Paquetes y librerías

---

# 1. Sobrecarga

La sobrecarga permite usar el mismo nombre para varios métodos siempre que cambien sus parámetros.

## 1.1 Conversión de tipos

Es el cambio de un tipo de dato a otro.

```java
int numero = 10;
double decimal = numero; // Conversión implícita

double valor = 9.8;
int entero = (int) valor; // Conversión explícita
```

## 1.2 Sobrecarga de métodos

```java
class Calculadora {
    int sumar(int a, int b) {
        return a + b;
    }

    double sumar(double a, double b) {
        return a + b;
    }

    int sumar(int a, int b, int c) {
        return a + b + c;
    }
}
```

## 1.3 Sobrecarga de operadores

En Java no se permite redefinir operadores como `+` o `-` (excepto concatenación de `String`).

```java
String texto = "Hola " + "Mundo";
```

---

# 2. Herencia

La herencia permite que una clase reutilice atributos y métodos de otra.

## 2.1 Introducción a la herencia

```java
class Animal {
    void comer() {
        System.out.println("Comiendo...");
    }
}

class Perro extends Animal {
    void ladrar() {
        System.out.println("Ladrando...");
    }
}
```

## 2.2 Herencia simple

Una clase hereda de una sola clase padre.

```java
class Vehiculo {
    void arrancar() {}
}

class Auto extends Vehiculo {}
```

## 2.3 Herencia múltiple

Java no permite herencia múltiple entre clases, pero sí mediante interfaces.

```java
interface Volador {
    void volar();
}

interface Nadador {
    void nadar();
}

class Pato implements Volador, Nadador {
    public void volar() {}
    public void nadar() {}
}
```

## 2.4 Parte protegida (`protected`)

Permite acceso dentro de la clase, paquete y clases hijas.

```java
class Cuenta {
    protected double saldo;
}

class CuentaAhorro extends Cuenta {
    void mostrar() {
        System.out.println(saldo);
    }
}
```

## 2.5 Redefinición de métodos (`override`)

Una subclase modifica el comportamiento heredado.

```java
class Animal {
    void sonido() {
        System.out.println("Sonido genérico");
    }
}

class Gato extends Animal {
    @Override
    void sonido() {
        System.out.println("Miau");
    }
}
```

---

# 3. Polimorfismo y reutilización

## 3.1 Concepto de polimorfismo

Un mismo método puede comportarse de distintas maneras.

```java
Animal a = new Gato();
a.sonido(); // Miau
```

## 3.2 Clases abstractas

No se pueden instanciar y sirven como base.

```java
abstract class Figura {
    abstract double area();
}

class Circulo extends Figura {
    double radio = 5;

    double area() {
        return Math.PI * radio * radio;
    }
}
```

## 3.3 Interfaces

Definen contratos que otras clases deben cumplir.

```java
interface Pago {
    void pagar(double monto);
}

class Tarjeta implements Pago {
    public void pagar(double monto) {
        System.out.println("Pago con tarjeta: " + monto);
    }
}
```

## 3.4 Paquetes y librerías

Sirven para organizar clases y reutilizar código.

```java
package com.ejemplo.modelos;
```

Importación:

```java
import com.ejemplo.modelos.Cliente;
```

---

# Conclusión

Estos conceptos son esenciales para desarrollar software mantenible y escalable:

* **Sobrecarga**: flexibilidad de métodos.
* **Herencia**: reutilización de código.
* **Polimorfismo**: comportamiento dinámico.
* **Interfaces**: diseño desacoplado.
* **Paquetes**: organización profesional.

---

# Autor

Material educativo para repositorio académico de Programación Orientada a Objetos.
