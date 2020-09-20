package discount;

import model.Budget;

public interface StatusBudget {
    void applyExtraDiscount(Budget budget);

    void approve(Budget budget);
    void disapprove(Budget budget);
    void finalize(Budget budget);

}
