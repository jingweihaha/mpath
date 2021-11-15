package com.zjw.mpath;

import org.junit.jupiter.api.Test;

/**
 * @author jingw
 * @created 11/7/2021 11:24 AM
 * @project mpath
 */
public class MySingleton {

    private String name;

    private static String age;

    private MySingleton(){
    }

//    public static MySingleton getInstance(){
//        return MyHelper.INSTANCE;
//    }

    public  class MyHelper{

        private final  MySingleton INSTANCE = new MySingleton();
        public void test(){
            String age = MySingleton.age;
            String name = INSTANCE.name;
        }
    }

}
