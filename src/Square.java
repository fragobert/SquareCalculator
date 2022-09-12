public class Square {
    private int a;
    public static int count;

    public Square(int a) {
        count++;
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public static int getCount() {
        return count;
    }

    public double getArea() {
        return Math.pow(a, 2);
    }

    public double getDiagonal() {
        return a * Math.sqrt(2);
    }

    public double getCircumference() {
        return 4 * a;
    }
}