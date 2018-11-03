package com.katas.marsrover;

public class MarsRover {
    private final String SEPARATOR = ":";
    private final SouthState southState;
    private State state;
    private Coordinates coordinates;
    private State westState;
    private State eastState;
    private State northState;

    public MarsRover() {
        this.state = new NorthState(this);
        this.westState = new WestState(this);
        this.eastState = new EastState(this);
        this.northState = new NorthState(this);
        this.southState = new SouthState(this);
        this.coordinates = new Coordinates(1, 1);
    }


    public String execute(String commands) {
        String[] commandList = commandParser(commands);
        for (String command : commandList) {
            if (command.equals("L")) {
                state.turnLeft();
            }
            if (command.equals("R")) {
                state.turnRight();
            }
            if (command.equals("M")) {
                state.moveForward();
            }

        }

        return this.coordinates.getX() + SEPARATOR + this.coordinates.getY() + SEPARATOR + state.toString();
    }

    private String[] commandParser(String commands) {
        return commands.split("");
    }

    void setState(State newState) {
        this.state = newState;
    }

    void moveForward(int x, int y) {
        this.coordinates.update(x, y);
    }

    State getWestState() {
        return westState;
    }

    State getEastState() {
        return eastState;
    }

    State getNorthState() {
        return northState;
    }

    State getSouthState() {
        return southState;
    }

}
