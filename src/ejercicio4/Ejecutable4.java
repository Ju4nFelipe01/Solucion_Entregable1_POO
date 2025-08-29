package ejercicio4;
import java.util.Scanner;
public class Ejecutable4 {
    public static void main(String[] args) {
        double numero, cuadrado, cubo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el valor de un numero:");
        numero = sc.nextDouble();
        cuadrado = Operaciones.elevar_cuadrado(numero);
        cubo = Operaciones.elevar_cubo(numero);
        System.out.println("El cuadrado del numeor "+ numero+ " es: "+ cuadrado);
        System.out.println("El cubo del numeor "+ numero+ " es: "+ cubo);


    }
}
