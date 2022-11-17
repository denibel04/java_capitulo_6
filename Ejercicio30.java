/**
 * Capítulo 6
 * Ejercicio 30: El pequeño Roberto tenía como mascota un pececillo dentro de una pecera. Los Reyes Magos le han traído un caballito de mar ($) y
 * una caracola (@) para que le hagan compañía al pez. Realiza un programa que pinte por pantalla la pecera con los tres animalitos acuáticos colocados
 * dentro en posiciones aleatorias. Por una cuestión de física elemental, ninguno de los animales puede coincidir en la misma posición. Se debe pedir al
 * usuario el ancho y el alto de la pecera, que como mínimo serán de 4 unidades.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio30 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
        int altura = sc.nextInt();
        System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
        int ancho = sc.nextInt();
        int posicionPececito;
        int posicionCaracola;
        int posicionCaballito;
        int posicion = 0;

        do { // genera las posiciones de los animalitos
            posicionPececito = (int)(Math.random()*(altura-2)*(ancho-2));
            posicionCaracola = (int)(Math.random()*(altura-2)*(ancho-2));
            posicionCaballito = (int)(Math.random()*(altura-2)*(ancho-2));
        } while (posicionPececito == posicionCaracola || posicionPececito == posicionCaballito || posicionCaracola == posicionCaballito);

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
                    } else if (posicion==posicionCaballito) {
                        System.out.print("$");
                    } else if (posicion==posicionCaracola) {
                        System.out.print("@");
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
