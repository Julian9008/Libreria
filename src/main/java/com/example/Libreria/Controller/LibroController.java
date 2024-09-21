package com.example.Libreria.Controller;

import com.example.Libreria.Model.Libro;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/libros")
public class LibroController {

    @GetMapping("/{title}/{author}/{year}")
    public String showLibro(@PathVariable String title, @PathVariable String author, @PathVariable int year, Model model) {
        // Crea un nuevo objeto Libro con los datos proporcionados
        Libro libro = new Libro(title, author, year);

        // Agrega el objeto libro al modelo para que pueda ser accedido desde la vista
        model.addAttribute("libro", libro);

        // Retorna el nombre de la vista (libro.html) para mostrar los datos
        return "libro";  // La vista se ubicará en src/main/resources/templates/libro.html
    }
}
