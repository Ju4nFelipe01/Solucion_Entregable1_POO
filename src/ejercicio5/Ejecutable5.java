package ejercicio5;
import  java.util.Scanner;

public class Ejecutable5 {
    public static void main(String[] args) {
        double radio, perimetro, area;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el valor del radio de su circulo: ");
        radio = sc.nextDouble();
        perimetro = Calculos.perimetro_circuferencia(radio);
        area = Calculos.area_circulo(radio);
        //System.out.println("El valor del perimetro de dicha circunferencia de radio " + radio + " corresponde a: " + perimetro);
        //System.out.println("El valor del area de dicho circulo de radio " + radio + " corresponde a: " + area);
        System.out.println("Radio: "+ radio);
        System.out.println("Perimetro: "+ perimetro);
        System.out.println("Area: "+ area);
    }


}
