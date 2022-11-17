/**
 * Capítulo 6
 * Ejercicio 12: Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
 * con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para convertir un entero
 * en un carácter.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
public class Ejercicio12 {
    public static void main (String[] args) {
        System.out.print("\033[92m"); // escribe en verde
        for (int i = 0; i<10000; i++) {
            char caracter = (char)(Math.random()*(126-32+1)+ 32);
            System.out.print(caracter);
            if (i%200 == 0) {
                System.out.println("");
            }
        }
    }
}
