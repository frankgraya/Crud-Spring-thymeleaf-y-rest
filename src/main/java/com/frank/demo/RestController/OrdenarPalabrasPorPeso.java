package com.frank.demo.RestController;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OrdenarPalabrasPorPeso {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();
        ordenarPalabras(frase);
        scanner.close();
    }

    public static void ordenarPalabras(String frase) {
        Map<String, Integer> pesosPalabras = new HashMap<>();
        String[] palabras = frase.split(" ");
        // Creamos un mapa que asocia cada palabra con su peso

        for (String palabra : palabras) {
            int peso = 0;
            for (char letra : palabra.toLowerCase().toCharArray()) {
                peso += Character.getNumericValue(letra);
            }
            pesosPalabras.put(palabra, peso);
            // Calculamos el peso de cada palabra sumando los pesos de sus letras
        }

        String[] palabrasOrdenadas = Arrays.stream(palabras)
                .sorted(Comparator.comparingInt(pesosPalabras::get))
                .toArray(String[]::new);
        // Ordenamos las palabras según su peso

        for (String palabra : palabrasOrdenadas) {
            System.out.println(palabra.substring(0, 1).toUpperCase() + palabra.substring(1) + " = " + pesosPalabras.get(palabra));
            // Imprimimos cada palabra con su peso en consola
        }
    }
}
