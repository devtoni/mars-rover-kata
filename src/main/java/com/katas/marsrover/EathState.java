package com.katas.marsrover;

public class EathState implements State {
    @Override
    public void moveForward() {

    }

    @Override
    public void turnLeft(MarsRover context) {
        context.setState(new NorthState());
    }

    @Override
    public void turnRight() {

    }

    @Override
    public String toString(){
        return "E";
    }
}
