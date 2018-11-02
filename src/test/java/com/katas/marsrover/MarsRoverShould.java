package com.katas.marsrover;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class MarsRoverShould {

    @Test
    @Parameters({
            "L, 0:0:W",
            "LL, 0:0:S",
            "LLL, 0:0:E",
            "LLLL, 0:0:N",
            "LLLLL, 0:0:W"
    })
    public void rotate_to_left_when_commands_are_executed(String commands, String currentLocation) {
        MarsRover marsRover = new MarsRover();

        assertEquals(marsRover.execute(commands), currentLocation);
    }

    @Test
    public void rotate_to_right_when_commands_are_executed(){
        MarsRover marsRover = new MarsRover();

        assertEquals(marsRover.execute("R"), "0:0:E");
    }
}
