package com.lampstudio.jsc;

/**
 * Created by KHOAND_ADMIN on 10/13/2017.
 */
public class Greeter {
    public String name;

    public Greeter(String name) {
        this.name = name;
    }
    public String hello(){
        return "Hello "+name;
    }
    public String hello(String other){
        return "Hello "+other;
    }
}
