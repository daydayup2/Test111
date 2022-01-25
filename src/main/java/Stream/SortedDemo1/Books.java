package Stream.SortedDemo1;

import java.util.Objects;

/**
 * Stream.SortedDemo1
 *
 * @author yuhl
 * @date 2022/1/24
 */
public class Books {
    String name;
    double price;

    public Books(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Books books = (Books) o;
        return Double.compare(books.price, price) == 0 && Objects.equals(name, books.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Books{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
