/**
 * Capítulo 6
 * Ejercicio 24: Escribe un programa que, dado un número introducido por teclado, elija al azar uno de sus dígitos.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio24 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        long num = sc.nextLong();
        long aux = num;
        sc.close();

        int i = 0; // contador para la longitud del número
        while (aux>0) {
            aux /= 10;
            i++;
        }
        int digito = (int)(Math.random()*i) +1; // elige uno de los dígitos al azar

        // Imprime el dígito obtenido
        System.out.println((num / (long)(Math.pow(10, i - digito))) % 10);
    }
}
