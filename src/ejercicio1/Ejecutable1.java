package ejercicio1;

import java.util.Scanner;

public class Ejecutable1{
    public static void main(String[] args) {
        double EdadJuan, EdadAlberto, EdadAna, EdadMama;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese edad Juan: ");
        EdadJuan = sc.nextDouble();
        sc.close();
        AsignarEdades asignar = new AsignarEdades();
        EdadAlberto= asignar.Alberto(EdadJuan);
        EdadAna= asignar.Ana(EdadJuan);
        EdadMama= asignar.Mama(EdadJuan, EdadAlberto, EdadAna);
        System.out.println("La edad de Juan es: "+ EdadJuan);
        System.out.println("La edad de Alberto es: "+ EdadAlberto);
        System.out.println("La edad de Ana es: "+ EdadAna);
        System.out.println("La edad de la máma de Juan es: "+ EdadMama);
    }
}