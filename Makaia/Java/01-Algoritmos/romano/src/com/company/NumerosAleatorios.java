package com.company;


import java.util.Random;
import java.util.Scanner;

public class NumerosAleatorios {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de filas: ");
        int tamanioFilas = scanner.nextInt();

        System.out.println("Ingrese la cantidad de columnas: ");
        int tamanioColumnas = scanner.nextInt();

        int matriz[][] = new int[tamanioFilas][tamanioColumnas];

        llenarMatriz(matriz, tamanioFilas, tamanioColumnas);

    }

    private static void llenarMatriz(int[][] matriz, int tamanioFilas, int tamanioColumnas) {
        Random random = new Random();
        //Llenamos matriz
        for (int i = 0; i<tamanioFilas; i++ ){
            for (int j = 0; j<tamanioColumnas; j++){
                matriz[i][j] = random.nextInt(10, 100);
            }
        }


        //mostramos Matriz
        System.out.println("El array generado es el siguiente");
        for (int i = 0; i<tamanioFilas; i++ ){
            for (int j = 0; j<tamanioColumnas; j++){
                System.out.print(" "+ matriz[i][j]); ;
            }
            System.out.println();
        }


    }

}
