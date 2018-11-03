package com.katas.marsrover;

public class TurnRightCommand implements Command {
    private final Position position;

    public TurnRightCommand(Position position) {
        this.position = position;
    }

    @Override
    public void execute() {
        position.turnRight();
    }
}
