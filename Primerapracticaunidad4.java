/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primerapracticaunidad4;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Primerapracticaunidad4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         double[]arreglo= {20.5, 40.6, 78.4, 94.7, 55.3, 22.6, 84.3};
     
    Scanner lecturaDatos = new Scanner (System.in);
     boolean salir = false;
        int opcion;
        double suma = 0;
        double multiplicacion = 1;
        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo [i];
        }
        for (int i = 0; i < arreglo.length; i++) {
            multiplicacion = multiplicacion * arreglo[i];
        }
        while (!salir){
        System.out.println("Bienvenido al nuevo cliente");
        System.out.println("1 Multiplicar los arreglos");
        System.out.println("2 Sumar los arreglos");
        System.out.println("3 Salir del menu");
            
            System.out.println("Por favor elija una de las opciones anteriores");
            opcion = lecturaDatos.nextInt();
            
            switch (opcion){
                case 1:
                    System.out.println("El resultado de sumar los arreglos es: "+ suma);
                    
                    break;
                    
                case 2:
                    System.out.println("El resultado de multiplicar los arreglos es: "+ multiplicacion);
                    
                    break;
                    
                case 3:
                    
                    salir = true;
                    System.out.println("Salio del menu");
                    break;
                    
                default:
                    System.out.println("Seleccione una opcion entre el 1 y 3");
       
    }
    }
}
}