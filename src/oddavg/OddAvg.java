package oddavg;

import java.util.ArrayList;

/**
 * Created by Nóra on 2017. 04. 18..
 */
public class OddAvg {

  public static void main(String[] args) {
    // Create a function called `oddAverage` that takes a list of numbers as parameter
    // and returns the average value of the odd numbers in the list
    // Create basic unit tests for it with at least 3 different test cases
  }

  public static int oddAverage(ArrayList<Integer> listOfNumbers) {
    ArrayList<Integer> oddNumbers = new ArrayList<>();
    for (Integer number : listOfNumbers) {
      if (number % 2 == 1) {
        oddNumbers.add(number);
      }
    }
    int oddAvg = 0;
    for (Integer oddNumber : oddNumbers) {
      oddAvg += oddNumber;
    }
    oddAvg /= oddNumbers.size();
    return oddAvg;
  }

}
