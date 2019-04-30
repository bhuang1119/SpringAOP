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
    public void log() {
        System.out.println("log");
    }

    public void log2(String val1, String val2) {
        System.out.println("log2");
    }
}
