package com.oop_pub.exceptions.ex4;

import java.util.EnumSet;

public class EmailLogger extends LoggerBase {

    public EmailLogger(EnumSet<LogLevel> enumSet) {
        super(enumSet);
    }

    @Override
    public void writeMesage(String message) {
        System.out.println("[Email] " + message);
    }

    @Override
    public void message(String message, LogLevel level) {
        if(this.getEnumSet().contains(level)){
            writeMesage(message);
        } else {
            this.getNextInChain().message(message,level);
        }
    }
}
