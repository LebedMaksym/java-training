package training.task3;

public class Student extends Human {
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
        ", firsName='" + getFirsName() + '\'' +
        ", age=" + getAge() +
        ", sex='" + getSex() + '\'' +
        ", fromCampus=" + fromCampus +
        '}';
  }
}
