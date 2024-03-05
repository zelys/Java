package Logica;

public class Arbusto extends Planta {

    private double ancho;
    private boolean es_domestico;
    private String variedad;
    private String color_hoja;
    private boolean se_poda;

    public Arbusto() {
    }

    public Arbusto(String nombre, double alto_del_tallo, boolean tiene_hojas, String clima_ideal, double ancho,
            boolean es_domestico, String variedad, String color_hoja, boolean se_poda) {
        super(nombre, alto_del_tallo, tiene_hojas, clima_ideal);
        this.ancho = ancho;
        this.es_domestico = es_domestico;
        this.variedad = variedad;
        this.color_hoja = color_hoja;
        this.se_poda = se_poda;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public boolean isEs_domestico() {
        return es_domestico;
    }

    public void setEs_domestico(boolean es_domestico) {
        this.es_domestico = es_domestico;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getColor_hoja() {
        return color_hoja;
    }

    public void setColor_hoja(String color_hoja) {
        this.color_hoja = color_hoja;
    }

    public boolean isSe_poda() {
        return se_poda;
    }

    public void setSe_poda(boolean se_poda) {
        this.se_poda = se_poda;
    }

    @Override
    public void decirLoQueSoy() {
        System.out.println("Hola soy un arbusto");  
    }    
}
