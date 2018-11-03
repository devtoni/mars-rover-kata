package com.katas.marsrover;

public class MarsRover {
    private final Position position;

    public MarsRover(Position position) {
        this.position = position;
    }


    public String execute(String commands) {
        String[] commandList = commandParser(commands);
        for (String command : commandList) {
            if (command.equals("L")) {
                position.turnLeft();
            }
            if (command.equals("R")) {
                position.turnRight();
            }
            if (command.equals("M")) {
                position.move();
            }
        }

        return position.toString();
    }

    private String[] commandParser(String commands) {
        return commands.split("");
    }


}
