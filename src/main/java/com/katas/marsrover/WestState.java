package com.katas.marsrover;

public class WestState implements State {

    private final MarsRover context;

    public WestState (MarsRover context){
      this.context = context;
    }

    @Override
    public void moveForward() {
        context.moveForward(-1, 0);
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
