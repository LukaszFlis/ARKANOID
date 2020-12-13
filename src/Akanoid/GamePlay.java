/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Akanoid;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.Serializable;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Luk
 */
public class GamePlay extends JPanel implements ActionListener, KeyListener, Serializable {

    private boolean play = false;
    private int score = 0;
    private int totalBricks = 21;

    private Timer time;
    private int delay = 8;

    private int paddleX = 310;
    private final  int paddleY = 550;

    private int ballX = 120;
    private int ballY = 350;
    private int ballXDir = -1;
    private int ballYDir = -2;

    public GamePlay() {
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
   
        time = new Timer(delay, this);
        time.start();
    }

    @Override
    public void paint(Graphics g) {

        //Background of the game
        g.setColor(Color.black);
        g.fillRect(1, 1, 692, 592);

        //borders
        g.setColor(Color.yellow);
        g.fillRect(0, 0, 3, 692);
        g.fillRect(0, 0, 692, 3);
        g.fillRect(689, 0, 3, 592);

        //paddle
        g.setColor(Color.green);
        g.fillRect(paddleX, paddleY, 100, 8);

        //the ball
        g.setColor(Color.blue);
        g.fillOval(ballX, ballY, 20, 20);

        g.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        time.start();
        
        
        if (new  Rectangle(ballX, ballY, 20, 20).intersects(new Rectangle(paddleX, paddleY, 100, 8))) {
            ballYDir = -ballYDir;
        }
        
        if (play) {
            ballX += ballXDir;
            ballY += ballYDir;

            if (ballX < 0) {
                ballXDir = -ballXDir;
            }

            if (ballY < 0) {
                ballYDir = -ballYDir;
            }

            if (ballX >= 670) {
                ballXDir = -ballXDir; 
            }
        }
        
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (paddleX >= 580) {
                paddleX = 580;
            } else {
                moveRigth();
            }
        }

        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if (paddleX < 10) {
                paddleX = 10;
            } else {
                moveLeft();
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    public void moveRigth() {
        play = true;
        paddleX += 20;
    }

    public void moveLeft() {
        play = true;
        paddleX -= 20;
    }

}
