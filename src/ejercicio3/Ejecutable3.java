package ejercicio3;
import  java.util.Scanner;
public class Ejecutable3 {
    public static void main(String[] args) {
        double nHoras, pagoHora, pRetencion, salarioBruto, retencion, salarioNeto;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el numero de horas trabajadas por el empleado en la semana: ");
        nHoras = sc.nextDouble();
        System.out.println("Digite el pago por hora: ");
        pagoHora = sc.nextDouble();
        System.out.println("Digite el porcentaje de retencion: ");
        pRetencion = sc.nextDouble();
        salarioBruto = Calculos.salario_bruto(nHoras, pagoHora);
        retencion = Calculos.retencion_fuente(salarioBruto, pRetencion);
        salarioNeto = Calculos.salario_neto(salarioBruto, retencion);
        System.out.println("El valor total del salario bruto corresponde a:" + salarioBruto);
        System.out.println("El valor total de las retenciones corresponde a:" + retencion);
        System.out.println("El valor total del salario neto corresponde a:" + salarioNeto);


    }
}
