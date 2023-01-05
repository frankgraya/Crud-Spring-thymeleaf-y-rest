package com.frank.demo.RestController;

import com.frank.demo.Model.Persona;
import com.frank.demo.Service.PersonaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api")
public class PersonaRestController {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/personas")
    public List<Persona> persona() {
        return personaService.findAll();
    }

    @PostMapping("/persona")
    public Persona save(@RequestBody Persona persona) {
        return personaService.savePersona(persona);
    }

    @GetMapping("/persona/{id}")
    public Persona MostrarPorId(@PathVariable Integer id) {
        return personaService.findById(id);
    }

    @PutMapping("/persona/{id}")
    public Persona update(@RequestBody Persona persona, @PathVariable Integer id) {
        Persona personaActual = personaService.findById(id);
        personaActual.setNombre(persona.getNombre());
        personaActual.setApellidos(persona.getApellidos());
        personaActual.setEdad(persona.getEdad());
        return personaService.savePersona(persona);
    }

  //  @DeleteMapping("/persona/{id}")
    //public void delete(@PathVariable Integer id){
      //  personaService.delete(id);
    //}
}
