public class Triangle {
  private Point a, b, c;

  public Triangle(Point v1, Point v2, Point v3) {
    a = new Point(v1.getX(), v1.getY());
    b = new Point(v2.getX(), v2.getY());
    c = new Point(v3.getX(), v3.getY());
  }

  public Triangle(double aX, double aY, double bX, double bY, double cX, double cY) {
    a = new Point(aX, aY);
    b = new Point(bX, bY);
    c = new Point(cX, cY);
  }

  public void setVertex(int x, Point A) {
    if (x == 1) a = new Point(A.getX(), A.getY());
    if (x == 2) b = new Point(A.getX(), A.getY());
    else {c = new Point(A.getX(), A.getY());}
}

  public Point getVertex(int x) {
    Point output;
    if (x == 1) output = new Point(a.getX(), a.getY());
    if (x == 2) output = new Point(b.getX(), b.getY());
    else {output = new Point(c.getX(), c.getY());}
    return output;
  }

  public double getPerimeter() {
    Point x = this.getVertex(1);
    Point y = this.getVertex(2);
    Point z = this.getVertex(3);
    return x.distanceTo(y) + y.distanceTo(z) + z.distanceTo(x);
  }

  public String toString() {
    return "Triangle: A" + this.getVertex(1) + " B" + this.getVertex(2) + " C" + this.getVertex(3);
  }

}
