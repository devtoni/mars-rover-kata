package com.katas.marsrover;

public class Position {
    private final Coordinates coordinates;
    private final Grid grid;
    private State state;

    private State westState;
    private State eastState;
    private State northState;
    private State southState;

    public Position(Coordinates coordinates, Grid grid){
        this.coordinates = coordinates;
        this.grid = grid;

        this.westState = new WestState(this);
        this.eastState = new EastState(this);
        this.northState = new NorthState(this);
        this.southState = new SouthState(this);

        this.state = northState;
    }

    public void turnLeft() {
        state.turnLeft();
    }


    public void turnRight() {
        state.turnRight();
    }

    public void move() {
        state.moveForward(coordinates);
        updateCurrentPositionOnGrid();
    }

    void setState(State newState) {
        this.state = newState;
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

    private void updateCurrentPositionOnGrid() {
        grid.updateCurrentPosition(coordinates);
    }

    @Override
    public String toString() {
        return coordinates.getX() + ":" + coordinates.getY() + ":" + state.toString();
    }
}
