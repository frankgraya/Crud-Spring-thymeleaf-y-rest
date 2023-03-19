package com.frank.demo.RestController;

import com.frank.demo.Model.Usuario;
import com.frank.demo.Service.UsuarioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api")
//http://localhost:4000/api
public class UsuarioRestController {

    @Autowired
    private UsuarioService UsuarioService;

    @PostMapping("/Usuarios")
    public Usuario save(@RequestBody Usuario Usuario) {
        return UsuarioService.saveUsuario(Usuario);
    }

    @GetMapping("/Usuarios")
    public List<Usuario> Usuario() {
        return UsuarioService.findAll();
    }

    @GetMapping("/Usuarios/{id}")
    public Usuario mostrar(@PathVariable Integer id) {
        return UsuarioService.findById(id);
    }

    @PutMapping("/registraUsuario/{id}")
    public Usuario update(@RequestBody Usuario Usuario, @PathVariable Integer id) {
        Usuario UsuarioActual = UsuarioService.findById(id);

        UsuarioActual.setNombre(Usuario.getNombre());
        UsuarioActual.setApellidoPaterno(Usuario.getApellidoPaterno());
        UsuarioActual.setApellidoMaterno(Usuario.getApellidoMaterno());
        UsuarioActual.setEdad(Usuario.getEdad());
        UsuarioActual.setCorreo(Usuario.getCorreo());
        return UsuarioService.saveUsuario(UsuarioActual);
    }

    @DeleteMapping("/Usuarios/{id}")
    public void delete(@PathVariable Integer id) {
        UsuarioService.delete(id);
    }
}
