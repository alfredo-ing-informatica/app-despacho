// Importa la clase Scanner desde la biblioteca estándar de Java.
// Scanner permite leer datos ingresados por el usuario desde la consola.
import java.util.Scanner;

// Define la clase principal del programa. El nombre debe coincidir con el nombre del archivo .java.
public class AppDespacho {

    // Método principal que se ejecuta al iniciar el programa.
    public static void main(String[] args) {

        // Crea un objeto Scanner llamado 'entrada' para capturar la entrada del usuario.
        Scanner entrada = new Scanner(System.in);

        // Solicita al usuario que ingrese la marca del vehículo.
        System.out.print("Ingrese la marca del vehículo: ");
        String marca = entrada.nextLine(); // Guarda la marca como una cadena de texto.

        // Solicita el modelo del vehículo.
        System.out.print("Ingrese el modelo del vehículo: ");
        String modelo = entrada.nextLine(); // Guarda el modelo como texto.

        // Solicita la cilindrada del vehículo.
        System.out.print("Ingrese la cilindrada del vehículo: ");
        String cilindrada = entrada.nextLine(); // Guarda la cilindrada como texto.

        // Solicita el tipo de combustible.
        System.out.print("Ingrese el tipo de combustible: ");
        String combustible = entrada.nextLine(); // Guarda el tipo de combustible como texto.

        // Solicita la capacidad en pasajeros.
        System.out.print("Ingrese la capacidad en pasajeros: ");
        int capacidad = entrada.nextInt(); // Guarda la capacidad como número entero.

        // Solicita el total de la compra en pesos.
        System.out.print("Ingrese el total de la compra en pesos: ");
        int totalCompra = entrada.nextInt(); // Guarda el monto de la compra como entero.

        // Solicita la cantidad de kilómetros recorridos para la entrega.
        System.out.print("Ingrese la cantidad de kilómetros recorridos para la entrega: ");
        int kilometros = entrada.nextInt(); // Guarda los kilómetros como entero.

        // Inicializa la variable que almacenará el costo del despacho.
        int costoDespacho = 0;

        // Aplica la lógica de negocio para calcular el costo del despacho según el total de la compra.
        if (totalCompra >= 50000) {
            // Si la compra es igual o mayor a $50.000, el despacho es gratuito.
            costoDespacho = 0;
        } else if (totalCompra >= 25000 && totalCompra <= 49999) {
            // Si la compra está entre $25.000 y $49.999, se cobra $150 por kilómetro.
            costoDespacho = kilometros * 150;
        } else {
            // Si la compra es menor a $25.000, se cobra $300 por kilómetro.
            costoDespacho = kilometros * 300;
        }

        // Calcula el total final sumando el costo de la compra y el despacho.
        int totalFinal = totalCompra + costoDespacho;

		// Datos del usuario
		entrada.nextLine(); // Limpieza de buffer
		System.out.print("Ingrese su nombre: ");
		String nombreUsuario = entrada.nextLine();

		System.out.print("Ingrese su edad: ");
		int edadUsuario = entrada.nextInt();

        // Imprime un resumen con todos los datos ingresados y calculados.
        System.out.println("\nResumen de la operación:");
        System.out.println("La marca que ha ingresado es: " + marca);
        System.out.println("El modelo que ha ingresado es: " + modelo);
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada);
        System.out.println("El tipo de combustible es: " + combustible);
        System.out.println("Tiene una capacidad de " + capacidad + " pasajeros.");
        System.out.println("Total de la compra: $" + totalCompra);
        System.out.println("Kilómetros recorridos: " + kilometros + " km");
        System.out.println("Costo de despacho: $" + costoDespacho);
        System.out.println("Total a pagar: $" + totalFinal);
    }
}

