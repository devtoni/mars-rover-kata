package com.katas.marsrover;

public class Grid {
    private final int height;
    private final int width;
    private final int LOWER_LIMIT = 1;

    public Grid(int width, int height) {
        this.width = width;
        this.height = height;
    }


    public void updateCurrentPosition(Coordinates coordinates) {
        int coordinateX = coordinates.getX();
        int coordinateY = coordinates.getY();
        if (coordinateX == 0) {
            coordinates.update(width, coordinateY);
        }
        if (coordinateY == 0) {
            coordinates.update(coordinateX, height);
        }
        if (coordinateX > width) {
            coordinates.update(LOWER_LIMIT, coordinateY);
        }
        if (coordinateY == height) {
            coordinates.update(coordinateX, LOWER_LIMIT);
        }
    }

}
