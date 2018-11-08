package com.company;

public class Market {
    //Market - contain an array of Items
    // The method displayItems print the details about its items.

    Item []items;

    String marketName;

    public Market(String marketName, Item[]items){
        this.marketName =marketName;
        this.items = items;
    }

    public void displayItems() {
        for (int i = 0; i < items.length; i++) {
            items[i].displayDetail();
        }
    }
}
