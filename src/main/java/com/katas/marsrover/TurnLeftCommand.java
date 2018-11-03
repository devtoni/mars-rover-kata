package com.katas.marsrover;

public class TurnLeftCommand implements Command {
    private final Position position;

    public TurnLeftCommand(Position position) {
        this.position = position;
    }


    @Override
    public void execute() {
        position.turnLeft();
    }
}
