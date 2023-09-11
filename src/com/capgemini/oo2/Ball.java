package com.capgemini.oo2;

public class Ball {
    String color;
    int cost;
    String brand;
    void bounce(){
        System.out.println("Ball is bouncing");

    }
    void roll(){
        System.out.println("Boll is rolling");
    }
}

class LaunchTheBall{
    public static void main(String[] args){
        Ball b1=new Ball();
        b1.bounce();
    }
}