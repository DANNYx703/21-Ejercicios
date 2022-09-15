/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodo1semana6ejercicio6;
import java.util.Scanner;
/**
 *
 * @author DANNY
 */
public class Unidad1Semana6Clase17Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre,clave;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el nombre del usuario: ");
        nombre = entrada.nextLine();
        System.out.print("Ingrese la clave del usuario: ");
        clave = entrada.nextLine();
        if (nombre.equals("Juan") && clave.equals("123456")){
            System.out.println("Bienvenido al sistema");
        } else {
            System.out.println("Nombre de usuario o contraseña incorrecto");
        }
        
    }
    
}
