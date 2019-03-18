package cn.wzvtc.leonshaw.springbootclass.class01;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello Spring Boot!";
    }
}
