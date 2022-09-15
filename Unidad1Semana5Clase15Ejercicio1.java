/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodo1semana5ejercicio5;
import java.util.Scanner;
/**
 *
 * @author DANNY
 */
public class Unidad1Semana5Clase12Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Ingrese la base: ");
        double base = Entrada.nextDouble();
        System.out.println("Ingrese el exponente ");
        double exponente = Entrada.nextDouble();
        double resultado = Math.pow(base, exponente);
        System.out.println("El resultado es: " + resultado);
    }
    
}
