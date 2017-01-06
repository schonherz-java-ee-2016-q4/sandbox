package hu.schonherz.training.jpa.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping(path = "")
    public ModelAndView serveIndex() {
        final String name = "Jóskagyerek";
        return new ModelAndView("index", "name", name);
    }
}
