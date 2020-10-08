package training.task2;

import java.util.Arrays;

public class Board {
  private Shape[] shapes = new Shape[4];

  public Board() {
  }

  public Shape[] getShapes() {
    return shapes;
  }

  public void setShapes(Shape[] shapes) {
    this.shapes = shapes;
  }

  public void putFigureOnTheBoard(Shape shape) {
    for (int i = 0; i < shapes.length; i++) {
      if (shapes[i] == null) {
        shapes[i] = shape;
        return;
      }
    }
    System.out.println("The board is full");
  }

  public void removeFigureFromBoard(Shape shape) {
    for (int i = 0; i < shapes.length; i++) {
      if (shapes[i] == shape) {
        shapes[i] = null;
        System.out.println(shape + " was removed from board");
        return;
      }
    }
    System.out.println("There is no " + shape + " on the board");
  }

  public void printFigures() {
    double totalArea = 0;
    for (int i = 0; i < shapes.length; i++) {
      if (shapes[i] != null) {
        System.out.println(shapes[i]);
        totalArea += shapes[i].getArea();
      }
    }
    System.out.println("Total area is " + totalArea);
  }

  @Override
  public String toString() {
    return "Board{" +
        "shapes=" + Arrays.toString(shapes) +
        '}';
  }
}
