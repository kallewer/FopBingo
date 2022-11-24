import java.util.ArrayList;
import java.util.Collections;

/**
 * Class randomly generates a bingo card.
 *
 * @author Karl Werner
 * @version 1.0
 */
public class BingoCard {
    /**
     * Array of array of strings in 5x5 pattern.
     */
    private final String[][] bingoCard = new String[5][5];

    public BingoCard(){
        ArrayList <String> cardValues = new ArrayList<String>();
        fillArray(cardValues);
        shuffleArrayList(cardValues);
        ArrayListToArray(cardValues);
    }

    void fillArray(ArrayList<String> cardValues){
        cardValues.clear();
        for (int i = 0; i < 25; i++){
            cardValues.add(BingoValues.values()[i].getExpression());
        }

    }

    void shuffleArrayList(ArrayList<String> cardValues){
        Collections.shuffle(cardValues);
    }

    void ArrayListToArray(ArrayList<String> cardValues) {
        int index = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                bingoCard[i][j] = cardValues.get(index);
                index++;
            }
        }
    }
    public String[][] getCardValues() {
        return bingoCard;
    }
}
