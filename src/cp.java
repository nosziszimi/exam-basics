/**
 * Created by Nóra on 2017. 04. 18..
 */
public class cp {

  public static void main(String[] args) {
    // This should be the basic replica of the 'cp' command
    // If ran from the command line without arguments
    // It should print out the usage:
    // copy [source] [destination]
    // When just one argument is provided print out
    // No destination provided
    // When both arguments provided and the source is a file
    // Read all contents from it and write it to the destination

    if (args.length == 0) {
      Copy.printUsage();
    } else if (args.length == 1) {
      Copy.missingDestination();
    } else if (args.length == 2 && Copy.isFile(args[0])) {
      Copy.readAndWrite(args[0], args[1]);
    } else {
      System.out.println("Unsupported argument");
    }
  }
}
