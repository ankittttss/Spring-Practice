package com.springcore.lifecycle;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Kachori {

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Kachori(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Kachori{" +
                "price=" + price +
                '}';
    }

    public Kachori(){

    }

     @PostConstruct
     public void init(){
        System.out.println("Initialise");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Destroyed");
    }

}
