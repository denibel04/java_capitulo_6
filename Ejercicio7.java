/**
 * Capítulo 6
 * Ejercicio 7: Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
 * para los 14 partidos y el pleno al quince (15 filas).
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio7 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String apuesta = "";
        int columnas = 3;
        for (int i = 1; i<=15; i++) {
            System.out.printf("%3d. |", i);
            if (i==15) {
                columnas = 1;
            }
            for (int j = 1; j<=columnas; j++) {
                int numApuesta = (int)(Math.random()*3+1);
                switch (numApuesta) {
                    case 1:
                        System.out.print(" 1 |");
                        break;
                    case 2:
                        System.out.print(" 2 |");
                        break;
                    case 3:
                        System.out.print(" X |");
                        break;
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
