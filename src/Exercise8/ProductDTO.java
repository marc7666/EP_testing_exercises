package Exercise8;

import java.math.BigDecimal;

public class ProductDTO {
    private String description;
    private String id;
    private BigDecimal price;

    public ProductDTO(String description, String id, BigDecimal price) {
        this.description = description;
        this.id = id;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
