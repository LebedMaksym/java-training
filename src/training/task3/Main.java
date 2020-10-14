package training.task3;

import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    Student studentOne = new Student("Max", "A", 25, "male", true);
    Student studentTwo = new Student("Oleg", "B", 23, "male", true);
    Student studentThree = new Student("Olena", "C", 22, "female", true);
    Student studentFour = new Student("Andriy", "D", 21, "male", true);

    Group group = new Group();

    try {
      group.addStudentByIndex(studentOne, 5);
      group.addStudentByIndex(studentTwo, 0);
      group.addStudentByIndex(studentThree, 8);
      group.addStudentByIndex(studentFour, 7);
      System.out.println(group);

      group.removeStudent(studentFour);
      group.addStudentByIndex(studentFour, 10);

    } catch (GroupIndexOutOfBoundsException e) {
      System.out.println("Can not add student to the group:");
      System.out.println(e.getMessage());
      e.printStackTrace();
    }
  }
}