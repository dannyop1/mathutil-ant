/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zuong.mathutil.core;

/**
 *
 * @author Duwowng
 */
public class MathUtility {

    public static final double PI = 3.145;

    //ham tinh N! = 1 * 2 * 3 * ... * n
    //khong co iai thua cho so am
    //0! = 1! = 1 quy uoc 0! = 1
    //vi giai thua tang gia tri rat nhanh
    //20! vua du 18 so 0 tuc la 21! tran kieu long ==> quy uoc ham nay chi tinh tu 0->20!
    //co 2 cach viet ham nay: for truyen thong va de quy - recursion
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be between 0-20!");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        //song sot den doan nay, n tu 2..20 roi!!!, for ma choi
        long product = 1; //bie khoi dong cho tich nhan don
        for (int i = 2; i <= n; i++) 
            product *= i;
        
        return product;
    }
}