package Exercise4;

import java.math.BigDecimal;

public class Simple implements Task {
    public BigDecimal euros;
    public int days;

    public Simple(BigDecimal euros, int days) {
        this.euros = euros;
        this.days = days;
    }

    @Override
    public BigDecimal costInEuros() {
        return euros;
    }

    @Override
    public int durationInDays() {
        return days;
    }
}
