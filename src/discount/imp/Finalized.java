package discount.imp;

import discount.StatusBudget;
import model.Budget;

public class Finalized implements StatusBudget {
    @Override
    public void applyExtraDiscount(Budget budget) {
        throw new RuntimeException("Finalized budgets do not receive extra discount");
    }

    @Override
    public void approve(Budget budget) {
        throw new RuntimeException("Budget already finalized");

    }

    @Override
    public void disapprove(Budget budget) {
        throw new RuntimeException("Budget already finalized");
    }

    @Override
    public void finalize(Budget budget) {
        throw new RuntimeException("Budget already finalized");
    }
}
