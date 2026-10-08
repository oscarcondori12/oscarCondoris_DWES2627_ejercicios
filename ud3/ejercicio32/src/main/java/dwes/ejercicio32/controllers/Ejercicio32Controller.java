package dwes.ejercicio32.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Controller
public class Ejercicio32Controller {

    @GetMapping("/list")
    public String listar(Model model) {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        int cantidad = random.nextInt(0, 51);

        List<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            numeros.add(random.nextInt(1, 101));
        }

        model.addAttribute("numeros", numeros);
        return "list";
    }
}
