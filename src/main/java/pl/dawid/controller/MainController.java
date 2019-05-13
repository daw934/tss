package pl.dawid.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {
    private static final Logger log = LoggerFactory.getLogger(MainController.class);

    @GetMapping
    public String getMainPage() {
        log.info("getMainPage");
        System.out.println("getMainPage");
        return "index";
    }

    @GetMapping("login")
    public String getLoginPage(){
        return "login";
    }

    @GetMapping("test")
    public String getLoginPage1(){
        return "test";
    }


}
