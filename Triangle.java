public class Triangle {
  private Point a, b, c;

  public Triangle(Point A, Point B, Point C) {
    a = new Point(A.getX(), A.getY());
    b = new Point(B.getX(), B.getY());
    c = new Point(C.getX(), C.getY());
  }

  public Triangle(double A, Point B, Point C) {
    a = new Point(A.getX(), A.getY());
    b = new Point(B.getX(), B.getY());
    c = new Point(C.getX(), C.getY());
  }

  public void setA(Point A) {
    a = new Point(A.getX(), A.getY());
  }

  public void setB(Point B) {
    b = new Point(B.getX(), B.getY());
  }

  public void setC(Point C) {
    c = new Point(C.getX(), C.getY());
  }

  public Point getA() {
    return a;
  }

  public Point getB() {
    return b;
  }

  public Point getC() {
    return c;
  }

  public double perimeter(Triangle tri) {
    Point x = tri.getA();
    Point y = tri.getB();
    Point z = tri.getC();
    return x.distanceTo(y) + y.distanceTo(z) + z.distanceTo(x);
  }

}
