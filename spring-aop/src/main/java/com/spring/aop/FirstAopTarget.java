package com.spring.aop;

/**
 * @desc: todo
 * @author: yaowei
 * @since:2025/7/2
 */
public class FirstAopTarget {

    /**
     * 配置被代理的方法
     */
    public void target() {
        System.out.println("Method is proxyed");
    }

    /**
     * 没被代理的方法
     */
    public void target2() {
        System.out.println("Method is not proxyed");
    }


}
