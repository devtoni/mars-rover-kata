package com.katas.marsrover;

public class NorthState implements State {

    @Override
    public void moveForward() {

    }

    @Override
    public void turnLeft(MarsRover context) {
        context.setState(new WestState());
    }

    @Override
    public void turnRight() {

    }

    @Override
    public String toString(){
        return "N";
    }
}
