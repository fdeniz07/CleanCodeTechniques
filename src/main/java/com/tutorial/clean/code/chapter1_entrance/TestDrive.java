package com.tutorial.clean.code.chapter1_entrance;

public class TestDrive {


    // !!! Campaign: Add an IF :)) - This is Bad Code
    /* ???
         Code sollte immer erweiterbar und wartbar sein.
         Mit anderen Worten, es sollte nach SOLID-Prinzipien entwickelt werden.
   ??? */


    public static String calculateArea(String types){
        if (types.equalsIgnoreCase("F")){
            return "f";
        }
        else if (types.equalsIgnoreCase("S")){
            return "s";
        }
        else if (types.equalsIgnoreCase("M")){
            return "m";
        }
        else if (types.equalsIgnoreCase("L")){
            return "l";
        }
        return "";
    }

    public static void main(String[] args) {
        /**
         *
         *
         *
         */

        String a = null;

        // *** Note :
        /***
              In Java kann ein bekannter Wert mit einem unbekannten Wert verglichen werden.
              Wenn jedoch ein unbekannter Wert mit einem bekannten Wert verglichen wird,
              wird ein "Null Pointer Exception" empfangen. Um dieses Problem zu lösen, wird die optionale Struktur verwendet.
         ***/

        if("F".equalsIgnoreCase(a)) {

        }

        if(a.equalsIgnoreCase("F")) {

            // Null Pointer Exception x Optional
        }
    }
}
