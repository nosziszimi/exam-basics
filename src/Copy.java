import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nóra on 2017. 04. 18..
 */
public class Copy {

  public static void printUsage() {
    System.out.println("copy [source] [destination]");
  }

  public static void missingDestination() {
    System.out.println("No destination provided");
  }

  public static boolean isFile(String path) {
    File file = new File(path);
    return file.isFile();
  }

  public static void readAndWrite(String sourcePath, String destinationPath) {
    Path source = Paths.get(sourcePath);
    try {
      List<String> lines = new ArrayList<>(Files.readAllLines(source));
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
