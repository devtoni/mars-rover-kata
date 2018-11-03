package com.katas.marsrover;

public class MoveCommand implements Command {
    private final Position position;

    public MoveCommand(Position position) {
        this.position = position;
    }


    @Override
    public void execute() {
        position.move();
    }
}
