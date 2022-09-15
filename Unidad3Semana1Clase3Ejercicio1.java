/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodo3semana1ejercicio1;

import java.util.Scanner;

/**
 *
 * @author DANNY
 */
public class Unidad3Semana1Clase3Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingresar = new Scanner(System.in);
        double nota;
        
        System.out.println("Favor ingresar un valor desde el 1 hasta el 10");
        nota = ingresar.nextDouble();
        
        while (nota<1 | nota>10){
            System.out.println("Lo siento mucho pero el valor no es correcto");
            nota = ingresar.nextDouble();
        }
            
             
    }
    
}
