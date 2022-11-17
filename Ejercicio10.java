/**
 * Capítulo 6
 * Ejercicio 10: Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
 * El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno
 * de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud aleatoria
 * entre 1 y 40 caracteres.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
public class Ejercicio10 {
    public static void main (String[] args) {
        int longitud = (int)(Math.random()*40 +1);
        String relleno = "";
        for (int i = 0; i<10; i++) {
            int numRelleno = (int)(Math.random()*6);
            relleno = switch (numRelleno) {
                case 0 -> "*";
                case 1 -> "-";
                case 2 -> "=";
                case 3 -> ".";
                case 4 -> "|";
                case 5 -> "@";
                default-> "";
            };
            for (int j = 0; j<longitud; j++) {
                System.out.print(relleno);
            }
            System.out.println();
        }
    }
}
