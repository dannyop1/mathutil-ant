/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zuong.mathutili.core.test;




import com.zuong.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Duwowng
 */
public class MathUtilityTest {
    
    //Kiem thu ngoai le thi sao
    //tuc la ham getF duoc thiet ke rang neu dua vao` n ca` chon'
    // thi ham phai nem ra ngoai le
    // tuc la getF=-5 thi expected ==  ngoai le illegal argument exception
    // thay ngoai le mung roi nuoc mat
    
    @Test(expected = Exception.class)
    public void testFacetorialGivenWrongArgumentThrowsException() {
        //Test case #5: getF() with a wrong arg: n = -5
        //Expected result: an exception is thrown
        MathUtility.getFactorial(-5);
        //neu chi go lenh tren thi` bi mau` do? do lenh nay gay ra exception va exception la mau` do?
        //nhung doan. code nay` hi vong ra exception, neu ra nhu ki` vong thi dung' nhu design
        // if dung' nhu design phai ra mau` xanh
        //vay loi cua ta la chua nhan dien. rang` code da~ co ngoai le. roi`
        //ta can them 1 lenh da co ngoai le chua, neu TRUE -> test XANH
        //JUnit 4 thi khong dung ham` assert() de do ngoai le.
        //Junit 5 thi dung ham assert() de do ngoai le
    }
    
    @Test
    //trong ham nay se chua cac test case de test getF voi n hop le trong khoang 0-20
    public void testFactorialGivenRightArgumentReturnsWell() {
        //Test case #1 test getF() with n = 0
        //Exoected result = 1; // hi vong 0! = 1
        int n = 0;
        long expectedValue = 1;
        long actualValue = MathUtility.getFactorial(n);
        
        Assert.assertEquals(expectedValue, actualValue);
        
        //Test case #2: test getF() with n=5
        //Expected result = 120; //hy vong =120 xem may co chay duoc nhu vay k
        
        Assert.assertEquals(120, MathUtility.getFactorial(5));
        
        //Test case #3: test getF() with n=6
        //Expected result = 720; //hy vong =720 xem may co chay duoc nhu vay k
        
        Assert.assertEquals(720, MathUtility.getFactorial(6));
        Assert.assertEquals(24, MathUtility.getFactorial(4));
    }
   
    
}
