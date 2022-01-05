package Lectures.Composition;

public class Ceiling {
    private int height;
    private int paintedColor;

    public Ceiling(int height, int paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setPaintedColor(int paintedColor) {
        this.paintedColor = paintedColor;
    }
}
