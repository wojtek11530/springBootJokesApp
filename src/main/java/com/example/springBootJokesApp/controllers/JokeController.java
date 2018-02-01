package com.example.springBootJokesApp.controllers;

import com.example.springBootJokesApp.services.JokeGetterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private JokeGetterService jokeGetterService;

    @Autowired
    public JokeController(JokeGetterService jokeGetterService) {
        this.jokeGetterService = jokeGetterService;
    }

    @RequestMapping({"/",""})
    public String showJoke(Model model){
        model.addAttribute("joke",jokeGetterService.getJoke());
        return "chucknorris";
    }
}
