package ru.kityukha.learnspring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("localhost/hello-world")
    public String sayHello() {
        return "hello_world";
    }
}
