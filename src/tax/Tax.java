package tax;

import model.Budget;

public abstract class Tax {
    protected Tax otherTax;

    public Tax(Tax tax){
        this.otherTax = tax;
    }

    public Tax(){};
    public abstract double calculate(Budget budget);

    protected double calculateNextTax(Budget budget) {
        return this.otherTax != null ? this.otherTax.calculate(budget) : 0;
    }
}
