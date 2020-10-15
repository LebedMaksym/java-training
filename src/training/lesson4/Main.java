package training.lesson4;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Dog dogOne = new Dog("Bobik");
    Ball ball = new Ball(12, "red");
    Dog dogTwo = new Dog("Belka");
    Cat cat5 = new Cat("Semen", 6, "White");
    Cat cat4 = new Cat("Kolia", 2, "White");
    Cat cat3 = new Cat("Murka", 4, "White");
    Cat cat2 = new Cat("Kuzja", 4, "White");
    Cat cat1 = new Cat("Vaska", 8, "White");

    Cat[] catArray = {cat1, cat2, cat3, cat4, cat5};

    for (Cat cat : catArray) {
      System.out.println(cat);
    }

    Arrays.sort(catArray);
    System.out.println();
    for (Cat cat : catArray) {

      System.out.println(cat);
    }

    dogOne.bite(dogOne);
    dogOne.bite(ball);
    dogOne.bite(cat1);
    dogOne.bite(dogTwo);
  }
}
