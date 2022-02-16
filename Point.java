package assignment1;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        setX(x);
        setY(y);
    }

    public void setX(int x){
        this.x = y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public double distance(Point point){
        return Math.sqrt(Math.pow(getX()-point.getX(),2)+Math.pow(getY()- point.getY(),2));
    }
}
