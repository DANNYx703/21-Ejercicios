/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodo1semana4ejercicio2;
import java.util.Scanner;
/**
 *
 * @author DANNY
 */
public class Unidad1Semana4Clase10Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Ingrese el número de meses:");
        float NM = Entrada.nextFloat();
        double precio, prima, descuento, deuda, cuota;
        if (NM >= 1 && NM <= 65) {
            precio = 23000 * 1.13;
            descuento = 0;
            if (NM == 36) {
                descuento = precio * 0.2;
                prima = (precio - descuento) * 0.15;
                deuda = (precio - descuento)-prima;
             } else {
                prima = precio * 0.15;
                deuda = precio - prima;
            }
            cuota = deuda / NM;
            System.out.println("Precio" + precio);
            System.out.println("Descuento" + descuento);
            System.out.println("Deuda" + deuda);
            System.out.println("Cuota" + cuota);
        } else {
            System.out.println("ERROR, lea bien por favor");
        }
    }
    
}
