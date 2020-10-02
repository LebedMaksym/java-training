package training.task1.subtask3;

public class Main {
  public static void main(String[] args) {
    Network network = new Network(5);
    Phone phone1 = new Phone("0951111111");
    Phone phone2 = new Phone("0952222222");
    Phone phone3 = new Phone("0953333333");

    phone1.registerPhone(network);
    phone2.registerPhone(network);
    phone3.registerPhone(network);

    phone1.call("0952222222", network);
    phone2.call("0953333333", network);
    phone3.call("0950000000", network);

    System.out.println(network);
  }
}
