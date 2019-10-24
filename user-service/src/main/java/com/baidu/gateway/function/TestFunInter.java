package com.baidu.gateway.function;

/**
 * @Auther: XieZhiGui
 * @Date: 2019-10-24
 * @Description: com.baidu.gateway.function
 * @version: 1.0
 */
public class TestFunInter {

    public static void show(MyFunctionalInterface myFunctionalInterface){
        myFunctionalInterface.show();
    }

    public static void main(String[] args) {
        show(()-> System.out.println("执行了show"));
    }
}
