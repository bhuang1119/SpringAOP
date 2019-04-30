package com.bhuang.aop;


/**
 * @author: huangbin
 * @description: 配置的目标对象
 * @date: Created in 2019/4/29
 * @modified By:
 */
public class TargetObjectByConfigure {
    public void method1() {
        System.out.println("配置的目标对象-method1执行...");
    }

    public void method2(String val1, String val2) {
        System.out.println("配置的目标对象-method2执行..." + " val1:" + val1 + "  val2:" + val2);
    }

    public void method3() throws Exception {
        System.out.println("配置的目标对象-method3执行...");
        throw new Exception("配置的目标对象-异常");
    }

    public String method4(String val4) {
        System.out.println("配置的目标对象-method4执行..." + "  val4:" + val4);
        return "配置的目标对象-method4的返回值";
    }
}
