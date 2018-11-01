package com.katas.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRoverShould {
    @Test
    public void rotate_to_left_when_commands_are_executed() {
        MarsRover marsRover = new MarsRover();

        assertEquals(marsRover.execute("L"), "0:0:W");
    }
}
