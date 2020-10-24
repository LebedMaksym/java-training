package training.task5;

import java.io.File;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    int a = 1;
    try {
      File mergedFile =
          FileOperations.mergeFilesByEqualWords(
              new File("/home/max/Java/src/source/1.txt"),
              new File("/home/max/Java/src/source/2.txt"),
              "/home/max/Java/src/source/3.txt");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
