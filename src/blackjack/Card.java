package blackjack;

/**
 * Created by Nóra on 2017. 04. 18..
 */
public class Card {

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
