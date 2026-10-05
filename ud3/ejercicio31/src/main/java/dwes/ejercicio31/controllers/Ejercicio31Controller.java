package dwes.ejercicio31.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Ejercicio31Controller {


    @GetMapping("/")
    public String paginaInicio(){
        return "index";
    }

    @GetMapping("/galeria")
    public String galeria(){
    return "galeria";
    }

  @GetMapping("/destacados")
    public String destacados(){
        return "destacados";
  }
}
