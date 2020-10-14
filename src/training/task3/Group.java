package training.task3;

import java.util.Arrays;

public class Group {
  Student[] group = new Student[10];

  public Group() {
  }

  public Student[] getGroup() {
    return group;
  }

  public void setGroup(Student[] group) {
    this.group = group;
  }

  public void addStudentByIndex(Student student, int index) throws GroupIndexOutOfBoundsException {
    Student studentToSearch = getStudentByLastName(student.getLastName());
    if (studentToSearch != null) {
      System.out.println("Student already added to the group " + studentToSearch);
      return;
    }
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

  public Student[] getSortedGroup() {
    boolean isSorted = false;
    String student;
    Student[] groupSorted = group.clone();
    Student buffer;
    for (int i = groupSorted.length - 1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        String item = groupSorted[j] != null ? groupSorted[j].getLastName() : "";
        String itemNext = groupSorted[j + 1] != null ? groupSorted[j + 1].getLastName() : "";

        int compare = item.compareTo(itemNext);

        if (item.equals("") && !itemNext.equals("")) compare = 1;
        if (!item.equals("") && itemNext.equals("")) compare = -1;

        if (compare > 0) {
          Student tmp = groupSorted[j];
          groupSorted[j] = groupSorted[j + 1];
          groupSorted[j + 1] = tmp;
        }
      }
    }
    return groupSorted;
  }

  @Override
  public String toString() {
    return "Group{" +
        "group=" + Arrays.toString(getSortedGroup()) +
        '}';
  }
}
