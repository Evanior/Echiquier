package fr.imie.huard.echiquier;

/**
 * Created by huard.cdi04 on 27/01/2017.
 */
public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean memePosition(Position p) {
        return p.getY() == this.getY() && p.getX() == this.getX();
    }

    @Override
    public String toString() {
        return "X : "+getX()+" Y : "+getY();
    }
}
