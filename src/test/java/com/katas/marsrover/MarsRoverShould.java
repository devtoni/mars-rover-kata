package com.katas.marsrover;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class MarsRoverShould {

    private MarsRover marsRover;
    private Grid grid;
    private Position position;
    private Coordinates coordinates;

    @Before
    public void setUp() throws Exception {
        grid = new Grid(5, 5);
        coordinates = new Coordinates(1, 1);
        position = new Position(coordinates, grid);
        marsRover = new MarsRover(position);
    }

    @Test
    @Parameters({
            "L, 1:1:W",
            "LL, 1:1:S",
            "LLL, 1:1:E",
            "LLLL, 1:1:N",
            "LLLLL, 1:1:W"
    })
    public void rotate_to_left_when_commands_are_executed(String commands, String currentLocation) {
        assertEquals(marsRover.execute(commands), currentLocation);
    }

    @Test
    @Parameters({
            "R, 1:1:E",
            "RR, 1:1:S",
            "RRRR, 1:1:N",
            "RRRRR, 1:1:E"
    })
    public void rotate_to_right_when_commands_are_executed(String commands, String currentLocation) {
        assertEquals(marsRover.execute(commands), currentLocation);
    }

    @Test
    @Parameters({
            "RL, 1:1:N",
            "RLR, 1:1:E",
            "RRRLRR, 1:1:N"
    })
    public void rotate_to_any_side_when_commands_are_executed(String commands, String currentLocation) {
        assertEquals(marsRover.execute(commands), currentLocation);
    }

    @Test
    @Parameters({
            "MMR, 1:3:E",
            "MMRMM, 3:3:E",
            "LM, 5:1:W",
            "LLM, 1:5:S"
    })
    public void should_move_and_rotate_when_commands_are_executed(String commands, String currentLocation) {
        assertEquals(marsRover.execute(commands), currentLocation);
    }

}
