package com.co.SchoolTool;

//import com.co.DAO.tbl_clienteDAO;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorInicio {
    
//    @Autowired
//    private tbl_clienteDAO clienteDAO;

    
    @GetMapping("/")
    public String inicio(){
        return "index";
    }
    
    @GetMapping("/contactanos")
    public String contactanos(){
        return "contactanos";
    }
    
    @GetMapping("/nosotros")
    public String nosotros(){
        return "nosotros";
    }
    
    @GetMapping("/login")
    public String inicioSesion(){
        return "iniciarsesion";
    }
    
    @GetMapping("/loginadmin")
    public String loginAdmin(){
        return "loginadmin";
    }
        

    
    @GetMapping("/registrate")
    public String registrarse(){
        return "registrate";
    }
    
}
