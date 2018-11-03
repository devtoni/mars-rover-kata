package com.katas.marsrover;

public class SouthState implements State {
    private Position context;

    public SouthState (Position context){
        this.context = context;
    }
    @Override
    public void moveForward(Coordinates coordinates) {
        coordinates.increaseY(-1);
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
