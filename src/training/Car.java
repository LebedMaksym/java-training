package training;

public class Car {
  private String color;
  private double weight;
  private int year;
  private double velocity = 0;

  public Car(String color, double weight, int year) {
    super();
    this.color = color;
    this.weight = weight;
    this.year = year;
  }

  public Car() {
    super();
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public int getYear() {
    return year;
  }

  public double getVelocity() {
    return velocity;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public void beep() {
    System.out.println("Bear-bear");
  }

  public void acceleration(double a) {
    this.velocity += a;
  }

  public void deceleration(double b) {
    if (velocity - b >= 0) {
      velocity -= b;
    }
  }

  @Override
  public String toString() {
    return "Car{" +
        "color='" + color + '\'' +
        ", weight=" + weight +
        ", year=" + year +
        ", velocity=" + velocity +
        '}';
  }
}
