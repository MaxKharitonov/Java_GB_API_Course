public class Laptop {
    private String brand;
    private String color;
    private int price;

    public Laptop(String brand, String color, int price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop)) return false;
        Laptop laptop = (Laptop) o;
        return getPrice() == laptop.getPrice() &&
                getBrand().equals(laptop.getBrand()) &&
                getColor().equals(laptop.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getColor(), getPrice());
    }
}