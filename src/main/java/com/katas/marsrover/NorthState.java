package com.katas.marsrover;

public class NorthState implements State {

    private final Position context;

    public NorthState (Position context){
        this.context = context;
    }
    @Override
    public void moveForward(Coordinates coordinates) {
        coordinates.increaseY( 1);
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
