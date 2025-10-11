package EjerciciosBasicosNivel2.nivel5Funciones;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Escribe una función que genere una contraseña aleatoria de 8 caracteres
 */
public class ContraseniaAleatoria {
    public static void main(String[] args) {
        System.out.println("La contraseña generada es: " + generadorContrasenia());
    }

    static String generadorContrasenia(){
        StringBuilder contrasenia = new StringBuilder();
        char caracter;

        for (int i = 0; i < 8 ; i++) {
            caracter = (char)ThreadLocalRandom.current().nextInt(48,122);
            contrasenia.append(Character.toString(caracter));
        }

        return contrasenia.toString();
    }
}
