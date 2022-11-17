/**
 * Capítulo 6
 * Ejercicio 9: Realiza un programa que vaya generando números aleatorios pares entre 0
 * y 100 y que no termine de generar números hasta que no saque el 24. El
 * programa deberá decir al final cuántos números se han generado.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
public class Ejercicio9 {
    public static void main (String[] args) {
        int aleatorio = 0;
        int i = 0;
        do  {
            aleatorio = (int)(Math.random()*51) *2;
            i++;
            System.out.print(aleatorio + " ");
        } while (aleatorio != 24);

        System.out.printf("\nFueron necesarios %d intentos para sacar un 24", i);

    }
}
