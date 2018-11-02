package com.katas.marsrover;

public class MarsRover {
    private State state;
    // private Direction direction;

    public MarsRover() {
       // this.direction = Direction.of("N");
        this.state = new NorthState();
    }


    public String execute(String commands) {
        String[] commandList = commandParser(commands);
        for(String command: commandList){
            if (command.equals("L")) {
               state.turnLeft(this);
            }
            if (command.equals("R")){
                return "0:0:E";
            }
        }

        return "0:0:" + state.toString();
    }

    private String[] commandParser(String commands) {
        return commands.split("");
    }

    public void setState(State newState) {
        this.state = newState;
    }
}

/*
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
 */