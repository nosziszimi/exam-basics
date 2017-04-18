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
    int cardsNumber = numberOfCards;
    ArrayList<String> colors = new ArrayList<>();
    ArrayList<String[]> allCardColorsAndValues = new ArrayList<>();
    if (numberOfCards < 4) {
      for (String color : Card.COLORS) {
        String cardColor = new String("color");
        colors.add(cardColor);
      }
      for (int i = 0; i < numberOfCards; i++) {
        String[] colorAndValue = new String[2];
        colorAndValue[0] = colors.get(i);
        allCardColorsAndValues.add(colorAndValue);
      }
    } else {
      do {
        for (String color : Card.COLORS) {
          String[] colorAndValue = new String[2];
          colorAndValue[0] = color;
          allCardColorsAndValues.add(colorAndValue);
          cardsNumber -= Card.COLORS.size();
        }
      } while (numberOfCards != 0); {
        int random = (int)(Math.random() * colors.size());
        String[] colorAndValue = new String[2];
        colorAndValue[0] = colors.get(random);
        allCardColorsAndValues.add(colorAndValue);
        cardsNumber -= 1;
      }
    }
  }
}
