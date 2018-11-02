package com.katas.marsrover;

public class SouthState implements State {
    @Override
    public void moveForward() {

    }

    @Override
    public void turnLeft(MarsRover context) {
        context.setState(new EathState());
    }

    @Override
    public void turnRight() {

    }

    @Override
    public String toString(){
        return "S";
    }
}
