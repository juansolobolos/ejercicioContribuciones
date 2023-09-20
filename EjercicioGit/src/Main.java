import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double precio;
        System.out.print("Introduzca un precio para añadir el IVA: ");
        precio = scan.nextDouble();
        double iva = 2.1;
        precio = precio * iva;
        System.out.println("El precio completo es " + precio);
        System.out.println("Es el fork :c");
    }
}