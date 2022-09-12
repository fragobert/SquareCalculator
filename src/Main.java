public class Main {
    public static void main(String[] args) {
        Square s1 = new Square(9);
        System.out.println("s1.getA() = " + s1.getA());
        System.out.println("s1.getArea() = " + s1.getArea());
        System.out.println("s1.getDiagonal() = " + s1.getDiagonal());
        System.out.println("s1.getCircumference() = " + s1.getCircumference());
        System.out.println("Square.getCount() = " + Square.getCount());
        Square s2 = new Square(3);
        Square s3 = new Square(3);
        Square s4 = new Square(3);
        Square s5 = new Square(3);
        Square s6 = new Square(3);
        System.out.println("Square.getCount() = " + Square.getCount());
        
        
    }
}