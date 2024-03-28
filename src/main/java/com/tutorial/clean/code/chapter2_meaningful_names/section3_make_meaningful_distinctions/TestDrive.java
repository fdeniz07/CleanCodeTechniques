package com.tutorial.clean.code.chapter2_meaningful_names.section3_make_meaningful_distinctions;

import java.math.BigDecimal;

public class TestDrive {

    // ??? : I'll fix it later, let me write like this for now !!!

    public static void main(String[] args) {

        // +++ : In monetary transactions, BigDecimal variable type should be selected instead of double.

        // Monetary
        BigDecimal money;
        BigDecimal moneyAmount;
        BigDecimal moneyBigDecimal;

        // !!! : Give distinctive and meaningful names to the variables !!!

        Customer c = new Customer();
        CustomerObject c2 = new CustomerObject();

    }
}
