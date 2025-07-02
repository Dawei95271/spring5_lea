package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author lx
 */
public class AopTest {

    public static void main(String[] args) {
        //1.获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        //2.获取对象
        FirstAopTarget firstAopTarget = (FirstAopTarget) ac.getBean("firstAopTarget");
        //3.尝试调用被代理类的相关方法
        firstAopTarget.target();
        System.out.println("-------------");
        firstAopTarget.target2();
    }


}
