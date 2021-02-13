package Akanoid;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Luk
 */
public class FLC {

    //fuzzy sets of linguistic variable DIFFERENCE
    private ArrayList<Pairs> zero = new ArrayList<>();
    private ArrayList<Pairs> someLeft = new ArrayList<>();
    private ArrayList<Pairs> left = new ArrayList<>();
    private ArrayList<Pairs> extremeLeft = new ArrayList<>();
    private ArrayList<Pairs> someRight = new ArrayList<>();
    private ArrayList<Pairs> right = new ArrayList<>();
    private ArrayList<Pairs> extremeRight = new ArrayList<>();

    //fuzzy sets of liguistic variable SWING
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
        zeroOut.add(new Pairs(1, 0));
        someLeftOut.add(new Pairs(1, -12));
        leftOut.add(new Pairs(1, -24));
        extremeLefOut.add(new Pairs(1, -36));
        someRightOut.add(new Pairs(1, 12));
        rightOut.add(new Pairs(1, 24));
        extremeRightOut.add(new Pairs(1, 36));
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
     * Fuzzyfication for input value Difference = 220
     *
     * @param list fuzzy set
     * @return value of membership function for fuzzy set element equal to input
     */
    public String fuzzyfication(ArrayList<Pairs> list) {
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getX() == 220) {
                result = String.valueOf(list.get(i).getU());
            }
        }
        return result;
    }

    /**
     *
     * @param in value of set after fuzzyfication
     * @param list fuzzy set
     * @return new set after  
     */
    public StringBuilder inference(double in, ArrayList<Pairs> list) {
        StringBuilder result = new StringBuilder();
        result.append("{");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getU() > in) {
                result.append(String.valueOf(in)).append("/").append(String.valueOf(list.get(i).getX()));
                
            } else {
                result.append(String.valueOf(list.get(i).getU())).append("/").append(String.valueOf(list.get(i).getX()));
            }
        }
        result.append("}");
        return result;
    }
    
    /*public StringBuilder agregation (JLabel r1, JLabel r2,JLabel r3,JLabel r4, JLabel r5, JLabel r6, JLabel r7){
        StringBuilder result = new StringBuilder();
        String zero = r1.getText();
        String  zeroCut= zero.substring(0, zero.length()-1);
        String[] zeroVal = zeroCut.split("/");
        String sLeft = r2.getText();
        String  sLeftCut= sLeft.substring(0, sLeft.length()-1);
        String[] sLeftVal = sLeftCut.split("/");
        String left = r3.getText();
        String  leftCut= left.substring(0, left.length()-1);
        String[] leftVal = leftCut.split("/");
        String eLeft = r4.getText();
        String  eLeftCut= eLeft.substring(0, eLeft.length()-1);
        String[] eLeftVal = eLeftCut.split("/");
        String sRight = r5.getText();
        String  sRightCut= sRight.substring(0, sRight.length()-1);
        String[] sRightVal = sRightCut.split("/");
        String right = r6.getText();
        String  rightCut= right.substring(0, right.length()-1);
        String[] righttVal = rightCut.split("/");
        String eRight = r7.getText();
        String  eRightCut= eRight.substring(0, eRight.length()-1);
        String[] eRightVal = eRightCut.split("/");
        
        for (int i = 0; i < 7; i++) {
            
        }
        return result;
    }*/
    
    //public String defuzzyfication(){
        
    //}
            
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

    public ArrayList<Pairs> getZero() {
        return zero;
    }

    public ArrayList<Pairs> getSomeLeft() {
        return someLeft;
    }

    public ArrayList<Pairs> getLeft() {
        return left;
    }

    public ArrayList<Pairs> getExtremeLeft() {
        return extremeLeft;
    }

    public ArrayList<Pairs> getSomeRight() {
        return someRight;
    }

    public ArrayList<Pairs> getRight() {
        return right;
    }

    public ArrayList<Pairs> getExtremeRight() {
        return extremeRight;
    }

    public ArrayList<Pairs> getZeroOut() {
        return zeroOut;
    }

    public ArrayList<Pairs> getSomeLeftOut() {
        return someLeftOut;
    }

    public ArrayList<Pairs> getLeftOut() {
        return leftOut;
    }

    public ArrayList<Pairs> getExtremeLefOut() {
        return extremeLefOut;
    }

    public ArrayList<Pairs> getSomeRightOut() {
        return someRightOut;
    }

    public ArrayList<Pairs> getRightOut() {
        return rightOut;
    }

    public ArrayList<Pairs> getExtremeRightOut() {
        return extremeRightOut;
    }
}
