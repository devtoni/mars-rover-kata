package com.katas.marsrover;

public class Coordinates {
    private int x;
    private int y;


    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public Coordinates(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void update(int x, int y){
        this.x += x;
        this.y += y;
    }

}
