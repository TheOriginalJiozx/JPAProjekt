package jpa.jpaprojekt.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @GetMapping("/unicode/{i}")
    public String unicodeToChar(@PathVariable int i) {
        char c = (char)i;
        return "unicode=" + i + " char=" + c;
    }

    @GetMapping("/{c}/unicode")
    public String charToUnicde(@PathVariable char c)  {
        return "char=" + c + " uni=" + (int)c;
    }

}