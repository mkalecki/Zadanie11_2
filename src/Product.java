import java.util.Collection;

public class Product implements Comparable<Product> {

    private String prodName;
    private int quantity;

    public Product(String product, int quantity) {
        this.prodName = product;
        this.quantity = quantity;
    }

    public String getProduct() {
        return prodName;
    }

    public void setProduct(String product) {
        this.prodName = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product='" + prodName + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public String visualQuantity() {
        if (this.quantity < 5 && this.quantity >= 0)
            return " ";
        if (this.quantity < 15 && this.quantity >= 5)
            return "*";
        if (this.quantity < 25 && this.quantity >= 15)
            return "**";
        if (this.quantity <= 35 && this.quantity >= 25)
            return "***";
        if (this.quantity <= 45 && this.quantity >= 35)
            return "****";
        if (this.quantity <= 55 && this.quantity >= 45)
            return "*****";
        if (this.quantity <= 65 && this.quantity >= 55)
            return "*******";
        if (this.quantity <= 75 && this.quantity >= 65)
            return "********";
        if (this.quantity <= 85 && this.quantity >= 75)
            return "********";
        if (this.quantity <= 95 && this.quantity >= 85)
            return "*********";
        return "**********";

    }

    @Override
    public int compareTo(Product other) {
        return prodName.compareTo(other.prodName);
    }
}
