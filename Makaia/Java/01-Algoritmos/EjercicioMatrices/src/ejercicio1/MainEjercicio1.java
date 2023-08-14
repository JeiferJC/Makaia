package ejercicio1;

import javax.swing.*;
import java.util.Random;

public class MainEjercicio1 {
    public static void main(String[] args) {

        int var = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un tamaño"));

        int filas = 3;
        int columnas = 3;

        int[][] matriz1 = new int[var][var];
        int[][] matriz2 = new int[var][var];
        int [][] matrizSuma = new int [var][var];

        //Agregamos contenido a las matrices
        llenarMatriz(matriz1, 10, 99);
        llenarMatriz(matriz2, 10, 99);

        //Mostrar las matrices
        System.out.println("Matriz 1:");
        mostrarMatriz(matriz1);

        System.out.println("Matriz 2:");
        mostrarMatriz(matriz2);
    }

    public static void llenarMatriz(int[][] matriz, int min, int max){
        Random random = new Random();

        for (int i=0; i<matriz.length; i++){
            for (int j=0; j < matriz[i].length; j++){
                matriz[i][j] = random.nextInt(max - min +1) + min;
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz){
        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

}
