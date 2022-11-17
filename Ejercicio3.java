/**
 * Capítulo 6
 * Ejercicio 3: Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
 * de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
public class Ejercicio3 {
    public static void main (String[] args) {
        System.out.print("Este programa muestra una carta al azar de la baraja española: ");
        String carta = "";
        int numeroCarta = (int)(Math.random()*10 + 1);
        carta = switch (numeroCarta) {
            case 1 -> "As";
            case 8 -> "Sota";
            case 9 -> "Caballo";
            case 10 -> "Rey";
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
