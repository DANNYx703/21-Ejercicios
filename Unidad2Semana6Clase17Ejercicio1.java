/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodo2semana6ejercicio7;
import java.util.Scanner;
/**
 *
 * @author DANNY
 */
public class Unidad2Semana6Clase17Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereM
        Scanner teclado = new Scanner(System.in);
        int num;
        int supar = 0;
        int suimpar = 0;
        System.out.println("Introduzca un número");
        num = teclado.nextInt();
        for (int ind=1; ind<=num; ind++){
        if (ind%2==0){
            supar+=ind;
        } else {
            suimpar+=ind;
        }
    }
    System.out.println("La suma de los pares es: "+ supar);
    System.out.println("La suma de los impares es: "+ suimpar);
}
}

