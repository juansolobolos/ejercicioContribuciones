import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double precio;
        System.out.print("Introduzca un precio para añadir el IVA: ");
        precio = scan.nextDouble();
        precio = precio * 1.21;
        System.out.println("El precio completo es " + precio);
    }
}