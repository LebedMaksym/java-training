package training.task1.subtask3;

import java.util.Arrays;

public class Network {
  private Phone[] phonesList;

  public Phone[] getPhonesList() {
    return phonesList;
  }

  public Network(int maxItems) {
    phonesList = new Phone[maxItems];
  }

  public Network() {
  }

  public void registerPhone(Phone phone) {
    for (int i = 0; i < phonesList.length; i++) {
      if (phonesList[i] == null) {
        phonesList[i] = phone;
        return;
      } else if (phonesList[i].getNumber().equals(phone.getNumber())) {
        System.out.println(phone.getNumber() + " is already registered in network");
        return;
      } else if (i == phonesList.length - 1) {
        System.out.println("The network is overloaded");
      }
    }
  }

  @Override
  public String toString() {
    return "Network{" +
        "phonesList=" + Arrays.toString(phonesList) +
        '}';
  }
}
