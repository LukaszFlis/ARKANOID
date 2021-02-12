package Akanoid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Luk
 */
public class FLC {

    private final Scanner sc = new Scanner(System.in);
    //WEJŚCIE
    private final int input = 220;
    //WYJŚCIE
    private final int output = -22;
    //wejściowe zbiory rozmyte zmiennej lingwistycznej różnica
    private ArrayList<Pairs> zero = new ArrayList<>();
    private ArrayList<Pairs> someLeft = new ArrayList<>();
    private ArrayList<Pairs> left = new ArrayList<>();
    private ArrayList<Pairs> extremeLeft = new ArrayList<>();
    private ArrayList<Pairs> someRight = new ArrayList<>();
    private ArrayList<Pairs> right = new ArrayList<>();
    private ArrayList<Pairs> extremeRight = new ArrayList<>();

    //weyjściowe zbiory rozmyte zmiennej lingwistycznej WYCHYLENIE
    private ArrayList<Pairs> zeroOut = new ArrayList<>();
    private ArrayList<Pairs> someLeftOut = new ArrayList<>();
    private ArrayList<Pairs> leftOut = new ArrayList<>();
    private ArrayList<Pairs> extremeLefOut = new ArrayList<>();
    private ArrayList<Pairs> someRightOut = new ArrayList<>();
    private ArrayList<Pairs> rightOut = new ArrayList<>();
    private ArrayList<Pairs> extremeRightOut = new ArrayList<>();

    public FLC() {
    }

    /**
     * Starts up all lists (fuzzy sets)
     */
    public void initFuzzySets() {
        zeroOut.add(new Pairs(1.0, 0));
        someLeftOut.add(new Pairs(1.0, -12.0));
        leftOut.add(new Pairs(1.0, -24.0));
        extremeLefOut.add(new Pairs(1.0, -36.0));
        someRightOut.add(new Pairs(1.0, 12));
        rightOut.add(new Pairs(1.0, 24.0));
        extremeRightOut.add(new Pairs(1.0, 36.0));
    }

    /**
     * Metoda iniciująca wartości wejściowego zbioru rozmytego ZERO
     *
     * @param u
     * @param x
     * @param lbl
     */
    public void initZero(JTextField u, JTextField x, JLabel lbl) {
        String uValues = u.getText();
        String xValues = x.getText();
        String[] uNumbers = uValues.split(",");
        String[] xNumbers = xValues.split(",");
        //wartośc funkcji przynależności
        double fX;
        // wartość elementu zmiennej lingwistycznej RÓŻNICA
        double v;

        for (int i = 0; i < 13; i++) {
            fX = Double.parseDouble(uNumbers[i]);
            v = Double.parseDouble(xNumbers[i]);
            zero.add(new Pairs(fX, v));
        }
        StringBuilder result = new StringBuilder();
        result.append("{");
        for (int i = 0; i < zero.size(); i++) {
            result.append(String.valueOf(zero.get(i).getU())).append("/").append(String.valueOf(zero.get(i).getX())).append("; ");
        }
        result.append("}");
        lbl.setText(String.valueOf(result));
    }

    /**
     * Metoda iniciująca wartości zbioru rozmytego SOME_LEFT
     *
     * @param u
     * @param x
     * @param lbl
     */
    public void initSomeLeft(JTextField u, JTextField x, JLabel lbl) {
        String uValues = u.getText();
        String xValues = x.getText();
        String[] uNumbers = uValues.split(",");
        String[] xNumbers = xValues.split(",");
        //wartośc funkcji przynależności
        double fX;
        // wartość elementu zmiennej lingwistycznej RÓŻNICA
        double v;
        for (int i = 0; i < 13; i++) {
            fX = Double.parseDouble(uNumbers[i]);
            v = Double.parseDouble(xNumbers[i]);
            someLeft.add(new Pairs(fX, v));
        }
        StringBuilder result = new StringBuilder();
        result.append("{");
        for (int i = 0; i < someLeft.size(); i++) {
            result.append(String.valueOf(someLeft.get(i).getU())).append("/").append(String.valueOf(someLeft.get(i).getX())).append("; ");
        }
        result.append("}");
        lbl.setText(String.valueOf(result));
    }

    /**
     * Metoda iniciująca wartości zbioru rozmytego LEFT
     *
     * @param u
     * @param x
     * @param lbl
     */
    public void initLeft(JTextField u, JTextField x, JLabel lbl) {
        String uValues = u.getText();
        String xValues = x.getText();
        String[] uNumbers = uValues.split(",");
        String[] xNumbers = xValues.split(",");
        //wartośc funkcji przynależności
        double fX;
        // wartość elementu zmiennej lingwistycznej RÓŻNICA
        double v;
        for (int i = 0; i < 13; i++) {
            fX = Double.parseDouble(uNumbers[i]);
            v = Double.parseDouble(xNumbers[i]);
            left.add(new Pairs(fX, v));
        }
        StringBuilder result = new StringBuilder();
        result.append("{");
        for (int i = 0; i < left.size(); i++) {
            result.append(String.valueOf(left.get(i).getU())).append("/").append(String.valueOf(left.get(i).getX())).append("; ");
        }
        result.append("}");
        lbl.setText(String.valueOf(result));
    }

    /**
     * Metoda iniciująca wartości zbioru rozmytego EXTREME_LEFT
     *
     * @param u
     * @param x
     * @param lbl
     */
    public void initExtremeLeft(JTextField u, JTextField x, JLabel lbl) {
        String uValues = u.getText();
        String xValues = x.getText();
        String[] uNumbers = uValues.split(",");
        String[] xNumbers = xValues.split(",");
        //wartośc funkcji przynależności
        double fX;
        // wartość elementu zmiennej lingwistycznej RÓŻNICA
        double v;
        for (int i = 0; i < 7; i++) {
            fX = Double.parseDouble(uNumbers[i]);
            v = Double.parseDouble(xNumbers[i]);
            extremeLeft.add(new Pairs(fX, v));
        }
        StringBuilder result = new StringBuilder();
        result.append("{");
        for (int i = 0; i < zero.size(); i++) {
            result.append(String.valueOf(extremeLeft.get(i).getU())).append("/").append(String.valueOf(extremeLeft.get(i).getX())).append("; ");
        }
        result.append("}");
        lbl.setText(String.valueOf(result));
    }

    /**
     * Metoda iniciująca wartości zbioru rozmytego SOME_Right
     *
     * @param u
     * @param x
     * @param lbl
     */
    public void initSomeRigth(JTextField u, JTextField x, JLabel lbl) {
        String uValues = u.getText();
        String xValues = x.getText();
        String[] uNumbers = uValues.split(",");
        String[] xNumbers = xValues.split(",");
        //wartośc funkcji przynależności
        double fX;
        // wartość elementu zmiennej lingwistycznej RÓŻNICA
        double v;
        for (int i = 0; i < 13; i++) {
            fX = Double.parseDouble(uNumbers[i]);
            v = Double.parseDouble(xNumbers[i]);
            someRight.add(new Pairs(fX, v));
        }
        StringBuilder result = new StringBuilder();
        result.append("{");
        for (int i = 0; i < someRight.size(); i++) {
            result.append(String.valueOf(someRight.get(i).getU())).append("/").append(String.valueOf(someRight.get(i).getX())).append("; ");
        }
        result.append("}");
        lbl.setText(String.valueOf(result));
    }

    /**
     * Metoda iniciująca wartości zbioru rozmytego RIGHT
     *
     * @param u
     * @param x
     * @param lbl
     */
    public void initRigth(JTextField u, JTextField x, JLabel lbl) {
        String uValues = u.getText();
        String xValues = x.getText();
        String[] uNumbers = uValues.split(",");
        String[] xNumbers = xValues.split(",");
        //wartośc funkcji przynależności
        double fX;
        // wartość elementu zmiennej lingwistycznej RÓŻNICA
        double v;
        for (int i = 0; i < 13; i++) {
            fX = Double.parseDouble(uNumbers[i]);
            v = Double.parseDouble(xNumbers[i]);
            right.add(new Pairs(fX, v));
        }
        StringBuilder result = new StringBuilder();
        result.append("{");
        for (int i = 0; i < right.size(); i++) {
            result.append(String.valueOf(right.get(i).getU())).append("/").append(String.valueOf(right.get(i).getX())).append("; ");
        }
        result.append("}");
        lbl.setText(String.valueOf(result));
    }

    /**
     * Metoda iniciująca wartości zbioru rozmytego EXTREME_RIGHT
     *
     * @param u
     * @param x
     * @param lbl
     */
    public void initExtremeRigth(JTextField u, JTextField x, JLabel lbl) {
        String uValues = u.getText();
        String xValues = x.getText();
        String[] uNumbers = uValues.split(",");
        String[] xNumbers = xValues.split(",");
        //wartośc funkcji przynależności
        double fX;
        // wartość elementu zmiennej lingwistycznej RÓŻNICA
        double v;
        for (int i = 0; i < 7; i++) {
            fX = Double.parseDouble(uNumbers[i]);
            v = Double.parseDouble(xNumbers[i]);
            extremeRight.add(new Pairs(fX, v));
        }
        StringBuilder result = new StringBuilder();
        result.append("{");
        for (int i = 0; i < extremeRight.size(); i++) {
            result.append(String.valueOf(extremeRight.get(i).getU())).append("/").append(String.valueOf(extremeRight.get(i).getX())).append("; ");
        }
        result.append("}");
        lbl.setText(String.valueOf(result));
    }

    /**
     *
     * @param list1
     * @param list2
     * @return
     */
    public ArrayList<Pairs> calcMin(ArrayList<Pairs> list1, ArrayList<Pairs> list2) {
        ArrayList<Pairs> result = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).getU() < list2.get(i).getU()) {
                result.add(list1.get(i));
            } else if (list1.get(i).getU() > list2.get(i).getU()) {
                result.add(list2.get(i));
            }
        }
        return result;
    }

    /**
     *
     * @param list1
     * @param list2
     * @return
     */
    public ArrayList<Pairs> calcMax(ArrayList<Pairs> list1, ArrayList<Pairs> list2) {
        ArrayList<Pairs> result = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).getU() > list2.get(i).getU()) {
                result.add(list1.get(i));
            } else if (list1.get(i).getU() < list2.get(i).getU()) {
                result.add(list2.get(i));
            }
        }
        return result;
    }

    /**
     *
     * @param paddleX
     * @param ballX
     * @param ballY
     * @return
     */
    public int playGame(int paddleX, int ballX, int ballY) {
        int diffrence = (ballX + 10) - (paddleX + 50);
        if (diffrence < 0) {
            if (paddleX < 5) {
                paddleX = 5;
            } else {
                paddleX -= 22;
            }
        } else if (diffrence > 0) {
            if (paddleX >= 615) {
                paddleX = 615;
            } else {
                paddleX += 22;
            }
        }
        return paddleX;
    }

}
