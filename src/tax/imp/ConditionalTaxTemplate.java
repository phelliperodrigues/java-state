package tax.imp;

import model.Budget;
import tax.Tax;

public abstract class ConditionalTaxTemplate extends Tax {

    @Override
    public double calculate(Budget budget) {
        if (mustUseTheMaximumRate(budget)) {
            return maximumRate(budget) + calculateNextTax(budget);
        }else {
            return minimumRate(budget) + calculateNextTax(budget);
        }
    }

    public abstract double minimumRate(Budget budget);

    public abstract  double maximumRate(Budget budget);

    public abstract  boolean mustUseTheMaximumRate(Budget budget);
}
