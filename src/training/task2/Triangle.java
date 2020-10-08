package training.task2;

public class Triangle extends Shape {
  private Point a;
  private Point b;
  private Point c;

  public Triangle(Point a, Point b, Point c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public Triangle() {
  }

  public Point getA() {
    return a;
  }

  public void setA(Point a) {
    this.a = a;
  }

  public Point getB() {
    return b;
  }

  public void setB(Point b) {
    this.b = b;
  }

  public Point getC() {
    return c;
  }

  public void setC(Point c) {
    this.c = c;
  }

  @Override
  double getPerimeter() {
    return super.getPointsDistance(a, b) + super.getPointsDistance(b, c) + super.getPointsDistance(c, a);
  }

  @Override
  double getArea() {
    double p = getPerimeter() / 2;
    double sideA = super.getPointsDistance(a, b);
    double sideB = super.getPointsDistance(b, c);
    double sideC = super.getPointsDistance(c, a);
    return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
  }

  @Override
  public String toString() {
    return "Triangle{" +
        "a=" + a +
        ", b=" + b +
        ", c=" + c +
        '}';
  }
}
