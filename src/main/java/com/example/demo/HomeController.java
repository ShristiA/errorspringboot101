package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.naming.Binding;
import javax.validation.Valid;

@Controller
public class HomeController {

    @GetMapping("/songform")
    public String loadFormPage(Model model) {
        model.addAttribute("song", new Song());
        return "songform";

    }

    @PostMapping("/songform")
    public String processformPage(@Valid Song song, BindingResult result) {
        if (result.hasErrors()) {
            return "songform";
        }
        return "confirmsong";
    }
}

