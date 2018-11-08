package com.company;

import java.util.Arrays;
import java.util.Collections;

public class MarketManager {

    static double ExpensItem(Market market){
        double maxValue = market.items[0].price;
        for(int i=1;i < market.items.length;i++){
            if(market.items[i].price > maxValue){
                maxValue = market.items[i].price;
            }
        }
        return maxValue;
    }
    static double AvgPrice(Market market){
        double sum = 0;
        for (int i = 0; i < market.items.length; i++){
            sum += market.items[i].price;
        }
        return sum/market.items.length;
    }

    static void  Replacing(Market market, Item item, int position){
    }

}

