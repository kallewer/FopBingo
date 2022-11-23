import java.util.ArrayList;
import java.util.Random;

/**
 * Class randomly generates a bingo card.
 *
 * @author Karl Werner
 * @version 1.0
 */
public class BingoCard {
    /**
     * Arraylist of strings in 5x5 pattern.
     */
    private String[][] bingoCard = new String[5][5];
    private Random randomNum = new Random();

    public BingoCard(){
        ArrayList <String> cardValues = new ArrayList<String>();
    }

    void fillArray(ArrayList cardValues, int init){
        cardValues.clear();
        for (int i = init; i < init + 15; i++){

            cardValues.add(Expressions.values()[i]);
        }
    }
}
