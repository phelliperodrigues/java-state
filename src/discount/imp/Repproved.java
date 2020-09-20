package discount.imp;

import discount.StatusBudget;
import model.Budget;

public class Repproved implements StatusBudget {
    @Override
    public void applyExtraDiscount(Budget budget) {
        throw new RuntimeException("Disapproved budgets do not receive extra discount");
    }

    @Override
    public void approve(Budget budget) {
        throw new RuntimeException("Reproved budget cannot go approved");

    }

    @Override
    public void disapprove(Budget budget) {
        throw new RuntimeException("Budget already reproved");

    }

    @Override
    public void finalize(Budget budget) {
        budget.statusBudget = new Finalized();
    }
}
