package chap6.aggregation;

public class Quadrangle {
    private Point p1, p2, p3, p4;

    public Quadrangle(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    public void print() {
        p1.print();
        p2.print();
        p3.print();
        p4.print();
    }

    public static void main(String[] args) {
        Quadrangle qd = new Quadrangle(
            new Point(0, 0), 
            new Point(0, 1),
            new Point(1, 1),
            new Point(1, 0)
        );
        
        qd.print();
    }

    
}
