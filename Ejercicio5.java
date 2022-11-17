/**
 * Capítulo 6
 * Ejercicio 5: Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por espacios.
 * Muestra también el máximo, el mínimo y la media de esos números.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
public class Ejercicio5 {
    public static void main (String[] args) {
        System.out.println("Este programa muestra 50 números aleatorios:");
        int max = 100;
        int min = 199;
        double suma = 0;

        for (int i = 0; i<50; i++) {
            // Genera e imprime los números aleatorios
            int aleatorio = (int)(Math.random()*100 + 100);
            if (i%10 == 0 && i!=0) {
                System.out.print("\n"+aleatorio + " ");
            } else {
                System.out.print(aleatorio + " ");
            }

            if (aleatorio > max) {
                max = aleatorio;
            } else if (min > aleatorio) {
                min = aleatorio;
            }
            suma += aleatorio;
        }

        System.out.printf("\nDe todos, el mayor número es el %d, el menor es el %d y la media es: %.2f", max, min, suma/50);
    }
}
