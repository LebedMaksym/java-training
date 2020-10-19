package training.task4;

import training.task4.comparators.AgeStudentComparator;
import training.task4.comparators.FirstNameStudentComparator;
import training.task4.comparators.LastNameStudentComparator;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Group implements MilitaryCommision {
  private Student[] group = new Student[5];

  public Group() {
  }

  public Student[] getGroup() {
    return group;
  }

  public void setGroup(Student[] group) {
    this.group = group;
  }

  public void addStudentFromKeyboard(int index) {
    if (group[index] != null) {

    }
    try {
      Student student = new Student();
      Scanner scanner = new Scanner(System.in);
      System.out.println("Set student first name");
      student.setFirstName(scanner.nextLine());
      System.out.println("Set student last name");
      student.setLastName(scanner.nextLine());
      System.out.println("Set student sex");
      student.setSex(scanner.nextLine());
      System.out.println("Set student if from campus");
      student.setFromCampus(scanner.nextBoolean());
      System.out.println("Set student age");
      student.setAge(scanner.nextInt());

      if (checkGroupHasStudent(student)) return;

      if (group[index] != null) {
        System.out.println("This place in group already taken by " + group[index]);
      } else {
        group[index] = student;
      }
    } catch (Exception e) {
      System.out.println("Error setting student data");
      e.printStackTrace();
    }
  }

  public boolean checkGroupHasStudent(Student student) {
    Student studentToSearch = getStudentByLastName(student.getLastName());
    if (studentToSearch != null) {
      System.out.println("Student already added to the group " + studentToSearch);
      return true;
    } else return false;
  }

  public void addStudentByIndex(Student student, int index) throws GroupIndexOutOfBoundsException {
    if (checkGroupHasStudent(student)) return;
    try {
      if (group[index] != null) {
        System.out.println("This place in group already taken by " + group[index]);
      } else {
        group[index] = student;
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      throw new GroupIndexOutOfBoundsException(index);
    }
  }

  public void removeStudent(Student student) {
    for (int i = 0; i < group.length; i++) {
      if (student.equals(group[i])) {
        group[i] = null;
        return;
      }
    }
    System.out.println("No such student in group" + student);
  }

  public Student getStudentByLastName(String lastName) {
    for (Student student : group) {
      if (student != null && student.getLastName().equals(lastName)) {
        return student;
      }
    }
    return null;
  }

  public void sort(String property, int sortDirection) {
    switch (property) {
      case "lastName":
        Arrays.sort(group, new LastNameStudentComparator(sortDirection));
        break;
      case "firstName":
        Arrays.sort(group, new FirstNameStudentComparator(sortDirection));
        break;
      case "age":
        Arrays.sort(group, new AgeStudentComparator(sortDirection));
        break;
      default:
        Arrays.sort(group, new LastNameStudentComparator(1));
    }
    System.out.println("Group{" + "group=" + Arrays.toString(group) + '}');
  }


  @Override
  public String toString() {
    Student[] groupSorted = this.group.clone();
    Arrays.sort(groupSorted);
    return "Group{" +
        "group=" + Arrays.toString(groupSorted) +
        '}';
  }

  @Override
  public Student[] getAdultMaleStudents() {
    Student[] studentsFiltered = new Student[group.length];

    int count = 0;
    for (int i = 0; i < group.length; i++) {
      if (group[i].getAge() >= 18 && group[i].getSex() == "male") {
        studentsFiltered[i] = group[i];
        count++;
      }
    }

    Arrays.sort(studentsFiltered, new LastNameStudentComparator(1));

    Student[] adultMaleStudents = new Student[count];
    for (int i = 0; i < studentsFiltered.length; i++) {
      if (studentsFiltered[i] != null) {
        adultMaleStudents[i] = studentsFiltered[i];
      }
    }
    return adultMaleStudents;
  }
}
