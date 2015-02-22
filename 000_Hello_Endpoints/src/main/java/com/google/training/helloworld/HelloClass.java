package com.google.training.helloworld;

public class HelloClass {
    public String message = "Hello World";
    public String name = "Hello World";
    public String period = "Hello World";

    public HelloClass() {
    }

    public HelloClass(String name) {
        this.message = "Hello " + name + "!";
    }

    public HelloClass(String name, String period) {
        this.name = name;
        this.period = period;
    }

    public String getMessage() {
        return "Good "+period+" "+name+"!";
    }

}