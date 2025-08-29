package ejercicio3;

public class Calculos {
    static double retencion_fuente(double salario, double pRetencion){
        return (salario*(pRetencion/100));
    }
    static double salario_bruto(double nHoras, double valorHora){
        return nHoras*valorHora;
    }
    static double salario_neto(double sBruto, double retenciones){
        return sBruto-retenciones;
    }

}
