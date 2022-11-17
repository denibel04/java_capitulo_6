/**
 * Capítulo 6
 * Ejercicio 31: Realiza el juego del “Craps”. Las reglas son las siguientes: Al comenzar la partida, el jugador introduce la cantidad de dinero que
 * quiere apostar. Se muestra la tirada aleatoria de dos dados. Si entre los dos dados suman 7 u 11, el jugador gana la misma cantidad que apostó y
 * termina la partida. Por ej. si apostó 1000 €, gana otros 1000 € y acaba con 2000 €. Si entre los dos dados suman 2, 3 o 12, el jugador pierde todo
 * su dinero y termina la partida. Si no se da ninguno de los casos anteriores, es decir si sale 4, 5, 6, 8, 9 o 10, el juego entra en una segunda etapa.
 * En esta etapa, el jugador buscará volver a obtener ese número en los dados. Si consigue repetir ese número, gana. Si sale un 7, pierde. Si sale otro
 * número, tiene que seguir tirando.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio31 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bienvenido a Craps! ¿Cuánto dinero quiere apostar?: ");
        int apuesta = sc.nextInt();
        sc.close();

        int dado1 = (int)(Math.random()*6) + 1;
        int dado2 = (int)(Math.random()*6) + 1;
        int suma = dado1 + dado2;
        int suma2;

        System.out.printf("En el primer dado ha salido %d y en el segundo %d\n", dado1, dado2);

        if (suma == 7 || suma == 11) {
            System.out.printf("La suma de los dados es %d, felicidades! Ha duplicado su apuesta, gana: %d", dado1+dado2, apuesta*2);
        } else if (suma == 2 || suma == 3 || suma == 12) {
            System.out.printf("La suma de los dados es %d... Ha perdido todo su dinero", dado1+dado2);
        } else {
            do {
                System.out.printf("\nLa suma de los dados es %d. Aún no ha perdido, se vuelven a tirar los dados:\n", dado1+dado2);
                // Se vuelven a tirar los dados
                dado1 = (int)(Math.random()*6) + 1;
                dado2 = (int)(Math.random()*6) + 1;
                suma2 = dado1 + dado2;

                System.out.printf("En el primer dado ha salido %d y en el segundo %d", dado1, dado2);
                if (suma2 == suma) {
                    System.out.printf("\nLa suma de los dados es %d de nuevo, felicidades! Ha duplicado su apuesta, gana: %d", suma2, apuesta*2);
                } else if (suma2 == 7) {
                    System.out.printf("\nLa suma de los dados es %d... Ha perdido todo su dinero", suma2);
                    System.exit(0);
                }
            } while (suma2 != suma);

        }
    }
}
