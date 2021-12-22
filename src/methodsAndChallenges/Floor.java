package methodsAndChallenges;

public class Floor {
    private double length;
    private double width;

    public Floor(double length, double width) {
        if (width < 0) {
            this.width = 0;
            if (length < 0) {
                this.length = 0;
            }
        }
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return this.width * this.length;
    }


}
