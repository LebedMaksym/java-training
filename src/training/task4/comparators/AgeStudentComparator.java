package training.task4.comparators;

import training.task4.Student;

import java.util.Comparator;

public class AgeStudentComparator implements Comparator<Student> {
  private int direction;

  public AgeStudentComparator() {
  }

  public AgeStudentComparator(int direction) {
    this.direction = direction;
  }

  public int getDirection() {
    return direction;
  }

  public void setDirection(int direction) {
    this.direction = direction;
  }

  @Override
  public int compare(Student student, Student studentNext) {
    return direction * student.getAge() - studentNext.getAge() ;
  }
}
