package com.katas.marsrover;

public class WestState implements State {

    private final Position context;

    public WestState (Position context){
      this.context = context;
    }

    @Override
    public void moveForward(Coordinates coordinates) {
        coordinates.increaseX(-1);
    }

    @Override
    public void turnLeft() {
        context.setState(context.getSouthState());
    }

    @Override
    public void turnRight() {
        context.setState(context.getNorthState());
    }

    @Override
    public String toString() {
        return "W";
    }
}
