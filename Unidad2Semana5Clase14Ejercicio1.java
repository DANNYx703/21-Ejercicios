/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodo2semana5ejercicio6;
import java.util.Scanner;
/**
 *
 * @author DANNY
 */
public class Unidad2Semana5Clase14Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int nla;
        System.out.println("Número de lados");
        nla = entrada.nextInt();
        switch (nla){
            case 1:
                System.out.println("No es figura");
                break;
            case 2:
                System.out.println("No es figura");
                break;
            case 3:
                System.out.println("Triángulo");
                break;
            case 4:
                System.out.println("Cuadrado o rectángulo");
                break;
             case 5:
                System.out.println("Pentágono");
                break;
             case 6:
                System.out.println("Hexágono");
                break;
             case 8:
                System.out.println("Octágono");
                break;
             default:
                System.out.println("No registrada");   
        }
    }
    
}
