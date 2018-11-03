package com.katas.marsrover;

public class SouthState implements State {
    private MarsRover context;

    public SouthState (MarsRover context){
        this.context = context;
    }
    @Override
    public void moveForward() {
        context.moveForward(0, -1);
    }

    @Override
    public void turnLeft() {
        context.setState(context.getEastState());
    }

    @Override
    public void turnRight() {
        context.setState(context.getWestState());
    }

    @Override
    public String toString(){
        return "S";
    }
}
