/**
 * Capítulo 6
 * Ejercicio 2: Realiza un programa que muestre al azar el nombre de una carta de la baraja
 * francesa. Esta baraja está dividida en cuatro palos: picas, corazones, diamantes y tréboles.
 * Cada palo está formado por 13 cartas, de las cuales 9 cartas son numerales y 4 literales: 2,
 * 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el 1). Para convertir un número en una cadena
 * de caracteres podemos usar String.valueOf(n).
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
public class Ejercicio2 {
    public static void main (String[] args) {
        System.out.print("Este programa muestra una carta al azar de la baraja francesa: ");
        String carta = "";
        int numeroCarta = (int)(Math.random()*13 + 2);
        carta = switch (numeroCarta) {
            case 1 -> "As";
            case 11 -> "J";
            case 12 -> "Q";
            case 13 -> "K";
            default -> String.valueOf(numeroCarta);
        };
        String palo = "";
        int numeroPalo = (int)(Math.random()*4 + 1);
        switch (numeroPalo) {
            case 1 -> palo = "picas";
            case 2 -> palo = "corazones";
            case 3 -> palo = "tréboles";
            case 4 -> palo = "diamantes";
        }
        System.out.printf("%s de %s", carta, palo);
    }
}
