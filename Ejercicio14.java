/**
 * Capítulo 6
 * Ejercicio 14: Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El programa intentará adivinar el número que
 * estás pensando - un número entre 0 y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el programa debe preguntar si el
 * número que estás pensando es mayor o menor que el que te acaba de decir.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio14 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 4;
        int minimo = 0;
        int maximo = 100;
        boolean coincide = false;
        System.out.print("Piensa en un número del 1 al 100! Intentaré adivinarlo, dame 5 oportunidades");
        int intento = (int)(Math.random()*(maximo - minimo) + minimo);
        do {
            System.out.printf("\n¿El número que pensaste es %d? (si/no) Me quedan %d intentos más\n", intento, i);
            String respuesta = sc.next();
            if (respuesta.equalsIgnoreCase("si")) {
                System.out.print("Bien! Acerté :D");
                coincide = true;
            } else if (respuesta.equalsIgnoreCase("no")) {
                System.out.println("¿Es mayor o menor?");
                respuesta = sc.next();
                if (respuesta.equalsIgnoreCase("mayor")) {
                    maximo = intento-1;
                } else if (respuesta.equalsIgnoreCase("menor")) {
                    minimo = intento+1;
                }
                intento = (int)(Math.random()*(maximo - minimo) + minimo);
            }
            i--;
        } while (i>=0 && !coincide);

        if (!coincide) {
            System.out.print("Lo siento, no fui capaz de acertar :(");
        }
        sc.close();
    }
}
