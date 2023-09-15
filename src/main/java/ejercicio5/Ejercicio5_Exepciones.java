import java.util.Random;
import java.util.Scanner;

public class Ejercicio5_Exepciones {
    public static void main(String[] args) {
        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(500) + 1; // Genera un número aleatorio entre 1 y 500
        int intentos = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("Adivina el número entre 1 y 500.");

        while (true) {
            System.out.print("Introduce tu intento: ");
            try {
                int intento = scanner.nextInt();
                intentos++;

                if (intento < 1 || intento > 500) {
                    System.out.println("Por favor, ingresa un número entre 1 y 500.");
                } else if (intento < numeroAleatorio) {
                    System.out.println("El número a adivinar es mayor.");
                } else if (intento > numeroAleatorio) {
                    System.out.println("El número a adivinar es menor.");
                } else {
                    System.out.println("¡Felicidades! Has adivinado el número " + numeroAleatorio);
                    System.out.println("Número de intentos: " + intentos);
                    break; // Sale del bucle mientras
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Por favor, ingresa un número válido.");
                intentos++;
                scanner.next(); // Limpia el búfer del scanner
            }
        }

        scanner.close();
    }
}
