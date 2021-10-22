/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.frank.demo.RestController;

import com.frank.demo.Model.Estudiante;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author frank
 */
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class EstudianteRestController {

    // http://localhost:4000/Estudiante
    @GetMapping("/Estudiante")
    public Estudiante getEstudiante() {
        return new Estudiante(1, "francisco", "granados");
    }

    @GetMapping("/Estudiantes")
    public List<Estudiante> obtentenEstudiante() {
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante(1, "francisco", "granados"));
        estudiantes.add(new Estudiante(2, "tere", "yañez"));
        estudiantes.add(new Estudiante(3, "josefina", "somera"));
        return estudiantes;
    }

    @GetMapping("{nombre}/{apellido}")
    public Estudiante estudiantePathVariable(String nombre, String apellido) {
        return new Estudiante(nombre, apellido);
    }

}
