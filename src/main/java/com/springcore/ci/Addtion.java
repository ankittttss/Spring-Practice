package com.springcore.ci;

public class Addtion {
    private int a;
    private int b;

    public Addtion(int a,int b){
        this.a = a;
        this.b = b;
        System.out.println("Constructor : int, int");
    }

    public Addtion(double a,double b){
        this.a = (int) a;
        this.b = (int) b;
        System.out.println("Constructor : Double, Double");
    }

    public Addtion(String a,String b){
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
        System.out.println("Constructor : String, String");
    }

    public void doSum(){
        System.out.println("Summation is" + " " + (this.a + this.b));
    }
}
