package training.task1.subtask2;

public class Main {
  public static void main(String[] args) {
    Triangle triangleOne = new Triangle(13, 14, 15);
    double triangleOneSquare = triangleOne.calculateSquare();
    System.out.println("Triangle one square is: " + triangleOneSquare);

    Triangle triangleTwo = new Triangle(3, 4, 5);
    double triangleTwoSquare = triangleTwo.calculateSquare();
    System.out.println("Triangle two square is: " + triangleTwoSquare);

    Triangle triangleThree = new Triangle(5, 5, 8);
    double triangleThreeSquare = triangleThree.calculateSquare();
    System.out.println("Triangle three square is: " + triangleThreeSquare);
  }
}
