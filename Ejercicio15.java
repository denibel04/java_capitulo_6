/**
 * Capítulo 6
 * Ejercicio 15: Realiza un generador de melodía con las siguientes condiciones:
 * a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa, sol, la y si.
 * b) Una melodía está formada por un número aleatorio de notas mayor o igual a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…).
 * c) Cada grupo de 4 notas será un compás y estará separado del siguiente compás mediante la barra vertical “|” (Alt + 1). El final de la
 * melodía se marca con dos barras.
 * d) La última nota de la melodía debe coincidir con la primera.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
public class Ejercicio15 {
    public static void main (String[] args) {
        String nota = "";
        String primeraNota = "";
        int longitud = 4 * (int)(Math.random()*(7)+1);

        for (int i = 1; i<=longitud; i++) {
            for (int j=1; j<5; j++) {
                int numNota = (int)(Math.random()*(7)+1);
                nota = switch (numNota) {
                    case 1 -> "do";
                    case 2 -> "re";
                    case 3 -> "mi";
                    case 4 -> "fa";
                    case 5 -> "sol";
                    case 6 -> "la";
                    case 7 -> "si";
                    default -> "";
                };
                if (i == 1 && j ==1) {
                    primeraNota = nota;
                    System.out.print(primeraNota + " ");
                } else {
                    if (i == longitud && j == 4) {
                        nota = primeraNota;
                    }
                    System.out.print(" " + nota + " ");
                }
            }
            System.out.print("|");
        }
        System.out.print("|");



    }
}
