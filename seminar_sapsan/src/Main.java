import utils.dry.Dry;

public class Main {
    public static void main(String[] args) {
        Dry dry = new Dry(12,12);
        System.out.println(dry.calculateArea());
        System.out.println(dry.calculateDoubleArea());
    }
}