package clase18;

import java.util.Scanner;

public class ECEjercicio11 {
    /* 11.	Se les dará un bono por antigüedad a los empleados de una tienda. Si tienen un año, se les dará $100; si
    tienen 2 años, $200, y así sucesivamente hasta los 5 años. Para los que tengan más de 5, el bono será de $1000.
    Realice un algoritmo y represéntelo mediante el diagrama de flujo y el pseudocódigo que permita determinar el bono
    que recibirá un trabajador.
     */

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
       /* final int BONO1 = 100;
        final int BONO2 = 200;
        final int BONO3 = 300;
        final int BONO4 = 400;
        final int BONO5 = 500;
        final int BONO6 = 1000;

        int bono = 0 ;*/
        byte antiguedad = 0 ;
        int bono ;
        System.out.println("Ingrese la antigüedad en años: " );
        antiguedad = lector.nextByte();

       /* if (antiguedad > 5 ) {
           bono = BONO6 ;
        } else if (antiguedad == 5 ) {
          bono = BONO5  ;
        } else if (antiguedad == 4 ) {
            bono = BONO4  ;
        } else if (antiguedad == 3 ) {
            bono = BONO3  ;
        }
        else if (antiguedad == 2 ) {
            bono = BONO2  ;
        } else {
            bono = BONO1  ;
        }*/
        if (antiguedad <= 5){
            bono = antiguedad*100;
        } else {
            bono = 1000;
        }

        System.out.printf("Por la antigüedad de %d años, obtuviste un bono de $%d", antiguedad, bono);


    }
}
