package com.katas.marsrover;

public class MarsRover {
    private Direction direction = Direction.of("N");

    public String execute(String commands) {
        String[] commandList = commands.split("");
        for(String command: commandList){
            if (command.equals("L")) {
               this.direction = this.direction.left();
            }
        }
        return "0:0:" + this.direction.representation;
    }

    private enum Direction {
        NORTH("N") {
            @Override
            public Direction left() {
                return WEST;
            }
        }, EAST("E"){
            @Override
            public Direction left(){
                return NORTH;
            }
        }, SOUTH("S"){
            @Override
            public Direction left(){
                return EAST;
            }
        }, WEST("W"){
            @Override
            public Direction left(){
                return SOUTH;
            }
        };


        private final String representation;

        Direction(String representation) {
            this.representation = representation;
        }

        public static Direction of(String representation) {
            for (Direction value : values()) {
                if (value.representation.equals(representation)) {
                    return value;
                }
            }
            throw new RuntimeException();
        }

        public abstract Direction left();
    }
}
