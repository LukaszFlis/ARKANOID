package Akanoid;

import static Akanoid.GamePlay.ballX;
import static Akanoid.GamePlay.paddleX;
import static Akanoid.GamePlay.play;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Luk
 */
public class FLC {
    private Scanner sc = new Scanner(System.in);
    private final int dif = -220;
    private Pairs pair;
    private ArrayList<Pairs> zero = new ArrayList<>(11);
    private ArrayList<Pairs> someLeft = new ArrayList<>(10);
    private ArrayList<Pairs> left = new ArrayList<>(10);
    private ArrayList<Pairs> extremeLeft = new ArrayList<>(8);
    private ArrayList<Pairs> someRight = new ArrayList<>(10);
    private ArrayList<Pairs> right = new ArrayList<>(10);
    private ArrayList<Pairs> extremeRight = new ArrayList<>(8);

    public FLC() {
        init();
    }

    /**
     * Initialize components
     */
    public void init() {
        initZero(zero);
        initSomeLeft(someLeft);
        initLeft(left);
        initExtremeLeft(extremeLeft);
        initSomeRigth(someRight);
        initRigth(right);
        initExtremeRigth(extremeRight);
    }

    /**
     *Metoda iniciująca wartości zbioru rozmytego ZERO
     * @param list ArrayList przyjmująca pary wartości (u- wartośći funkcji przynależności x- elementy zmiennej lingwistycznej RÓŻNICA)
     */
    public void initZero(ArrayList<Pairs> list) {
        double u;
        double x;
        for (Pairs list1 : list) {
            u = sc.nextDouble();
            x = sc.nextDouble();
            list.add(pair = new Pairs (u, x));
        }
    }

    /**
     * Metoda iniciująca wartości zbioru rozmytego SomeLeft
     * @param list ArrayList przyjmująca pary wartości (u- wartośći funkcji przynależności x- elementy zmiennej lingwistycznej RÓŻNICA)
     */
    public void initSomeLeft(ArrayList<Pairs> list) {
        double u;
        double x;
        for (Pairs list1 : list) {
            u = sc.nextDouble();
            x = sc.nextDouble();
            list.add(pair = new Pairs (u, x));
        }
    }

    /**
     *Metoda iniciująca wartości zbioru rozmytego SomeLeft
     * @param list ArrayList przyjmująca pary wartości (u- wartośći funkcji przynależności x- elementy zmiennej lingwistycznej RÓŻNICA)
     */
    public void initLeft(ArrayList<Pairs> list) {
        double u;
        double x;
        for (Pairs list1 : list) {
            u = sc.nextDouble();
            x = sc.nextDouble();
            list.add(pair = new Pairs (u, x));
        }
    }

    /**
     * Metoda iniciująca wartości zbioru rozmytego SomeLeft
     * @param list ArrayList przyjmująca pary wartości (u- wartośći funkcji przynależności x- elementy zmiennej lingwistycznej RÓŻNICA)
     */
    public void initExtremeLeft(ArrayList<Pairs> list) {
        double u;
        double x;
        for (Pairs list1 : list) {
            u = sc.nextDouble();
            x = sc.nextDouble();
            list.add(pair = new Pairs (u, x));
        }
    }

    /**
     * Metoda iniciująca wartości zbioru rozmytego SomeLeft
     * @param list ArrayList przyjmująca pary wartości (u- wartośći funkcji przynależności x- elementy zmiennej lingwistycznej RÓŻNICA)
     */
    public void initSomeRigth(ArrayList<Pairs> list) {
        double u;
        double x;
        for (Pairs list1 : list) {
            u = sc.nextDouble();
            x = sc.nextDouble();
            list.add(pair = new Pairs (u, x));
        }
    }

    /**
     * Metoda iniciująca wartości zbioru rozmytego SomeLeft
     * @param list ArrayList przyjmująca pary wartości (u- wartośći funkcji przynależności x- elementy zmiennej lingwistycznej RÓŻNICA)
     */
    public void initRigth(ArrayList<Pairs> list) {
        double u;
        double x;
        for (Pairs list1 : list) {
            u = sc.nextDouble();
            x = sc.nextDouble();
            list.add(pair = new Pairs (u, x));
        }
    }

    /**
     * Metoda iniciująca wartości zbioru rozmytego SomeLeft
     * @param list ArrayList przyjmująca pary wartości (u- wartośći funkcji przynależności x- elementy zmiennej lingwistycznej RÓŻNICA)
     */
    public void initExtremeRigth(ArrayList<Pairs> list) {
        double u;
        double x;
        for (Pairs list1 : list) {
            u = sc.nextDouble();
            x = sc.nextDouble();
            list.add(pair = new Pairs (u, x));
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

    /**
     *
     *
     */
    public static void play() {
        if (play) {
            steerPaddle();
        }
    }
}
