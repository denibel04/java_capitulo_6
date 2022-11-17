/**
 * Capítulo 6
 * Ejercicio 27: Implementa el juego piedra, papel y tijera. Primero, el usuario introduce su jugada y luego el ordenador genera al azar una de
 * las opciones. Si el usuario introduce una opción incorrecta, el programa deberá mostrar un mensaje de error.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio27 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Juguemos a piedra, papel o tijera! Vas primero: ");
        String turnoJug = sc.next();
        sc.close();

        int num_turnoJug = switch (turnoJug.toLowerCase()) {
            case "piedra" -> 0;
            case "papel" -> 1;
            case "tijera" -> 2;
            default -> 3;
        };

        if (num_turnoJug == 3) {
            System.out.print("Error, no ha introducido bien su jugada :(");
        } else {
            // turno del ordenador
            System.out.print("Ahora voy yo! elijo ");
            int turnOrd = (int)(Math.random()*3);
            switch (turnOrd) {
                case 0 -> System.out.println("piedra");
                case 1 -> System.out.println("papel");
                case 2 -> System.out.println("tijera");
            }

            // Resultados
            if (num_turnoJug == turnOrd) {
                System.out.print("Empate!");
            } else {
                int ganador = 2;
                switch (num_turnoJug) {
                    case 0:
                        if (turnOrd == 2) {
                            ganador = 1;
                        }
                        break;
                    case 1:
                        if (turnOrd == 3) {
                            ganador = 1;
                        }
                        break;
                    case 2:
                        if (turnOrd == 1) {
                            ganador = 1;
                        }
                        break;
                }
                if (ganador==2) {
                    System.out.print("Ja! ganó la máquina B)");
                } else {
                    System.out.print("Jo, ganaste tú :(");
                }
            }
        }
    }
}
