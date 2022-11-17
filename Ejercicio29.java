/**
 * Capítulo 6
 * Ejercicio 29: Realiza un programa que muestre la previsión del tiempo para mañana en Málaga. Las temperaturas máxima y mínima se deben generar de
 * forma aleatoria entre los intervalos máximos y mínimos absolutos medidos en las últimas décadas para cada estación. La probabilidad de que esté
 * soleado o nublado en cada estación se proporciona a continuación. Obviamente, la temperatura mínima deberá ser menor o igual que la temperatura máxima.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio29 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1. Primavera\n2. Verano\n3. Otoño\n4. Invierno\nSelecciona una estación: ");
        int estacion = sc.nextInt();
        sc.close();

        // Definicion de variables
        int temp1 = 0;
        int temp2 = 0;
        String cielo = "";

        // Genera las temperaturas y el cielo segun la estacion:
        switch (estacion) {
            case 1 -> { // Primavera
                temp1 = (int) (Math.random() * 16 + 15);
                temp2 = (int) (Math.random() * 16 + 15);
                cielo = Math.random() <= 0.6 ? "soleado" : "nublado";
            }
            case 2 -> { // Verano
                temp1 = (int) (Math.random() * 21 + 25);
                temp2 = (int) (Math.random() * 21 + 25);
                cielo = Math.random() <= 0.8 ? "soleado" : "nublado";
            }
            case 3 -> { // Otoño
                temp1 = (int) (Math.random() * 11 + 20);
                temp2 = (int) (Math.random() * 11 + 20);
                cielo = Math.random() <= 0.4 ? "soleado" : "nublado";
            }
            case 4 -> { // Invierno
                temp1 = (int) (Math.random() * 25);
                temp2 = (int) (Math.random() * 25);
                cielo = Math.random() <= 0.8 ? "soleado" : "nublado";
            }
            default -> {
                System.out.println("Error. Deje de inventar estaciones >:(");
                System.exit(0);
            }
        }
        System.out.println("Previsión del tiempo para mañana");
        System.out.println("________________________________");
        System.out.printf("Temperaturas mínimas: %dºC\n", Math.min(temp1, temp2));
        System.out.printf("Temperaturas máximas: %dºC\n", Math.max(temp1, temp2));
        System.out.println("El cielo estará " + cielo);
    }
}
