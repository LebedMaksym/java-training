package training.lesson4;

public class Ball implements Bite {
  private int size;
  private String color;

  public Ball() {
  }

  public Ball(int size, String color) {
    this.size = size;
    this.color = color;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public String toString() {
    return "Ball{" +
        "size=" + size +
        ", color='" + color + '\'' +
        '}';
  }

  @Override
  public boolean isTasty() {
    return this.size < 15;
  }
}
