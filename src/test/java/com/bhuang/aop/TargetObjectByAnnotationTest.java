package com.bhuang.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author: huangbin
 * @description: AOP测试类
 * @date: Created in 2019/4/30
 * @modified By:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:springContext.xml"})
public class TargetObjectByAnnotationTest {

    @Autowired
    TargetObjectByAnnotation targetObjectByAnnotation;

    @Test
    public void method1() {
        targetObjectByAnnotation.method1();
    }

    @Test
    public void method2() {
        targetObjectByAnnotation.method2("Annotation-method2参数1", "Annotation-method2参数2");
    }

    @Test
    public void method3() throws Exception {
        targetObjectByAnnotation.method3();
    }

    @Test
    public void method4() {
        targetObjectByAnnotation.method4("Annotation-method4参数");
    }
}