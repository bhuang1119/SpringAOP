package com.bhuang.aop;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author: huangbin
 * @description: AOP测试类
 * @date: Created in 2019/4/30
 * @modified By:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:springContext.xml"})
public class TargetObjectTest {

    @Autowired
    TargetObject targetObject;

    @Test
    public void method1() {
        targetObject.method1();
    }

    @Test
    public void method2() {
        targetObject.method2("method2参数1", "method2参数2");
    }

    @Test
    public void method3() throws Exception {
        targetObject.method3();
    }

    @Test
    public void method4() {
        targetObject.method4("method4参数");
    }
}