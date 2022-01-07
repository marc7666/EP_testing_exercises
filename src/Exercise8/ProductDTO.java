package Exercise8;

import java.math.BigDecimal;

public class ProductDTO {
    private String productID;
    private String description;
    private BigDecimal price;

    public ProductDTO(String productID, String description, BigDecimal price) {
        this.productID = productID;
        this.description = description;
        this.price = price;
    }

    public ProductDTO getProduct(String productID) {
        return new ProductDTO(productID, description, price);
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
