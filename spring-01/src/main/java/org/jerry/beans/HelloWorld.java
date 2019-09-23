package org.jerry.beans;

/**
 * spring入门
 *
 * @author Jerry
 * @create 2019-09-05 15:17
 */
public class HelloWorld {
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        System.out.println("userName="+userName);
        this.userName = userName;
    }

    public void hello() {
        System.out.println("hello");
    }

    public HelloWorld(String userName) {
        this.userName = userName;
    }

    public HelloWorld() {
        System.out.println("先调用无参构造器");
    }

}
