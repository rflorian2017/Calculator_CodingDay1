package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SumWithZero sumWithZero = new SumWithZero(7);
        System.out.println(sumWithZero); // this will display 7 + 0 = 7

        Sum sum1 = new Sum(2,3);

        System.out.println(sum1);

        Difference dif1 = new Difference(2,3);
        System.out.println(dif1);

        Divide div1 = new Divide(5,2);
        System.out.println(div1);

        Multiply mul1 = new Multiply(0.5,2);
        System.out.println(mul1);

        Sum sum2 = new Sum(div1, mul1);
        System.out.println(sum2);

        sum2 = new Sum(1, mul1);
        System.out.println(sum2);

        sum2 = new Sum(div1, 3);
        System.out.println(sum2);

        Difference dif2 = new Difference(7,2);
        System.out.println(dif2);
        System.out.println(sum1.equals(dif2));

        System.out.println(sum1.equals(new Object()));
    }
}
