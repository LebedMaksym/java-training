package training.task4;

public class Human {
  private String firstName;
  private String lastName;
  private int age;
  private String sex;

  public Human() {
  }

  public Human(String firsName, String lastName, int age, String sex) {
    this.firstName = firsName;
    this.lastName = lastName;
    this.age = age;
    this.sex = sex;
  }


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firsName) {
    this.firstName = firsName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public void printInfo() {
    System.out.println(this);
  }

  @Override
  public String toString() {
    return "Human{" +
        "firsName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", age=" + age +
        ", sex='" + sex + '\'' +
        '}';
  }
}
