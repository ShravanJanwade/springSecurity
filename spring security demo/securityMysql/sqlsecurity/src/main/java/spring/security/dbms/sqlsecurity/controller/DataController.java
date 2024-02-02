package spring.security.dbms.sqlsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class DataController {
    
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/home")
    public String home(){
        return "home";
    }
    @GetMapping("/about")
    public String about(){
        return "about";
    }
    @GetMapping("/admin")
    public String admin(){
        return "admin";
    }
}
