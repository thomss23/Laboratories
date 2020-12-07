package com.oop_pub.exceptions.ex4;

import java.util.EnumSet;

public abstract class LoggerBase {

    private EnumSet<LogLevel> enumSet;
    private LoggerBase nextInChain;

    public LoggerBase(EnumSet<LogLevel> enumSet) {
        this.enumSet = enumSet;
    }

    public void setNext(LoggerBase next){
        nextInChain=next;
    }

    public abstract void writeMesage(String message);

    public abstract void message(String message,LogLevel level);

    public LoggerBase getNextInChain() {
        return nextInChain;
    }

    public EnumSet<LogLevel> getEnumSet() {
        return enumSet;
    }
}
