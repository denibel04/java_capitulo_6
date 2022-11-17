/**
 * Capítulo 6
 * Ejercicio 25: Escribe un programa que muestre por pantalla 100 números enteros separados por un espacio. Los números deben estar generados de
 * forma aleatoria en un rango entre 10 y 200 ambos incluidos. Los primos deben aparecer entre almohadillas (p. ej. #19#) y los múltiplos de 5
 * entre corchetes (p. ej. [25]).
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
public class Ejercicio25 {
    public static void main (String[] args) {
        for (int i=0; i<100; i++) {
            // Genera los números aleatorios
            int num = 10 + (int)(Math.random()*201-10);

            // Para comprobar si es primo:
            boolean esprimo = true;
            for (int j = 2; j < num; j++) {
                if ((num % j) == 0) {
                    esprimo = false;
                }
            }

            // Imprime los números
            if (num%5==0) {
                System.out.printf("[%d] ", num);
            } else if (esprimo){
                System.out.printf("#%d# ", num);
            } else {
                System.out.print(num + " ");
            }
        }
    }
}
