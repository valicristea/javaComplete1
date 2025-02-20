package ro.scoala_informala.javaComplete1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MvcDemo {

    @GetMapping("/mvc")
    public String getData(){
        return "table";
    }

}
