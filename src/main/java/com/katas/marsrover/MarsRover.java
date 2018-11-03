package com.katas.marsrover;

import java.util.HashMap;
import java.util.Map;

public class MarsRover {
    private final Position position;
    private Map<String, Command> commands;

    public MarsRover(Position position) {
        this.position = position;
        initiateAllowedCommands();
    }

    public String execute(String commands) {
        String[] commandList = commandParser(commands);
        for (String command : commandList) {
            this.commands.get(command).execute();
        }

        return position.toString();
    }

    private String[] commandParser(String commands) {
        return commands.split("");
    }

    private void initiateAllowedCommands() {
        this.commands = new HashMap<>() {{
            put("L", new TurnLeftCommand(position));
            put("R", new TurnRightCommand(position));
            put("M", new MoveCommand(position));
        }};
    }


}
