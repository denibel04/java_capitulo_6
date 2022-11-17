/**
 * Capítulo 6
 * Ejercicio 21: Realiza un programa que genere una secuencia de cinco monedas de curso legal lanzadas al aire. Las monedas disponibles son de
 * 1 céntimo, 2 céntimos, 5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. Las dos posiciones posibles son cara y cruz.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
public class Ejercicio21 {
    public static void main (String[] args) {
        for (int i = 0; i<5; i++) {
            int moneda = (int)(Math.random()*8);
            switch (moneda) {
                case 0 -> System.out.print("1 céntimo ");
                case 1 -> System.out.print("2 céntimos ");
                case 2 -> System.out.print("5 céntimos ");
                case 3 -> System.out.print("10 céntimos ");
                case 4 -> System.out.print("20 céntimos ");
                case 5 -> System.out.print("50 céntimos ");
                case 6 -> System.out.print("1 euro ");
                case 7 -> System.out.print("2 euros ");
            }
            int posicion = (int)(Math.random()*2);
            switch (posicion) {
                case 0 -> System.out.print("- cara");
                case 1 -> System.out.print("- cruz");
            }
            System.out.println("");
        }
    }
}
