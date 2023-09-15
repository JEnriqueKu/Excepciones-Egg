package ejercicio1.Ejercicio7OOP.Main;

import ejercicio1.Ejercicio7OOP.Persona.Persona;
import ejercicio1.Ejercicio7OOP.PersonaService.PersonaService;

public class Personas {
    public static void main(String[] args) {
        PersonaService s1 = new PersonaService();
        Persona p1 = s1.crearPersona();
        Persona p2 = s1.crearPersona();
        Persona p3 = s1.crearPersona();
        Persona p4 = s1.crearPersona();

        double imc1, imc2, imc3, imc4;
        double[] imc= new double[4];
        boolean[] edad = new boolean[4];
        double contS=0, contN=0, contB=0, menor=0, mayor=0;

        System.out.println("P1");
        imc[0]= s1.imc(p1);
        edad[0]= s1.mayorEdad(p1);
        System.out.println("P2");
        imc[1]= s1.imc(p2);
        edad[1]= s1.mayorEdad(p2);
        System.out.println("P3");
        imc[2]= s1.imc(p3);
        edad[2]=s1.mayorEdad(p3);
        System.out.println("P4");
        imc[3]= s1.imc(p4);
        edad[3]=s1.mayorEdad(p4);

        for (int i = 0; i < 4; i++) {
            if (imc[i] == 1){
                contS++;


            } else if (imc[i]==0) {
                contN++;
            }else{
                contB++;
            }
        }

        System.out.println("Hay " + (contN/4)*100 + " % personas en su perso normal");
        System.out.println("Hay " + (contS/4)*100 + " % personas en sobrepeso");
        System.out.println("Hay " + (contB/4)*100 + " % personas bajas de peso");


        for (int i = 0; i < 4; i++) {
            if (edad[i]){
                mayor++;
            }else{
                menor++;
            }
        }
        System.out.println("Hay " + (mayor/4)*100 + " % Mayores de edad");
        System.out.println("Hay " + (menor/4)*100 + " % menores  de edad");

    }

}
