package oneHundredProblems;
/*
 * In the popular Minesweeper game you have a board with some mines and those cells that don't contain a mine have a number in it that indicates the total number of mines in the neighboring cells. Starting off with some arrangement of mines we want to create a Minesweeper game setup.

Example

For

matrix = [[true, false, false],
         [false, true, false],
         [false, false, false]]
the output should be

minesweeper(matrix) = [[1, 2, 1], [2, 1, 1], [1, 1, 1]]
Check out the image below for better understanding:


//
Input/Output

[time limit] 4000ms (js)
[input] array.array.boolean matrix
A non-empty rectangular matrix consisting of boolean values - true if the corresponding cell contains a mine, false otherwise.

Guaranteed constraints:

2 ≤ matrix.length ≤ 5,

2 ≤ matrix[0].length ≤ 5.

[output] array.array.integer
Rectangular matrix of the same size as matrix each cell of which contains an integer equal to the number of mines in the neighboring cells. Two cells are called neighboring if they share at least one corner.
 */

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Java Minesweeper Game
 *
 * Author: Jan Bodnar
 * Website: http://zetcode.com
 */

public class Minesweeper extends JFrame {

    private JLabel statusbar;

    public Minesweeper() {

        initUI();
    }

    private void initUI() {

        statusbar = new JLabel("");
        add(statusbar, BorderLayout.SOUTH);

        add(new Board(statusbar));

        setResizable(false);
        pack();

        setTitle("Minesweeper");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            var ex = new Minesweeper();
            ex.setVisible(true);
        });
    }
}
