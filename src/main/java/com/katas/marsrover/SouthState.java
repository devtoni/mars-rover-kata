package com.katas.marsrover;

public class SouthState implements State {
    @Override
    public void moveForward(MarsRover context) {
        context.moveForward(0, -1);
    }

    @Override
    public void turnLeft(MarsRover context) {
        context.setState(new EastState());
    }

    @Override
    public void turnRight(MarsRover context) {
        context.setState(new WestState());
    }

    @Override
    public String toString(){
        return "S";
    }
}
