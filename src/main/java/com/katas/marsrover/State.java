package com.katas.marsrover;

public interface State {
    void moveForward(Coordinates coordinates);

    void turnLeft();

    void turnRight();

    String toString();
}
