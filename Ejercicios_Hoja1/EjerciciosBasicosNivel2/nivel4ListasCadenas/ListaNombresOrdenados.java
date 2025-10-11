package EjerciciosBasicosNivel2.nivel4ListasCadenas;

import java.util.Arrays;

/**
 * Crea una lista con los nombres de 5 amigos y muéstralos en orden
 */
public class ListaNombresOrdenados {
    public static void main(String[] args) {
        ////////////////////
        // VERSION 1
        ////////////////////
        String[] amigos = {"Carlos", "Roberto", "Diego", "Ana", "Abila"};
        String amigoIntercambio;
        boolean cambiarPosicionAmigo;

        for (int i = 0; i < amigos.length-1; i++) {
            for (int j = i+1; j < amigos.length; j++) {
                cambiarPosicionAmigo = false;

                if (amigos[i].charAt(0) > amigos[j].charAt(0)){
                    cambiarPosicionAmigo = true;

                } else if (amigos[i].charAt(0) == amigos[j].charAt(0)) {

                    for (int k = 1; k < amigos[i].length(); k++) {
                        if (amigos[i].charAt(k) > amigos[j].charAt(k)){
                            cambiarPosicionAmigo = true;
                            break;
                        }
                    }
                }

                if (cambiarPosicionAmigo) {
                    amigoIntercambio = amigos[i];
                    amigos[i] = amigos[j];
                    amigos[j] = amigoIntercambio;
                }
            }
        }
        System.out.println(Arrays.toString(amigos));

        ////////////////////
        // VERSION 2
        ////////////////////
        String[] amigos2 = {"Carlos", "Roberto", "Diego", "Ana", "Abila"};
        for (int i = 0; i < amigos2.length - 1; i++) {
            for (int j = i + 1; j < amigos2.length; j++) {
                if (amigos2[i].compareTo(amigos2[j]) > 0) {
                    amigoIntercambio = amigos2[i];
                    amigos2[i] = amigos2[j];
                    amigos2[j] = amigoIntercambio;
                }
            }
        }
        System.out.println(Arrays.toString(amigos2));

        ////////////////////
        // VERSION 3
        ////////////////////
        String[] amigos3 = {"Carlos", "Roberto", "Diego", "Ana", "Abila"};
        Arrays.sort(amigos3);
        System.out.println(Arrays.toString(amigos3));
    }
}
