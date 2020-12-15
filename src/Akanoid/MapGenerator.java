/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Akanoid;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author Luk
 */
public class MapGenerator {

    public int map[][];
    public int bricWidth;
    public int bricHeight;

    public MapGenerator(int row, int col) {

        map = new int[row][col];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                map[i][j] = 1;
            }
        }

        bricWidth = 540 / col;
        bricHeight = 140 / row;
    }

    public void draw(Graphics2D g) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] > 0) {
                    g.setColor(Color.white);
                    g.fillRect(j * bricWidth + 80, i * bricHeight + 50, bricWidth, bricHeight);
                }
            }
        }
    }

    //public 
}
