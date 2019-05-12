package pl.dawid.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SocketController {

    @GetMapping("/socket")
    public String getSocketPage() {
        return "socket";
    }
}
