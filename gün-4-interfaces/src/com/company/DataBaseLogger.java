package com.company;

public class DataBaseLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Data base loglandı " + message);
    }
}