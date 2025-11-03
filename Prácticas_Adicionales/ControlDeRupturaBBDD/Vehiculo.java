public class Vehiculo implements Comparable<Vehiculo>{

    private String fabricante;
    private String modelo;
    private String color;
    private int precio;
    private int id;

    // CONSTRUCTOR
    public Vehiculo(String fabricante, String modelo, String color, int precio, int id) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.id = id;
    }

    // GETTERS
    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public int getPrecio() {
        return precio;
    }

    public int getId() {
        return id;
    }

    // MÉTODO
    @Override
    public int compareTo(Vehiculo o) {
        int comparacion = this.fabricante.compareTo(o.fabricante);
        if (comparacion == 0) comparacion = this.modelo.compareTo(o.modelo);
        if (comparacion == 0) comparacion = Integer.compare(this.precio, o.getPrecio());
        return comparacion;
    }
}
