package com.co;

import com.co.DAO.tbl_clienteDAO;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class prueba {

    @Autowired
    private tbl_clienteDAO clienteDAO;

    @GetMapping("/")
    public String inicio() {
        return "index";

    }

    @GetMapping("/contactanos")
    public String contactanos() {
        return "contactanos";
    }

    @GetMapping("/nosotros")
    public String nosotros() {
        return "nosotros";
    }

    @GetMapping("/login")
    public String inicioSesion() {
        return "iniciarsesion";
    }

    @GetMapping("/loginadmin")
    public String loginAdmin(Model model) {
        var clientes = clienteDAO.findAll();
        model.addAttribute("cliente", clientes);
        return "loginadmin";
    }

    @GetMapping("/registrate")
    public String registrarse() {
        return "registrate";
    }

}
