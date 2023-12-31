/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodosestaticos;



/**
 *
 * @author Usuario
 */
public class MetodosEstaticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        double[][] opciones
                = {
                    {90.5, 85.0, 78.5, 92.9},
                    {88.0, 76.5, 89.0, 94.5},
                    {70.0, 82.5, 91.0, 87.5,}
                };

        MetodosEstaticos.promedioPorEstudiante1();
        MetodosEstaticos.promedioPorEstudiante2();
        MetodosEstaticos.promedioPorEstudiante3();
        
        MetodosEstaticos.promedioPorMateria1();
        MetodosEstaticos.promedioPorMateria2();
        MetodosEstaticos.promedioPorMateria3();
        MetodosEstaticos.promedioPorMateria4();
    }

    public static void promedioPorEstudiante1() {
        double[] valores = {90.5, 85.0, 78.5, 92.9};
        double total = 0;
        for (int i = 0; i < valores.length; i++) {
            total += valores[i];
        }
        System.out.println("El promedio del estudiante 1 es:" + (total / valores.length));
    }

    public static void promedioPorEstudiante2() {
        double[] calificaciones = {88.0, 76.5, 89.0, 94.5};
        double totales = 0;
        for (int j = 0; j < calificaciones.length; j++) {
            totales += calificaciones[j];
        }
        System.out.println("El promedio  del estudiante 2 es:" + (totales / calificaciones.length));

    }
    public static void promedioPorEstudiante3() { 
     double[] calificacion = {70.0, 82.5, 91.0, 87.5,};
        double resultados = 0;
        for (int z = 0; z < calificacion.length; z++) {
            resultados += calificacion[z];    
}
  
        System.out.println( "El promedio del estudiante 3 es:" + (resultados / calificacion.length));      
       
    }
    public static void promedioPorMateria1() {
        double[] valores = {90.5,88.0,70.0};
        double total = 0;
        for (int i = 0; i < valores.length; i++) {
            total += valores[i];
        }
        System.out.println("El promedio de la materia 1 es:" + (total / valores.length));
    }
    public static void promedioPorMateria2() {
        double[] valores = {85.0,76.5,82.5};
        double total = 0;
        for (int i = 0; i < valores.length; i++) {
            total += valores[i];
        }
        System.out.println("El promedio de la materia 2 es:" + (total / valores.length));
    }
    public static void promedioPorMateria3() {
        double[] valores = {78.5,89.0,91.0};
        double total = 0;
        for (int i = 0; i < valores.length; i++) {
            total += valores[i];
        }
        System.out.println("El promedio de la materia 3 es:" + (total / valores.length));
    }
    public static void promedioPorMateria4() {
        double[] valores = {92.0,94.5,87.5};
        double total = 0;
        for (int i = 0; i < valores.length; i++) {
            total += valores[i];
        }
        System.out.println("El promedio de la materia 4 es:" + (total / valores.length));
    }   
}
