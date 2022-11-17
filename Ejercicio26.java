/**
 * Capítulo 6
 * Ejercicio 26: Realiza un programa que pinte una tableta de turrón con un bocado realizado de forma aleatoria. El ancho y el alto de la tableta
 * se pide por teclado. El bocado se da alrededor del turrón, obviamente no se puede dar un bocado por en medio de la tableta.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio26 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el ancho de la tableta: ");
        int ancho = sc.nextInt();
        System.out.print("Introduce la altura de la tableta: ");
        int altura = sc.nextInt();
        sc.close();

        int j = (altura*ancho)-((altura-2)*(ancho-2)); // es el numero de caracteres que forman el borde
        int mordisco = (int)(Math.random()*j)+1; // genera el mordisco en uno de los caracteres que forman el borde

        // pinta el rectángulo:
        for (int i = 1; i<=altura; i++) {
            if (i == 1 || i == altura) { // para el borde de arriba y abajo
                for (int k = 1; k<=ancho; k++) {
                    if (j==mordisco) {
                        System.out.print(" ");
                        j = 0;
                    } else {
                        System.out.print("*");
                        j--;
                    }
                }
                System.out.println("");
            } else { // cuerpo del rectángulo
                for (int l = 0; l<3; l++) {
                    if (l==0 || l==2) {
                        if (j==mordisco) {
                            System.out.print(" ");
                            j = 0;
                        } else {
                            System.out.print("*");
                            j--;
                        }
                    } else {
                        for (int k = 2; k<ancho; k++) {
                            System.out.print("*");
                        }
                    }
                }
                System.out.println("");
            }
        }
    }
}
