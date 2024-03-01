package OOP.Inheritance.Compare;

public class Point {
    private  int x;
    private  int y;

    public Point(int y, int x) {
        this.y = y;
        this.x = x;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Point other))
            return false;

        return  other.x == x && other.y == y;
    }
}
