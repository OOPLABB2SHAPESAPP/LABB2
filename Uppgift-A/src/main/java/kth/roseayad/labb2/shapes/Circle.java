package kth.roseayad.labb2.shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Circle extends FillableShape{
    private double diameter;

    public Circle(double x, double y, Color color,
                  boolean filled, double diameter){
        super(x, y, color, filled);
        this.diameter = diameter;
    }

    public double getDiameter(){
        return diameter;
    }

    public void setDiameter(double diameter){
        this.diameter = diameter;
    }

    @Override
    public void paint(GraphicsContext gc) {

    }
}
