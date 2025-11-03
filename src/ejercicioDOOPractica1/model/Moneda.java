package ejercicioDOOPractica1.model;

public class Moneda extends ElementoColeccionable {
    protected String composicion;
    protected double peso;
    protected double diametro;
    protected double grosor;
    protected EstadoConservacionMoneda estadoConservacionMoneda;

    public Moneda (String pais, String autoridadGobernante, int annus, String unidadMonetaria,
                   double valor, int rareza, double precio, String Composicion, double peso,
                   double diametro, double grosor, EstadoConservacionMoneda estadoConservacionMoneda ) {

        super(pais, autoridadGobernante, annus, unidadMonetaria, valor, rareza, precio);

        this.composicion = Composicion;
        this.peso = peso;
        this.diametro = diametro;
        this.grosor = grosor;
        this.estadoConservacionMoneda = estadoConservacionMoneda;
    }
    public String getComposicion() {
        return composicion;
    }
    public double getPeso() {
        return peso;
    }
    public double getDiametro() {
        return diametro;
    }
    public double getGrosor() {
        return grosor;
    }
    public EstadoConservacionMoneda getEstadoConservacionMoneda() {
        return estadoConservacionMoneda;
    }
}



