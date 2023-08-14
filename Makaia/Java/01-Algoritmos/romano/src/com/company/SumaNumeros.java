package com.company;

import java.util.Random;
import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de filas: ");
        int tamanioFilas = scanner.nextInt();


        int matriz[][] = new int[tamanioFilas][3];

        llenarMatriz(matriz, tamanioFilas);
    }

    private static void llenarMatriz(int[][] matriz, int tamanioFilas) {
        Random random = new Random();
        //Llenamos matriz
        for (int i = 0; i<tamanioFilas; i++ ){
            for (int j = 0; j<=2; j++){
                if(j==2){
                    matriz[i][2] = matriz[i][0] + matriz[i][1];
                }else{matriz[i][j] = random.nextInt(1, 9);}
            }
        }

        //mostramos Matriz
        System.out.println("El array generado es el siguiente");
        for (int i = 0; i<tamanioFilas; i++ ){
            for (int j = 0; j<=2; j++){
                System.out.print(matriz[i][j] + " "); ;
            }
            System.out.println();
        }

    }



}
