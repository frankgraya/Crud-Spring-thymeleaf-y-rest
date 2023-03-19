package com.frank.demo.Controller;

import com.frank.demo.Model.Correo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class ValidacorreoController {

    @GetMapping("/validacorreo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("correo", new Correo());
        return "validar_correo";
    }
        @PostMapping("/validar")
        public String validarCorreo(@RequestParam("email") String email, Model model) {
            boolean esValido = validarCorreoElectronico(email);
            String mensaje;
            if (esValido) {
                mensaje = "La dirección de correo electrónico es válida";
            } else {
                mensaje = "La dirección de correo electrónico no es válida";
            }
            model.addAttribute("mensaje", mensaje);
            return "validar-correo";
        }

        private boolean validarCorreoElectronico(String email) {
            // Aquí implementaríamos la lógica de validación del correo electrónico
            // Devolveríamos true si la cadena es una dirección de correo válida
            // y false en caso contrario
            // Por simplicidad, aquí devolvemos true siempre
            return true;
        }
}
