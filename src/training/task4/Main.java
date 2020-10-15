package training.task4;

import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    Student studentOne = new Student("Max", "A", 25, "male", true);
    Student studentTwo = new Student("Oleg", "B", 17, "male", true);
    Student studentThree = new Student("Olena", "C", 17, "female", true);
    Student studentFour = new Student("Andriy", "D", 18, "male", true);
    Student studentFive = new Student("Kek", "F", 21, "male", true);

    Group group = new Group();

    try {
      group.addStudentByIndex(studentOne, 4);
      group.addStudentByIndex(studentTwo, 0);
      group.addStudentByIndex(studentThree, 1);
      group.addStudentByIndex(studentFour, 3);
      group.addStudentByIndex(studentFive, 2);

      group.sort("age", -1);
      group.sort("lastName", -1);
      group.sort("firstName", -1);

      System.out.println(Arrays.toString(group.getAdultMaleStudents()));

    } catch (GroupIndexOutOfBoundsException e) {
      System.out.println("Can not add student to the group:");
      System.out.println(e.getMessage());
      e.printStackTrace();
    }

  }
}