package tax.imp;

import model.Budget;
import tax.Tax;

public class ICMS extends Tax {

    public ICMS(Tax tax) {
        super(tax);
    }

    public ICMS() {
    }

    @Override
    public double calculate(Budget budget){
        return  budget.getValue() * 0.1 + calculateNextTax(budget);
    }
}
