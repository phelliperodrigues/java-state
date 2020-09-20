package tax.imp;

import model.Budget;
import tax.Tax;

public class ISS extends Tax {

    public ISS(Tax tax) {
        super(tax);
    }

    public ISS() {
    }

    @Override
    public double calculate(Budget budget) {
        return  budget.getValue() * 0.06 + calculateNextTax(budget);
    }


}
