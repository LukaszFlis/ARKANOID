package Akanoid;

import static Akanoid.GamePlay.ballX;
import static Akanoid.GamePlay.paddleX;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Luk
 */
public class FLC {

    private Scanner sc = new Scanner(System.in);
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
     *Starts up all lists (fuzzy sets)
     */
    public void initFuzzySets() {
        zeroOut.add(new Pairs(1.0, 0));
        someLeftOut.add(new Pairs(1.0, -12.0));
        leftOut.add(new Pairs(1.0, -24.0));
        extremeLefOut.add(new Pairs(1.0, -36.0));
        someRightOut.add(new Pairs(1.0, 12));
        rightOut.add(new Pairs(1.0, 24.0));
        extremeRightOut.add(new Pairs(1.0, 36.0));
        initZero();
        initSomeLeft();
        initLeft();
        initExtremeLeft();
        initSomeRigth();
        initRigth();
        initExtremeRigth();
    }

    /**
     * Metoda iniciująca wartości wejściowego zbioru rozmytego ZERO
     */
    public void initZero() {
        System.out.println("Inicjalizacja zbioru wejściowego ZERO");
        //wartośc funkcji przynależności
        double u = 0;
        // wartość elementu zmiennej lingwistycznej RÓŻNICA
        double x = 0;

        for (int i = 0; i < 13; i++) {
            System.out.print("Pdaj wartość funkcji przynależności:");
            u = sc.nextDouble();
            System.out.print("Podaj wartość elementu zmiennejlingwistycznej:");
            x = sc.nextDouble();
            zero.add(new Pairs(u, x));
        }
    }

    /**
     * Metoda iniciująca wartości zbioru rozmytego SOME_LEFT
     */
    public void initSomeLeft() {
        System.out.println("Inicjalizacja zbioru wejściowego SOME_LEFT");
        //wartośc funkcji przynależności
        double u = 0;
        // wartość elementu zmiennej lingwistycznej RÓŻNICA
        double x = 0;
        for (int i = 0; i < 13; i++) {
            System.out.print("Pdaj wartość funkcji przynależności:");
            u = sc.nextDouble();
            System.out.print("Podaj wartość elementu zmiennejlingwistycznej:");
            x = sc.nextDouble();
            someLeft.add(new Pairs(u, x));
        }
    }

    /**
     * Metoda iniciująca wartości zbioru rozmytego LEFT
     */
    public void initLeft() {
        System.out.println("Inicjalizacja zbioru wejściowego LEFT");
        //wartośc funkcji przynależności
        double u = 0;
        // wartość elementu zmiennej lingwistycznej RÓŻNICA
        double x = 0;
        for (int i = 0; i < 13; i++) {
            System.out.print("Pdaj wartość funkcji przynależności:");
            u = sc.nextDouble();
            System.out.print("Podaj wartość elementu zmiennejlingwistycznej:");
            x = sc.nextDouble();
            left.add(new Pairs(u, x));
        }
    }

    /**
     * Metoda iniciująca wartości zbioru rozmytego EXTREME_LEFT
     */
    public void initExtremeLeft() {
        System.out.println("Inicjalizacja zbioru wejściowego EXTREME_LEFT");
        //wartośc funkcji przynależności
        double u = 0;
        // wartość elementu zmiennej lingwistycznej RÓŻNICA
        double x = 0;
        for (int i = 0; i < 7; i++) {
            System.out.print("Pdaj wartość funkcji przynależności:");
            u = sc.nextDouble();
            System.out.print("Podaj wartość elementu zmiennejlingwistycznej:");
            x = sc.nextDouble();
            extremeLeft.add(new Pairs(u, x));
        }
    }

    /**
     * Metoda iniciująca wartości zbioru rozmytego SOME_Right
     */
    public void initSomeRigth() {
        System.out.println("Inicjalizacja zbioru wejściowego SOME_RIGHT");
        //wartośc funkcji przynależności
        double u = 0;
        // wartość elementu zmiennej lingwistycznej RÓŻNICA
        double x = 0;
        for (int i = 0; i < 13; i++) {
            System.out.print("Pdaj wartość funkcji przynależności:");
            u = sc.nextDouble();
            System.out.print("Podaj wartość elementu zmiennejlingwistycznej:");
            x = sc.nextDouble();
            someRight.add(new Pairs(u, x));
        }
    }

    /**
     * Metoda iniciująca wartości zbioru rozmytego RIGHT
     */
    public void initRigth() {
        System.out.println("Inicjalizacja zbioru wejściowego RIGHT");
        //wartośc funkcji przynależności
        double u = 0;
        // wartość elementu zmiennej lingwistycznej RÓŻNICA
        double x = 0;
        for (int i = 0; i < 13; i++) {
            System.out.print("Pdaj wartość funkcji przynależności:");
            u = sc.nextDouble();
            System.out.print("Podaj wartość elementu zmiennejlingwistycznej:");
            x = sc.nextDouble();
            right.add(new Pairs(u, x));
        }
    }

    /**
     * Metoda iniciująca wartości zbioru rozmytego EXTREME_RIGHT
     */
    public void initExtremeRigth() {
        System.out.println("Inicjalizacja zbioru wejściowego EXTREME_RIGHT");
        //wartośc funkcji przynależności
        double u = 0;
        // wartość elementu zmiennej lingwistycznej RÓŻNICA
        double x = 0;
        for (int i = 0; i < 7; i++) {
            System.out.print("Pdaj wartość funkcji przynależności:");
            u = sc.nextDouble();
            System.out.print("Podaj wartość elementu zmiennejlingwistycznej:");
            x = sc.nextDouble();
            extremeRight.add(new Pairs(u, x));
        }
    }

    /**
     *
     */
    public static void steerPaddle() {
        while (true) {
            if (ballX >= -100 && ballX <= 100) {
                paddleX = 300;
            } else if (ballX >= -200 && ballX <= 0) {
                paddleX -= 145;
            } else if (ballX >= -300 && ballX <= -100) {
                paddleX -= 145;
            } else if (ballX >= -340 && ballX <= -200) {
                paddleX -= 145;
            } else if (ballX >= 0 && ballX <= 200) {
                paddleX += 145;
            } else if (ballX >= 100 && ballX <= 300) {
                paddleX += 145;
            } else if (ballX >= 200 && ballX <= 340) {
                paddleX += 145;
            }
        }
    }

}
