package oddavg;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

/**
 * Created by Nóra on 2017. 04. 18..
 */
class OddAvgTest {

  OddAvg oddAvg = new OddAvg();

  @Test
  void oddAverage() {
    ArrayList<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
    assertEquals(4, oddAvg.oddAverage(listOfNumbers));
  }

}