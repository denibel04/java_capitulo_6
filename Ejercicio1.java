/**
 * Capítulo 6
 * Ejercicio 1: Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
 * también la suma total (los puntos que suman entre los tres dados).
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
public class Ejercicio1 {
    public static void main (String[] args) {
        double suma = 0;
        System.out.print("Los resultados de tirar un dado tres veces son: ");
        for (int i = 1; i<=3; i++) {
            double aleatorio = Math.random()*6 + 1;
            System.out.printf("%.0f ", aleatorio);
            suma += aleatorio;
        }
        System.out.printf("\nLa suma de los resultados es: %.0f", suma);
    }
}
