public class APLine {
 private double a1, b1, c1;
 public APLine(int a, int b, int c) {
   a1 = a;
   b1 = b;
   c1 = c;
 }
 public double getSlope() {
   return -(a1 / b1);
 }
 public boolean isOnLine(int x, int y) {
 return (0 == (a1 * x) + (b1 * y) + c1);
 }
}
