package Springboot.Springbootkoushik1;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hi")
    public String hi(){
        return "hi";
    }
    @GetMaping("/check)
               public String check(){
                   return "Check";
}
