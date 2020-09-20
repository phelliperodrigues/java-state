package model;

import discount.StatusBudget;
import discount.imp.OnApproval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Budget {

    public double value;
    private List<Item> items;

    public StatusBudget statusBudget;


    public Budget(double value){
        this.items = new ArrayList<>();
        this.value = value;
        this.statusBudget = new OnApproval();
    }

    public double getValue() {
        return value;
    }

    public void addItem(Item item){
        this.items.add(item);
    }
    public List<Item> getItems() {
        return Collections.unmodifiableList(this.items);
    }

    public void applyExtraDiscount() {
        statusBudget.applyExtraDiscount(this);
    }

    public void approve(){
        this.statusBudget.approve(this);
    }

    public void disapprove(){
        this.statusBudget.disapprove(this);
    }

    public void finalize(){
        this.statusBudget.finalize(this);
    }
}
