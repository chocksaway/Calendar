package com.chocksaway;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalendarController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/calendar")
    public @ResponseBody
    Calendar greeting(@RequestParam(value="name", defaultValue="World") String name) {
        Calendar cal = new Calendar(name);
        return cal;
    }
}
