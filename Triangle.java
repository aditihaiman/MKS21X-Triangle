public class Triangle {
  private Point v1, v2, v3;

  public Triangle(Point a, Point b, Point c) {
    v1 = new Point(a.getX(), a.getY());
    v2 = new Point(b.getX(), b.getY());
    v3 = new Point(c.getX(), c.getY());
  }

  public Triangle(double aX, double aY, double bX, double bY, double cX, double cY) {
    v1 = new Point(aX, aY);
    v2 = new Point(bX, bY);
    v3 = new Point(cX, cY);
  }

  public void setVertex(int x, Point A) {
    if (x == 1) v1 = new Point(A.getX(), A.getY());
    if (x == 2) v2 = new Point(A.getX(), A.getY());
    else {v3 = new Point(A.getX(), A.getY());}
}

  public Point getVertex(int x) {
    Point output;
    if (x == 1) output = new Point(v1.getX(), v1.getY());
    if (x == 2) output = new Point(v2.getX(), v2.getY());
    else {output = new Point(v3.getX(), v3.getY());}
    return output;
  }

  public double getPerimeter() {
    Point x = new Point(this.getVertex(1).getX(), this.getVertex(1).getY());
    Point y = new Point(this.getVertex(2).getX(), this.getVertex(2).getY());
    Point z = new Point(this.getVertex(3).getX(), this.getVertex(3).getY());
    return x.distanceTo(y) + y.distanceTo(z) + z.distanceTo(x);
  }

  public String toString() {
    return "Triangle: A" + this.getVertex(1) + " B" + this.getVertex(2) + " C" + this.getVertex(3);
  }

}
