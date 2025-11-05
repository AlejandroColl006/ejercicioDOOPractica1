package ejercicioDOOPractica1.model;

import java.util.ArrayList;

public class Coleccion {
    private ArrayList<ElementoColeccionable> elementos;

    public Coleccion() {
        elementos = new ArrayList<>();
    }

    public void agregarMoneda (Moneda moneda) {
        elementos.add(moneda);
    } // Este metodo nos permitira añadir una moneda a la colección (introduciendolo al array creado anteriormente)

    public void agregarSello (Sello sello) {
        elementos.add(sello);
    } //Este metodo nos permitira añadir un sello a la colección

    public void mostrarMonedas() {
        System.out.println("Monedas en la colección: ");
        for (ElementoColeccionable e : elementos) {
            if (e instanceof Moneda) {
                Moneda moneda = (Moneda) e;
            }
        }
    } //Este metodo te permite mostrar las monedas guardadas/almacenadas en la colleción identificando con el if si es una moneda y no otra cosa
    public void mostrarSellos() {
        System.out.println("Sellos en la coleccion: ");
        for (ElementoColeccionable e : elementos) {
            if (e instanceof Sello) {
                Sello sello = (Sello) e;
            }
        }
    }//Este metodo te permite mostrar los sellos guardados/almacenados en la colleción identificando con el if si es un sello y no otra cosa

    public double obtenerPrecioTotal() {
        double total = 0;
        for (ElementoColeccionable e : elementos) {
            total += e.getPrecio();
        }
        return total;
    }
    //Metodo que te permite obtener el precio total
    public double obtenerRarezaMedia() {
        if (elementos.isEmpty()) {
            return 0;
        }
        double sumaRareza = 0;
        for (ElementoColeccionable e : elementos) {
            sumaRareza += e.getRareza();
        }

        return sumaRareza / elementos.size();
    }
    //Metodo que te permite obtener el precio total
}
