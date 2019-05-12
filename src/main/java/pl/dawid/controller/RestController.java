package pl.dawid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.dawid.service.RandomService;

import java.util.List;

@Controller
@RequestMapping("/rest")
public class RestController {

    @Autowired
    private RandomService randomService;

    @GetMapping
    public String getRestPage(){
        return "restPage";
    }

    @GetMapping(value = "/data",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Integer> getDataRandom(){
        return randomService.generateRandomNumbers();
    }
}
