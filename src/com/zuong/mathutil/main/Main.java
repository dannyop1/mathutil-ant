/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zuong.mathutil.main;

import com.zuong.mathutil.core.MathUtility;
import java.awt.BorderLayout;

/**
 *
 * @author Duwowng
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testFactorialGivenRightArgumentRunsWell();
        testFactorialGivenWrongArgumentThrowsException();
        // TODO code application logic here
    }
    // thiet ke ham getF() la chi tinh n! tu 0..20
    // neu dua n < 0 hoac n > 20 thi` ham se ko tinhh, chui = cach nem ra ngoai le.
    // thuc te ham getF() khi chay co lam duoc nhu thiet ke hay khong thi phai test thu moi biet duoc
    public static void testFactorialGivenWrongArgumentThrowsException() {
        // Test case #4 Test getF with n = -5, wrong argument
        // Expected value : an exception is thrown -> IllegalArgumentException
           System.out.println("Test -5!: expected = Illegal Argument Exception is Thrown!");
           
           MathUtility.getFactorial(-5);
        
    }
    //dan dev phai co trach nhiem test code cua minh chay dung hay sai truoc khi 
   // lap rap no voi cac class khac de hinh hanh chuc nang
   // ghi chu
    // co nhieu quy tac dat ten ham cho viec kiem thu ham
    // thuong ten ham se bao ham y nghia cua viec kiem thu
    // vi du ham duoi nay se dung de test cai ham tinh giai thua
    // trong tinh huong - case dua n dung chuan, thi ta hy vong
    // ham se chay ngon nhu thiet ke, n = 5 thi ham phai tra ve 120
    // tuc la 5! hy vong ham se tinh ra 120
    public static void testFactorialGivenRightArgumentRunsWell() {
       
            //Test case #1: Test getFactorial with n = 0
            // expected value 1 - hy vong dua n = 0 vao thi ham tra ve 1
            
            int n = 0;
            long expectedValue = 1;
            long actualValue = MathUtility.getFactorial(n);
            
            System.out.println("Test" + n + "!: expected =" + expectedValue
                                 + " | actual: "    +  actualValue );
            
            //Test case #2: Test getFactorial with n = 1
            // expected value = 1 - hy vong dua n = 1 vao thi ham tra ve 1
            n = 1;
            expectedValue = 1;
            actualValue = MathUtility.getFactorial(n);
            
            System.out.println("Test" + n + "!: expected =" + expectedValue
                                 + " | actual: "    +  actualValue );
            
            //Test case #3: Test getFactorial with n = 3
            // expected value = 6 !!!
            n = 3;
            expectedValue = 6;
            actualValue = MathUtility.getFactorial(n);
            
            System.out.println("Test" + n + "!: expected =" + expectedValue
                                 + " | actual: "    +  MathUtility.getFactorial(3) );
            
            
    }
}
