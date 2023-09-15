package ejercicio1.Ejercicio7OOP.PersonaService;

import ejercicio1.Ejercicio7OOP.Persona.Persona;

import java.util.Scanner;

public class PersonaService {
    Persona p1 = new Persona();
    public Persona crearPersona(){
        Scanner leer = new Scanner(System.in);

        System.out.println("Nombre:");
        p1.setNombre(leer.nextLine());
        System.out.println("Edad:");
        p1.setEdad(leer.nextInt());
        p1.setSexo(validarSexo());
        System.out.println("Peso:");
        p1.setPeso(leer.nextDouble());
        System.out.println("Estatura:");
        p1.setEstatura(leer.nextDouble());

        return p1;
    }
    public char validarSexo( ) {
        Scanner leer = new Scanner(System.in);
        char sexo;
        System.out.println("Sexo:");
        sexo = leer.next().toUpperCase().charAt(0);
        while (sexo != 'H' && sexo != 'F' && sexo != 'O') {
            System.out.println("El sexo no es correcto vuelva a ingresarlo: ");
            sexo = leer.next().toUpperCase().charAt(0);
        }
        return sexo;
    }

   /* Método calcularIMC(): Si esta fórmula da por resultado un valor menor que 20,
    significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
    Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
    persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
    de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
    función devuelve un 1.*/


    public double imc(Persona p1){
        double imc, aux;
        imc = p1.getPeso()/(Math.pow(p1.getEstatura(),2));
        if(imc < 20){
            System.out.println("La persona esta baja de peso");
            aux = -1 ;
        } else if (imc > 25) {
            System.out.println("La persona tiene sobre peso ");
            aux = 1;
        }else{
            System.out.println("La persona esta en su peso ideal");
            aux = 0;
        }
        return aux;
    }
    public boolean mayorEdad(Persona p1) {
        if(p1.getEdad() >= 18)
            System.out.println("Eres mayor de edad");
        else
            System.out.println("La persona es menor de edad");
        return p1.getEdad() >= 18;
    }


}



