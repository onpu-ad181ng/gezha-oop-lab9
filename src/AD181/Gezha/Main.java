package AD181.Gezha;

import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    ArrayList<Point> pointsArray = new ArrayList<Point>(Arrays.asList(
        new Point(4, 3),
        new Point(4, 2),
        new Point(3, 4),
        new Point(5, 5)));
    pointsArray.sort(new PointComparator());

    for (Point p: pointsArray) {
      System.out.println(p.toString());
    }
  }
}
