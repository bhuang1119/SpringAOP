package com.bhuang.aop;


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

    public void around(){
        System.out.println("配置方式-around");
    }
}
