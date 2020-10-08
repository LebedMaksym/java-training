package training.task2;

public abstract class Shape {
  abstract double getPerimeter();
  abstract double getArea();
  public double getPointsDistance(Point a, Point b) {
    return Math.sqrt(Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2));
  }
}
