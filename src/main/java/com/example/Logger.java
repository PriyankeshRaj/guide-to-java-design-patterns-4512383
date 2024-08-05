package com.example;

//public enum Logger {
//
//    INSTANCE;
//
//    public static Logger getInstance(){
//        return INSTANCE;
//    }
//
//    void log(String logMessage) {
//        System.out.println(logMessage);
//    }
//
//}

public final class Logger {

    private static Logger INSTANCE;

    private Logger(){}

    public synchronized static Logger getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Logger();
        }
        return INSTANCE;
    }

    void log(String logMessage) {
        System.out.println(logMessage);
    }

}
