package com.company;

public class Item {
    //Item - has name and price -
    // the metod displayDetail will print the  detail
    String name;
    double price;

    public Item(String name,double price){
        this.name=name;
        this.price = price;
    }

    public void displayDetail(){
        System.out.println(name + Double.toString(price));
    }
}
