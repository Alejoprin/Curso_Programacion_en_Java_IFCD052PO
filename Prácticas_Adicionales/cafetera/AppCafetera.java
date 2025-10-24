package Prácticas_Adicionales.cafetera;

import java.util.Scanner;

public class AppCafetera {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String optMenu;
        Cafetera miCafetera = new Cafetera(1000, 50, 100);

        do {
            menu();
            optMenu = entrada.nextLine();

            switch (optMenu){
                case "1":
                    miCafetera.encender();
                    break;
                case "2":
                    miCafetera.servirVaso();
                    break;
                case "3":
                    miCafetera.servirTaza();
                    break;
                case "4":
                    miCafetera.llenar();
                    break;
                case "5":
                    miCafetera.mostrarCapacidad();
                    break;
                case "6":
                    miCafetera.apagar();
                    break;

                default:
                    System.out.println("ERROR: indique un número entero positivo entre 1 y 6");
                    break;
            }

        }while (!optMenu.equals("6"));
        entrada.close();
    }

    static void menu(){
        System.out.println("""
                M E N Ú
                1 - Encender cafetera
                2 - Servir vaso de café
                3 - Servir taza de café
                4 - Llenar cafetera
                5 - Mostrar capacidad
                6 - Salir
                """);
    }
}
