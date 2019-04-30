package com.bhuang.aop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author: huangbin
 * @description: 目标对象
 * @date: Created in 2019/4/29
 * @modified By:
 */
@Service("targetObject")
public class TargetObject {
    public void method1() {
        System.out.println("method1");
    }

    public void method2(String val1, String val2) {
        System.out.println("method2");
    }

    public void method3() throws Exception {
        System.out.println("method3");
        throw new Exception("异常");
    }

    public String method4(String val4) {
        System.out.println("method4");
        return val4;
    }
}
