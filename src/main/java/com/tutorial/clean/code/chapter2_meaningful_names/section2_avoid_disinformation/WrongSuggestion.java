package com.tutorial.clean.code.chapter2_meaningful_names.section2_avoid_disinformation;

public class WrongSuggestion {

    String accountList = ""; //!!! A variable must be named correctly and assigned a value. (String accountName = "" is correct)

    // *** Wenn eine globale Variable nicht initialisiert ist, nimmt sie automatisch den Wert 0 an
    static int O;
    static int l;

    public static void main(String[] args) {
        {
            int a = l;
            if (O == l)
                a = 1;
            else
                l = 01;
        }
        System.out.println(l);
    }
}
