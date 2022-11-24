import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BingoGraphic extends Frame {
    private final Button[][] bingoButtons;

    public BingoGraphic(String[][] bingoCard) {

        setLayout(new GridLayout(5, 5));

        bingoButtons = new Button[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                bingoButtons[i][j] = new Button(bingoCard[i][j]);
                add(bingoButtons[i][j]);
                bingoButtons[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                    }
                });
            }
        }

        setTitle("FOP Bingo");
        setSize(1000, 1000);
        setVisible(true);
    }
}
