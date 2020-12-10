package controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichController {
    @GetMapping
    public String abc(){
        return "index";
    }
    @PostMapping("/index")
    public String save(@RequestParam String condiment, Model model) {
        
        model.addAttribute("condiment", condiment);
        return "save";
    }
}
