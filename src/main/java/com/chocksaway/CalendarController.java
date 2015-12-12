package com.chocksaway;


import org.springframework.web.bind.annotation.*;

@RestController
public class CalendarController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/calendar")
    public @ResponseBody Calendar getTheCalendar(@RequestParam(value="name", defaultValue="World") String name) {
        Calendar cal = new Calendar(name);
        return cal;
    }
}
