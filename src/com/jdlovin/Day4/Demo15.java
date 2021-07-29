package com.jdlovin.Day4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo15 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("name", 47);
        map.put("number", 47);
        map.put("digit", 47);
        map.put("some other", 47);

        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            //converting to map.Entry so that we can get key and value separately
            Map.Entry entry = (Map.Entry)iterator.next();
            System.out.println(entry.getKey());
        }

    }
}
