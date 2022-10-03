package com.co;

import com.co.DAO.tbl_clienteDAO;
import com.co.pojo.tbl_cliente;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControladorInicio {

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

    @GetMapping("/registrate")
    public String registrarse() {
        return "registrate";
    }

    /* CRUD */
    @PostMapping("/guardar")
    public String guardar(@ModelAttribute tbl_cliente clientes) {
        clienteDAO.save(clientes);
        return "redirect:/loginadmin";
    }

    @GetMapping("/loginadmin")
    public String loginAdmin(Model model) {
        var clientes = clienteDAO.findAll();
        model.addAttribute("clientes", clientes);
        return "loginadmin";
    }

    @GetMapping("/modificar/{clien_id}")
    public String modificar(@PathVariable("clien_id") Integer clien_id, Model model) {
        var clientes = clienteDAO.findById(clien_id);
        model.addAttribute("clientes", clientes);
        return "modificar";
    }

    @GetMapping("/eliminar/{clien_id}")
    public String eliminar(@PathVariable("clien_id") Integer clien_id) {
        clienteDAO.deleteById(clien_id);
        return "redirect:/loginadmin";
    }
    /* FIN DEL CRUD */

}
