package com.capgemini.oo2;

public class Fan {
    String color="blue";
    int cost=24000;
    int numberOfBlades=3;

    void on(){
        System.out.println("Fan is swiched on");
    }
    void fanIsRotating(){
        System.out.println("Fan is rotating");
    }
    void switchOff(){
        System.out.println("Fan is switched off");
    }
}
class LaunchTheFan{
    public static void main(String[] args){
        Fan fan1=new Fan();
       fan1.fanIsRotating();
    }
}
