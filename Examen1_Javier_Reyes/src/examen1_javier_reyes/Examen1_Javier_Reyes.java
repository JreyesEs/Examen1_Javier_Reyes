/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1_javier_reyes;
import java.util.Scanner;
/**
 *
 * @author Javier Reyes
 */
        public class Examen1_Javier_Reyes {
            public static void main(String[] args) {
                Scanner entrada = new Scanner(System.in);
                String historial = "";

                int opcion;
                do {
                    System.out.println("Menu del primer examen de ptogramacion: ");
                    System.out.println("1. Ejercicios String");
                    System.out.println("2. Respuestas a preguntas");
                    System.out.println("3. Mostrar historial del menú");
                    System.out.println("4. Salir");
                    System.out.print("Escoja su opcion: ");
                    opcion = entrada.nextInt();

                    switch (opcion) {
                        case 1:
                            historial += "Ejercicios String - ";
                            ejerciciosString(entrada);
                            break;
                        case 2:
                            historial += "Respuestas a preguntas - ";
                            respuestasPreguntas();
                            break;
                        case 3:
                            System.out.println("Historial del menu: " + historial);
                            break;
                        case 4:
                            System.out.println("Fin del programa...");
                            break;
                        default:
                            System.out.println("Opción no valida. escoja una opcion nuevamente 1 y 4.");
                    }
                } while (opcion != 4);

               // entrada.close();
            }

            public static void ejerciciosString(Scanner scanner) {
                scanner.nextLine(); 
                System.out.print("Ingrese una cadena: ");
                String cadena = scanner.nextLine();
                int length = cadena.length();

                if (length % 2 == 0) {
                    String parte1 = cadena.substring(0, length / 2);
                    String parte2 = cadena.substring(length / 2);
                    String nuevaCadena = parte1.replaceAll("", "-") + "/" + parte2.replaceAll("", "/");
                    System.out.println("Primera mitad de la cadena: " + parte1);
                    System.out.println("Segunda mitad de la cadena: " + parte2);
                    System.out.println("Cadena resultante: " + nuevaCadena);
                }else{
                    System.out.print("Ingrese otra cadena: ");
                    String otraCadena = scanner.nextLine();
                    String nuevaCadena = cadena.concat(otraCadena);
                    System.out.println("Cadena resultante: " + nuevaCadena);
                    System.out.println("Tamaño de la nueva cadena: " + nuevaCadena.length());
                }
            }

            public static void respuestasPreguntas() {
                System.out.println("a. El if se utiliza para tomar decisiones en condiciones booleanas,");
                System.out.println("mientras que el switch case se utiliza para seleccionar una de ");
                System.out.println("multiples opciones basadas en un valor dado.");
                System.out.println("");

                System.out.println("b.El substring() se utiliza para extraer una subcadena de una cadena dada,");
                System.out.println("equalsIgnoreCase() se utiliza para comparar dos cadenas ignorando las diferencias de mayúsculas y minúsculas,");
                System.out.println("y equals() se utiliza para comparar dos cadenas teniendo en cuenta las diferencias de mayúsculas y minúsculas.");
                System.out.println("");

                System.out.println("c. La concatenación se refiere a la operación de unir dos o más cadenas para formar una nueva cadena más larga.");
            }
}

