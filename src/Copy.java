import java.io.File;

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
}
