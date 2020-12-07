package com.oop_pub.exceptions.ex4;

import java.util.EnumSet;

public class FileLogger extends LoggerBase {

    public FileLogger(EnumSet<LogLevel> enumSet) {
        super(enumSet);
    }

    @Override
    public void writeMesage(String message) {
        System.out.println("[File] " + message);
    }

    @Override
    public void message(String message, LogLevel level) {
        if(this.getEnumSet().contains(level)) {
            writeMesage(message);
        }
    }
}
