import java.lang.Math;

public class Point{
  private double x, y;

  public Point(double X, double Y){
    x=X;
    y=Y;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }

  public double distanceTo(Point a) {
    return Math.sqrt(Math.pow(this.getX() + a.getX(), 2)+Math.pow(this.getY() + a.getY(), 2));
  }

  public static double distance(Point a, Point b) {
    return Math.sqrt(Math.pow(b.getX() + a.getX(), 2)+Math.pow(b.getY() + a.getY(), 2));
  }

  public String toString() {
    System.out.println("("+ this.getX() + ", " + this.getY() + ")";)
  }
}
