package com.chocksaway;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by milesd on 10/12/2015.
 */
public class Calendar {
    private String id;
    private String name;
    Map<String, Calendar> cals;


    public Calendar(String calId ) {
        if (cals == null) {
            cals = new HashMap<String, Calendar>();
            this.id = calId;
            cals.put(calId, this);
        }
    }


//    public List<String> getContent() {
//        return Arrays.asList("sup1", "sup2", "sup3");
//    }
}
