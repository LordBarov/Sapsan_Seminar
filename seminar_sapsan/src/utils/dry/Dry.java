package utils.dry;

public class Dry {
    private int width;
    private int length;

    public Dry() {

    }

    public Dry(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int calculateArea() {
        return this.width * this.length;
    }

    public int calculateDoubleArea() {
        return (this.width * this.length) * 2;
    }
}
