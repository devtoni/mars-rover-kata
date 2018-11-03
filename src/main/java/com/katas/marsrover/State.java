package com.katas.marsrover;

public interface State {
    void moveForward();

    void turnLeft();

    void turnRight();

    String toString();
}
