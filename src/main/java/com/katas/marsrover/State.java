package com.katas.marsrover;

public interface State {
    void moveForward(MarsRover context);

    void turnLeft(MarsRover context);

    void turnRight(MarsRover context);

    String toString();
}
