package training.task4;

import training.task4.comparators.LastNameStudentComparator;

public class Student extends Human implements Comparable {
  private boolean fromCampus;

  public Student() {
    super();
  }

  public Student(String firsName, String lastName, int age, String sex, boolean fromCampus) {
    super(firsName, lastName, age, sex);
    this.fromCampus = fromCampus;
  }


  public boolean isFromCampus() {
    return fromCampus;
  }

  public void setFromCampus(boolean fromCampus) {
    this.fromCampus = fromCampus;
  }

  @Override
  public void printInfo() {
    System.out.println(this);
  }

  @Override
  public String toString() {
    return "Student{" +
        "lastName='" + getLastName() + '\'' +
        ", firsName='" + getFirstName() + '\'' +
        ", age=" + getAge() +
        ", sex='" + getSex() + '\'' +
        ", fromCampus=" + fromCampus +
        '}';
  }

  @Override
  public int compareTo(Object o) {
    LastNameStudentComparator comparator = new LastNameStudentComparator();
    return comparator.compare(this, (Student) o);
  }
}
