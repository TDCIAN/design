package com.company.design.decorator;

public class Audi implements ICar {

    private int price;

    public Audi(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return 1000;
    }

    @Override
    public void showPrice() {
        System.out.println("auid의 가격은 "+this.price +" 원 입니다.");

    }
}
