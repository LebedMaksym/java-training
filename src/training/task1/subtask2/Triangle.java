package training.task1.subtask2;

public class Triangle {
  private double a;
  private double b;
  private double c;

  public Triangle(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public Triangle() {
  }

  private double calculateHalfPerimeter() {
    return (a + b + c) / 2;
  }

  public double calculateSquare() {
    double p = calculateHalfPerimeter();
    return Math.sqrt(p * (p - a) * (p - b) * (p - c));
  }
}
