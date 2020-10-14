package training.task3;

public class Human {
  private String firsName;
  private String lastName;
  private int age;
  private String sex;

  public Human() {
  }

  public Human(String firsName, String lastName, int age, String sex) {
    this.firsName = firsName;
    this.lastName = lastName;
    this.age = age;
    this.sex = sex;
  }


  public String getFirsName() {
    return firsName;
  }

  public void setFirsName(String firsName) {
    this.firsName = firsName;
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
        "firsName='" + firsName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", age=" + age +
        ", sex='" + sex + '\'' +
        '}';
  }
}
