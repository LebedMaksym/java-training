package training.task1.subtask1;

public class Cat {
  private String name;
  private String color;
  private int age;
  private boolean isPurring;
  private boolean isHappy;

  public Cat(String name, String color, int age) {
    this.name = name;
    this.color = color;
    this.age = age;
  }

  public Cat() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getColor() {
    return color;
  }

  public int getAge() {
    return age;
  }

  public void startPetting() {
    isPurring = true;
    isHappy = true;
  }

  public void stopPetting() {
    isPurring = false;
    isHappy = false;
  }

  @Override
  public String toString() {
    return "Cat{" +
        "name='" + name + '\'' +
        ", color='" + color + '\'' +
        ", age=" + age +
        ", isPurring=" + isPurring +
        ", isHappy=" + isHappy +
        '}';
  }
}
