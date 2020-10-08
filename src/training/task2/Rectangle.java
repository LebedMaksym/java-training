package training.task2;

public class Rectangle extends Shape {
  private Point a;
  private Point b;
  private Point c;
  private Point d;

  public Rectangle(Point a, Point b, Point c, Point d) {
    this.a = a;
    this.b = b;
    this.c = c;
    this.d = d;
  }

  public Rectangle() {
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

  public Point getD() {
    return d;
  }

  public void setD(Point d) {
    this.d = d;
  }

  @Override
  double getPerimeter() {
    return (super.getPointsDistance(a, b) + super.getPointsDistance(b, c)) * 2;
  }

  @Override
  double getArea() {
    return super.getPointsDistance(a, b) * super.getPointsDistance(b, c);
  }

  @Override
  public String toString() {
    return "Rectangle{" +
        "a=" + a +
        ", b=" + b +
        ", c=" + c +
        ", d=" + d +
        '}';
  }
}
