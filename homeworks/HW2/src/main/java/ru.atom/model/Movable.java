package ru.atom.model;

import ru.atom.geometry.Point;

/**
 * GameObject that can move during game
 */
public interface Movable extends Tickable {
    /**
     * Tries to move entity towards specified direction for time
     *
     * @return final position after movement
     */
    Point move(Direction direction, int time);

    enum Direction {
        UP, DOWN, RIGHT, LEFT, IDLE;
    }
}
