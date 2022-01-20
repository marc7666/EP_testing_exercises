package Exercise8;

/**
 * @project: EP_testing_exercises.
 * @author: mcr99 on 21/01/2022.
 */

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
