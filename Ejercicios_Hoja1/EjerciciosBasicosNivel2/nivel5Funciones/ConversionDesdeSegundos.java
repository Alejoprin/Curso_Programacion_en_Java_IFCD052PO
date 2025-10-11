package EjerciciosBasicosNivel2.nivel5Funciones;

/**
 * Define una función que convierta un número de segundos en horas,
 * minutos y segundos
 */
public class ConversionDesdeSegundos {
    public static void main(String[] args) {
        conversion(14650);
    }

    static void conversion(int segundos){
        final int UNA_HORA_EN_SEGUNDOS = 3600;
        final int UN_MINUTO_EN_SEGUNDOS = 60;
        int horas=0, minutos=0;
        float segundosTotales = segundos;

        while(segundosTotales > UNA_HORA_EN_SEGUNDOS){
            horas++;
            segundosTotales-= UNA_HORA_EN_SEGUNDOS;
        }

        while (segundosTotales > UN_MINUTO_EN_SEGUNDOS){
            minutos++;
            segundosTotales-= UN_MINUTO_EN_SEGUNDOS;
        }

        System.out.printf("La conversión de %d segundos es: %d %s, %d %s, %.0f %s",
                segundos,
                horas,
                horas == 1 ? "hora" : "horas",
                minutos,
                minutos == 1 ? "minuto" : "minutos",
                segundosTotales,
                segundosTotales == 1 ? "segundo" : "segundos"
        );
    }
}
