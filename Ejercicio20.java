/**
 * Capítulo 6
 * Ejercicio 20: Realiza un programa que pinte por pantalla una cuba con cierta cantidad de agua. La capacidad será indicada por el usuario.
 * La cuba se llenará con una cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que pueda admitir. El ancho de la cuba no varía.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio20 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, indique la capacidad de la cuba en litros: ");
        int capacidad = sc.nextInt();

        int agua = (int)(Math.random()*capacidad+1);

        for (int i = 0; i<capacidad; i++) {
            if (i < capacidad - agua) {
                System.out.println("*    *");
            } else {
                System.out.println("*====*");
            }
        }
        System.out.println("******");

        sc.close();
    }
}
