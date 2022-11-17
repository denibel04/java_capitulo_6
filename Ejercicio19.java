/**
 * Capítulo 6
 * Ejercicio 19: Escribe un programa que muestre 50 números enteros aleatorios comprendidos entre el -100 y el 200 ambos incluidos y
 * separados por espacios. Muestra luego el máximo de los pares el mínimo de los impares y la media de todos los números generados.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio19 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = -100;
        int min = 200;
        int suma = 0;

        for (int i = 0; i<50; i++) {
            int aleatorio = (int)(Math.random()*(300+1) - 100);
            System.out.print(aleatorio + " ");
            suma += aleatorio;
            if (aleatorio%2==0 && aleatorio>max) {
                max = aleatorio;
            } else if (aleatorio%2 != 0 && aleatorio<min) {
                min = aleatorio;
            }
        }

        System.out.printf("\nEl mayor de los pares es el %d, y el menor de los impares es %d\nLa media es %.2f", max, min, (float)(suma/50));

        sc.close();
    }
}
