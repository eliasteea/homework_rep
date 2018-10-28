package com.company;

public class Market {
    //Market - contain an array of Items
    // The method displayItems print the details about its items.

    Item []items = new Item[20];
    String marketName;

    Item milk = new Item("milk",9.5);
    Item soda = new Item("soda",6.8);
    Item cookies = new Item("cookies",14.9);

    public void displayItems() {
        for (int i = 0; i < items.length; i++) {
            System.out.print(items[i].name + items[i].price);
        }
    }
}
