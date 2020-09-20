package main;

import calculator.CalculatorDiscount;
import model.Budget;
import model.Item;
import tax.Tax;
import tax.imp.ICMS;
import tax.imp.ICPP;
import tax.imp.ISS;

public class Main {
    public static void main(String[] args) {
        Budget remodeling = new Budget(500);
        remodeling.applyExtraDiscount();
        System.out.println(remodeling.getValue());
        remodeling.approve();
        remodeling.applyExtraDiscount();
        System.out.println(remodeling.getValue());
        remodeling.finalize();
        remodeling.applyExtraDiscount();
    }
}
