
package periodo1semana6ejercicio7;
import java.util.Scanner;
/**
 *
 * @author DANNY
 */
public class Unidad1Semana6Clase18Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double valor, descuento, recargo, total;
        String tipo_pago;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el valor de la compra: ");
        valor = entrada.nextDouble();
        System.out.print("Ingrese el tipo de pago: ");
        tipo_pago = entrada.next();
        descuento = 0.05 * valor;
        recargo = 0.03 * valor;
        if (tipo_pago.equalsIgnoreCase("contado")){
            System.out.println("El descuento es:" + descuento);
            total = valor - descuento;
            System.out.println("El total es: " + total);
        } else if(tipo_pago.equalsIgnoreCase("tarjeta")){
            System.out.println("El recargo es:"+ recargo);
            total = valor + recargo;
            System.out.println("El total es:" + total);
        } else {
            System.out.println("Método de pago inválido");
        }
    }
}

        
                
