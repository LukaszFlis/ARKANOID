/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Akanoid;

import java.util.Objects;

/**
 *
 * @author Luk
 */
public class Pairs {
    //1Współrzędna łuku
    double u;
    //2Współrzędna łuku
    double x;
    
    //Konstruktor iniciujący
    Pairs(double u, double x){
        this.u = u;
        this.x = x;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return u + "/" + x + "; ";
    }

    /**
     *
     * @param o Object
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pairs that = (Pairs) o;
        return u == that.u &&
                x == that.x;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(u, x);
    }
}
