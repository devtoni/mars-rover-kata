package com.katas.marsrover;

public class WestState implements State {
    @Override
    public void moveForward() {

    }

    @Override
    public void turnLeft(MarsRover context) {
        context.setState(new SouthState());
    }

    @Override
    public void turnRight(MarsRover context) {
       context.setState(new NorthState());
    }

    @Override
    public String toString(){
        return "W";
    }
}
