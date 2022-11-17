/**
 * Capítulo 6
 * Ejercicio 11: Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
 * aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al final aparecerá
 * el número de suspensos, el número de suficientes, el número de bienes, etc.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
public class Ejercicio11 {
    public static void main (String[] args) {
        System.out.print("Notas generadas al azar: ");
        int suspensos = 0;
        int suficientes = 0;
        int bienes = 0;
        int notables = 0;
        int sobresalientes = 0;
        for (int i=0; i<20; i++) {
            int nota = (int)(Math.random()*10 +1);
            System.out.print(nota + " ");
            switch (nota) {
                case 1, 2 -> suspensos++;
                case 3, 4 -> suficientes++;
                case 5, 6 -> bienes++;
                case 7, 8 -> notables++;
                case 9, 10 -> sobresalientes++;
            }
        }
        System.out.printf("\nDe esas 20 notas generadas al azar, %d son suspensos, %d son suficientes, %d son bienes, %d son notables y %d son sobresalientes", suspensos, suficientes, bienes, notables, sobresalientes);
    }
}
