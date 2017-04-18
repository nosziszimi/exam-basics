package blackjack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by Nóra on 2017. 04. 18..
 */
public class Card {
  static final HashSet<String> COLORS = new HashSet<>(Arrays.asList("Clubs", "Diamonds", "Hearts", "Spades"));
  static final ArrayList VALUES = new ArrayList<>(Arrays.asList("Ace", 2, 3, 4, 5, 6, 7, 8, 9, 10, "Jack", "Queen", "King"));
  String color, value;

  public Card(String color, String value) {
    this.color = color;
    this.value = value;
  }

  public String toString() {
    String card = new String();
    return card = value + " " + color;
  }
}
