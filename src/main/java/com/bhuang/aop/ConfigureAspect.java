package com.bhuang.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

/**
 * @author: huangbin
 * @description:
 * @date: Created in 2019/4/30
 * @modified By:
 */
public class ConfigureAspect {
    public void before(){
        System.out.println("配置方式-before");
    }

    public void before2(String var1, String var2){
        System.out.println("配置方式-before2  var1：" + var1 + "   var2：" + var2);
    }

    public void after(){
        System.out.println("配置方式-after");
    }

    public void afterReturn(){
        System.out.println("配置方式-afterReturn");
    }

    public void afterThrow(){
        System.out.println("配置方式-afterThrow");
    }

    public Object around(ProceedingJoinPoint point){
        try {
            System.out.println("配置方式-proceed before");
            Object object = point.proceed();
            System.out.println("配置方式-proceed after:" + (ObjectUtils.isEmpty(object) ? "空返回值" : object.toString()) + "  args:"
                    + CollectionUtils.arrayToList(point.getArgs()).toString());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return null;
    }
}
