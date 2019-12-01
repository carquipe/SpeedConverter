package Section6_OOP;

public class Point {
    private int x;
    private int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(int originX, int originY){
        Point originPoint = new Point(originX, originY);
        return distance(originPoint);
    }

    public double distance (Point originPoint){
        return Math.sqrt((originPoint.x - this.x) * (originPoint.x - this.x) + (originPoint.y - this.y) * (originPoint.y - this.y)) ;
    }

    public double distance (){
        return distance(new Point(0,0));
    }
}
