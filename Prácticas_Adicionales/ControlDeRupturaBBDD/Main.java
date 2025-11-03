import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    static final String COLOR_POR_DEFECTO = "\u001B[0m";
    static final String COLOR_VERDE = "\u001B[32m";

    public static void main(String[] args) {
        Conexion test = new Conexion();
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        try {
            Connection conexion = test.conectar();
            Statement consulta = conexion.createStatement();
            ResultSet resultado = consulta.executeQuery("select * from vehiculos");

            while (resultado.next()){
                String fabricante = resultado.getString("fabricante");
                String modelo = resultado.getString("modelo");
                String color = resultado.getString("color");
                int precio = resultado.getInt("precio");
                int id = resultado.getInt("id_vehiculo");

                vehiculos.add(new Vehiculo(fabricante, modelo, color, precio, id));
            }

            Collections.sort(vehiculos);

            imprimirReporte(vehiculos);

            conexion.close();
            consulta.close();
            resultado.close();
        }catch (SQLException e){
            System.out.println("Error consultando datos");
        }
    }

    private static void imprimirReporte(ArrayList<Vehiculo> vehiculos) {
        if (vehiculos.isEmpty()) return;

        String fabricanteActual = "";
        String modeloActual = "";
        int totalModelo = 0;
        int totalFabricante = 0;
        int totalGeneral = 0;

        System.out.println("=".repeat(50));
        System.out.println("FABRICANTE     MODELO     COLOR     PRECIO     ID");
        System.out.println("=".repeat(50));

        for (int i = 0; i < vehiculos.size(); i++) {
            Vehiculo v = vehiculos.get(i);
            boolean esUltimoVehiculo = (i == vehiculos.size() - 1);
            boolean cambiaFabricante = !v.getFabricante().equals(fabricanteActual);
            boolean cambiaModelo = !v.getModelo().equals(modeloActual);

            // Detectar cambio de fabricante
            if (cambiaFabricante && !fabricanteActual.isEmpty()) {
                imprimirTotalModelo(totalModelo);
                totalFabricante += totalModelo;
                imprimirTotalFabricante(totalFabricante);
                totalGeneral += totalFabricante;
                totalModelo = 0;
                totalFabricante = 0;
            }

            // Detectar cambio de modelo (pero no de fabricante)
            if (cambiaModelo && !cambiaFabricante && !modeloActual.isEmpty()) {
                imprimirTotalModelo(totalModelo);
                totalFabricante += totalModelo;
                totalModelo = 0;
            }

            // Imprimir fabricante si cambió
            if (cambiaFabricante) {
                System.out.println(v.getFabricante());
                fabricanteActual = v.getFabricante();
            }

            // Imprimir modelo si cambió
            if (cambiaModelo) {
                System.out.printf(" ".repeat(15) + "%s\n", v.getModelo());
                modeloActual = v.getModelo();
            }

            // Imprimir detalle del vehículo
            System.out.printf(" ".repeat(26) + "%-9s %-10d %d\n",
                    v.getColor(), v.getPrecio(), v.getId());
            totalModelo += v.getPrecio();

            // Totales finales
            if (esUltimoVehiculo) {
                imprimirTotalModelo(totalModelo);
                totalFabricante += totalModelo;
                imprimirTotalFabricante(totalFabricante);
                totalGeneral += totalFabricante;
                imprimirTotalGeneral(totalGeneral);
            }
        }

        System.out.println("=".repeat(50));
    }

    private static void imprimirTotalModelo(int total) {
        System.out.printf(" ".repeat(15) + COLOR_VERDE + "Total Modelo %13d\n" + COLOR_POR_DEFECTO, total);
    }

    private static void imprimirTotalFabricante(int total) {
        System.out.printf(COLOR_VERDE + "Total Fabricante %24d\n" + COLOR_POR_DEFECTO, total);
    }

    private static void imprimirTotalGeneral(int total) {
        System.out.printf("=".repeat(50) + COLOR_VERDE + "\nTotal General %27d\n" + COLOR_POR_DEFECTO, total);
    }
}