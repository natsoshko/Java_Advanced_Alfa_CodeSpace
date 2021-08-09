package com.alfabank.work24;

import java.util.Comparator;

public class MyComparatorColor implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        String sColor1 = ((Shape) o1).getColor();
        String sColor2 = ((Shape) o2).getColor();
        return sColor2.compareTo(sColor1);
    }
}
