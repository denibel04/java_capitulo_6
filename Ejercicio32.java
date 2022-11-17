/**
 * Capítulo 6
 * Ejercicio 32: Realiza un programa que pinte un sendero aleatorio.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio32 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la longitud del sendero: ");
        int longitud = sc.nextInt();
        int posicion = 6;
        sc.close();

        for (int i = 0; i<longitud; i++) {
            int metro = 1-(int)(Math.random()*3);
            posicion += metro;
            for (int j = 1; j<=posicion; j++) {
                if (j==posicion) {
                    System.out.print("|");
                    int posicionObstaculo = (int)(Math.random()*4);
                    for (int k=0; k<4; k++){
                        if (k==posicionObstaculo) {
                            int obstaculo = (int)(Math.random()*4);
                            switch (obstaculo) {
                                case 0, 1 -> System.out.print(" ");
                                case 2 -> System.out.print("*");
                                case 3 -> System.out.print("O");
                            }
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.print("|");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
