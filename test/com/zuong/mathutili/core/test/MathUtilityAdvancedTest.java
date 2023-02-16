/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zuong.mathutili.core.test;

import com.zuong.mathutil.core.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Duwowng
 */


@RunWith(value = Parameterized.class)
// báo với junit rằng tao sẽ code trong class này
// tao sẽ tách data và hàm so sánh riêng biệt nhau - DATA DRIVEN TESTING
// tách thì phải có kĩ thuật nhồi/fill data trở lại lệnh so sánh
// fill trở lại thông qua biến - biến chứa value thay đổi
// DDT có anh em nương tựa với Parameterized - tham số hóa data
public class MathUtilityAdvancedTest {
    
  //chuẩn bị mảng 2 chiều để chứa data trong các testcase
  //mảng phải là static public
    
    @Parameterized.Parameters
    public static Object[][] initData() {
      
        return new Object[][] {
                                            {0, 1},
                                            {1, 1},
                                            {2, 2},
                                            {3, 6},
                                            {4, 24},
                                            {5, 120},
                               
        };
    }
    
    //map tung cap data o tren vao 2 bien'
    //day 2 bien' nay` vao` ham` asserteQuals() da~ quen
    @Parameterized.Parameter(value = 0) //lay cot 0 cua mang gan' vao`
    public int n;
    @Parameterized.Parameter(value = 1) //lay cot 1 cua mang gan' vao`
    public long expected;
    
    //test thôi
    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}
