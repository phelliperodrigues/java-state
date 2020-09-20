package discount.imp;

import discount.StatusBudget;
import model.Budget;

public class Approved implements StatusBudget {

    public void applyExtraDiscount(Budget budget){
        budget.value -= ( budget.getValue() * 0.02);
    }

    @Override
    public void approve(Budget budget) {
        throw new RuntimeException("Budget already approved");

    }

    @Override
    public void disapprove(Budget budget) {
        throw new RuntimeException("Approved budget cannot go reproved");

    }

    @Override
    public void finalize(Budget budget) {
        budget.statusBudget = new Finalized();
    }
}
