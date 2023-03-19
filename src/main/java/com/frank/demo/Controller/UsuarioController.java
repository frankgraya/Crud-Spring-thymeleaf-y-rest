/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.frank.demo.Controller;

import com.frank.demo.Model.Usuario;
import com.frank.demo.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author frank
 */
@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService UsuarioService;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listUsuarios", UsuarioService.findAll());
        return "index";
    }

    @GetMapping("/showNewUsuarioForm")
    public String showNewUsuarioForm(Model model) {
        Usuario Usuario = new Usuario();
        model.addAttribute("Usuario", Usuario);
        return "new_usuario";
    }

    @PostMapping("/saveUsuario")
    public String saveUsuario(@ModelAttribute("Usuario") Usuario Usuario) {
        // save Usuario to database
        UsuarioService.saveUsuario(Usuario);
        return "redirect:/";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {
        Usuario Usuario = UsuarioService.findById(id);
        model.addAttribute("Usuario", Usuario);
        return "update_usuario";
    }

    @GetMapping("/deleteUsuario/{id}")
    public String deleteUsuario(@PathVariable(value = "id") long id) {
        // call delete Usuario method 
        this.UsuarioService.delete(id);
        return "redirect:/";
    }

}
