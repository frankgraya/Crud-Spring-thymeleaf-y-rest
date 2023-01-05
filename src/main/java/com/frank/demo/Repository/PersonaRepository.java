package com.frank.demo.Repository;

import com.frank.demo.Model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("PersonaRepository")
public interface PersonaRepository extends JpaRepository <Persona, Long> {
}
