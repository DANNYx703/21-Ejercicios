/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodo2semana4ejercicio4;
import java.util.Scanner;
/**
 *
 * @author DANNY
 */
public class Unidad2Semana4Clase10Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int suma = 0, num;
        double promedio;
        Scanner ingresar = new Scanner(System.in);
        for (int i=1; i<=5; i++){
            System.out.println("Ingrese un número");
            num = ingresar.nextInt();
            suma = suma + num;
    }
        promedio = suma / 5;
        System.out.println("El promedio es:" + promedio);
    }
    
}
