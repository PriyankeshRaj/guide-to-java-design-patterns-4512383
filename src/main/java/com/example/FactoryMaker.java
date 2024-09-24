package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class FactoryMaker {

    private static final Map<String, Supplier<UserInterfaceFactory>> map = new HashMap<>();

    static{
        map.put("BLUE", BlueUserInterfaceFactory::new);
        map.put("RED", RedUserInterfaceFactory::new);
    }

    public static UserInterfaceFactory createFactory(String userInterfaceType){
        if(map.get(userInterfaceType)!=null){
            return map.get(userInterfaceType).get();
        }
        else{
            throw new IllegalArgumentException("No such userInterfaceType exists");
        }
    }
}
