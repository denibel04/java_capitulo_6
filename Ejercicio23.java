/**
 * Capítulo 6
 * Ejercicio 23: Las caras de un dado de poker tienen las siguientes figuras: As, K, Q, J, 7 y 8.
 * Escribe un programa que genere de forma aleatoria la tirada de cinco dados.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
public class Ejercicio23 {
    public static void main (String[] args) {
        for (int i = 0; i<5; i++) {
            int resultado = (int)(Math.random()*6);
            switch (resultado) {
                case 0 -> System.out.print("As ");
                case 1 -> System.out.print("K ");
                case 2 -> System.out.print("Q ");
                case 3 -> System.out.print("J ");
                case 4 -> System.out.print("7 ");
                case 5 -> System.out.print("8 ");
            }
        }


    }
}
