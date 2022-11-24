import java.awt.*;


public class Main extends Frame {

    public static void main(String[] args) {

        BingoCard bingoCard = new BingoCard();

        BingoGraphic bingoGraphic = new BingoGraphic(bingoCard.getCardValues());
    }
}