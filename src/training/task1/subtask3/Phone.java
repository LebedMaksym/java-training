package training.task1.subtask3;

public class Phone {
  private String number;

  public Phone(String number) {
    this.number = number;
  }

  public Phone() {
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public void registerPhone(Network network) {
    network.registerPhone(this);
  }

  public void call(String number, Network network) {
    if (this.number.equals(number)) {
      System.out.println("You can not call on your own number");
      return;
    }
    for (Phone phone : network.getPhonesList()) {
      if (phone != null && phone.number.equals(number)) {
        phone.incomingCall(this.number);
        return;
      }
    }
    System.out.println(number + " does not exist in network");
  }

  private void incomingCall(String number) {
    System.out.println(this.number + " got incoming call from " + number);
  }

  @Override
  public String toString() {
    return "Phone{" +
        "number='" + number + '\'' +
        '}';
  }
}
