import java.util.Scanner;

/**
 * Programa que lee cantidades y precios de productos, para al final indicar el total de la factura.
 * Si el importe supera los 1000€ se aplicará un descuento del 5%. El programa finaliza al
 * introducir una cantidad 0
 */
public class TotalCompraProductos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cantidadProducto, precioProducto, totalProducto;
        final int IMPORTE_CON_DESCUENTO = 1000;
        final float DESCUENTO = 0.05f;
        float totalFactura=0;
        boolean terminarCompra = false;

        do {
            System.out.print("Indique la cantidad del producto: ");
            cantidadProducto = entrada.nextInt();

            if (cantidadProducto > 0){
                System.out.print("Indique precio del producto: ");
                precioProducto = entrada.nextInt();

                totalProducto = cantidadProducto * precioProducto;
                totalFactura += totalProducto;
                System.out.println();
            } else {
                terminarCompra = true;
            }

        }while (!terminarCompra);

        if (totalFactura > IMPORTE_CON_DESCUENTO){
            totalFactura = totalFactura - (totalFactura * DESCUENTO);
            System.out.printf("El importe total con descuento fue: %.2f€%n", totalFactura);
        } else {
            System.out.printf("El importe total fue: %.2f€%n", totalFactura);
        }
    }
}
