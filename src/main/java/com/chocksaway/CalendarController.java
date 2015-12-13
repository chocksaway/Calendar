package com.chocksaway;


import com.chocksaway.com.chocksaway.utils.Redis;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
public class CalendarController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/calendar")
    public @ResponseBody Calendar getTheCalendar(@RequestParam(value="name", defaultValue="World") String name,
                                                 @RequestParam(value="date", defaultValue="01/01/1970") String date) {
        Redis redis;
        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate theDate = LocalDate.parse(date, formatter);
        List<LocalDate> dates = Collections.singletonList(theDate);
        List<String> apts;

        redis = new Redis();

        if (!redis.checkForValueInRedis(date, name)) {
            apts = Arrays.asList("not", "in", "redis");
        } else {
            apts = Arrays.asList("in", "redis");
        }

        return new Calendar(name, dates, apts);
    }
}
