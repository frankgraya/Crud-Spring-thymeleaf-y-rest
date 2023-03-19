package com.frank.demo.RestController;

import com.frank.demo.Model.Persona;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

@RestController
public class PersonaController {

    @PostMapping("/creaArchivo")
    public String creaArchivo(@RequestBody List<Persona> personas) {
        try {
            FileWriter writer = new FileWriter("personas.txt");
            for (Persona persona : personas) {
                writer.write(persona.getNombre() + "|" + persona.getApellidoPaterno() + "|" +
                        persona.getApellidoMaterno() + "|" + persona.getEdad() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            return "Error al crear archivo";
        }
        return "Archivo creado exitosamente";
    }
}