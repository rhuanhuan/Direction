package com.twu.refactoring;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class DIRECTIONTEST {

    private DIRECTION direction;

    @Test
    public void shouldTurnEastWhenTurnRightFromNorth() {
        assertThat(DIRECTION.EAST, is(direction.NORTH.turnRight()));
    }

    @Test
    public void shouldTurnNorthWhenTurnRightFromWest() {
        assertThat(DIRECTION.NORTH, is(direction.WEST.turnRight()));
    }

    @Test
    public void shouldTurnWestWhenTurnRightFromSouth() {
        assertThat(DIRECTION.WEST, is(direction.SOUTH.turnRight()));
    }

    @Test
    public void shouldTurnSouthWhenTurnRightFromEast() {
        assertThat(DIRECTION.SOUTH, is(direction.EAST.turnRight()));
    }

    @Test
    public void shouldTurnWestWhenTurnLeftFromNorth() {
        assertThat(DIRECTION.WEST, is(direction.NORTH.turnLeft()));
    }

    @Test
    public void shouldTurnNorthWhenTurnLeftFromEast() {
        assertEquals(DIRECTION.NORTH, direction.EAST.turnLeft());
    }

    @Test
    public void shouldTurnSouthWhenTurnLeftFromWest() {
        assertEquals(DIRECTION.SOUTH, direction.WEST.turnLeft());
    }

    @Test
    public void shouldTurnEastWhenTurnLeftFromSouth() {
        assertEquals(DIRECTION.EAST, direction.SOUTH.turnLeft());
    }
}
