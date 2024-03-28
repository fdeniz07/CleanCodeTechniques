package com.tutorial.clean.code.chapter2_meaningful_names.section1_use_intention_revealing_names;

import java.util.ArrayList;
import java.util.List;

public class BadNaming {

    // !!! Seien Sie vorsichtig mit der Nomenklatur

    int d; // elapsed time in day

    public List<int[]> getThem(int[][] theList) {

        List<int[]> list1 = new ArrayList<int[]>();
        for (int[] x : theList)
            if (x[0] == 4)
                list1.add(x);
        return list1;
    }
}
