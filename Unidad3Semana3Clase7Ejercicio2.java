/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodo3semana3ejercicio4;
import java.util.Scanner;
/**
 *
 * @author DANNY
 */
public class Unidad3Semana3Clase7Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Reader = new Scanner(System.in);
        int Contador;
        int fin;
        System.out.println("Por favor ingrese el valor inicial(Contador)");
        Contador = Reader.nextInt();
        System.out.println("Por favor ingrese el valor final");
       fin = Reader.nextInt();
       while (Contador <= fin){
           System.out.println("Valor actual de la iteración: " + Contador);
           Contador++;
       }
        
        
    }
    
}
