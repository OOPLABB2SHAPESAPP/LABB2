package kth.roseayad.labb2.shapes;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Line extends Shape{

    private double x2, y2;

    public Line(double x, double y, double x2, double y2, Color color){
        super(x, y, color);
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getX2() {
        return x2;
    }

    public double getY2() {
        return y2;
    }

    public void setX2(double x2){
        this.x2 = x2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    @Override
    protected void move(long elapsedTimeNs){
        super.move(elapsedTimeNs);
        x2 += getDx() * elapsedTimeNs / BILLION;
        y2 += getDy() * elapsedTimeNs / BILLION;
    }

    @Override
    public void paint(GraphicsContext gc) {
        gc.setStroke(getColor());
        gc.strokeLine(getX(), getY(), x2, y2);
    }

    @Override
    protected void constrain(
            double boxX, double boxY,
            double boxWidth, double boxHeight) {

        if(getX2() < boxX || getX() < boxX ){
            setVelocity(Math.abs(getDx()), getDy());
        } else if (getX2() > boxWidth || getX() > boxWidth) {
            setVelocity(-Math.abs(getDx()), getDy());
        }if (getY2()<boxY + boxHeight || getY()<boxY){
            setVelocity(getDx(), Math.abs(getDy()));
        } else if (getY()>boxHeight ||getY2()>boxHeight) {
            setVelocity(getDx(), -Math.abs(getDy()));
        }
    }

    @Override
    public String toString() {
        return super.toString() + ": x2= " + x2 + ", y2= " + y2;
    }
}
