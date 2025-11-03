package ejercicioDOOPractica1.model;

public class Sello extends ElementoColeccionable{
    protected double altura;
    protected double anchura;
    protected String imagen;
    protected EstadoConservacionSello estadoConservacionSello;


    public Sello(String pais, String autoridadGobernante, int annus, String unidadMonetaria, double valor, int rareza, double precio) {
        super (pais, autoridadGobernante, annus, unidadMonetaria, valor, rareza, precio);

        this.altura = altura;
        this.anchura = anchura;
        this.imagen = imagen;
        this.estadoConservacionSello = estadoConservacionSello;
    }

    public double getAltura() {
        return altura;
    }
    public double getAnchura() {
        return anchura;
    }
    public String getImagen() {
        return imagen;
    }
    public EstadoConservacionSello getEstadoConservacionSello() {
        return estadoConservacionSello;
    }

    @Override
    public String toString() {
        return "Sello{" +
                "pais='" + getPais() + '\'' +
                ", annus=" + getAnnus() +
                ", altura=" + altura +
                ", anchura=" + anchura +
                ", imagen='" + imagen + '\'' +
                '}';
    }
}
