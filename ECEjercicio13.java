package clase18;

import java.util.Scanner;
public class ECEjercicio13 {
    /* 13. Los alumnos de una escuela desean realizar un viaje de estudios, pero requieren determinar cuánto
    les costará el pasaje, considerando que las tarifas del autobús son las siguientes: si son más de 100
    alumnos, el costo es de $20; si son entre 50 y 100, $35; entre 20 y 49, $40, y si son menos de 20 alumnos,
    $70 por cada uno. Realice el algoritmo para determinar el costo del pasaje de cada alumno. Represente el
    algoritmo mediante el diagrama de flujo y el pseudocódigo */


    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        float preciopasaje1 = 70;
        float preciopasaje2 = 40;
        float preciopasaje3 = 35;
        float preciopasaje4 = 20;
        float preciopasaje;
        int alumnos = 0;
        System.out.println("Introduzca la cantidad de alumnos que viajarán:  ");
        alumnos = lector.nextInt();

        if(alumnos > 100){
            preciopasaje = preciopasaje4;
        } else if (alumnos <= 50 ){
            preciopasaje = preciopasaje3;
    } else if (alumnos <= 20) {
            preciopasaje = preciopasaje2;
        } else {
          preciopasaje = preciopasaje1;
        }
        System.out.printf("Si viajan %d alumnos, el costo del pasaje por alumno será de: $%.2f ", alumnos, preciopasaje );
} }
