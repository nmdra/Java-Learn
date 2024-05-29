package PastPapers.Y22JuneVerA.Q01;

public abstract class Pet implements PointAllocator {
    double point = 0.0;

    @Override
    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public double getPoint() {
        return point;
    }

    public abstract void GetTotalPoints();
    public abstract void feed();
    public abstract void clean();
    public abstract void cuddle();
}
