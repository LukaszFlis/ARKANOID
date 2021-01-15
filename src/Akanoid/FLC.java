package Akanoid;

import static Akanoid.GamePlay.ballX;
import static Akanoid.GamePlay.paddleX;
import static Akanoid.GamePlay.play;
import java.util.ArrayList;

/**
 *
 * @author Luk
 */
public class FLC {

    private final int dif = -220;
    private ArrayList<Integer> zero = new ArrayList<>(11);
    private ArrayList<Integer> someLeft = new ArrayList<>(10);
    private ArrayList<Integer> Left = new ArrayList<>(10);
    private ArrayList<Integer> ExtremeLeft = new ArrayList<>(8);
    private ArrayList<Integer> someRight = new ArrayList<>(10);
    private ArrayList<Integer> Right = new ArrayList<>(10);
    private ArrayList<Integer> ExtremeRight = new ArrayList<>(8);

    public FLC() {
        init();
    }

    /**
     * Initialize all private components
     */
    public void init() {
        initZero(zero);
        initSomeLeft(someLeft);
        initLeft(Left);
        initExtremeLeft(ExtremeLeft);
        initSomeRight(someRight);
        initRight(Right);
        initExtremeRigth(ExtremeRight);

    }

    public void initZero(ArrayList<Integer> list) {
        list.stream().map(_item -> -100).map(x -> {
            list.add(x);
            return x;
        }).forEachOrdered(x -> {
            x += 20;
        });
    }

    public void initSomeLeft(ArrayList<Integer> list) {
        list.stream().map(_item -> -200).map(x -> {
            list.add(x);
            return x;
        }).forEachOrdered(x -> {
            x += 20;
        });
    }

    public void initLeft(ArrayList<Integer> list) {
        list.stream().map(_item -> -300).map(x -> {
            list.add(x);
            return x;
        }).forEachOrdered(x -> {
            x += 20;
        });
    }

    public void initExtremeLeft(ArrayList<Integer> list) {
        list.stream().map(_item -> -340).map(x -> {
            list.add(x);
            return x;
        }).forEachOrdered(x -> {
            x += 20;
        });
    }

    public void initSomeRight(ArrayList<Integer> list) {
        list.stream().map(_item -> 0).map(x -> {
            list.add(x);
            return x;
        }).forEachOrdered(x -> {
            x += 20;
        });
    }

    public void initRight(ArrayList<Integer> list) {
        list.stream().map(_item -> 100).map(x -> {
            list.add(x);
            return x;
        }).forEachOrdered(x -> {
            x += 20;
        });
    }

    public void initExtremeRigth(ArrayList<Integer> list) {
        list.stream().map(_item -> 200).map(x -> {
            list.add(x);
            return x;
        }).forEachOrdered(x -> {
            x += 20;
        });
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
