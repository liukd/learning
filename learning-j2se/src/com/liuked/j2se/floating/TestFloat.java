package com.liuked.j2se.floating;

/**
 * Created by liukedong on 2017/3/25.
 */
public class TestFloat {
    public static void main(String[] args) {

        float af = 5.123456789f;
        System.out.println(af); // 输出 5.123457

        double c = Double.NEGATIVE_INFINITY;
        float d = Float.NEGATIVE_INFINITY;
        System.out.println(c == d); // float和double的负无穷大是相等的

        double a = 0.0;
        System.out.println(a/a);  // 输出NaN， 0.0除以0.0将出现非数

        System.out.println(Double.NaN == Float.NaN); // 两个非数是不相等的

        System.out.println(6.0/0 == 333.0/0); // 所有无穷大都是相等的

        System.out.println(-9/0.0); // 负数除以0.0 得到负无穷大

//        System.out.println(0 / 0);


    }


}
