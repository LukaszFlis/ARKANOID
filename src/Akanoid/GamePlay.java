package Akanoid;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.Serializable;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * Main content of the game
 *
 * @author Luk
 */
public class GamePlay extends JPanel implements ActionListener, KeyListener, Serializable {

    FLC flc = new FLC();
    static boolean play = false;
    private int score = 0;
    private int totalBricks = 21;

    private MapGenerator map;

    private final Timer time;
    private int delay = 4;

    private int paddleX = 310;
    private final int paddleY = 550;

    static int ballX = 130;
    private int ballY = 350;
    private int ballXDir = 1;
    private int ballYDir = 2;

    @SuppressWarnings("LeakingThisInConstructor")
    public GamePlay() {
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        time = new Timer(delay, this);
        time.start();
        map = new MapGenerator(3, 7);
    }

    /**
     *
     * @param g
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        //Background of the game
        g.setColor(Color.black);
        g.fillRect(1, 1, width -1, height -1);

        //draw bricks
        map.draw((Graphics2D) g);

        //borders
        g.setColor(Color.yellow);
        g.fillRect(0, 0, 3, 720);
        g.fillRect(0, 0, 720, 3);
        g.fillRect(720, 0, 3, 600);

        //score
        g.setColor(Color.white);
        g.setFont(new Font("serif", Font.BOLD, 25));
        g.drawString("" + score, 620, 30);

        //paddle
        g.setColor(Color.green);
        g.fillRect(paddleX, paddleY, 100, 8);

        //the ball
        g.setColor(Color.blue);
        g.fillOval(ballX, ballY, 20, 20);
        
        //win condition
        if (totalBricks <= 0) {
            play = false;
            ballXDir = 0;
            ballXDir = 0;
            g.setColor(Color.red);
            g.setFont(new Font("serif", Font.BOLD, 30));
            g.drawString("You Won! Score: " + score, 190, 300);
            g.setFont(new Font("serif", Font.BOLD, 20));
            g.drawString("Press Enter to Restart", 230, 350);

        }
        //lose condition
        if (ballY > 570) {
            play = false;
            ballXDir = 0;
            ballXDir = 0;
            g.setColor(Color.red);
            g.setFont(new Font("serif", Font.BOLD, 30));
            g.drawString("Game Over. Score: " + score, 190, 300);
            g.setFont(new Font("serif", Font.BOLD, 20));
            g.drawString("Press Enter to Restart", 230, 350);

        }

        //g.dispose();
    }

    /**
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        time.start();
        if (play) {
            if (new Rectangle(ballX, ballY, 20, 20).intersects(new Rectangle(paddleX, paddleY, 100, 8))) {
                ballYDir = -ballYDir;
                delay--;
            }

            A:
            for (int i = 0; i < map.map.length; i++) {
                for (int j = 0; j < map.map[0].length; j++) {
                    if (map.map[i][j] > 0) {
                        int brickX = j * map.bricWidth + 80;
                        int brickY = i * map.bricHeight + 50;
                        int brickWidth = map.bricWidth;
                        int brickHeight = map.bricHeight;
                        Rectangle rect = new Rectangle(brickX, brickY, brickWidth, brickHeight);
                        Rectangle ballRect = new Rectangle(ballX, ballY, 20, 20);
                        Rectangle brickRect = rect;
                        if (ballRect.intersects(brickRect)) {
                            map.setBrickValue(0, i, j);
                            totalBricks--;
                            score += 5;
                            if (ballX + 19 <= brickRect.x || ballX + 1 >= brickRect.x + brickRect.width) {
                                ballXDir = -ballXDir;
                            } else {
                                ballYDir = -ballYDir;
                            }
                            break A;
                        }
                    }
                }
            }

            ballX += ballXDir;
            ballY += ballYDir;

            if (ballX < 0) {
                ballXDir = -ballXDir;
            }

            if (ballY < 0) {
                ballYDir = -ballYDir;
            }

            if (ballX >= 700) {
                ballXDir = -ballXDir;
            }
            paddleX = flc.playGame(paddleX, ballX, ballY);
        }
        
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!play) {
                ballX = 130;
                ballY = 350;
                ballXDir = 1;
                ballYDir = 2;
                paddleX = 310;
                score = 0;
                totalBricks = 21;
                map = new MapGenerator(3, 7);
                repaint();
            }
        }

        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            play = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    public int getTotalBricks() {
        return totalBricks;
    }
}
