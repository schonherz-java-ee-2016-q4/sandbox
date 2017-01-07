package hu.schonherz.training.jpa.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import hu.schonherz.training.jpa.data.domain.ProductEntity;
import hu.schonherz.training.jpa.data.repository.ProductRepository;

@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    private ProductRepository productRepository;
    
    
    @GetMapping(path = "")
    public ModelAndView serveIndex() {
        List<ProductEntity> products = productRepository.findAll();
     
        return new ModelAndView("index", "products", products);
    }
}
