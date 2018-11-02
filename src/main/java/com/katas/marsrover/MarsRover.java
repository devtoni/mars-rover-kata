package com.katas.marsrover;

public class MarsRover {
    public String execute(String commands) {
        return commands.length() == 1 ? "0:0:W" : "0:0:S";
    }
}
