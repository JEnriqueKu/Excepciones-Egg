import java.util.Scanner;

public class DivisionNumero{
    public static Scanner read = new Scanner(System.in).useDelimiter("\n");
    public static void division() {
        try {

            System.out.println("numero 1");
            int num1 = Integer.valueOf(read.next());
            System.out.println("numero 2");
            int num2 = Integer.valueOf(read.next());

            System.out.println( num1 / num2);

        } catch (NumberFormatException e) {
            System.out.println("Valor no valido" + e.getLocalizedMessage());

        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero" + e.getMessage());
        }

    }}

