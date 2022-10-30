/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenfinal;

import java.util.Scanner;

/**
 *
 * @author David Monterroso
 */
public class ExamenFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {

            System.out.println("**********************");
            System.out.println("*     BIENVENIDO     *");
            System.out.println("**********************");
            System.out.println("* 1. Problema 1      *");
            System.out.println("* 2. Problema 2      *");
            System.out.println("* 3. Problema 3      *");
            System.out.println("**********************");

            int opcion;
            System.out.println("Ingrese el número de opción a ejecutar");
            Scanner datoOpcion = new Scanner(System.in);
            opcion = datoOpcion.nextInt();

            switch (opcion) {
                case 1:

                    int N1;
                    System.out.println("Ingrese el primer número");
                    Scanner datoN1 = new Scanner(System.in);
                    N1 = datoN1.nextInt();

                    int N2;
                    System.out.println("Ingrese el segundo número");
                    Scanner datoN2 = new Scanner(System.in);
                    N2 = datoN2.nextInt();

                    if (N1 > N2) {
                        System.out.println("El número mayor es " + N1);
                    } else {
                        System.out.println("El número mayor es " + N2);
                    }

                    break;
                case 2:

                    int N;
                    System.out.println("Ingrese el número del triangulo");
                    Scanner datoN = new Scanner(System.in);
                    N = datoN.nextInt();

                    if (N % 2 == 0) {
                        System.out.println("Número Ingresado invalido");
                    } else {

                        for (int i = 1; i <= (N / 2) + 1; i++) {

                            for (int j = 1; j <= N - i; j++) {
                                System.out.print(" ");
                            }

                            for (int j = 1; j <= (i * 2) - 1; j++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }

                    }

                    break;
                case 3:
                    int vacas;
                    System.out.println("Ingrese Número de Vacas");
                    Scanner datoVacas = new Scanner(System.in);
                    vacas = datoVacas.nextInt();

                    int peso;
                    System.out.println("Ingrese Peso Limite de Camion en KG");
                    Scanner datoPeso = new Scanner(System.in);
                    peso = datoPeso.nextInt();

                    String pesosVacas = "";
                    System.out.println("Ingrese los pesos de las vacas");
                    Scanner datoPesosVacas = new Scanner(System.in);
                    pesosVacas = datoPesosVacas.nextLine();

                    String[] datoPesosVacas2 = pesosVacas.split(",");

                    String lecheVacas = "";
                    System.out.println("Ingrese la producción de leche de las vacas");
                    Scanner datoLecheVacas = new Scanner(System.in);
                    lecheVacas = datoLecheVacas.nextLine();

                    String[] datoLecheVacas2 = lecheVacas.split(",");

                    int pesoVaca = 0;
                    int lecheVaca = 0;
                    for (int i = 0; i < vacas; i++) {              
                        if (pesoVaca <= peso) {
                            pesoVaca = pesoVaca + Integer.parseInt(datoPesosVacas2[i]);
                            lecheVaca = lecheVaca +Integer.parseInt(datoLecheVacas2[i]);
                            if (pesoVaca > peso) {
                                pesoVaca = pesoVaca - Integer.parseInt(datoPesosVacas2[i]); 
                                lecheVaca = lecheVaca - Integer.parseInt(datoLecheVacas2[i]);
                            }
                        }
                    }    
                    
                    System.out.println("El peso de la vaca que se llevara en el carro es " + pesoVaca + " kg");
                    System.out.println("La producción total de leche es " + lecheVaca);
                    
                    
                    break;
                default:
                    System.out.println("OPCION INCORRECTA");
            }
        } catch (Exception e) {
            System.out.println("Dato Incorrecto");
        }
    }

}
