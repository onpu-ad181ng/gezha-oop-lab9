package AD181.Gezha;

public class Point {
  private int x;
  private int y;

  Point(int x, int y) {
    this.setX(x);
    this.setY(y);
  }

  public double calculateDistance() {
    return Math.hypot(this.getX(), this.getY());
  }

  @Override
  public String toString() {
    String toReturn = "(" + this.getX() + ", " + this.getY() + ") - ";
    toReturn += this.calculateDistance();
    return toReturn;
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
}
