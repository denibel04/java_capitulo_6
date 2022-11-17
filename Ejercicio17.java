/**
 * Capítulo 6
 * Ejercicio 17: Realiza un programa que pinte por pantalla una pecera con un pececito dentro. Se debe pedir al usuario el ancho y el alto de
 * la pecera, que como mínimo serán de 4 unidades. No hay que comprobar que los datos se introducen correctamente; podemos suponer que el usuario
 * los introduce bien. Dentro de la pecera hay que colocar de forma aleatoria un pececito, que puede estar situado en cualquiera de las posiciones
 * que quedan en el hueco que forma el rectángulo.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio17 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
        int altura = sc.nextInt();
        System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
        int ancho = sc.nextInt();

        int posicionPececito = (int)(Math.random()*(altura-2)*(ancho-2));
        int posicion = 0;

        for (int i = 1; i<=altura; i++) {
            if (i == 1 || i == altura) { // para el borde de arriba y abajo
                for (int k = 1; k<=ancho; k++) {
                    System.out.print("*");
                }
                System.out.println("");
            } else { // cuerpo del rectángulo
                System.out.print("*");
                for (int k = 2; k<ancho; k++) {
                    if (posicion==posicionPececito) {
                        System.out.print("&");
                    } else {
                        System.out.print(" ");
                    }
                    posicion++;
                }
                System.out.println("*");
            }
        }
        sc.close();
    }
}
