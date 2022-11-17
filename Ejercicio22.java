/**
 * Capítulo 6
 * Ejercicio 22: Realiza un programa que pinte por pantalla una serpiente con un “serpenteo” aleatorio. La cabeza se representará con el carácter
 * @ y se debe colocar exactamente en la posición 13 (con 12 espacios delante). A partir de ahí, el cuerpo irá serpenteando de la siguiente manera:
 * se generará de forma aleatoria un valor entre tres posibles que hará que el siguiente carácter se coloque una posición a la izquierda del anterior,
 * alineado con el anterior o una posición a la derecha del anterior. La longitud de la serpiente se pedirá por teclado y se supone que el usuario
 * introducirá un dato correcto.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio22 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int posicion = 13;
        System.out.print("Introduce la longitud de la serpiente: ");
        int longitud = sc.nextInt();
        sc.close();

        System.out.println("            @");
        for (int i = 0; i<longitud; i++) {
            int serpenteo = 1-(int)(Math.random()*3);
            posicion += serpenteo;
            for (int j = 1; j<=posicion; j++) {
                if (j==posicion) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
