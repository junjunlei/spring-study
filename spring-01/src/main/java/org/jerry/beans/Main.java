package org.jerry.beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试类
 * @author Jerry
 * @create 2019-09-05 15:36
 */
public class Main {
    public static void main(String[] args) {
        //1.创建IOC容器
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //2.从容器中获取实例根据bean id
        HelloWorld helloWorld=(HelloWorld) applicationContext.getBean("helloWorld");
        //3.使用bean
        helloWorld.hello();
        Car car = (Car) applicationContext.getBean("car");
        Car car1 = (Car) applicationContext.getBean("car1");
        System.out.println(car);
        System.out.println(car1);

    }

}
