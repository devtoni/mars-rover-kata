package com.katas.marsrover;

public interface State {
    void moveForward();

    void turnLeft(MarsRover context);

    void turnRight(MarsRover context);

    String toString();
}
