package blackjack;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nóra on 2017. 04. 18..
 */
public class Deck {

  List<Card> cards;

  public Deck(int numberOfCards) {
    cards = new ArrayList<>();

  }

  public void fillCardsList(int numberOfCards) {
    ArrayList<String> colors = new ArrayList<>();
    ArrayList<String[]> allCardColorsAndValues = new ArrayList<>();
    if (numberOfCards < 5) {
      for (String color : Card.COLORS) {
        String cardColor = new String ("color");
        colors.add(cardColor);
      }
      for (int i = 0; i < numberOfCards; i++) {
        String[] colorAndValue = new String[2];
        colorAndValue[0] = colors.get(i);;
        allCardColorsAndValues.add(colorAndValue);
      }
    }
  }
}
