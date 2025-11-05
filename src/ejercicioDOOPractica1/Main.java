package ejercicioDOOPractica1;

import ejercicioDOOPractica1.model.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Coleccion coleccion = new Coleccion();

        int opcion;

        do {
            System.out.println("\nMENÚ COLECCIÓN");
            System.out.println("1. Añadir una nueva moneda");
            System.out.println("2. Añadir un nuevo sello");
            System.out.println("3. Mostrar todas las monedas");
            System.out.println("4. Mostrar todos los sellos");
            System.out.println("5. Mostrar el precio total de la colección");
            System.out.println("6. Mostrar la rareza media de la colección");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {
                    case 1:

                        System.out.print("País: ");
                        String pais = sc.nextLine();

                        System.out.print("Autoridad gobernante: ");
                        String autoridad = sc.nextLine();

                        System.out.print("Año (annus): ");
                        int annus = sc.nextInt();

                        System.out.print("Unidad monetaria: ");
                        sc.nextLine();
                        String unidadMonetaria = sc.nextLine();

                        System.out.print("Valor: ");
                        double valor = sc.nextDouble();

                        System.out.print("Rareza (1 a 100): ");
                        int rareza = sc.nextInt();
                        if (rareza < 1 || rareza > 100) {
                            throw new IllegalArgumentException("La rareza debe estar entre 1 y 100.");
                        }

                        System.out.print("Precio: ");
                        double precio = sc.nextDouble();

                        sc.nextLine();
                        System.out.print("Composición: ");
                        String composicion = sc.nextLine();

                        System.out.print("Peso (g): ");
                        double peso = sc.nextDouble();

                        System.out.print("Diámetro (mm): ");
                        double diametro = sc.nextDouble();

                        System.out.print("Grosor (mm): ");
                        double grosor = sc.nextDouble();

                        sc.nextLine();
                        System.out.print("Estado de conservación (por ejemplo: NUEVA, BUENA, MEDIA, MALA): ");
                        String estadoTexto = sc.nextLine().toUpperCase();
                        EstadoConservacionMoneda estadoConservacion;
                        try {
                            estadoConservacion = EstadoConservacionMoneda.valueOf(estadoTexto);
                        } catch (IllegalArgumentException e) {
                            System.out.println("Estado no reconocido, se asignará por defecto 'BUENA'.");
                            estadoConservacion = EstadoConservacionMoneda.BUENA;
                        }

                        Moneda moneda = new Moneda(
                                pais, autoridad, annus, unidadMonetaria, valor, rareza, precio,
                                composicion, peso, diametro, grosor, estadoConservacion
                        );
                        coleccion.agregarMoneda(moneda);
                        System.out.println("✅ Moneda añadida correctamente.");
                        break;

                    case 2:
                        System.out.print("País: ");
                        String paisS = sc.nextLine();

                        System.out.print("Autoridad gobernante: ");
                        String autoridadS = sc.nextLine();

                        System.out.print("Año (annus): ");
                        int annusS = sc.nextInt();

                        System.out.print("Unidad monetaria: ");
                        sc.nextLine();
                        String unidadMonetariaS = sc.nextLine();

                        System.out.print("Valor: ");
                        double valorS = sc.nextDouble();

                        System.out.print("Rareza (1 a 100): ");
                        int rarezaS = sc.nextInt();
                        if (rarezaS < 1 || rarezaS > 100) {
                            throw new IllegalArgumentException("La rareza debe estar entre 1 y 100.");
                        }

                        System.out.print("Precio: ");
                        double precioS = sc.nextDouble();

                        sc.nextLine();
                        System.out.print("Altura (cm): ");
                        double altura = sc.nextDouble();

                        System.out.print("Anchura (cm): ");
                        double anchura = sc.nextDouble();

                        sc.nextLine();
                        System.out.print("Imagen (nombre o ruta): ");
                        String imagen = sc.nextLine();

                        System.out.print("Estado de conservación (por ejemplo: NUEVO, BUENO, REGULAR, MALO): ");
                        String estadoTextoS = sc.nextLine().toUpperCase();
                        EstadoConservacionSello estadoConservacionS;
                        try {
                            estadoConservacionS = EstadoConservacionSello.valueOf(estadoTextoS);
                        } catch (IllegalArgumentException e) {
                            System.out.println("Estado no reconocido, se asignará por defecto 'BUENO'.");
                            estadoConservacionS = EstadoConservacionSello.BUENO;
                        }

                        Sello sello = new Sello(paisS, autoridadS, annusS, unidadMonetariaS, valorS, rarezaS, precioS);
                        coleccion.agregarSello(sello);
                        System.out.println("✅ Sello añadido correctamente.");
                        break;

                    case 3:
                        coleccion.mostrarMonedas();
                        break;

                    case 4:
                        coleccion.mostrarSellos();
                        break;

                    case 5:
                        System.out.println("💰 Precio total de la colección: " + coleccion.obtenerPrecioTotal() + " €");
                        break;

                    case 6:
                        System.out.println("⭐ Rareza media de la colección: " + coleccion.obtenerRarezaMedia());
                        break;

                    case 0:
                        System.out.println("👋 Saliendo del programa...");
                        break;

                    default:
                        System.out.println("❌ Opción no válida. Intente de nuevo.");
                }

            } catch (InputMismatchException e) {
                System.out.println("⚠️ Error: ingrese un valor numérico válido.");
                sc.nextLine();
                opcion = -1;
            } catch (IllegalArgumentException e) {
                System.out.println("⚠️ " + e.getMessage());
                opcion = -1;
            }

        } while (opcion != 0);

        sc.close();
    }
}
