package objectOrentedPrograming.Station;

public class Gas {
    private int litres;
    private double price;

    public Gas(int litres, double price) {
        this.litres = litres;
        this.price = price;
    }

    public int getLitres() {
        return litres;
    }

    public double getPrice() {
        return price;
    }
}
