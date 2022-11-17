/**
 * Capítulo 6
 * Ejercicio 6: Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo
 * y tiene para ello 5 oportunidades. Después de cada intento fallido, el programa dirá cuántas oportunidades
 * quedan y si el número introducido es menor o mayor que el número secreto.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio6 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int secreto = (int)(Math.random()*101);
        int i = 5;
        boolean coincide = false;
        System.out.print("Intente adivinar el número secreto. Tiene 5 oportunidades: ");

        while (i>0 && !coincide) {
            int intento = sc.nextInt();
            if (intento == secreto) {
                coincide = true;
            } else if (intento>secreto && i!=1) {
                System.out.printf("Incorrecto! El número introducido es mayor. Le quedan %d intentos, suerte!\nInténtelelo de nuevo: ", i-1);
            } else if (intento<secreto && i!=1) {
                System.out.printf("Incorrecto! El número introducido es menor. Le quedan %d intentos, suerte!\nInténtelelo de nuevo: ", i-1);
            }
            i--;
        }
        if (coincide) {
            System.out.print("Felicidades !! Ha encontrado el número :D");
        } else if (!coincide) {
            System.out.print("Ya no le quedan intentos :( El número era " + secreto);
        }
        sc.close();
    }
}
