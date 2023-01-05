package com.frank.demo.Service;

import com.frank.demo.Model.Persona;
import com.frank.demo.Repository.PersonaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class PersonaServiceImpl implements PersonaService {


    @Autowired
    private PersonaRepository personaRepository;

    /**
     * @param persona
     * @return
     */
    @Override
    public Persona savePersona(Persona persona) {
        log.info("Se guardo Persona con exito ");
        return personaRepository.save(persona);
    }

    /**
     * @param id
     */
    @Override
    public void delete(long id) {
        log.info("Se borro Persona con exito ");
        personaRepository.deleteById(id);
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Persona findById(long id) {
        Optional<Persona> optional = personaRepository.findById(id);
        Persona persona = null;
        if (optional.isPresent()) {
            persona = optional.get();
        } else {
            throw new RuntimeException(" Persona not found for id :: " + id);
        }
        log.info("Se busco por id Persona con exito ");
        return persona;
    }

    /**
     * @return
     */
    @Override
    public List<Persona> findAll() {
        log.info("Se Busco todas las Personas con exito ");
        return (List<Persona>) personaRepository.findAll();
    }
}
