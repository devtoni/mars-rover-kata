package com.katas.marsrover;

public class NorthState implements State {

    private final MarsRover context;

    public NorthState (MarsRover context){
        this.context = context;
    }
    @Override
    public void moveForward() {
        context.moveForward(0, 1);
    }

    @Override
    public void turnLeft() {
        context.setState(context.getWestState());
    }

    @Override
    public void turnRight() {
        context.setState(context.getEastState());
    }

    @Override
    public String toString(){
        return "N";
    }
}
