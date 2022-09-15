/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodo3semana2ejercicio2;

import java.util.Scanner;

/**
 *
 * @author DANNY
 */
public class Unidad3Semana2Clase6Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner objetoNum = new Scanner(System.in);
        Scanner objetoTexto = new Scanner(System.in);
        String seguir = "s";
        double num, suma;
        int conteo = 0, primo = 0, noprimo=0;
        
        while ("s".equals(seguir) || "s".equals(seguir)){
            System.out.println("INgresar un número positivo");
            num=objetoNum.nextInt();
            while (num<0){
                System.out.println("INgresar un número positivo");
                num=objetoNum.nextInt();
            } conteo++;
            if (num%2==0){
                primo++;
            } else {
                noprimo++;
            }
            System.out.println("¿Desea ingresar otro valor?, s");
            seguir=objetoTexto.next();
        }
        
    }
    
}
