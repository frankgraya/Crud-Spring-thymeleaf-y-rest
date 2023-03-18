package com.frank.demo.Controller;

import com.frank.demo.Model.Correo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

@Controller
public class ValidarCorreoController {

    @GetMapping("/validacorreo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("correo", new Correo());
        return "validar_correo";
    }

    @PostMapping("/validarcorreo")
    public String validarCorreo(@ModelAttribute("correo") Correo correo, Model model) {
        boolean valido = false;
        try {
            InternetAddress emailAddr = new InternetAddress(correo.getDireccion());
            emailAddr.validate();
            valido = true;
        } catch (AddressException ex) {
            // no hacer nada, valido ya esta en false
        }
        model.addAttribute("resultado", valido);
        return "validar_correo";
    }
}
