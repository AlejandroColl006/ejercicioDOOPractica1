package ejercicioDOOPractica1.model;

public class ElementoColeccionable {
    protected String pais;
    protected String autoridadGobernante;
    protected int annus;
    protected String unidadMonetaria;
    protected double valor;
    protected int rareza;
    double precio;

    public ElementoColeccionable (String pais, String autoridadGobernante, int annus, String unidadMonetaria, double valor, int rareza, double precio) {
        this.pais = pais;
        this.autoridadGobernante = autoridadGobernante;
        this.annus = annus;
        this.unidadMonetaria = unidadMonetaria;
        this.valor = valor;
        this.rareza = rareza;
        this.precio = precio;
    }

    public String getPais() {
        return pais;
    }
    public String getAutoridadGobernante() {
        return autoridadGobernante;
    }
    public int getAnnus() {
        return annus;
    }
    public String getUnidadMonetaria() {
        return unidadMonetaria;
    }
    public double getValor() {
        return valor;
    }
    public int getRareza() {
        return rareza;
    }
    public double getPrecio() {
        return precio;
    }

}
