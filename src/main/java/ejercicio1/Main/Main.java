package ejercicio1.Ejercicio7OOP.Main;

import ejercicio1.Ejercicio7OOP.Persona.Persona;
import ejercicio1.Ejercicio7OOP.PersonaService.PersonaService;

public class Main {
    public static void main(String[] args) {

        PersonaService personaService = new PersonaService();

        //Persona persona = new Persona("Santiago",25,'H',70,175);

        Persona personanull = null;


        try {

            personaService.mayorEdad(personanull);

        } catch (NullPointerException e){

            System.err.println("El objeto es nulo");
            System.out.println("\u001B[31m" +"El objeto es nulo");

        }

    }
}
