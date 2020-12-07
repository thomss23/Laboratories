package com.oop_pub.exceptions.ex4;

import java.util.EnumSet;

public class ConsoleLogger extends LoggerBase {

    public ConsoleLogger(EnumSet<LogLevel> enumSet) {
        super(enumSet);
    }

    @Override
    public void writeMesage(String message) {
        System.out.println("[Console] " + message);
    }

    @Override
    public void message(String message, LogLevel level) {
        writeMesage(message);
        getNextInChain().message(message,level);
    }
}
