package com.katas.marsrover;

public class EastState implements State {
    private final Position context;

    public EastState(Position context) {
        this.context = context;
    }

    @Override
    public void moveForward(Coordinates coordinates) {
        coordinates.increaseX(1);
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
