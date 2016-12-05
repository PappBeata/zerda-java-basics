package com.greenfox.exams.java;

import java.util.ArrayList;

public abstract class Cardlists extends ArrayList<Cards> {

    public static void toString(Cardlists cardList){
            for(Cards item :cardList){
                System.out.println(item);
            }
    }
}
