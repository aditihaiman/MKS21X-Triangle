public class Driver {
  public static void main(String[] args) {
    Point p1 = new Point(0, 0);
    Point p2 = new Point(4, 0);
    Point p3 = new Point(0, 3);

    System.out.println(p2.distanceTo(p3));
    System.out.println(Point.distance(p1, p2));
    System.out.println(p1.toString());

    Triangle rightTri = new Triangle(p1, p2, p3);

    System.out.println(rightTri.getVertex(1));
    System.out.println(rightTri.toString());
    System.out.println(rightTri.getPerimeter());

  }


}
