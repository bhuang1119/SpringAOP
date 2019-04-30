package com.bhuang.aop;


import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author: huangbin
 * @description:
 * @date: Created in 2019/4/30
 * @modified By:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:springContext.xml"})
public class TargetObjectTest {

    @Autowired
    TargetObject targetObject;

    @Test
    public void log() {
        targetObject.log();
    }

    @Test
    public void log2() {
        targetObject.log2("参数1", "参数2");
    }
}