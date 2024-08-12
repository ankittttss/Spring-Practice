package com.springcore.lifecycle;

public class Samosa {

    private double price;

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Samosa(){

    }

    public Samosa(double price) {
        this.price = price;
    }

    public void init(){
        System.out.println("Inside init Method");
    }

    public void destroy(){
        System.out.println("Inside Destroy Method");
    }

}
