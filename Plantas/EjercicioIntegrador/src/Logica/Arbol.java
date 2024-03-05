package Logica;

public class Arbol extends Planta {

    private String variedad;
    private String tipo_de_tronco;
    private double radiode_tronco;
    private String color;
    private String tipo_de_hojas;

    public Arbol() {
    }

    public Arbol(String nombre, double alto_del_tallo, boolean tiene_hojas, String clima_ideal, String variedad,
            String tipo_de_tronco, double radiode_tronco, String color, String tipo_de_hojas) {
        super(nombre, alto_del_tallo, tiene_hojas, clima_ideal);
        this.variedad = variedad;
        this.tipo_de_tronco = tipo_de_tronco;
        this.radiode_tronco = radiode_tronco;
        this.color = color;
        this.tipo_de_hojas = tipo_de_hojas;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getTipo_de_tronco() {
        return tipo_de_tronco;
    }

    public void setTipo_de_tronco(String tipo_de_tronco) {
        this.tipo_de_tronco = tipo_de_tronco;
    }

    public double getRadiode_tronco() {
        return radiode_tronco;
    }

    public void setRadiode_tronco(double radiode_tronco) {
        this.radiode_tronco = radiode_tronco;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo_de_hojas() {
        return tipo_de_hojas;
    }

    public void setTipo_de_hojas(String tipo_de_hojas) {
        this.tipo_de_hojas = tipo_de_hojas;
    }

    @Override
    public void decirLoQueSoy() {
        System.out.println("Hola soy un árbol");
    }
    
}