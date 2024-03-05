package Logica;

public class Flor extends Planta {

    private String color_petalo;
    private double cant_prom_petalos;
    private String color_pistilo;
    private String variedad;
    private String estacion_florece;

    public Flor() {
    }

    public Flor(String nombre, double alto_del_tallo, boolean tiene_hojas, String clima_ideal, String color_petalo,
            double cant_prom_petalos, String color_pistilo, String variedad, String estacion_florece) {
        super(nombre, alto_del_tallo, tiene_hojas, clima_ideal);
        this.color_petalo = color_petalo;
        this.cant_prom_petalos = cant_prom_petalos;
        this.color_pistilo = color_pistilo;
        this.variedad = variedad;
        this.estacion_florece = estacion_florece;
    }

    public String getColor_petalo() {
        return color_petalo;
    }

    public void setColor_petalo(String color_petalo) {
        this.color_petalo = color_petalo;
    }

    public double getCant_prom_petalos() {
        return cant_prom_petalos;
    }

    public void setCant_prom_petalos(double cant_prom_petalos) {
        this.cant_prom_petalos = cant_prom_petalos;
    }

    public String getColor_pistilo() {
        return color_pistilo;
    }

    public void setColor_pistilo(String color_pistilo) {
        this.color_pistilo = color_pistilo;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getEstacion_florece() {
        return estacion_florece;
    }

    public void setEstacion_florece(String estacion_florece) {
        this.estacion_florece = estacion_florece;
    }

    @Override
    public void decirLoQueSoy() {
        System.out.println("Hola soy una flor");
    }
    
}
