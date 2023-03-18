/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.frank.demo.Service;

import com.frank.demo.Model.Usuario;
import java.util.List;

/**
 *
 * @author frank
 */
public interface UsuarioService {

    public Usuario saveUsuario(Usuario Usuario);

    public void delete(long id);

    public Usuario findById(long id);

    public List<Usuario> findAll();

}
