package com.frank.demo.Service;

import com.frank.demo.Model.Usuario;
import com.frank.demo.Repository.UsuarioRepository;
import java.util.List;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author frank
 */
@Service
@Slf4j
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository UsuarioRepository;

    @Override
    public Usuario saveUsuario(Usuario Usuario) {
        log.info("Se guardo saveUsuario con exito ");
        return UsuarioRepository.save(Usuario);
    }

    @Override
    public void delete(long id) {
        UsuarioRepository.deleteById(id);
    }

    @Override
    public Usuario findById(long id) {
        Optional<Usuario> optional = UsuarioRepository.findById(id);
        Usuario Usuario = null;
        if (optional.isPresent()) {
            Usuario = optional.get();
        } else {
            throw new RuntimeException(" Usuario not found for id :: " + id);
        }
        return Usuario;
    }

    @Override
    public List<Usuario> findAll() {
        return (List<Usuario>) UsuarioRepository.findAll();
    }

}
