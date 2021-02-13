package Akanoid;

import java.util.Objects;

/**
 *
 * @author Luk
 */
public class Pairs {
    //wartośc funkcji przynależności
    double u;
    //wartość elementu zmiennej lingwistycznej
    double x;
    
    //Konstruktor iniciujący
    Pairs(double u, double x){
        this.u = u;
        this.x = x;
    }

    public double getU() {
        return u;
    }

    public void setU(double u) {
        this.u = u;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
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
