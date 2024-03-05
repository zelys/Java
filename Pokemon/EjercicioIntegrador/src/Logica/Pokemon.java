package Logica;

public abstract class Pokemon {

    // atributos de la clase
    protected int numPokedex;
    protected String nombre;
    protected double peso;
    protected String sexo;
    protected int temporada;

    // declaracion de metodos abstractos
    protected abstract void atacarPlacaje();

    protected abstract void atacarAraniazo();

    protected abstract void atacarMordisco();
}
