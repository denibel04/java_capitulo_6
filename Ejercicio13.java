/**
 * Capítulo 6
 * Ejercicio 13: Escribe un programa que simule la tirada de dos dados. El programa deberá continuar
 * tirando los dados una y otra vez hasta que en alguna tirada los dos dados tengan el mismo valor.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
public class Ejercicio13 {
    public static void main (String[] args) {
        int tirada1, tirada2;
        do {
            tirada1 = (int)(Math.random()*6 + 1);
            tirada2 = (int)(Math.random()*6 + 1);
            System.out.printf("%d %d\n", tirada1, tirada2);
        } while (tirada1 != tirada2);
    }
}
