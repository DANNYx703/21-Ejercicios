/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodo1semana4ejercicio3;
import java.util.Scanner;
/**
 *
 * @author DANNY
 */
public class Unidad1Semana4Clase11Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Entrada = new Scanner(System.in);
        float nota1, nota2, nota3, promedio;
        System.out.println("Ingrese la primera nota");
        nota1 = Entrada.nextFloat();
        System.out.println("Ingrese la segunda nota");
        nota2 = Entrada.nextFloat();
        System.out.println("Ingrese la tercer nota");
        nota3 = Entrada.nextFloat();
        promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("IEl promedio es:" + promedio);
        if (promedio >= 7){
            System.out.println("Promocionado");
        } else if (promedio >=4){
            System.out.println("Regular");
        } else {
            System.out.println("Reprobado");
     }
   }
}
