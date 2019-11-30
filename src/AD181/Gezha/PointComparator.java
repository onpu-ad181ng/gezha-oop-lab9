package AD181.Gezha;

import java.util.Comparator;

public class PointComparator implements Comparator<Point> {

  @Override
  public int compare(Point point1, Point point2) {
    if (point1.calculateDistance() > point2.calculateDistance()) {
      // point 1 is further
      return 1;
    }
    else if (point1.calculateDistance() < point2.calculateDistance()) {
      // point 2 is further
      return -1;
    } else { // if distances are equal, compare by X axis
      if (point1.getX() == point2.getX() && point1.getY() == point2.getY()) {
        // points are equal
        return 0;
      } else if (point1.getX() > point2.getX()) {
        // point 1 is further
        return 1;
      } else {
        // point 2 is further
        return -1;
      }
    }
  }
}
