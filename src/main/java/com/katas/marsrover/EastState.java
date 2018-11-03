package com.katas.marsrover;

public class EastState implements State {
    private final MarsRover context;

    public EastState(MarsRover context) {
        this.context = context;
    }

    @Override
    public void moveForward() {
        context.moveForward(1, 0);
    }

    @Override
    public void turnLeft() {
        context.setState(context.getNorthState());
    }

    @Override
    public void turnRight() {
        context.setState(context.getSouthState());
    }

    @Override
    public String toString(){
        return "E";
    }
}
