package ejercicio2;
import java.util.Scanner;

public class Ejecutable2 {
    public static void main(String[] args) {
        double suma, X, Y;
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite un valor para la suma: ");
        suma= sc.nextDouble();
        System.out.println("Digite un valor para X: ");
        X= sc.nextDouble();
        System.out.println("Digite un valor para Y: ");
        Y= sc.nextDouble();
        suma = Operaciones.calcular_suma(suma, X);
        X = Operaciones.calcular_x(X, Y);
        suma+= X/Y;
        System.out.println("El valor de la suma es: "+ suma);
    }
}
