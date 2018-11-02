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

    @Before
    public void setUp() throws Exception {
       marsRover = new MarsRover();
    }

    @Test
    @Parameters({
            "L, 0:0:W",
            "LL, 0:0:S",
            "LLL, 0:0:E",
            "LLLL, 0:0:N",
            "LLLLL, 0:0:W"
    })
    public void rotate_to_left_when_commands_are_executed(String commands, String currentLocation) {
        assertEquals(marsRover.execute(commands), currentLocation);
    }

    @Test
    @Parameters({
            "R, 0:0:E"
    })
    public void rotate_to_right_when_commands_are_executed(String commands, String currentLocation){
        assertEquals(marsRover.execute(commands),currentLocation);
    }
}
