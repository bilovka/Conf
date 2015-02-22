package com.google.training.helloworld;

public class SumClass {
    public int a;
    public int b;

    public SumClass(){

    }

    public SumClass(int a, int b){
        this.a = a;
        this.b = b;
    }

    public String getMessage(){
        return "Sum = "+(a+b);
    }

}