package com.frank.demo.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class NumerosController {

    @GetMapping("/numeros")
    public List<Integer> obtenerNumeros() {
        List<Integer> numeros = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numeros.add(random.nextInt(100));
        }
        return numeros;
    }
}
