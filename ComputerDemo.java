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
