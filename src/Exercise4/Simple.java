package Exercise4;

/**
 * @project: EP_testing_exercises.
 * @author: mcr99 on 21/01/2022.
 */

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
