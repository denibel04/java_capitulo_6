/**
 * Capítulo 6
 * Ejercicio 18: Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren sustituir el color blanco por colores más alegres.
 * Realiza un programa que genere de forma aleatoria una secuencia de tres colores aleatorios (uno para cada dormitorio) de tal forma que no se
 * repita ninguno. Los colores entre los que debe elegir el programa son los siguientes: rojo, azul, verde, amarillo, violeta y naranja.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
public class Ejercicio18 {
    public static void main (String[] args) {

        int color1 = 0;
        int color2 = 0;
        int color3 = 0;

        do {
            color1 = (int)(Math.random()*6);
            color2 = (int)(Math.random()*6);
            color3 = (int)(Math.random()*6);
        } while (color3 == color1 || color3 == color2 || color1 == color2);

        switch (color1) {
            case 0 -> System.out.print("rojo ");
            case 1 -> System.out.print("azul ");
            case 2 -> System.out.print("verde ");
            case 3 -> System.out.print("amarillo ");
            case 4 -> System.out.print("violeta ");
            case 5 -> System.out.print("naranja ");
        }

        switch (color2) {
            case 0 -> System.out.print("rojo ");
            case 1 -> System.out.print("azul ");
            case 2 -> System.out.print("verde ");
            case 3 -> System.out.print("amarillo ");
            case 4 -> System.out.print("violeta ");
            case 5 -> System.out.print("naranja ");
        }

        switch (color3) {
            case 0 -> System.out.print("rojo ");
            case 1 -> System.out.print("azul ");
            case 2 -> System.out.print("verde ");
            case 3 -> System.out.print("amarillo ");
            case 4 -> System.out.print("violeta ");
            case 5 -> System.out.print("naranja ");
        }


    }
}
