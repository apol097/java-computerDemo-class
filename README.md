# Ejemplo de Creacion de Clases en Java

Este ejemplo toma la clase Computer y crea una Instancia de la misma en la clase ComputerDemo; como objetivo de demostracion de la Instanacia Scanner, la cual se utiliza para la obtencion de informacion en la consola.

## Creando la clase Computer
Esta clase nos servira para abstraer las propiedades de una computadora las cuales pueden ser:

    *Tipo de Computadora
    *Marca de la Computadora
    *Tipo de Procesador de la Computadora
    *Capacidad de Memoria Ram

Al crear la clase debemos de indicar el **modificador de acceso**, el cual para motivos de ejemplo sera de tipo `public`

```java 

public class Computer {

    public String tipe;
    public String brand;
    public String processor;
    public String ram;
  
}
```
## Creando la clase ComputerDemo
Ahora debemos de crear la clase **ComputerDemo** para realizar una Instancia de la clase **Computer** y realacionar los datos a traves de la obtencion de los mismos utilizando una instancia de la clase **Scaner** la cual se tiene que ralializar la importacion desde `import java.util.Scanner`

```java
import java.util.Scanner;

public class ComputerDemo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Computer computer = new Computer();
        System.out.println("Ingrese el tipo de Computadora");
        computer.tipe = console.nextLine();
        System.out.println("Ingrese la marca de la Computadora");
        computer.brand = console.nextLine();
        System.out.println("Ingrese el Procesador");
        computer.processor = console.nextLine();
        System.out.println("Ingrese la cantidad de RAM");
        computer.ram = console.nextLine();

        System.out.println("-----------------------------------------------------");
        System.out.println("              Detalles de la Computadora");
        System.out.println("-----------------------------------------------------");
        System.out.println(
            "Tipo: \t\t"+ computer.tipe + "\n" +
            "Procesador: \t"+computer.processor + "\n" + 
            "Marca: \t\t"+ computer.brand + "\n" +
            "RAM: \t\t"+computer.tipe
        );
        console.close();
    }
}
```

