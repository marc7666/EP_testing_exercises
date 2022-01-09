package Exercise8;

import java.math.BigDecimal;

public class Product {
    private String description;
    private String id;
    private BigDecimal price;

    public Product(String description, String id, BigDecimal price) {
        this.description = description;
        this.id = id;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
