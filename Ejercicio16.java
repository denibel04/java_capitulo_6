/**
 * Capítulo 6
 * Ejercicio 17: Realiza un simulador de máquina tragaperras simplificada que cumpla los siguientes requisitos:
 * a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5 figuras posibles: corazón, diamante, herradura, campana y limón.
 * b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha perdido”.
 * c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien, ha recuperado su moneda”.
 * d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado 10 monedas”.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
public class Ejercicio16 {
    public static void main (String[] args) {
        String figura = "";
        int figura1 = 0;
        int figura2 = 0;
        int figura3 = 0;
        for (int i = 1; i<4; i++) {
            int numFigura = (int)(Math.random()*5);
            figura = switch (numFigura) {
                case 0 -> "❤"; // corazon
                case 1 -> "♦"; // diamante
                case 2 -> "Ω"; // herradura
                case 3 -> "\uD83D\uDD14"; // campana
                case 4 -> "\uD83C\uDF4B"; // limón
                default -> "";
            };
            System.out.print(figura + " ");
            switch (i){
                case 1 -> figura1 = numFigura;
                case 2 -> figura2 = numFigura;
                case 3 -> figura3 = numFigura;
            }
        }
        if (figura1 != figura2 && figura1 !=figura3  && figura2 != figura3) { // todos diferentes
            System.out.print("\nLo siento, ha perdido");
        } else if (figura1 == figura2 && figura1 == figura3) { // todos iguales
            System.out.print("\nFelicidades !! ha ganado 10 monedas");
        } else {
            System.out.print("\nNo ha ganado, pero recupera su moneda");
        }
    }
}
