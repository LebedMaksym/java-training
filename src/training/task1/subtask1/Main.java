package training.task1.subtask1;

public class Main {
  public static void main(String[] args) {
    Cat cat = new Cat("Tom", "Gray", 12);

    cat.startPetting();
    System.out.println(cat);

    cat.stopPetting();
    System.out.println(cat);

    cat.setName("Bob");
    System.out.println(cat);
  }
}
