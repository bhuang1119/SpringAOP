package com.bhuang.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author: huangbin
 * @description:
 * @date: Created in 2019/4/30
 * @modified By:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:springContext.xml"})
public class TargetObjectByConfigureTest {

    @Autowired
    TargetObjectByConfigure targetObjectByConfigure;

    @Test
    public void method1() {
        targetObjectByConfigure.method1();
    }

    @Test
    public void method2() {
        targetObjectByConfigure.method2("Configure-method2参数1", "Configure-method2参数2");
    }

    @Test
    public void method3() throws Exception {
        targetObjectByConfigure.method3();
    }

    @Test
    public void method4() {
        targetObjectByConfigure.method4("Configure-method4参数");
    }
}