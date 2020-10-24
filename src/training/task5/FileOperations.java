package training.task5;

import java.io.*;

public class FileOperations {
  public static void copyFile(File in, File out) throws IOException {
    byte[] buffer = new byte[1024 * 1024];
    int readByte;
    try (FileInputStream fis = new FileInputStream(in);
        FileOutputStream fos = new FileOutputStream(out)) {
      for (; (readByte = fis.read(buffer)) > 0; ) {
        fos.write(buffer, 0, readByte);
      }
    } catch (IOException e) {
      throw e;
    }
  }

  public static void copyFilesByExtension(File sourceFolder, File targetFolder, String extension)
      throws IOException {
    if (sourceFolder.isFile() || targetFolder.isFile()) {
      System.out.println("Incorrect source or target folder");
      return;
    }
    File[] sourceFileList =
        sourceFolder.listFiles(
            (file, fileName) -> {
              return fileName.endsWith("." + extension);
            });
    for (File file : sourceFileList) {
      try {
        File newFile = new File(targetFolder, file.getName());
        copyFile(file, newFile);
      } catch (IOException e) {
        throw e;
      }
      System.out.println(file);
    }
  }

  public static File mergeFilesByEqualWords(File fileOne, File fileTwo, String pathToSave)
      throws IOException {
    File targetFile = new File(pathToSave);
    try (BufferedReader brFirstFile = new BufferedReader(new FileReader(fileOne));
        BufferedReader brSecondFile = new BufferedReader(new FileReader(fileTwo));
        PrintWriter writer = new PrintWriter(targetFile)) {

      StringBuilder fileContentFirst = new StringBuilder();
      StringBuilder fileContentSecond = new StringBuilder();

      String bufferLine;
      while ((bufferLine = brFirstFile.readLine()) != null) {
        fileContentFirst.append(bufferLine.trim()).append(" ");
      }
      while ((bufferLine = brSecondFile.readLine()) != null) {
        fileContentSecond.append(bufferLine.trim()).append(" ");
      }

      String[] firstFileWords = fileContentFirst.toString().split(" ");
      String[] secondFileWords = fileContentSecond.toString().split(" ");
      StringBuilder sameWords = new StringBuilder();

      for (String word : firstFileWords) {
        if (sameWords.indexOf(word) >= 0) continue;
        for (String wordToCompare : secondFileWords) {
          if (sameWords.indexOf(wordToCompare) >= 0) continue;
          if (word.equals(wordToCompare)) {
            sameWords.append(word).append(" ");
          }
        }
      }
      ;
      writer.println(sameWords.toString().trim());
      return targetFile;

    } catch (IOException e) {
      throw e;
    }
  }
}
