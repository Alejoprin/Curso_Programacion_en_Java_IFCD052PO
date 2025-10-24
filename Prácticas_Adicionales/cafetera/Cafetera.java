package Prácticas_Adicionales.cafetera;

/**
 * Simular el funcionamiento de una cafetera mediante la clase Cafetera.
 * La capacidad de la cafetera se determinará en el momento de crear el objeto miCafetera. Se servirá un vaso de café o una taza dependiendo de la opción indicada.
 * El tamaño del vaso y de la taza en mililitros se indica al crear el objeto.
 *
 * Los métodos van a ser, servirTaza y servirVaso, mostrarCapacidad y llenar.
 * Si la cafetera se queda vacía, sin agua, no podrá servir ni tazas, ni vasos de café; debemos mostrar un mensaje indicándolo.
 * Las opciones de la máquina se van a gestionar a través del siguiente menú:

 * MENÚ
 * ====
 * 1. Encender cafetera
 * 2. Servir vaso de café
 * 3. Servir taza de café
 * 4. Llenar
 * 5. Mostrar capacidad
 * 6. Salir
 *
 * Introduce opción: ¿?
 * Si la cafetera si encuentra apagada y se trata de llevar a cabo alguna acción, se mostrará un mensaje indicándolo.
 */
public class Cafetera {

    private int capacidad;
    private int tamanioVaso;
    private int tamanioTaza;
    private boolean modo;

    // CONSTRUCTOR
    public Cafetera(int capacidad, int tamanioVaso, int tamanioTaza) {
        this.capacidad = capacidad;
        this.tamanioVaso = tamanioVaso;
        this.tamanioTaza = tamanioTaza;
        this.modo = false;
    }

    // MÉTODOS
    public void encender(){
        this.modo = true;
        System.out.println("La cafetera se ha prendido");
    }

    public void apagar(){
        this.modo = false;
        System.out.println("La cafetera se ha apagado");
    }

    public void servirVaso(){
        if (this.modo){
            if (this.capacidad >= this.tamanioVaso){
                this.capacidad -= this.tamanioVaso;
                System.out.println("\n");
                System.out.println("      (  )   (   )  )");
                System.out.println("       ) (   )  (  (");
                System.out.println("       ( )  (    ) )");
                System.out.println("       _____________");
                System.out.println("      <_____________> ___");
                System.out.println("      |             |/ _ \\");
                System.out.println("      |               | | |");
                System.out.println("      |               |_| |");
                System.out.println("   ___|             |\\___/");
                System.out.println("  /    \\___________/    \\");
                System.out.println("  \\_____________________/");
                System.out.println("\n  ¡Disfruta tu vaso de café! ☕\n");
            } else {
                System.out.println("Debe llenar la cafetera");
            }

        } else {
            System.out.println("Debe encender la cafetera");
        }
    }

    public void servirTaza(){
        if (this.modo){
            if (this.capacidad >= this.tamanioTaza){
                this.capacidad -= this.tamanioTaza;
                System.out.println("\n");
                System.out.println("         {");
                System.out.println("      {   }   }");
                System.out.println("       }   {  {");
                System.out.println("      {  }  }  }");
                System.out.println("       \\___________/");
                System.out.println("       |           |");
                System.out.println("       |           |");
                System.out.println("       |           | ___");
                System.out.println("       |           |/   \\");
                System.out.println("       |           |     )");
                System.out.println("       |___________|\\___/");
                System.out.println("       /___________\\");
                System.out.println("          |___|");
                System.out.println("\n  ¡Disfruta tu taza de café! ☕\n");
            } else {
                System.out.println("Debe llenar la cafetera");
            }

        } else {
            System.out.println("Debe encender la cafetera");
        }
    }

    public void mostrarCapacidad(){
        if (this.modo){
            System.out.println("La cafetera tiene para servir: " + this.capacidad + "ml");
        } else {
            System.out.println("Debe encender la cafetera");
        }
    }

    public void llenar(){
        if (this.modo){
            this.capacidad = 1000;
            System.out.println("\n       ~  ~  ~");
            System.out.println("   _______________");
            System.out.println("  |               |");
            System.out.println("  |_______________|");
            System.out.println("  |  ___________  |");
            System.out.println("  | |  ▓▓▓▓▓▓▓  | |");
            System.out.println("  | |  ▓▓▓▓▓▓▓  | |");
            System.out.println("  | |  ▓▓▓▓▓▓▓  |_|");
            System.out.println("  | |___________| |");
            System.out.println("  |_______________|");
            System.out.println("      |  [●]  |");
            System.out.println("      |_______|");
            System.out.println("\n  ☕ la cafetera ha sido llenada! \n");
        } else {
            System.out.println("Debe encender la cafetera");
        }
    }
}
