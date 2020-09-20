package discount.imp;

import discount.StatusBudget;
import model.Budget;

public class OnApproval implements StatusBudget {

    public void applyExtraDiscount(Budget budget){
        budget.value -= ( budget.getValue() * 0.05);
    }

    @Override
    public void approve(Budget budget) {
        budget.statusBudget = new Approved();
    }

    @Override
    public void disapprove(Budget budget) {
        budget.statusBudget = new Repproved();
    }

    @Override
    public void finalize(Budget budget) {
        throw new RuntimeException("Approved budget cannot go directly to completion");
    }
}
