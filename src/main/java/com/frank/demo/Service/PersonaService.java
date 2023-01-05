package com.frank.demo.Service;

import com.frank.demo.Model.Employee;
import com.frank.demo.Model.Persona;

import java.util.List;

public interface PersonaService {

    public Persona savePersona(Persona persona);

    public void delete(long id);

    public Persona findById(long id);

    public List<Persona> findAll();
}
