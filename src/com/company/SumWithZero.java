package com.company;

public class SumWithZero extends Sum{

    // second ugly possibility
//    public SumWithZero(int termen1, int termen2) {
//        super(termen1, 0);
//        // this.termen2 = 0; - ugly possibility
//    }


    public SumWithZero(int termen1) {
        super(termen1, 0);
    }
}
