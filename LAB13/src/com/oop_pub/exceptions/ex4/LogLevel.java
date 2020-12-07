package com.oop_pub.exceptions.ex4;

import java.util.EnumSet;

public enum LogLevel {
    Info,
    Debug,
    Warning,
    Error,
    FunctionalMessage,
    FunctionalError;

    public static EnumSet<LogLevel> all(){
        EnumSet<LogLevel> enumSet = EnumSet.allOf(LogLevel.class);
        return enumSet;
    }
}




