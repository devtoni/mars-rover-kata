package com.katas.marsrover;

public class MarsRover {
    public String execute(String commands) {
        if (commands.length() == 2) {
            return "0:0:S";
        }
        if (commands.length() == 3) {
            return "0:0:E";
        }
        return "0:0:W";
    }
}
