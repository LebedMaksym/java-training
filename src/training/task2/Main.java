package training.task2;

public class Main {
  public static void main(String[] args) {
    Triangle triangle = new Triangle(new Point(0, 0), new Point(2, 2), new Point(0, 4));
    Rectangle rectangle = new Rectangle(new Point(0, 0), new Point(0, 2), new Point(4, 2), new Point(0, 4));
    Circle circle = new Circle(new Point(0, 0), new Point(0, 2));

    Board board = new Board();

  }
}
