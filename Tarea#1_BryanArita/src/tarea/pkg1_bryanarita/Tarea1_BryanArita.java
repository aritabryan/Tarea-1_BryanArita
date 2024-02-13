/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.pkg1_bryanarita;

import java.util.Scanner;

/**
 *
 * @author BJAL
 */
public class Tarea1_BryanArita {

    public static void main(String[] args) {
        Scanner duki = new Scanner(System.in);
        System.out.println("***MENU***\n[1]Cuantos numeros pares e impares hay entre este rango?\n"
                + "[2]Triangulos y mas Triangulos\n[3]Anita lava la tina\n[4]Codigos secretos\n[5]Salir del programa");
        int opcion = duki.nextInt();
        while (opcion != 5) {
            switch (opcion) {
                case 1:

                    char resp = 's';
                    while (resp == 's' || resp == 'S') {
                        System.out.print("Ingrese el numero: ");
                        int n = duki.nextInt();
                        while (n < 1) {
                            System.out.println("porfavor ingrese numeros mayor a 0");
                            System.out.print("Ingrese el numero: ");
                            n = duki.nextInt();
                        }
                        int par = 0;
                        int impar = 0;
                        String numimpar = "";
                        String numpar = "";
                        boolean espar = true;
                        boolean esimpar = true;

                        for (int i = 0; i <= n; i++) {
                            if (i % 2 == 0) {
                                par++;
                                if (!espar) {
                                    numpar += ", ";
                                }
                                numpar += i;
                                espar = false;
                            } else {
                                impar++;
                                if (!esimpar) {
                                    numimpar += ", ";
                                }
                                numimpar += i;
                                esimpar = false;
                            }
                        }
                        System.out.println("entre " + n + " y 0 existen " + par + " numeros pares y estos son: " + numpar);
                        System.out.println("entre " + n + " y 0 existen " + impar + " numeros impares y estos son: " + numimpar);
                        System.out.print("Desea contiunar [S/N]: ");
                        resp = duki.next().charAt(0);
                    }

                    break;
                case 2:
                    System.out.println("\n***TRIANGULOS***\n[1]Triangulo rectangulo\n[2]Triangulo equilatero\n[3]Salir de Triangulos");
                    int triangulo = duki.nextInt();
                    while (triangulo != 3) {
                        while (triangulo > 3 || triangulo < 1) {
                            System.out.println("Opcion no disponible!!!");
                            System.out.println("\n***TRIANGULOS***\n[1]Triangulo rectangulo\n[2]Triangulo equilatero\n[3]Salir de Triangulos");
                            triangulo = duki.nextInt();
                        }
                        System.out.println("Ingrese la altura para el triangulo: ");
                        int altura = duki.nextInt();
                        while (triangulo == 2 && altura % 2 != 0) {
                            System.out.println("La altura del triangulo equilatero debe de ser par");
                            System.out.println("Ingrese la altura para el triangulo: ");
                            altura = duki.nextInt();
                        }
                        if (triangulo == 1) {
                            for (int i = 0; i < altura; i++) {
                                for (int j = 0; j < altura; j++) {

                                    if (i >= j) {
                                        System.out.print(" * ");
                                    }
                                }
                                System.out.println();

                            }
                        } else if (triangulo == 2) {
                            for (int i = 0; i < altura; i++) {
                                for (int j = 0; j < altura * 2 - 1; j++) {
                                    if ((i + j >= altura - 1 && j < altura) || (j - i <= altura - 1 && j >= altura)) {
                                        System.out.print("*");
                                    } else {
                                        System.out.print(" ");
                                    }
                                }
                                System.out.println();
                            }
                        }
                        System.out.println("\n***TRIANGULOS***\n[1]Triangulo rectangulo\n[2]Triangulo equilatero\n[3]Salir de Triangulos");
                        triangulo = duki.nextInt();
                    }
                    System.out.println("Saliendo de triangulos...");
                    break;
                case 3:
                    char resp2 = 's';
                    while (resp2 == 's' || resp2 == 'S') {
                        System.out.println("Ingrese palabra: ");
                        String palabra = duki.next().toLowerCase();
                        String acum = "";
                        for (int i = palabra.length() - 1; i >= 0; i--) {
                            acum += palabra.charAt(i);
                        }
                        if (acum.equals(palabra)) {
                            System.out.println("la palabra ES UNA palindroma");
                        } else {
                            System.out.println("la palabra NO ES UNA palindroma");
                        }
                        System.out.print("Desea ingresar otra palabra[S/N]: ");
                        resp2 = duki.next().charAt(0);
                    }
                    System.out.println("Saliendo al menu...");
                    break;
                case 4:
                    char resp3 = 's';
                    while (resp3 == 's' || resp3 == 'S') {
                        System.out.println("Ingrese palabra");
                        String word = duki.next();
                        int pos = 0;
                        int numero = 1;
                        for (int i = 0; i < word.length(); i += 2) {//+2 ya que hay que saltarse una posicion de la letra
                            if (numero >= word.length()) {
                                break;
                            }
                            char x = word.charAt(i);
                            char y = word.charAt(numero);
                            String num = Character.toString(y);
                            pos = Integer.parseInt(num);
                            for (int j = 0; j < pos; j++) {
                                System.out.print(x);
                            }
                            numero += 2;
                        }
                        System.out.print("\nDesea ingresar otra palabra[S/N]? ");
                        resp3 = duki.next().charAt(0);
                    }
                    break;

                default:
                    System.out.println("Opcion no disponible, porfavor ingrese una de las opciones mostradas");
                    break;
            }
            System.out.println("\n***MENU***\n[1]Cuantos numeros pares e impares hay entre este rango?\n"
                    + "[2]Triangulos y mas Triangulos\n[3]Anita lava la tina\n[4]Codigos secretos\n[5]Salir del programa");
            opcion = duki.nextInt();
        }

        System.out.println(
                "Saliendo del programa...");
    }

}
