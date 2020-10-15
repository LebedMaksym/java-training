package training.task4.comparators;

import training.task4.Student;

import java.util.Comparator;

public class LastNameStudentComparator implements Comparator<Student> {
  private int direction;

  public LastNameStudentComparator() {
  }

  public LastNameStudentComparator(int direction) {
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

    String item = student != null ? student.getLastName() : "";
    String itemNext = studentNext != null ? studentNext.getLastName() : "";

    int compare = item.compareTo(itemNext);

    if (item.equals("") && !itemNext.equals("")) compare = 1;
    if (!item.equals("") && itemNext.equals("")) compare = -1;

    return direction * compare;
  }
}
