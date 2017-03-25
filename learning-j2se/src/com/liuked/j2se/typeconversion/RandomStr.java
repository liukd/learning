package com.liuked.j2se.typeconversion;

import java.util.Random;

/**
 * Created by liukedong on 2017/3/25.
 *
 * 生成一个6位的随机字符串
 */
public class RandomStr {

    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        int len = 6;
        for(int i = 0; i < len; i++){
            result.append((char) (Math.random() * 26 + 97));
        }
        System.out.println(result.toString());
    }

}
