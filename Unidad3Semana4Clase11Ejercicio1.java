/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodo3semana4ejercicio5;
import java.util.Scanner;
/**
 *
 * @author DANNY
 */
public class Unidad3Semana4Clase11Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double  peso;
        int cont1=0, cont2=0, piezas=0;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("Ingrese 0 para salir");
            System.out.println("Ingrese el peso: ");
            peso = entrada.nextDouble();
            if (peso >=9.8 && peso <=10.2)
            {
                cont1=cont1+1;
                piezas++;
            }
         else if (peso > 0 && peso < 9.8){
                cont2++;
                piezas++;
            }
        }
        while (peso !=0);
        System.out.println("Piezas entre 9.8 y 10.2: " + cont1);
        System.out.println("Piezas menores a 9.8: " + cont2);
        System.out.println("antidad de piezas: " + piezas);
    } 
                
    }
    

