package com.chocksaway;

import java.time.LocalDate;
import java.util.List;

public class Calendar {
    private String name;
    private List<LocalDate> dates;
    private List<String> apts;

    public Calendar(String name, List<LocalDate> dates, List<String> apts) {
        this.name = name;
        this.dates = dates;
        this.apts = apts;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<LocalDate> getDates() {
        return dates;
    }

    public void setDates(List<LocalDate> dates) {
        this.dates = dates;
    }

    public List<String> getApts() {
        return apts;
    }

    public void setApts(List<String> apts) {
        this.apts = apts;
    }

    @Override
    public String toString() {
        return "Calendar {" +
                "name='" + this.name + '\'' +
                "dates='" + this.dates + '\'' +
                "apts='" + this.apts + '\'' +
                '}';

    }
}