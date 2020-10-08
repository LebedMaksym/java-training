package training.task2;

public class Circle extends Shape {
  private Point o;
  private Point a;

  public Circle(Point o, Point a) {
    this.o = o;
    this.a = a;
  }

  public Circle() {
  }

  public Point getO() {
    return o;
  }

  public void setO(Point o) {
    this.o = o;
  }

  public Point getA() {
    return a;
  }

  public void setA(Point a) {
    this.a = a;
  }

  @Override
  double getPerimeter() {
    double r = super.getPointsDistance(o, a);
    return 2 * Math.PI * r;
  }

  @Override
  double getArea() {
    double r = super.getPointsDistance(o, a);
    return Math.PI * Math.pow(r, 2);
  }

  @Override
  public String toString() {
    return "Circle{" +
        "o=" + o +
        ", a=" + a +
        '}';
  }
}


