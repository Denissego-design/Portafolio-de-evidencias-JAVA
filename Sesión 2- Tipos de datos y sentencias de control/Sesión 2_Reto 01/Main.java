
public class Main {
    public static void main(String[] args) {
       double precioCafe = 60.00;
       double precioPastel = 85.00;
       double precioAgua = 20.00;


       int cantidadCafe = 2;
       int cantidadPastel = 1;
       int cantidadAgua = 1;

       cantidadPastel++;

       double total =  (precioCafe * cantidadCafe) + (precioPastel * cantidadPastel) + (precioAgua * cantidadAgua);

       boolean aplicaDescuento = total > 150;

       double descuento = aplicaDescuento ? total * 0.10 : 0;

       double totalFinal = total - descuento;

        System.out.printf("Total de compra: $" + total);
        System.out.printf("¿Te ganaste un descuento?" + aplicaDescuento);
        System.out.printf("¡Lo lograste! Este es tu descuento $" + descuento);
        System.out.printf("Tu total a pagar es de $" + totalFinal);

        }
    }
