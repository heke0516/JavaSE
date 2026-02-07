package com.itheima.junit;

import org.junit.Assert;
import org.junit.Test;

//测试类：junit单元测试框架
public class StringUtilTest {
    //测试方法：必须是public ，无参，无返回值
    //测试方法必须加上@Test注解
    @Test
    public void testprintNumber(){
        StringUtil.printNumber("张三"); //2
        StringUtil.printNumber("");
        StringUtil.printNumber(null);
    }

    @Test
    public void testGetMaxIndex(){
        int index1 = StringUtil.getMaxIndex("hello");
        int index2 = StringUtil.getMaxIndex("");
        int index3 = StringUtil.getMaxIndex(null);

        System.out.println(index1);
        System.out.println(index2);
        System.out.println(index3);
        //做断言：测试结果与预期结果是否一致
        Assert.assertEquals("本轮测试失败！",4,index1);
    }
}
