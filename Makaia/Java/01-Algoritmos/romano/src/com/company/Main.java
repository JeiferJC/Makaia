package com.company;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Obtiene el numero romano del usuario
        System.out.print("Ingrese un numero Romano: ");
        String numeroRomano  = scanner.nextLine().toUpperCase(Locale.ROOT);

        // regresa un entero al ejecutar la funcion, le pasamos una variable
        int numeroDecimal = romanToDecimal(numeroRomano);

        // Moostramos el numero
        System.out.println("El numero entero es : " + numeroDecimal);

    }
    public static int romanToDecimal(String numeroRomano) {
        // creamos un map para almacenar los numeros romanos
        Map<Character, Integer> numerosRomanos = new HashMap<>();
        numerosRomanos.put('I', 1);
        numerosRomanos.put('V', 5);
        numerosRomanos.put('X', 10);
        numerosRomanos.put('L', 50);
        numerosRomanos.put('C', 100);
        numerosRomanos.put('D', 500);
        numerosRomanos.put('M', 1000);

        // creamos una variable en 0
        int acum = 0;


        // Iteramos
        for (int i = 0; i < numeroRomano.length(); i++) {
            // obtenemos la clave
            char letra = numeroRomano.charAt(i);

            // obtenemos el valor de la posición
            int romanoActual = numerosRomanos.get(letra);
            System.out.println("numero actual vale " + romanoActual);


            //miramos si el actual es mayor al anterior
            if (i > 0 && numerosRomanos.get(numeroRomano.charAt(i - 1)) < romanoActual) {
                int romanoAnterior = numerosRomanos.get(numeroRomano.charAt(i-1));
                System.out.println("Acumulador1 vale " + acum);
                acum -= romanoAnterior;
                acum += (romanoActual-romanoAnterior);
            } else {

                acum += romanoActual;
            }
        }

        // regresamos resultado
        return acum;
    }

}
