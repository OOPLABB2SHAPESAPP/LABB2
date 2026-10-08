package kth.roseayad.labb2.shapes;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

/**
 * A representation of a world containing a set of moving shapes. NB! The worlds
 * y-axis points downward.
 *
 * @author Anders Lindström, anderslm@kth.se 2026-09-10
 */
public class World {

    private double width, height; // this worlds width and height

    private final ArrayList<Shape> shapes; // a list of _references_ to shape objects

    /**
     * Creates a new world, containing a pad and a set of balls. NB! The worlds
     * y-axis points downward.
     *
     * @param width the width of this world
     * @param height the height of this world
     */
    public World(double width, double height) {
        this.width = width;
        this.height = height;

        shapes = new ArrayList<>(); // a list of references
        // Create the actual Shape objects, of subtypes
        // ....

        Line l1 = new Line(10, 10, 100, 100, Color.RED);
        l1.setVelocity(20,10);
        shapes.add(l1);
    }

    /**
     * Sets the new dimensions, in pixels, for this world. The method could be
     * used for example when the canvas is reshaped.
     *
     * @param newWidth
     * @param newHeight
     */
    public void setDimensions(double newWidth, double newHeight) {
        this.width = newWidth;
        this.height = newHeight;
    }

    /**
     * Move the world one step, based on the time elapsed since last move.
     *
     * @param elapsedTimeNs the elapsed time in nanoseconds
     */
    public void moveAndConstrain(long elapsedTimeNs) {
        for (Shape s : shapes) {
            s.moveAndConstrain(elapsedTimeNs, 0, 0, width, height);
        }
    }

    /**
     * Returns a copy of the list of ball references.
     * Due to the implementation of clone, a shallow copy is returned.
     *
     * @return a copy of the list of balls
     */
    public List<Shape> getShapes() {
        return new ArrayList<>(shapes);
    }
}

